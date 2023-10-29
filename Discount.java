package Zoo;

public class Discount {
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getDpercentage() {
        return dpercentage;
    }

    public void setDpercentage(String dpercentage) {
        this.dpercentage = dpercentage;
    }

    public String getDelc() {
        return delc;
    }

    public void setDelc(String delc) {
        this.delc = delc;
    }

    String dname;
    String did;
    String dpercentage;
    String delc;

    public Discount(String dname, String dpercentage) {
        this.dname = dname;
        this.dpercentage = dpercentage;
    }


    public static void addDiscount(String dname, String dpercentage) {
        Discount newDiscount = new Discount(dname, dpercentage);
        Main.discountlist.add(newDiscount);
        System.out.println("Discount added successfully.");
        return;
    }

    public static void modifyDiscount(String dname, String newDpercentage) {
        for (Discount discount : Main.discountlist) {
            if (discount.dname.equals(dname)) {
                discount.dpercentage = newDpercentage;
                System.out.println("Discount modified successfully.");
                return;
            }
        }
        System.out.println("Discount not found in the list.");
    }

    public static void removeDiscount(String dname) {
        for (Discount discount : Main.discountlist) {
            if (discount.dname.equals(dname)) {
                Main.discountlist.remove(discount);
                System.out.println("Discount removed successfully.");
                return;
            }
        }
        System.out.println("Discount not found in the list.");
    }

    public static double givendis(int age) {
        double disci = 0.0;
        if (age < 18) {
            disci = 0.1;
        } else if (age > 60) {
            disci = 0.2;
        } else {
            disci = 0;
        }
        return disci;
    }
}