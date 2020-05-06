package composition;

public class AirConditioner extends Equipment{

    private int power;
    private int noiseLevel;

    public AirConditioner (String refNumber, String model, int power, int noiseLevel){
        super(refNumber, model);
        this.power = power;
        this.noiseLevel = noiseLevel;

    }


    public int getPower(){
        return power;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getNoise(){
        return noiseLevel;
    }

    public void setNoiseLevel(int noiseLevel){
        this.power = power;
    }

    @Override
    public String toString(){
        return refNumber;
    }
}
