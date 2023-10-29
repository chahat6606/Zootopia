package Zoo;

public class Amphibian extends Animal implements MakeSound{
    public String getAdescription() {
        return Adescription;
    }

    public void setAdescription(String adescription) {
        Adescription = adescription;
    }

    public String getAtype() {
        return Atype;
    }

    public void setAtype(String atype) {
        Atype = atype;
    }

    String Adescription;
    String Atype;

    public Amphibian(String name, String type, String newDescription, String newSound) {
        super(name, type,newDescription,newSound);
    }
    public String sound(){
        return this.sound;
    };
}
