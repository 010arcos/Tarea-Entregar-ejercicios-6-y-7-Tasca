package Act7;

public class Estudiante implements Comparable<Estudiante> {
    private String nombre;
    private int altura;
    private int edad;


    @Override
    public String toString() {
        return "Estudiante: " +
                "Nombre='" + nombre + '\'' +
                ", Altura=" + altura +
                ", Edad=" + edad;
    }

    public Estudiante(String nombre, int altura, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    @Override
    public int compareTo(Estudiante o) {

        // Primero comparamos por altura (de mayor a menor)
        int comparacionAltura = Integer.compare(o.altura, this.altura); // TIENE QUE DAR UN NUMERO POSITIVO PARA QUE SE ORDENE DE MAYOR A MENOR
        if (comparacionAltura != 0) {
            return comparacionAltura;
        }
        // Si la altura es la misma, comparamos por edad (de menor a mayor)
        return Integer.compare(this.edad, o.edad);
    }
}

//compare(x-y)