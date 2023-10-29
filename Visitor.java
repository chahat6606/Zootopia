package Zoo;

public class Visitor {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTicketsbought() {
        return ticketsbought;
    }

    public void setTicketsbought(int ticketsbought) {
        this.ticketsbought = ticketsbought;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    int age;
    int pnum;
    int balance;
    int ticketsbought;
    String email;
    String name;
    String pass;
    String membership;
    String feedback;


    public static void providefeed(Visitor vis,String feed){

            vis.feedback=feed;

        System.out.println("Thanks for the feedback");
    }






}