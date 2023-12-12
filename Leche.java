public class Leche
{
    private boolean grumos;
    private double litros;

    public Leche(boolean tieneGrumos, double litrosLeche){
        grumos = tieneGrumos;
        litros = litrosLeche;
    }
    
    public boolean getGrumos() {
        return grumos;
    }
    
    public void setGrumos(boolean grum) {
        grumos = grum;
    }
    
    public double getLitros() {
        return litros;
    }
    
    public void setLitros(double lit) {
        litros = lit;
    }
}