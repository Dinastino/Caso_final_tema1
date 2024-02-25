package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la mision espacial Cronos");
        System.out.println("---------------------------------------------");
        System.out.println("Por favor, Introduzca su usuario y contraseña:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();
        System.out.println("---------------------------------------------");

        if (usuario.equals("Cronos-1") && contrasena.equals("sufrimiento")) {
            System.out.println("Bienvenido, " + usuario + ", inciando sistema...");
            System.out.println("---------------------------------------------");

            CronometroCosmico cronometro = new CronometroCosmico();
            System.out.println(cronometro);

            System.out.println("---------------------------------------------");

            Scanner scanner2 = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de agua disponible (en litros):");
            double aguaDisponible = scanner2.nextDouble();
            System.out.println("Ingrese la cantidad de oxígeno disponible (en m3):");
            double oxigenoDisponible = scanner2.nextDouble();
            System.out.println("Ingrese la cantidad de comida disponible (en kg):");
            double comidaDisponible = scanner2.nextDouble();
            System.out.println("Ingrese la cantidad de combustible disponible (en litros):");
            double combustibleDisponible = scanner2.nextDouble();
            Recursos_Suministros recursos = new Recursos_Suministros(aguaDisponible, oxigenoDisponible, comidaDisponible,
                    combustibleDisponible);

            double[] consumoDiario = {10, 5, 3, 15}; // Consumo diario de agua, oxígeno, comida y combustible respectivamente
            int periodos = 5;

            recursos.mostrarRecursos(consumoDiario, periodos);

            scanner.close();

            System.out.println("---------------------------------------------");

            Alerta_monitoreo alerta = new Alerta_monitoreo();
            alerta.actualizarNivelRadiacion(150);
            alerta.actualizarTemperatura(45);
            alerta.actualizarPresion(130);
            alerta.verificarValoresExtremos();
            System.out.println("---------------------------------------------");

            Scanner scanner1 = new Scanner(System.in);

            // Crear una instancia de PlanificadorTareas
            PlanificadorTareas planificador = new PlanificadorTareas();
            System.out.println("Ingrese los miembros de la tripulación (escriba 'fin' para terminar):");
            String nombreMiembro;
            while (true) {
                System.out.print("Nombre del miembro: ");
                nombreMiembro = scanner1.nextLine();
                if (nombreMiembro.equalsIgnoreCase("fin")) {
                    break;
                }
                MiembroTripulacion miembro = new MiembroTripulacion(nombreMiembro);
                planificador.agregarMiembroTripulacion(miembro);
            }

            System.out.println("Ingrese las tareas disponibles (escriba 'fin' para terminar):");
            String nombreTarea;
            int duracionTarea;
            while (true) {
                System.out.print("Nombre de la tarea: ");
                nombreTarea = scanner1.nextLine();
                if (nombreTarea.equalsIgnoreCase("fin")) {
                    break;
                }
                System.out.print("Duración de la tarea (minutos): ");
                duracionTarea = Integer.parseInt(scanner1.nextLine());
                Planificador_tareas tarea = new Planificador_tareas(nombreTarea, duracionTarea);
                planificador.agregarTarea(tarea);
            }

            scanner1.close();
            planificador.distribuirTareas();
            planificador.mostrarHorariosYCargas();

            System.out.println("---------------------------------------------");

            Navegador_estelar navegador = new Navegador_estelar(4, 4);
            navegador.visualizar();
            navegador.planificarConstruccion(1, 1, 2);
            navegador.planificarConstruccion(3, 3, 3);
            navegador.visualizar();
            navegador.calcularRutaOptima();

            System.out.println("---------------------------------------------");

            Comunicador_interplanetario comunicador = new Comunicador_interplanetario();
            comunicador.iniciar();

            System.out.println("---------------------------------------------");

        } else {
            System.out.println("Usuario o contraseña incorrectos");
            return;
        }
    }
}