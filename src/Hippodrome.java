import java.util.ArrayList;

public class Hippodrome {
    private ArrayList<Horse> horses = new ArrayList();
    public static void main(String[] args) {
        
    }

    public Hippodrome(List<Horse> horses){
        this.horses = horses;
    }

    public ArrayList<Horse> getHorses(){
        return horses;
    }
}
