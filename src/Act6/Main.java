package Act6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangulo[] rect = new Rectangulo[10];

        // Crear 10 objetos Rectángulo con dimensiones aleatorias
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int base = (int) (random.nextDouble() * 10 + 1); // Valor entre 1 y 10
            int altura = (int) (random.nextDouble() * 10 + 1);
            rect[i] = new Rectangulo(4, base, altura);
        }

        // Ordenar los rectángulos según su área
        Arrays.sort(rect);

        // Imprimir los rectángulos ordenados
        System.out.println("Rectángulos ordenados por área: - Prueba 1 con for normal:");
        for (int i = 0; i < 10; i++) {
            System.out.println(rect[i]+ " - Área: " + rect[i].calcularArea());
        }
        System.out.println("---------------------------------");
        System.out.println("Rectángulos ordenados por área: - Prueba 2 con for each:");
        for (Rectangulo rectFinal : rect) {
            System.out.println(rectFinal+ " - Área: " + rectFinal.calcularArea());
        }
    }
}
