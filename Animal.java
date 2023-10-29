package Zoo;

public class Animal {
    String name;
    String type;
    String description;
    String sound;
    //new animal

    public Animal(String name, String type, String newDescription, String newSound) {
        this.name = name;
        this.type = type;
        this.sound = newSound;
        this.description = newDescription;
    }

    public static void addAnimal(String name, String type,String newDescription, String newSound) {
        Animal newAnimal = new Animal(name, type, newDescription, newSound);
        Main.Animallist.add(newAnimal);
        System.out.println("Animal added successfully.");
    }

    public static void updateAnimal(String currentName, String newName, String newType, String newDescription, String newSound) {
        for (Animal animal : Main.Animallist) {
            if (animal.name.equals(currentName)) {
                animal.name = newName;
                animal.type = newType;
                animal.description = newDescription;
                animal.sound = newSound;
                System.out.println("Animal updated successfully.");
                return;
            }
        }
        System.out.println("Animal not found in the list.");
    }

    public static void removeAnimal(String name) {
        for (Animal animal : Main.Animallist) {
            if (animal.name.equals(name)) {
                Main.Animallist.remove(animal);
                System.out.println("Animal removed successfully.");
                return;
            }
        }
        System.out.println("Animal not found in the list.");
    }
}
