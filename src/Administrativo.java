public class Administrativo extends Persona{
    double salario;
    String area;

    public Administrativo(String cedula, String nombre, String direccion, String correo, String telefono, double salario, String area) {
        super(cedula, nombre, direccion, correo, telefono);
        this.salario = salario;
        this.area = area;
    }
   @Override
   public void mostrarInformacionPersonal(){
       System.out.println("     Informacion  del personal administrativo");
        super.mostrarInformacionPersonal();
       System.out.println("Salario: " + salario);
       System.out.println("Area: " + area);
   }

}
