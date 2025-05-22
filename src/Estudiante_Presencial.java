public class Estudiante_Presencial extends Estudiante {

    int horasPresenciales;
    String horario;

    public Estudiante_Presencial(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, int horasPresenciales, String horario) {
        super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
        this.horasPresenciales = horasPresenciales;
        this.horario = horario;
    }

    @Override
    public void mostrarInformacionPersonal(){
        System.out.println("             Estudiante Presencial");
        super.mostrarInformacionPersonal();
        System.out.println("Horas presenciales: " + horasPresenciales);
        System.out.println("Horario: " + horario);

    }

    public void calcularEdad(int anioNacimiento, int anioActual){

        super.calcularEdad(anioNacimiento, anioActual);
    }

}
