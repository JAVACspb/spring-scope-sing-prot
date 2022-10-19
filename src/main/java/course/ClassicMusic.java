package course;

public class ClassicMusic implements Music{
    private ClassicMusic(){}

    public static ClassicMusic getClassicalMusic(){
        return new ClassicMusic();
    }
    public void doMyInit(){
        System.out.println("Doing my Initialization classic");
    }
    public void doMyDestroy(){
        System.out.println("Doing my destruction classic");
    }
    @Override
    public String getSong() {
        return "Generics_Rapsody";
    }
}
