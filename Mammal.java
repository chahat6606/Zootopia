package Zoo;

public class Mammal extends Animal implements MakeSound{
    String Mdescription;
    String Mtype;

    public Mammal(String name, String type, String newDescription, String newSound) {
        super(name, type,newDescription,newSound);
    }
    public String sound(){
        return this.sound;
    };
}
