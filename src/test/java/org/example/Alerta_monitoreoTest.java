package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Alerta_monitoreoTest {

    @Test
    public void testVerificarValoresExtremos_NivelRadiacionAlto() {
        // Crear una instancia de Alerta_monitoreo
        Alerta_monitoreo alerta = new Alerta_monitoreo();

        // Actualizar el nivel de radiación por encima del umbral
        alerta.actualizarNivelRadiacion(150);

        // Verificar que se genera una alerta
        assertEquals("¡Alerta! Se han detectado valores extremos:\n   - Nivel de radiación: 150.0", alerta.listarEventosCriticos());
    }

    @Test
    public void testVerificarValoresExtremos_TemperaturaAlta() {
        // Crear una instancia de Alerta_monitoreo
        Alerta_monitoreo alerta = new Alerta_monitoreo();

        // Actualizar la temperatura por encima del umbral
        alerta.actualizarTemperatura(45);

        // Verificar que se genera una alerta
        assertEquals("¡Alerta! Se han detectado valores extremos:\n   - Temperatura: 45.0", alerta.listarEventosCriticos());
    }

    @Test
    public void testVerificarValoresExtremos_PresionAlta() {
        // Crear una instancia de Alerta_monitoreo
        Alerta_monitoreo alerta = new Alerta_monitoreo();

        // Actualizar la presión por encima del umbral
        alerta.actualizarPresion(130);

        // Verificar que se genera una alerta
        assertEquals("¡Alerta! Se han detectado valores extremos:\n   - Presión: 130.0", alerta.listarEventosCriticos());
    }

    @Test
    public void testListarEventosCriticos_SinEventos() {
        // Crear una instancia de Alerta_monitoreo
        Alerta_monitoreo alerta = new Alerta_monitoreo();

        // Verificar que no se han registrado eventos críticos
        assertEquals("No se han registrado eventos críticos.", alerta.listarEventosCriticos());
    }
}
