package Zoo;

public class Reptiles extends Animal implements MakeSound{
    String Rdescription;
    String Rtype;

    public Reptiles(String name, String type, String newDescription, String newSound) {
        super(name, type,newDescription,newSound);
    }
    public String sound(){
        return this.sound;
    };
}
