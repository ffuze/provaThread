public class Persona extends Thread{
    private String nome;
    private Salvadanaio s;

    public Persona(String nome, Salvadanaio s){
        this.nome=nome;
        this.s = s;
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            s.aggiungiDanaro(1);
        }
    }

    public String getNome() {
        return nome;
    }

    public Salvadanaio getS() {
        return s;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setS(Salvadanaio s) {
        this.s = s;
    }
}
