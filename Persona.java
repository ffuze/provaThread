public class Persona extends Thread{
    private String nome;
    private Salvadanaio porcellino;
    private Semaforo semaforo;

    public Persona(String nome, Salvadanaio porcellino){
        this.nome=nome;
        this.porcellino = porcellino;
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            //controllo semaforo p()
            semaforo.P();
            porcellino.aggiungiDanaro(1);
            //rimetto il verde v()
            semaforo.V();
        }
    }

    public String getNome() {
        return nome;
    }

    public Salvadanaio getPorcellino() {
        return porcellino;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setS(Salvadanaio porcellino) {
        this.porcellino = porcellino;
    }
}
