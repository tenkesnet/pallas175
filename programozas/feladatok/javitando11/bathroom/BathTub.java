
public class BathTub implements Cloneable{
    public String getTubName() {
        return tubName;
    }

    public void setTubName(String tubName) {
        this.tubName = tubName;
    }

    private String tubName;
    public BathTub(String tubName){
        this.tubName = tubName;
    }
    public Object clone() throws CloneNotSupportedException {
            return (BathTub)this.clone();
    }
    //Any Getters-Setters goes here
}