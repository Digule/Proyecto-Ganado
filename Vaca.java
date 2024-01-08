public class Vaca {
    private String nombre;
    private int peso;
    private Leche lech_vaca;
    
    public Vaca (String nombre) {
        this.nombre = nombre;
        peso = 100;
        lech_vaca = new Leche(false, 0);
        }
        
    public String getNombre() {
        return nombre;
    }
    
    public int getPeso() {
        return peso;
    }
    
    public Leche getLeche() {
        return lech_vaca;
    }
    
    public void setNombre(String cambiarNombre){
        nombre = cambiarNombre;
    }
    
    public void setPeso(int cambiarPeso){
        peso = cambiarPeso;
    }
    
    public void setNombre(boolean cambiarGrumos, double cambiarLitros){
        lech_vaca.setGrumos(cambiarGrumos);
        lech_vaca.setLitros(cambiarLitros);
    }
    
}