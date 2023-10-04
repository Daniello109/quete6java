public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder (String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String WhoIAm (){
        if (this.isAware()) {return "My name is " + getFirstname() + " and i'm aware";
        } else {
            return "My name is " + getFirstname() + " and i'm not aware";
        }
    }

}