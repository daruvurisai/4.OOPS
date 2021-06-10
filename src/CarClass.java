

public class CarClass {
    //Fields or member variables has to defined by access modifiers
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
    //setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("optima")) {
            this.model = model;
        }
        else {
            this.model="Unknown";
        }
    }
    //getter
    public String getModel(){
        return this.model;
    }

}