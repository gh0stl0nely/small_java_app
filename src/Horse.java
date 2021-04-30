public class Horse {
        
    private String name;
    private double speed;
    private double distance; 
    
    public static void main(String[] args) {
        
    }

    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
      
    public double getSpeed(){
        return speed;
    }
    
    public void setSpeed(double speed){
        this.speed = speed;
    }
    
    
      
    public double getDistance(){
        return distance;
    }
    
    public void setDistance(double distance){
        this.distance = distance;
    }

    public void move(){
        double newDistance = Math.random() * this.getSpeed();
        this.setDistance(newDistance + this.getDistance());
    }

    public void print(){
        String horseName = this.getName();
        int numberOfDots = (int) Math.floor(this.getDistance());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numberOfDots; i++){
            sb.append('.');
        }
        sb.append(horseName);
        System.out.println(sb.toString());
    }
}
