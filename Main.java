public class Main{
    public static void main(String[] args) throws Exception{
        Salvadanaio s = new Salvadanaio();
        Persona p1 = new Persona("Omen", s);
        Persona p2 = new Persona("Viper", s);

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        System.out.println(s.getDanaro());
    }
}