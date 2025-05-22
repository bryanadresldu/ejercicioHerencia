public class Estudiante extends Persona {
   public  String carrera, nivel;

    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel) {
        super(cedula, nombre, direccion, correo, telefono);
        this.carrera = carrera;
        this.nivel = nivel;
    }
    @Override
    public void mostrarInformacionPersonal(){
        System.out.println("            Informacion del estudiante");
        super.mostrarInformacionPersonal();
        System.out.println("Carrera: " + carrera);
        System.out.println("Nivel: " + nivel);

    }

    public int calcularEdad(int anioNacimiento, int anioActual){

        return anioActual - anioNacimiento;
    }
}
