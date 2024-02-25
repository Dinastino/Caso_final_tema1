package org.example;

import java.util.Arrays;

public class Navegador_estelar {
    private int[][] terreno; // Matriz para representar el terreno
    private int[][] construcciones; // Matriz para representar las construcciones

    private int[][] costos = {
        {1, 3, 5, 9},
        {2, 1, 3, 4},
        {5, 2, 6, 7},
        {6, 8, 4, 3}
    };

    public Navegador_estelar(int filas, int columnas) {
        this.terreno = new int[filas][columnas];
        this.construcciones = new int[filas][columnas];
    }

    // Función para visualizar el terreno y las construcciones
    public void visualizar() {
        System.out.println("Terreno:");
        for (int i = 0; i < terreno.length; i++) {
            System.out.println(Arrays.toString(terreno[i]));
        }
        System.out.println("Construcciones:");
        for (int i = 0; i < construcciones.length; i++) {
            System.out.println(Arrays.toString(construcciones[i]));
        }
    }

    // Función para planificar una construcción en una posición específica
    public void planificarConstruccion(int fila, int columna, int tipoConstruccion) {
        if (fila < 0 || fila >= terreno.length || columna < 0 || columna >= terreno[0].length) {
            System.out.println("Posición fuera de los límites del terreno.");
            return;
        }
        if (construcciones[fila][columna] != 0) {
            System.out.println("Ya hay una construcción en esta posición.");
            return;
        }
        construcciones[fila][columna] = tipoConstruccion;
        System.out.println("Construcción planificada en la posición (" + fila + ", " + columna + ").");
    }

    // Función para calcular una ruta óptima
    public void calcularRutaOptima() {
        int filas = costos.length;
        int columnas = costos[0].length;

        // Verificar si la matriz de costos es cuadrada
        if (filas != columnas) {
            System.out.println("La matriz de costos no es cuadrada, no se puede calcular la ruta óptima.");
            return;
        }

        // Matriz para almacenar los costos acumulados
        int[][] costosAcumulados = new int[filas][columnas];

        // Inicializar la primera fila y la primera columna de la matriz de costos acumulados
        costosAcumulados[0][0] = costos[0][0];
        for (int i = 1; i < filas; i++) {
            costosAcumulados[i][0] = costosAcumulados[i - 1][0] + costos[i][0];
        }
        for (int j = 1; j < columnas; j++) {
            costosAcumulados[0][j] = costosAcumulados[0][j - 1] + costos[0][j];
        }

        // Calcular los costos acumulados
        for (int i = 1; i < filas; i++) {
            for (int j = 1; j < columnas; j++) {
                costosAcumulados[i][j] = Math.min(costosAcumulados[i - 1][j], costosAcumulados[i][j - 1]) + costos[i][j];
            }
        }

        System.out.println("Matriz de costos acumulados:");
        for (int i = 0; i < filas; i++) {
            System.out.println(Arrays.toString(costosAcumulados[i]));
        }

        int costoMinimoTotal = costosAcumulados[filas - 1][columnas - 1];
        System.out.println("El costo mínimo total para llegar al destino es: " + costoMinimoTotal);
    }


    public int[][] getTerreno() {
        return terreno;
    }
}
