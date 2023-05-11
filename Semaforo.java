public class Semaforo {
    
    private int stato;

    public Semaforo(int stato) {
        this.stato = stato;
    }

    public void P(){
        
        while(stato == 0){

        }

        stato = 0;

    }

    public void V(){
        stato = 1;
    }

}
