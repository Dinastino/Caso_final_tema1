package org.example;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class CronometroCosmicoTest {

    @Test
    public void testConversionFecha() {
        // Crear una instancia de CronometroCosmico
        CronometroCosmico cronometro = new CronometroCosmico();

        // Obtener la fecha de la Tierra y la fecha de otro planeta
        Date fechaTierra = cronometro.getFechaTierra();
        Date fechaOtroPlaneta = cronometro.getFechaOtroPlaneta();

        // Verificar que las fechas no son nulas
        assertNotNull(fechaTierra);
        assertNotNull(fechaOtroPlaneta);

        // Verificar que la fecha de otro planeta es distinta de la fecha de la Tierra
        assertNotEquals(fechaTierra, fechaOtroPlaneta);

        // Probar el método de conversión FC
        double FC = CronometroCosmico.getFC();
        long tiempoTierra = fechaTierra.getTime();
        long tiempoOtroPlaneta = fechaOtroPlaneta.getTime();
        assertEquals(tiempoOtroPlaneta, (long) (tiempoTierra * FC));
    }
}
