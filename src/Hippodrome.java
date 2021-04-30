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
    }

    public Hippodrome(ArrayList<Horse> horses){
        this.horses = horses;
    }

    public ArrayList<Horse> getHorses(){
        return horses;
    }
}
