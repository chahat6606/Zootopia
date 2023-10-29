package Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static List<Visitor> visitorList = new ArrayList<>();
    public static List<Animal>  Animallist=new ArrayList<>();
    public static List<Discount> discountlist=new ArrayList<>();
    public static List<Sdeal> specialdiscountlist=new ArrayList<>();


    public static void admin() {
        System.out.println("Admin menu \n 1. Manage Attractions \n 2. Manage Animals \n 3. Schedule Events \n 4. Set Discounts \n 5. Set Special Deal \n 6. View Visitor Stats \n 7. View Feedback \n 8. Exit");
        System.out.println("Enter your choice:");

        try (Scanner scanner = new Scanner(System.in)) {
            int nl1 = scanner.nextInt();
            scanner.nextLine();

            switch (nl1) {
                case 1:
                    System.out.println("Manage Attractions:\n" +
                            "1. Add Attraction\n" +
                            "2. View Attractions\n" +
                            "3. Modify Attraction\n" +
                            "4. Remove Attraction\n" +
                            "5. Exit");
                    System.out.println("Enter your choice :");
                    int nl2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (nl2) {
                        case 1:
                            System.out.print("Enter name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter description: ");
                            String description = scanner.nextLine();
                            Admin.addAttraction(name, description);
                            admin();
                            break;
                        case 2:
                            for (Attraction att : Admin.attractions) {
                                System.out.println("Name: " + att.getAttractname());
                                System.out.println("Description: " + att.getAttractdescription());
                                System.out.println();
                            }
                            admin();
                            break;
                        case 4:
                            System.out.println("Enter the name of attraction you want to remove");
                            String nl3 = scanner.nextLine();
                            Admin.removeAttractionByName(nl3);
                            admin();
                            break;
                        case 3:
                            System.out.println("Enter the name of attraction you want to modify");
                            String modiname = scanner.nextLine();
                            Admin.modifyattraction(modiname);
                            admin();
                            break;
                        case 5:
                            admin();
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break;
                case 2:
                    System.out.println("Manage Animals:\n 1. Add Animal \n 2. Update Animal Details \n 3. Remove Animal \n 4. Exit");
                    System.out.println("Enter your choice :");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1 -> {
                            System.out.println("Enter animal name: ");
                            String name = scanner.nextLine();
                            System.out.println("Enter animal type: ");
                            String type = scanner.nextLine();
                            System.out.println("Enter animal description: ");
                            String newDesp = scanner.nextLine();
                            System.out.println("Enter animal sound: ");
                            String sound = scanner.nextLine();
                            Animal.addAnimal(name, type, newDesp, sound);
                            admin();
                        }
                        case 2 -> {
                            System.out.println("Enter the current name of the animal to update: ");
                            String currentName = scanner.nextLine();
                            System.out.println("Enter the new name: ");
                            String newName = scanner.nextLine();
                            System.out.println("Enter the new type: ");
                            String newType = scanner.nextLine();
                            System.out.println("Enter the new description: ");
                            String newDescription = scanner.nextLine();
                            System.out.println("Enter the new sound: ");
                            String newSound = scanner.nextLine();
                            Animal.updateAnimal(currentName, newName, newType, newDescription, newSound);
                            admin();
                        }
                        case 3 -> {
                            System.out.println("Enter the name of the animal to remove: ");
                            String animalName = scanner.nextLine();
                            Animal.removeAnimal(animalName);
                            admin();
                        }
                        case 4 -> admin();
                    }
                case 3:
                    System.out.print("Enter name of the attraction");
                    String ide = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter status");
                    String sde = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("Enter price");
                    int atp = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter no of tickets bought");
                    int atnp = scanner.nextInt();
                    scanner.nextLine();
                    for (Attraction att : Admin.attractions) {
                        if ((att.attractname).equals(ide)) {
                            att.attractstatus = sde;
                            System.out.println("Attraction status set");
                            break;
                        }
                    }
                    admin();
                    break;
                case 4:
                    System.out.println("Set Discounts:\n" +
                            "1. Add Discount\n" +
                            "2. Modify Discount\n" +
                            "3. Remove Discount\n" +
                            "4. Exit\n");
                    System.out.println("Enter your choice");
                    int nl4 = scanner.nextInt();
                    switch (nl4) {
                        case 1:
                            System.out.println("Adding discount");
                            System.out.println("Enter Discount Category: ");
                            String dname = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter Discount Percentage (e.g., 20 for 20%): ");
                            String dpercentage = scanner.nextLine();
                            Discount.addDiscount(dname, dpercentage);
                            admin();
                            break;
                        case 2:
                            System.out.println("Enter the name of the discount to modify: ");
                            String discountName = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter the new discount percentage: ");
                            String newDpercentage = scanner.nextLine();
                            Discount.modifyDiscount(discountName, newDpercentage);
                            admin();
                            break;
                        case 3:
                            System.out.println("Enter the name of the discount to remove: ");
                            String discountNameToRemove = scanner.nextLine();
                            scanner.nextLine();
                            Discount.removeDiscount(discountNameToRemove);
                            admin();
                            break;
                        case 4:
                            admin();
                            break;
                    }
                case 5:
                    System.out.println("1. Add a deal\n 2.Remove a deal");
                    System.out.println("Enter your choice");
                    int nl5 = scanner.nextInt();
                    switch (nl5) {
                        case 1:
                            System.out.print("Name of special deal");
                            String sdname = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("percentage of discount");
                            int sdnperc = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("eligible for what criteria");
                            String sddes = scanner.nextLine();
                            Sdeal.addsdeal(sdname, sdnperc, sddes);
                            admin();
                            break;
                        case 2:
                            System.out.println("Name of deal you want to remove");
                            String srname = scanner.nextLine();
                            scanner.nextLine();
                            Sdeal.removeSpecialDeal(srname);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Visitor statistics");
                    System.out.println("Total visitors:" + Admin.totalvis);
                    System.out.println("Total Revenue: "+ Admin.totalrev);
                    System.out.println("Most popular: Botanical Garden" );
                    //based on input values this will be it
                    admin();

                    break;
                case 7:
                    System.out.println("Providing user feedback");
                    for (Visitor visitor : Main.visitorList) {
                        System.out.println("Visitor Name: " + visitor.getName());
                        System.out.println("Feedback: " + visitor.getFeedback());
                        System.out.println();
                    }
                    admin();
                    break;
                case 8:
                    System.out.println("Logged out!");
                    start();
                    break;

            }
        }
    }
    public static void visitorregister(){
        System.out.println("1.Register");
        System.out.println("2.login \n Enter your choice:");
        int n = scanner.nextInt();
        scanner.nextLine();
        if (n==1){
            System.out.println("Enter visitor's information:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Phone Number: ");
            int pn = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Balance: ");
            int bal = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Email: ");
            String em = scanner.nextLine();
            System.out.print("Password: ");
            String pass = scanner.nextLine();
            Visitor myVisitor = new Visitor();
            myVisitor.setAge(age);
            myVisitor.setName(name);
            myVisitor.setBalance(bal);
            myVisitor.setEmail(em);
            myVisitor.setPnum(pn);
            myVisitor.setPass(pass);
            Main.visitorList.add(myVisitor);
            Admin.totalvis=+1;
            visitorregister();
        }
        if(n==2){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter email: ");
            String em = scanner.nextLine();
            System.out.print("Enter password: ");
            String pass = scanner.nextLine();
            int co=0;
            for (Visitor visitor : Main.visitorList) {
                if (visitor.email.equals(em) && visitor.pass.equals(pass)) {
                    System.out.println("Logged in as " + visitor.name);
                    visitormenu(visitor);
                    co=1;
                    break;
                }
            }
            if (co!=1){
                System.out.println("No match found");
                start();
            }
        }
    }
    public static void visitormenu(Visitor myvis){
        System.out.println("Visitor Menu:\n" +
                "1. Explore the Zoo\n" +
                "2. Buy Membership\n" +
                "3. Buy Tickets\n" +
                "4. View Discounts\n" +
                "5. View Special Deals\n" +
                "6. Visit Animals\n" +
                "7. Visit Attractions\n" +
                "8. Leave Feedback\n" +
                "9. Log Out\n");
        System.out.println("Enter your choice");
        int n3 = scanner.nextInt();
        scanner.nextLine();
        switch(n3){
            case 1:
                System.out.println("Explore the Zoo:\n 1. View Attractions\n 2. View Animals\n 3. Exit");
                System.out.println("Enter your choice");
                int nm1= scanner.nextInt();
                switch (nm1){
                    case 1:
                        System.out.println("Attractions in the Zoo");
                        for (Attraction att : Admin.attractions) {
                                System.out.println("- " + att.getAttractname());
                                System.out.println();
                            }
                        System.out.println("ZOOtopia offers an adventure ride that allows you to explore unexplored trails. Buy your ticket now!");

                        visitormenu(myvis);
                    case 2:
                        System.out.println("Animals in the zoo");
                        for (Animal a: Main.Animallist){
                            System.out.println("- "+ a.name);
                        }
                        visitormenu(myvis);
                        break;
                    case 3:
                        visitormenu(myvis);
                        break;}
                break;

            case 2:
                System.out.println("\n" +
                        "Buy Membership:\n" +
                        "1. Basic Membership (₹20)\n" +
                        "2. Premium Membership (₹50)\n" +
                        "Enter your choice: 1\n");
                int nm2= scanner.nextInt();
                scanner.nextLine();
                System.out.println("enter discount code");
                String dis=scanner.nextLine();
                switch(nm2){
                    case 1:
                        myvis.membership="Basic";
                        myvis.balance-=20;
                        Admin.totalrev+=20;
                        System.out.println("Basic Membership purchased successfully. Your balance is now "  +myvis.balance);
                        visitormenu(myvis);
                        break;
                    case 2:
                        myvis.membership="Premium";
                        myvis.balance-=50;
                        Admin.totalrev+=50;
                        System.out.println("Premium membership purchased succesfully.Your balance is "+myvis.balance);
                        visitormenu(myvis);
                        break;
            }
                break;

            case 3:
                System.out.println("Buying tickets");
                System.out.println("Number of tickets you wanna buy");
                int nl5=scanner.nextInt();
                double disc= Sdeal.specialdis(nl5);
                double disc2= Discount.givendis(myvis.getAge());
                System.out.println("enter the attraction ");
                for (Attraction attraction : Admin.attractions) {
                    System.out.println("Attraction Name: " + attraction.getAttractname());
                    System.out.println("Price: " + attraction.getAtprice());
                    System.out.println();
                }
                System.out.print("Enter your choice: ");
                int atc = scanner.nextInt();
                if (atc >= 1 && atc <= Admin.attractions.size()) {
                    atc=atc-1;
                    Attraction satt = Admin.attractions.get(atc);
                    double ft= (satt.atprice)*nl5*(1-disc)*(1-disc2);
                    if ((myvis.balance-ft)<0){
                        System.out.println("Insuffiencent balance");

                    }
                    else{
                        myvis.balance= (int) (myvis.balance-ft);
                        System.out.println("Your balance is now ₹" + myvis.getBalance() + ".");
                        System.out.println("Ticket purchased");
                        Admin.totalrev+=ft;

                    }
                }
                visitormenu(myvis);
                break;

            case 4:
                System.out.println("Displaying all discounts");
                for (Discount discount : Main.discountlist) {
                System.out.println("Name " + discount.getDname());
                System.out.println("Percentage: " + discount.dpercentage + "%");
                System.out.println();
                }
                visitormenu(myvis);
                break;
            case 5:
                for (Sdeal sde : Main.specialdiscountlist){
                    System.out.println("Special discount" + sde.selc );
                }
                visitormenu(myvis);
                break;
            case 6:
                System.out.println("Animals present are : ");
                int m= 0;
                for(Animal x : Animallist){
                    System.out.printf("%d. %s\n",m,x.name);
                    m++;
                }
                System.out.println("Enter the index number : ");
                int choice = scanner.nextInt();
                if(choice>(Animallist.size()-1)){
                    System.out.println("Enter valid index number");
                    visitormenu(myvis);
                }
                Animal selectAnimal = Animallist.get(choice);
                System.out.println("1. Feed");
                System.out.println("2. Read");
                System.out.println("Enter the index number of choice : ");
                int choice2 = scanner.nextInt();
                if(choice2 == 1){
                    System.out.printf("The %s says %s\n",selectAnimal.name,selectAnimal.sound );
                } else if (choice2 == 2) {
                    System.out.println("Description : " + selectAnimal.description);
                }
                else{
                    System.out.println("Please select the correct option");
                }
                visitormenu(myvis);
                break;
            case 7:
                for (int i = 0; i < Admin.attractions.size(); i++) {
                    Attraction attraction = Admin.attractions.get(i);
                    System.out.println((i + 1) + "." + attraction.getAttractname());
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your choice");
                int nl3=scanner.nextInt();
                if (myvis.membership=="Basic"){
                    System.out.println("Ticket not available!  Basic Members need to buy separate tickets for the attractions");
                    visitormenu(myvis);

                }
                else {
                    if (nl3 >= 1 && nl3 <= Admin.attractions.size()) {
                        System.out.println("1 Ticket Used.");
                        Attraction attrc= Admin.attractions.get(nl3-1);
                        Admin.attractions.get(nl3-1).atnooftickets=-1;
                        System.out.println("Thank you for visiting " + attrc.getAttractname() + ". Hope you enjoyed the attraction.");
                        visitormenu(myvis);

                    }
                }
                break;

            case 8:
                System.out.println("Enter the feedback(max 200 words)");
                Scanner scan = new Scanner(System.in);
                String feed = scan.nextLine();
                Visitor.providefeed(myvis,feed);
                visitormenu(myvis);
                break;

            case 9:
                System.out.println("Logged out!");
                System.exit(0);
                break;
        }













    }
    public static void start() {
        System.out.println("1.Enter as Admin");
        System.out.println("2.Enter as a Visitor");
        System.out.println("3.View Special deals");
        System.out.println("Enter your choice:");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        scanner.nextLine();
            if (n1 == 1) {
                String bid;
                String pid;
                System.out.println("Enter Admin id");
                bid = scanner.nextLine();
                System.out.println("Enter Password");
                pid = scanner.nextLine();
                if (bid.equals(Admin.username) && pid.equals(Admin.password)) {
                    System.out.println("Match found");
                    admin();
                }
                else {
                    System.out.println("Match not found ");
                    start();
                }

            }
            else if (n1==2){
                visitorregister();
            }
            else if (n1==3){
                for (Sdeal sde : Main.specialdiscountlist){
                    System.out.println("Special discount" + sde.selc );
                }
                start();

            }
        }

    public static void main(String[] args){
        System.out.println("Welcome to ZOOtopia");
        Visitor myVisitor = new Visitor();
        myVisitor.age=10;
        myVisitor.name="myname";
        myVisitor.balance=100;
        myVisitor.email="chahat";
        myVisitor.pnum=4562;
        myVisitor.pass="chahat";
        System.out.println("Registered a member succesfully");
        Main.visitorList.add(myVisitor);

        //JUST ADDED THREE OF THESE FOR REFERENCE TO see if the code is running
        Attraction attraction1 = new Attraction();
        attraction1.setAttractname("Jungle Safari");
        attraction1.setAtprice(10);
        attraction1.setAttractdescription("An exciting jungle adventure");
        Admin.attractions.add(attraction1);

        Attraction attraction2 = new Attraction();
        attraction2.setAttractname("Botanical Garden");
        attraction2.setAtprice(15);
        attraction2.setAttractdescription("A beautiful garden with a variety of plants");
        Admin.attractions.add(attraction2);

        Attraction attraction3 = new Attraction();
        attraction3.setAttractname("Dinosaur Show");
        attraction3.setAtprice(12);
        attraction3.setAttractdescription("An educational exhibit about dinosaurs");
        Admin.attractions.add(attraction3);

        //3 sample inputs taken from CHATGPT
        Discount discount1 = new Discount("MINOR", "10%" );
        Main.discountlist.add(discount1);
        Discount discount2 = new Discount("SENIOR", "20%");
        Main.discountlist.add(discount2);

        Sdeal specialDeal1 = new Sdeal( 15, "buy 2 tickets and get 15%");
        specialdiscountlist.add(specialDeal1);

        Sdeal specialDeal2 = new Sdeal( 20, "buy 3 tickets and get 30%");
        specialdiscountlist.add(specialDeal2);
        //2 sample discounts take

        //ALREADY ADDED INPUTS WE CAN WORK WITHOUT THESE TOO


        start();
    }
}






