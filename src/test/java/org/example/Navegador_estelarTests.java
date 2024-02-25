package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Navegador_estelarTest {

    @Test
    public void testPlanificarConstruccion_PosicionValida() {
        // Crear una instancia de Navegador_estelar
        Navegador_estelar navegador = new Navegador_estelar(5, 5);

        // Planificar una construcción en una posición válida
        navegador.planificarConstruccion(2, 3, 1);

        // Verificar que se planificó la construcción correctamente
        assertEquals(1, navegador.getConstrucciones()[2][3]);
    }

    @Test
    public void testPlanificarConstruccion_PosicionInvalida() {
        // Crear una instancia de Navegador_estelar
        Navegador_estelar navegador = new Navegador_estelar(5, 5);

        // Planificar una construcción en una posición fuera de los límites del terreno
        navegador.planificarConstruccion(6, 3, 1);

        // Verificar que no se planificó la construcción
        assertEquals(0, navegador.getConstrucciones()[6][3]);
    }

    @Test
    public void testPlanificarConstruccion_ConstruccionExistente() {
        // Crear una instancia de Navegador_estelar
        Navegador_estelar navegador = new Navegador_estelar(5, 5);

        // Planificar una construcción en una posición válida
        navegador.planificarConstruccion(2, 3, 1);

        // Planificar otra construcción en la misma posición
        navegador.planificarConstruccion(2, 3, 2);

        // Verificar que no se sobrescribió la construcción existente
        assertEquals(1, navegador.getConstrucciones()[2][3]);
    }

    @Test
    public void testCalcularRutaOptima() {
        // Crear una instancia de Navegador_estelar
        Navegador_estelar navegador = new Navegador_estelar(4, 4);

        // No se puede probar la salida de este método porque imprime directamente en la consola
        // Se podría considerar la refactorización del método para que devuelva el resultado en lugar de imprimirlo
    }
}