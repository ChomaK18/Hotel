package composition;


import java.util.Arrays;

public class Room {

    private String number;
    private int floor;

    private Equipment [] equipment;


    public Room(String number, int floor){
        this.number = number;
        this.floor = floor;
    }


    public String getNumber(){
        return number;
    }
    public void setNumber(String number){
        this.number = number;
    }

    public int getFloor(){
        return floor;
    }
    public void setFloor(int floor){
        this.floor= floor;
    }

    public Equipment[] getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment[] equipment) {
        this.equipment = equipment;
    }

//    public TV getTv(){
//        return tv;
//    }
//    public void setTv(TV tv){
//        this.tv= tv;
//    }
//    public AirConditioner getAirConditioner(){
//        return airConditioner;
//    }
//    public void setAirConditioner(AirConditioner airConditioner){
//        this.airConditioner= airConditioner;
//    }

    public String toString(){
        return "Room number: " + number + " tv=" + Arrays.toString(equipment) + ", airConditioner=" + Arrays.toString(equipment);
    }
}
