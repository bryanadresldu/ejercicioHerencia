public class Docente extends Persona {
 public String facultadPertenece;
 public int horasAsignadasClases;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, int horasAsignadasClases, String facultadPertenece) {
        super(cedula, nombre, direccion, correo, telefono);
        this.horasAsignadasClases = horasAsignadasClases;
        this.facultadPertenece = facultadPertenece;
    }

    @Override
    public void mostrarInformacionPersonal() {
        System.out.println("            Informacion del docente");
        super.mostrarInformacionPersonal();
        System.out.println("Horas asignadas: " + horasAsignadasClases);
        System.out.println("Facultad a la que pertenece: " + facultadPertenece);
    }
}
