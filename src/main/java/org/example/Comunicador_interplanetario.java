package org.example;

import java.util.Scanner;

public class Comunicador_interplanetario {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Comunicador Interplanetario");
        System.out.println("Por favor, seleccione una opción:");
        System.out.println("1. Enviar mensaje");
        System.out.println("2. Recibir mensaje");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el mensaje a enviar: ");
                String mensajeEnviar = scanner.nextLine();
                enviarMensaje(mensajeEnviar);
                break;
            case 2:
                System.out.print("Ingrese el mensaje recibido: ");
                String mensajeRecibido = scanner.nextLine();
                recibirMensaje(mensajeRecibido);
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }

    public void enviarMensaje(String mensaje) {
        // Función para enviar mensajes a la base
        System.out.println("Mensaje enviado: " + mensaje);
        System.out.println("Análisis de mensaje:");
        System.out.println("Cantidad de vocales: " + contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + invertirMensaje(mensaje));
        System.out.println("Es palíndromo: " + esPalindromo(mensaje));
    }

    public void recibirMensaje(String mensaje) {
        // Función para recibir mensajes de la base
        System.out.println("Mensaje recibido: " + mensaje);
        System.out.println("Análisis de mensaje:");
        System.out.println("Cantidad de vocales: " + contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + invertirMensaje(mensaje));
        System.out.println("Es palíndromo: " + esPalindromo(mensaje));
    }

    public int contarVocales(String mensaje) {
        // Función para contar la cantidad de vocales en el mensaje
        int conteo = 0;
        mensaje = mensaje.toLowerCase();
        for (int i = 0; i < mensaje.length(); i++) {
            char c = mensaje.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                conteo++;
            }
        }
        return conteo;
    }

    public String invertirMensaje(String mensaje) {
        // Función para invertir el mensaje
        StringBuilder invertido = new StringBuilder();
        invertido.append(mensaje);
        invertido = invertido.reverse();
        return invertido.toString();
    }

    public boolean esPalindromo(String mensaje) {
        // Función para verificar si el mensaje es un palíndromo
        String mensajeSinEspacios = mensaje.replaceAll("\\s+", "").toLowerCase();
        String mensajeInvertido = invertirMensaje(mensajeSinEspacios);
        return mensajeSinEspacios.equals(mensajeInvertido);
    }
}
