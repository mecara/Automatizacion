package co.com.qvision.models;

public class InformacionDeBusqueda {

    private String locacion;
    private String fechaIngreso;
    private String fechaSalida;

    public InformacionDeBusqueda(String locacion, String fechaIngreso, String fechaSalida) {
        this.locacion = locacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public String getLocacion() {
        return locacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }
}
