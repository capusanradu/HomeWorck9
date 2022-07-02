package HomeWorcks.home9.HomeWorck91;

public class Fridge extends Electronics {
    private int temparature;

    public void setTemparature(int temparature) {
        this.temparature = temparature;
    }

    public int getTemparature() {
        return temparature;
    }
    public void setGoVacation(){
        System.out.println("The Fridge is set vacation mode");
        this.temparature = 10;
    }

}
