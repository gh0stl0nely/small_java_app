import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private static Hippodrome game;
    private ArrayList<Horse> horses = new ArrayList<Horse>();
    public static void main(String[] args) {
        ArrayList<Horse> horseList = new ArrayList<Horse>();
        game = new Hippodrome(horseList);
        ArrayList<Horse> horses = game.getHorses();
        String name = null;
        for(int i = 0; i <= 2; i++){
            name = i == 0 ? "Andy" : (i == 1 ? "Bobby" : "Candy");
            horses.add(new Horse(name, 3.0,0));
        }
        game.run();
        game.printWinner();
    }

    public Hippodrome(ArrayList<Horse> horses){
        this.horses = horses;
    }

    public ArrayList<Horse> getHorses(){
        return horses;
    }

    public void move(){
        List<Horse> horses = this.getHorses();
        for(Horse horse : horses){
            horse.move();
        }
    }

    public void print(){
        List<Horse> horses = this.getHorses();
        for(Horse horse : horses){
            horse.print();
           
        }
        for(int i = 0; i < 10; i++){
            System.out.println("");
        }
    }

    public void run(){
        for(int i = 0; i < 20; i++){
            try {
                this.move();
                this.print();
                Thread.sleep(200); // Program will stop for 0.2 seconds
            } catch (InterruptedException ie){
                System.out.println("Program interrupted!");
            }
        }
    }

    public Horse getWinner(){
        Horse winner = null;
        
        for(Horse horse : this.getHorses()){
            if(winner == null){
                winner = horse;
            } else {
                int result = Double.compare(horse.getDistance(), winner.getDistance());
                if(result > 0)
                    winner = horse;
            }
        }
        
        return winner;
    }
    
    public void printWinner(){
        Horse winner = this.getWinner();
        System.out.println(String.format("The winner is %s", winner.getName()));
    }
}
