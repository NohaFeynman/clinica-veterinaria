public class Mascota {
    private String nombre;
    private String especie;

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void mostrar() {
        System.out.println("Mascota: " + nombre + " (" + especie + ")");
    }
}
