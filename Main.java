import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[5];

        // Capturar datos
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        // a) Mostrar nombre y género
        System.out.println("\n--- Nombres y géneros ---");
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre() + ", Género: " + p.getGenero());
        }

        // b) Promedio de edades
        double sumaEdades = 0;
        for (Persona p : personas) {
            sumaEdades += p.getEdad();
        }
        double promedio = sumaEdades / personas.length;
        System.out.println("\nPromedio de edades: " + promedio);

        // c) Contar géneros
        int contadorMasculino = 0;
        int contadorFemenino = 0;

        for (Persona p : personas) {
            if (p.getGenero().equalsIgnoreCase("Masculino")) {
                contadorMasculino++;
            } else if (p.getGenero().equalsIgnoreCase("Femenino")) {
                contadorFemenino++;
            }
        }

        System.out.println("Cantidad de personas Masculinas: " + contadorMasculino);
        System.out.println("Cantidad de personas Femeninas: " + contadorFemenino);
    }
}
