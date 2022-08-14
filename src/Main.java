public class Main {
    public static void main(String[] args){

        Fighter hamilton = new Fighter("Tahir",10, 120, 100,55, 35);
        Fighter rosberg = new Fighter("Mehmet",20, 85, 85,30,45);

        Match match = new Match(hamilton,rosberg,85, 100);
        match.run();
    }
}
