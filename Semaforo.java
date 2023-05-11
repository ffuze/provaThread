public class Semaforo {
    
    private int stato;

    public Semaforo(int stato) {
        this.stato = stato;
    }

    public synchronized void P(){
        
        while(stato == 0){
            try{
                wait();
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        stato = 0;

    }

    public synchronized void V(){
        stato = 1;
    }

}
