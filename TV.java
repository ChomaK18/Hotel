package composition;

public class TV extends Equipment{

    private int size;
    private String resolution;

    public TV (String refNumber, String model, int size, String resolution){
        super(refNumber, model);
        this.size = size;
        this.resolution = resolution;
    }


    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getResolution(){
        return resolution;
    }

    public void setResolution(String resolution){
        this.resolution = resolution;
    }
    @Override
    public String toString(){
        return refNumber;
    }
}
