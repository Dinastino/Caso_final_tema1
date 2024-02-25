package org.example;

public class Recursos_Suministros {
    private int cantidad;
    private String tipo;

    public Recursos_Suministros(int cantidad, String tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Recursos_Suministros{" +
                "cantidad= " + cantidad +
                "\ntipo= " + tipo +
                "\n}";
    }
}
