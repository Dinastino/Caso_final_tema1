package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Planificador_tareas {
    private String nombre;
    private int duracion; // Duración estimada de la tarea en minutos

    public Planificador_tareas(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }
}

class MiembroTripulacion {
    private String nombre;
    private int cargaTrabajo; // Carga de trabajo acumulada en minutos

    public MiembroTripulacion(String nombre) {
        this.nombre = nombre;
        this.cargaTrabajo = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void asignarTarea(Planificador_tareas tarea) {
        cargaTrabajo += tarea.getDuracion();
    }
}

class PlanificadorTareas {
    private List<MiembroTripulacion> tripulacion;
    private List<Planificador_tareas> tareasDisponibles;

    public PlanificadorTareas() {
        tripulacion = new ArrayList<>();
        tareasDisponibles = new ArrayList<>();
    }

    public void agregarMiembroTripulacion(MiembroTripulacion miembro) {
        tripulacion.add(miembro);
    }

    public void agregarTarea(Planificador_tareas tarea) {
        tareasDisponibles.add(tarea);
    }

    public void distribuirTareas() {
        for (MiembroTripulacion miembro : tripulacion) {
            if (tareasDisponibles.isEmpty()) {
                System.out.println("No hay tareas disponibles para asignar.");
                return;
            }
            int indiceTarea = (int) (Math.random() * tareasDisponibles.size());
            Planificador_tareas tarea = tareasDisponibles.get(indiceTarea);
            miembro.asignarTarea(tarea);
            tareasDisponibles.remove(indiceTarea);
        }
    }

    public void mostrarHorariosYCargas() {
        for (MiembroTripulacion miembro : tripulacion) {
            System.out.println("Miembro: " + miembro.getNombre());
            System.out.println("Carga de trabajo: " + miembro.getCargaTrabajo() + " minutos");
            System.out.println("-----------------------------");
        }
    }
}

