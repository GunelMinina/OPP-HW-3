public class Car extends Auto {
    private double power;

    Car(String model, int year, String fuelType, double probeg, double power){
        super(model, year, fuelType, probeg);
        this.power = power;
    }
    @Override
    public void getInfo() {
        System.out.println(this.getModel() + " " + this.getYear() + " " + this.getFuelType() + " "
                + this.getProbeg() + " " + this.getPower());
    }
    public Double getPower(){
        return this.power;
    }
}
