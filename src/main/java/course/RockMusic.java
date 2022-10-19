package course;

public class RockMusic implements Music{
    public void doMyInit(){
        System.out.println("Doing my Initialization rock");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction rock");
    }
    @Override
    public String getSong() {
        return "Ace of Spades";
    }
}
