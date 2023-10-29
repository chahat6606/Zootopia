package Zoo;

public class Sdeal{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getSelc() {
        return selc;
    }

    public void setSelc(String selc) {
        this.selc = selc;
    }

    String name;
    int percentage;
    String selc;

    public Sdeal(int i, String s) {
        this.percentage=i;
        this.selc=s;
    }

    public static void addsdeal(String name, int perc, String selc) {
        Sdeal newSpecialDeal = new Sdeal(perc,selc);
        newSpecialDeal.name = name;
        newSpecialDeal.percentage = perc;
        newSpecialDeal.selc = selc;
        Main.specialdiscountlist.add(newSpecialDeal);
        System.out.println("Special Deal added successfully.");
    }

    public static void removeSpecialDeal(String name) {
        for (Sdeal specialDeal : Main.specialdiscountlist) {
            if (specialDeal.name.equals(name)) {
                Main.specialdiscountlist.remove(specialDeal);
                System.out.println("Special Deal removed successfully.");
                return;
            }
        }
        System.out.println("Special Deal not found in the list.");
    }

    public static double specialdis(int notick) {
        double discount = 0.0;
        if (2<=notick) {
            discount = 0.15;}
        else if(notick>=3) {
            discount = 0.30;
        }
        else{ discount=0.0;}
        return discount;
    }
}


