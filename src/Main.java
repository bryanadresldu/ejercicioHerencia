//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("181912748359","pedro","Quito","pedro@gmail.com","0938429445","Medicina","Sexto");
        estudiante1.mostrarInformacionPersonal();


        Docente docente=new Docente("04938128374","Camila","Ichimbia","camila@gmail.com","2948592",12,"Desarrollo");
        docente.mostrarInformacionPersonal();

        Estudiante_Presencial estudiante_presencial =new Estudiante_Presencial("04938128374","Luisa","Calderon","luisa@gmail.com","294859","sistemas","segundo",5,"7--12");
        estudiante_presencial.mostrarInformacionPersonal();
        int edad=estudiante_presencial.calcularEdad(2003,2025);
        System.out.println("Edad: " + edad);

        Estudiante_Virtual estudiante_virtual =new Estudiante_Virtual("18938128374","Ruth","Quitumbe","ruth@gmail.com","492853","sistemas","tercero","Teams","Pablo");
        estudiante_virtual.mostrarInformacionPersonal();
        edad=estudiante_virtual.calcularEdad(2008,2025);
        System.out.println("Edad: " + edad);

        Estudiante estudiante2=new Estudiante("181912748359","pedro","Quito","pedro@gmail.com","0938429445","Medicina","Sexto");
        estudiante2.mostrarInformacionPersonal();
        edad=estudiante2.calcularEdad(2000,2025);
        System.out.println("Edad: " + edad);

        Docente_linea docenteLinea=new Docente_linea("67838128374","Yolanda","Cayambe","yola@gmail.com",12,"Desarrollo","Ocasional");
        docenteLinea.mostrarInformacionPersonal();

    }
}