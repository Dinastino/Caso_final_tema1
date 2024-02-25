package org.example;
import java.util.ArrayList;

public class Alerta_monitoreo {

    private double nivelRadiacion;
    private double temperatura;
    private double presion;

    public Alerta_monitoreo() {
        // Inicialización de variables
        this.nivelRadiacion = 0.0;
        this.temperatura = 0.0;
        this.presion = 0.0;
    }


    public void actualizarNivelRadiacion(double nivelRadiacion) {
        this.nivelRadiacion = nivelRadiacion;
    }

    public void actualizarTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void actualizarPresion(double presion) {
        this.presion = presion;
    }

    // Método para verificar y alertar sobre valores extremos
    public void verificarValoresExtremos() {
        if (nivelRadiacion > 100 || temperatura > 40 || presion > 120) {
            System.out.println("¡Alerta! Se han detectado valores extremos:");
            if (nivelRadiacion > 100) {
                System.out.println("   - Nivel de radiación: " + nivelRadiacion);
            }
            if (temperatura > 40) {
                System.out.println("   - Temperatura: " + temperatura);
            }
            if (presion > 120) {
                System.out.println("   - Presión: " + presion);
            }
            // Aquí podrías agregar lógica para sugerir ajustes
        } else {
            System.out.println("Los valores ambientales están dentro de los límites normales.");
        }
    }

    // Método para identificar y listar los N primeros números primos
    public ArrayList<Integer> encontrarPrimos(int n) {
        ArrayList<Integer> primos = new ArrayList<>();
        int num = 2;
        while (primos.size() < n) {
            if (esPrimo(num)) {
                primos.add(num);
            }
            num++;
        }
        return primos;
    }

    // Método auxiliar para verificar si un número es primo
    private boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

