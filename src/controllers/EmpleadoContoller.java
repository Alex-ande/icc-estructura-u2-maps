package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {
    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();
    }

    public boolean addEmpleado(Empleado empleado) {
        if (empleados.containsKey(empleado.getId())) {
            return false;
        }
        empleados.put(empleado.getId(), empleado);

        return true;
    }
    public Empleado getEmpleadoById (int id){
return empleados.get(id);
    }
    public void displayEmpleados (){
        for (Map.Entry<Integer, Empleado> empeladoEntry : empleados.entrySet()) {
            System.out.println(empeladoEntry.getKey()+"--"+empeladoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres (){
        for (Map.Entry<Integer, Empleado> empeladoEntry : empleados.entrySet()) {
            System.out.println(empeladoEntry.getKey()+"--"+empeladoEntry.getKey());
        }
    }
    //sin usuar entryset

    public void displayLlaves(){
for (Integer key : empleados.keySet()) {
    System.out.println();
}
    }
    // sin usuar entryset
    public void displayEmpleadosValue(){
for (Empleado valor : empleados.values()) {
   System.out.println(valor); 
}
    }
}