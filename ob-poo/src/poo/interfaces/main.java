package poo.interfaces;

import java.util.List;

public class main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado Armando = new Empleado("Armando", 25, 5000, true);
        Empleado Patricia = new Empleado("Patricia", 25, 5000, true);
        Empleado Emily = new Empleado("Emily", 25, 5000, true);

        //guardar empleados
        empleadoCRUD.guardar(Armando);
        empleadoCRUD.guardar(Patricia);
        empleadoCRUD.guardar(Emily);

        //consultar empleados
        List<Empleado> empleadoList = empleadoCRUD.findALL();
        System.out.println(empleadoList);

    }

}
