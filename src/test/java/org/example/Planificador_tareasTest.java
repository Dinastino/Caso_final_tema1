package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlanificadorTareasTest {

    @Test
    public void testAgregarMiembroTripulacion() {
        // Crear una instancia de PlanificadorTareas
        PlanificadorTareas planificador = new PlanificadorTareas();

        // Agregar un miembro a la tripulación
        planificador.agregarMiembroTripulacion(new MiembroTripulacion("John"));

        // Verificar que el miembro se agregó correctamente
        assertEquals(1, planificador.getTripulacion().size());
    }

    @Test
    public void testAgregarTarea() {
        // Crear una instancia de PlanificadorTareas
        PlanificadorTareas planificador = new PlanificadorTareas();

        // Agregar una tarea disponible
        planificador.agregarTarea(new Planificador_tareas("Tarea1", 30));

        // Verificar que la tarea se agregó correctamente
        assertEquals(1, planificador.getTareasDisponibles().size());
    }

    @Test
    public void testDistribuirTareas() {
        // Crear una instancia de PlanificadorTareas
        PlanificadorTareas planificador = new PlanificadorTareas();

        // Agregar miembros a la tripulación
        planificador.agregarMiembroTripulacion(new MiembroTripulacion("John"));
        planificador.agregarMiembroTripulacion(new MiembroTripulacion("Jane"));

        // Agregar tareas disponibles
        planificador.agregarTarea(new Planificador_tareas("Tarea1", 30));
        planificador.agregarTarea(new Planificador_tareas("Tarea2", 45));

        // Distribuir tareas entre la tripulación
        planificador.distribuirTareas();

        // Verificar que las tareas se distribuyeron correctamente
        assertEquals(0, planificador.getTareasDisponibles().size());
        assertEquals(1, planificador.getTripulacion().get(0).getCargaTrabajo());
        assertEquals(1, planificador.getTripulacion().get(1).getCargaTrabajo());
    }
}
