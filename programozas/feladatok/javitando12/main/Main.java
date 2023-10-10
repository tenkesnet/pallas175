
package main;



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BathTub bathTub = new BathTub("BreezeTub");
        BathRoom bathRoom_1 = new BathRoom(10,10,12, bathTub);
        BathRoom bathRoom_2 = (BathRoom)bathRoom_1.clone();
        bathRoom_1.getBathTub().setTubName("BreezeTub1");
        System.out.printf(bathRoom_2.getBathTub().getTubName());
    }
}