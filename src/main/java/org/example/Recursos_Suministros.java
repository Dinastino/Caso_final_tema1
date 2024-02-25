package org.example;

import java.util.Scanner;

public class Recursos_Suministros {
    private double aguaDisponible;
    private double oxigenoDisponible;
    private double comidaDisponible;
    private double combustibleDisponible;
    private final double umbralSeguro = 50; // Umbral seguro

    // Constructor
    public Recursos_Suministros(double aguaDisponible, double oxigenoDisponible, double comidaDisponible,
                                double combustibleDisponible) {
        this.aguaDisponible = aguaDisponible;
        this.oxigenoDisponible = oxigenoDisponible;
        this.comidaDisponible = comidaDisponible;
        this.combustibleDisponible = combustibleDisponible;
    }

    // Método para calcular el consumo de recursos durante un período dado
    public double[] calcularConsumoRecursos(double[] consumoDiario, int periodos) {
        double[] consumoTotal = new double[4];
        for (int i = 0; i < consumoDiario.length; i++) {
            consumoTotal[i] = consumoDiario[i] * periodos;
        }
        return consumoTotal;
    }

    // Método para verificar y activar alertas si los niveles de recursos están por debajo del umbral seguro
    public void verificarAlertas() {
        if (aguaDisponible < umbralSeguro) {
            System.out.println("¡Alerta! Nivel de agua por debajo del umbral seguro.");
        }
        if (oxigenoDisponible < umbralSeguro) {
            System.out.println("¡Alerta! Nivel de oxígeno por debajo del umbral seguro.");
        }
        if (comidaDisponible < umbralSeguro) {
            System.out.println("¡Alerta! Nivel de comida por debajo del umbral seguro.");
        }
        if (combustibleDisponible < umbralSeguro) {
            System.out.println("¡Alerta! Nivel de combustible por debajo del umbral seguro.");
        }
    }

    // Método para calcular estadísticas sobre el uso de recursos durante un período dado y mostrar los resultados
    public void mostrarRecursos(double[] consumoDiario, int periodos) {
        double[] consumoTotal = calcularConsumoRecursos(consumoDiario, periodos);
        System.out.println("Consumo total durante el período:");
        System.out.println("Agua: " + consumoTotal[0] + " litros");
        System.out.println("Oxígeno: " + consumoTotal[1] + " m3");
        System.out.println("Comida: " + consumoTotal[2] + " kg");
        System.out.println("Combustible: " + consumoTotal[3] + " litros");

        verificarAlertas();

        double[] estadisticas = calcularEstadisticas(consumoDiario, periodos);
        System.out.println("\nEstadísticas sobre el uso de recursos durante el período:");
        System.out.println("Media de agua consumida por día: " + estadisticas[0] / periodos + " litros");
        System.out.println("Media de oxígeno consumido por día: " + estadisticas[1] / periodos + " m3");
        System.out.println("Media de comida consumida por día: " + estadisticas[2] / periodos + " kg");
        System.out.println("Media de combustible consumido por día: " + estadisticas[3] / periodos + " litros");
    }

    // Método para calcular estadísticas sobre el uso de recursos durante un período dado
    private double[] calcularEstadisticas(double[] consumoDiario, int periodos) {
        double[] estadisticas = new double[4];
        for (int i = 0; i < consumoDiario.length; i++) {
            estadisticas[i] = consumoDiario[i] * periodos;
        }
        return estadisticas;
    }
}

