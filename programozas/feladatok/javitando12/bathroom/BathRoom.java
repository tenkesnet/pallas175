package bathroom;

public class BathRoom  {
    private int legth;
    private int width;
    private int height;

    public BathTub getBathTub() {
        return bathTub;
    }

    private BathTub bathTub;
    public BathRoom(int legth, int width, int height, BathTub bathTub){
        this.legth = legth;
        this.width = width;
        this.height = height;
        this.bathTub = bathTub;
    }
    public Object clone()  {
        BathRoom bathRoom = null;
        bathRoom = (BathRoom)super.clone();
        return bathRoom;
    }
    //Any Getters-Setters goes here
}