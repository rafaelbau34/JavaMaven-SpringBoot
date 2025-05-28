public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Bernardo");
        estudiante.setCalificacion(60.0);

        System.out.println(estudiante.getNombre());
        System.out.println(estudiante.getCalificacion());
    }
}
