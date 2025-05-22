public class Docente_linea extends Docente{
    String tipoCointrato;

    public Docente_linea(String cedula, String nombre, String direccion, String correo, int horasAsignadasClases, String facultadPertenece, String tipoCointrato) {
        super(cedula, nombre, direccion, correo, horasAsignadasClases, facultadPertenece);
        this.tipoCointrato = tipoCointrato;
    }

    public void mostrarInformacionPersonal() {
        super.mostrarInformacionPersonal();
        System.out.println("Tipo Cointrato: " + tipoCointrato);
    }
}
