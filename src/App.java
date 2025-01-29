import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empctrol = new EmpleadoContoller();
        boolean result = empctrol.addEmpleado(new Empleado(1, "alexander", "seniar"));
        System.out.println("ingreso"+ result);
        result = empctrol.addEmpleado(new Empleado(1, "alexander", "senior"));
      System.out.println(result);

empctrol.addEmpleado(new Empleado(2, "alexander", "joven"));
empctrol.addEmpleado(new Empleado(3, "bryan", "joven"));
empctrol.addEmpleado(new Empleado(4, "limber", "joven"));

      empctrol.displayEmpleados();

empctrol.displayEmpleadosSoloNombres();
empctrol.displayEmpleadosValue();
empctrol.displayLlaves();

    }

    private static void runMapExamlpe() {
        
        new Mapa();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
