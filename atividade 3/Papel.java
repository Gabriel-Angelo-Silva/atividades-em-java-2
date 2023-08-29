public class Papel {
    private String marca;
    private int papelU, paginasV;

    public Papel(String marca, int paginasV) {
        this.marca = marca;
        this.paginasV = paginasV;
    }

    public int getPapelU() {
        return papelU;
    }
    
    public void setPapelU(int papelU) {
        this.papelU = papelU;
    } 
    
    public int getPaginasV() {
        return paginasV;
    }
    
    public int preencher_Papel() {
        paginasV -= papelU;
        return paginasV;
    }
}
