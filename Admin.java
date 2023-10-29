package Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    static String username="admin123";
    static String password="c-a-2";

    public int getTotalvis() {
        return this.totalvis;
    }

    public void setTotalvis(int totalvis) {
        this.totalvis = totalvis;
    }

    public int getTotalrev() {
        return totalrev;
    }

    public void setTotalrev(int totalrev) {
        this.totalrev = totalrev;
    }

    static int totalvis=10;
    static int totalrev=100;


    //managing
    public static List<Attraction> attractions = new ArrayList<>();


    public static void addAttraction(String name,String description ) {
        Attraction touristAttraction = new Attraction();
            touristAttraction.attractname=name;
            touristAttraction.attractdescription=description;
            Admin.attractions.add(touristAttraction);

            System.out.println("Attraction added: " + name);
        }
    public static void removeAttractionByName(String name) {
        boolean removed = false;
        for (int i = 0; i < attractions.size(); i++) {
            Attraction attraction = attractions.get(i);
            if (attraction.getAttractname().equalsIgnoreCase(name)) {
                attractions.remove(i);
                removed = true;
                System.out.println("Attraction with name '" + name + "' removed.");
                i--;
            }
        }

        if (!removed) {
            System.out.println("Attraction with name '" + name + "' not found.");
        }
    }
    public static void modifyattraction(String name){
        for (Attraction att : attractions) {
            if ((att.attractname).equals(name)){
                System.out.print("Enter new name: ");
                Scanner scanner = new Scanner(System.in);
                String name1 = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Enter new description");
                String description1 = scanner.nextLine();
                att.attractname=name1;
                att.attractdescription=description1;
                System.out.println("Modified details correctly");



            }
        }


    }


















}


