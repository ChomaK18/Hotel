package composition;

public abstract class Equipment {

        protected String refNumber;
        protected String model;

        public Equipment (String refNumber, String model){
            this.refNumber = refNumber;
            this.model = model;
        }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
