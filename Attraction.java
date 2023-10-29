package Zoo;

public class Attraction {
     int attractid;
     String attractname;
     String attractdate;
     String attractstatus;
     String attractdescription;
     int atprice;
     int atnooftickets;


    public int getAttractid() {
        return attractid;
    }

    public int getAtprice() {
        return atprice;
    }

    public void setAtprice(int atprice) {
        this.atprice = atprice;
    }

    public void setAttractid(int attractid) {
        this.attractid = attractid;
    }

    public String getAttractname() {
        return attractname;
    }

    public void setAttractname(String attractname) {
        this.attractname = attractname;
    }

    public String getAttractdate() {
        return attractdate;
    }

    public void setAttractdate(String attractdate) {
        this.attractdate = attractdate;
    }
    //here we can also use date time function but we can work with strings for that we would use this
    //LocalDate parsedDate = LocalDate.parse(attractdate);


    public String getAttractdescription() {
        return attractdescription;
    }

    public void setAttractdescription(String attractdescription) {
        this.attractdescription = attractdescription;
    }
}

