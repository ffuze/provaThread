public class Salvadanaio {
    private double danaro;

    public Salvadanaio(){
        this.danaro = 0;
    }

    public Salvadanaio(int danaro) {
        this.danaro = danaro;
    }

    public void aggiungiDanaro(double danaroAgg){
        this.danaro+=danaroAgg;
    }

    public double getDanaro() {
        return danaro;
    }

    public void setDanaro(double danaro) {
        this.danaro = danaro;
    }
}
