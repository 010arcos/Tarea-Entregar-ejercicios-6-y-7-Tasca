package Act6;




public class Rectangulo extends Forma implements Comparable<Rectangulo>{
    private int ancho;
    private int alto;

    public Rectangulo(int numLados, int ancho, int alto) {
        super(numLados);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea(){
        return alto*ancho;
    }


    @Override
    public int getArea() {
        return ancho*alto;
    }

    @Override
    public int getPerimeter() {
        return (2*ancho) * (2*alto);
    }


    @Override
    public int compareTo(Rectangulo RectB) {

        double areaActual = this.calcularArea();
        double areaB = RectB.calcularArea();

        if (areaActual < areaB) {
            return -1;
        } else if (areaActual > areaB) {
            return 1;
        } else {
            return 0;
        }

    }
/*
    public int CompareTo(Rectangulo o){
    int resultado;
    if(o.getArea() >this.getArea()){
    resultado=1;
    }
    else if(o.getArea()<this.getArea()){
    resultado=-1;
    }
    else{resultado=0;}
    return resultado;

    }
*/

    /*alternativa a este compareto

    @Override
    public int compareTo(Rectangulo otroRectangulo) {
        // Comparar por área
        return Integer.compare(this.calcularArea(), otroRectangulo.calcularArea());
    }
     */

    @Override
    public String toString() {
        return "Rectangulo: " +
                "Ancho:" + ancho +
                " Alto: " + alto ;
    }
}





