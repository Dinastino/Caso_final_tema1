package org.example;
import java.util.ArrayList;

public class Alerta_monitoreo {

    private double nivelRadiacion;
    private double temperatura;
    private double presion;
    private ArrayList<String> eventosCriticos;
    private int contadorEventos;

    public Alerta_monitoreo() {
        // Inicialización de variables
        this.nivelRadiacion = 0.0;
        this.temperatura = 0.0;
        this.presion = 0.0;
        this.eventosCriticos = new ArrayList<>();
        this.contadorEventos = 0;
    }


    public void actualizarNivelRadiacion(double nivelRadiacion) {
        this.nivelRadiacion = nivelRadiacion;
        verificarValoresExtremos();
    }

    public void actualizarTemperatura(double temperatura) {
        this.temperatura = temperatura;
        verificarValoresExtremos();
    }

    public void actualizarPresion(double presion) {
        this.presion = presion;
        verificarValoresExtremos();
    }

    // Método para verificar y alertar sobre valores extremos
    public void verificarValoresExtremos() {
        if (nivelRadiacion > 100 || temperatura > 40 || presion > 120) {
            System.out.println("¡Alerta! Se han detectado valores extremos:");
            if (nivelRadiacion > 100) {
                System.out.println("   - Nivel de radiación: " + nivelRadiacion);
                registrarEvento("Nivel de radiación alto: " + nivelRadiacion);
            }
            if (temperatura > 40) {
                System.out.println("   - Temperatura: " + temperatura);
                registrarEvento("Temperatura alta: " + temperatura);
            }
            if (presion > 120) {
                System.out.println("   - Presión: " + presion);
                registrarEvento("Presión alta: " + presion);
            }
            // Aquí podrías agregar lógica para sugerir ajustes
        } else {
            System.out.println("Los valores ambientales están dentro de los límites normales.");
        }
    }

    // Método para registrar eventos críticos
    private void registrarEvento(String evento) {
        if (contadorEventos < 5) {
            eventosCriticos.add(evento);
            contadorEventos++;
        }
    }

    public void listarEventosCriticos() {
        if (eventosCriticos.isEmpty()) {
            System.out.println("No se han registrado eventos críticos.");
        } else {
            System.out.println("Listado de eventos críticos:");
            for (String evento : eventosCriticos) {
                System.out.println(" - " + evento);
            }
        }
    }
}


