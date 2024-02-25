package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Recursos_SuministrosTest {

    @Test
    public void testCalcularConsumoRecursos() {

        Recursos_Suministros recursos = new Recursos_Suministros(100, 100, 100, 100);
        double[] consumoDiario = {5, 5, 5, 5};
        int periodos = 3;


        double[] consumoTotal = recursos.calcularConsumoRecursos(consumoDiario, periodos);


        assertArrayEquals(new double[]{15, 15, 15, 15}, consumoTotal);
    }

    @Test
    public void testVerificarAlertas() {
        // Crear una instancia de Recursos_Suministros con niveles bajos de recursos
        Recursos_Suministros recursos = new Recursos_Suministros(40, 30, 20, 10);

        // Verificar que se activan las alertas correspondientes
        assertDoesNotThrow(recursos::verificarAlertas);
    }

    @Test
    public void testMostrarRecursos() {
        // Crear una instancia de Recursos_Suministros
        Recursos_Suministros recursos = new Recursos_Suministros(100, 100, 100, 100);

        // Definir el consumo diario y el número de periodos
        double[] consumoDiario = {5, 5, 5, 5};
        int periodos = 3;

        // Verificar que no se producen excepciones al mostrar los recursos
        assertDoesNotThrow(() -> recursos.mostrarRecursos(consumoDiario, periodos));
    }
}
