public class Vaca {
    private String nombre;
    private int peso;
    private Leche lech_vaca;
    
    public Vaca (String nombre) {
        this.nombre = nombre;
        peso = 100;
        lech_vaca = new Leche(false, 0);
    }
}