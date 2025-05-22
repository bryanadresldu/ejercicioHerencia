public class Persona{

    String cedula, nombre, direccion, correo, telefono;

    public Persona(String cedula, String nombre, String direccion, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Persona(String cedula, String nombre, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }

    public void mostrarInformacionPersonal() {
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
    }
}
