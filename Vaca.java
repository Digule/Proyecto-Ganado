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
    
    public void setLeche(boolean cambiarGrumos, double cambiarLitros){
        lech_vaca.setGrumos(cambiarGrumos);
        lech_vaca.setLitros(cambiarLitros);
    }
    
    public void imprimirDetalles() {
        String contiene = "";
        if (lech_vaca.getGrumos()) {
            contiene = "si";
        }
        else {
            contiene = "no";
        }
        System.out.println("El nombre de esta vaca es: " + nombre + " |La vaca pesa: " + peso + " |La vaca tiene " + lech_vaca.getLitros() + " L de leche" + " |Esta leche " + contiene
        + " contiene grumos");
    }
}