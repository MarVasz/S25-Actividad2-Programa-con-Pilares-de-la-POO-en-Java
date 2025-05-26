public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", "Pérez", "Masculino", 25);
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Género: " + p.getGenero());
        System.out.println("Edad: " + p.getEdad());
    }
}
