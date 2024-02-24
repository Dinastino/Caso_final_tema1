
package org.example;
import java.util.Date;

public class CronometroCosmico {
    Date fechaTierra;
    Date fechaOtroPlaneta;

    static long FC = 2; // Factor de conversión

    public CronometroCosmico() {
        fechaTierra = new Date();
        long fnp = this.fechaTierra.getTime();
        fechaOtroPlaneta = new Date((long) (fnp * CronometroCosmico.getFC()));
    }

    public Date getFechaTierra() {
        return fechaTierra;
    }

    public Date getFechaOtroPlaneta() {
        return fechaOtroPlaneta;
    }

    public void setFechaTierra(Date fechaTierra) {
        this.fechaTierra = fechaTierra;
    }

    public void setFechaOtroPlaneta(Date fechaOtroPlaneta) {
        this.fechaOtroPlaneta = fechaOtroPlaneta;
    }

    public static double getFC() {
        return FC;
    }

    public static void setFC(long FC) {
        CronometroCosmico.FC = FC;
    }

    @Override
    public String toString() {
        return "CronometroCosmico{" +
                "fechaTierra=" + fechaTierra +
                "\n, fechaOtroPlaneta=" + fechaOtroPlaneta +
                '}';
    }


}
