package Act7;

import Act6.Rectangulo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Estudiante e1= new Estudiante("Patri", 170, 12);
        Estudiante e2= new Estudiante("Manuel", 173, 43);
        Estudiante e3= new Estudiante("Javier", 189, 72);
        Estudiante e4= new Estudiante("Alicia", 168, 52);
        Estudiante e5= new Estudiante("Alberto", 189, 35);

        Estudiante[] estudiantes = { e1, e2, e3, e4, e5 };

        System.out.println("Estudiantes sin ordenar");
        int cont = 1;//uno con for each
        for (Estudiante est: estudiantes){
            System.out.println(cont+ "." + est);
            cont++;
        }

        System.out.println("---------------------------");

        Arrays.sort(estudiantes);
        System.out.println("Estudiantes ordenados"); // otro for normal
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println( (i+1)+"."+estudiantes[i]);



        }
    }
}



/*
CON ARRAYLIST Y COLLECTIONSHORT
 public static void main(String[] args) {
        // Crear estudiantes
        Estudiante patri = new Estudiante("Patri", 12, 170);
        Estudiante manuel = new Estudiante("Manuel", 43, 173);
        Estudiante javier = new Estudiante("Javier", 72, 189);
        Estudiante alicia = new Estudiante("Alicia", 52, 168);
        Estudiante alberto = new Estudiante("Alberto", 35, 189);

        // Crear lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(patri);
        estudiantes.add(manuel);
        estudiantes.add(javier);
        estudiantes.add(alicia);
        estudiantes.add(alberto);

        // Mostrar estudiantes sin ordenar
        System.out.println("Estudiantes sin ordenar:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }

        // Ordenar estudiantes
        Collections.sort(estudiantes);

        // Mostrar estudiantes ordenados
        System.out.println("\nEstudiantes ordenados:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
 */


/*
ARRAYLIST CON ARRAYSHORT
import java.util.ArrayList;
import java.util.Arrays;



    public static void main(String[] args) {
        // Crear estudiantes
        Estudiante patri = new Estudiante("Patri", 12, 170);
        Estudiante manuel = new Estudiante("Manuel", 43, 173);
        Estudiante javier = new Estudiante("Javier", 72, 189);
        Estudiante alicia = new Estudiante("Alicia", 52, 168);
        Estudiante alberto = new Estudiante("Alberto", 35, 189);

        // Crear lista de estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(patri);
        estudiantes.add(manuel);
        estudiantes.add(javier);
        estudiantes.add(alicia);
        estudiantes.add(alberto);

        // Convertir ArrayList a array
        Estudiante[] estudiantesArray = estudiantes.toArray(new Estudiante[estudiantes.size()]);

        // Mostrar estudiantes sin ordenar
        System.out.println("Estudiantes sin ordenar:");
        for (int i = 0; i < estudiantesArray.length; i++) {
            System.out.println((i + 1) + ". " + estudiantesArray[i]);
        }

        // Ordenar estudiantes
        Arrays.sort(estudiantesArray);

        // Mostrar estudiantes ordenados
        System.out.println("\nEstudiantes ordenados:");
        for (int i = 0; i < estudiantesArray.length; i++) {
            System.out.println((i + 1) + ". " + estudiantesArray[i]);
        }
    }
}

 */