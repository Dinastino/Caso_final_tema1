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








        } else {
            System.out.println("Usuario o contraseña incorrectos");
            return;
        }
    }
}