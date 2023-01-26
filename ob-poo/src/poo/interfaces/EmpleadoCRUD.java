package poo.interfaces;

import java.util.ArrayList;
import java.util.List;
public class EmpleadoCRUD {

    // estructura de datos
    List<Empleado> empleadolist = new ArrayList<>();

    //operaciones CRUD
    //create guardar un empleado
    public void guardar(Empleado empleado){

        empleadolist.add(empleado);
    }

    public List<Empleado> findALL(){
        return empleadolist;
    }


}
