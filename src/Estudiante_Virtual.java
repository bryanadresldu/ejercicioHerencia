public class Estudiante_Virtual extends Estudiante{
            String plataforma;
            String tutorVirtual;

            public Estudiante_Virtual(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, String plataforma, String tutorVirtual) {
                super(cedula, nombre, direccion, correo, telefono, carrera, nivel);
                this.plataforma = plataforma;
                this.tutorVirtual = tutorVirtual;
            }

            @Override
            public void mostrarInformacionPersonal() {
                System.out.println("               Estudiante Virtual");
                super.mostrarInformacionPersonal();
                System.out.println("Plataforma: " + plataforma);
                System.out.println("Tutor Virtual: " + tutorVirtual);
            }

            public void calcularEdad(int anioNacimiento, int anioActual){

                super.calcularEdad(anioNacimiento, anioActual);
            }

}
