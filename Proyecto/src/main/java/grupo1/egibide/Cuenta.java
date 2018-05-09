package grupo1.egibide;

public class Cuenta {
    private String nombre;
    private String contrasenya;
    private int tipoCuenta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Cuenta(String nombre, String contrasenya, int tipoCuenta) {
        this.nombre = nombre;
        this.contrasenya = contrasenya;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombre='" + nombre + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", tipoCuenta=" + tipoCuenta +
                '}';
    }


}
