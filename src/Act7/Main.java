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

        System.out.println("Estudiantes sin ordenar"); //uno con for each
        for (Estudiante est: estudiantes){
            System.out.println(est);
        }

        System.out.println("---------------------------");

        Arrays.sort(estudiantes);
        System.out.println("Estudiantes ordenados"); // otro for normal
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);



        }
    }
}



