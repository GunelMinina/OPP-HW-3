public class Bus extends Auto {
    private String trekNumber;

    Bus( String model, int year, String fuelType, double probeg, String trekNumber){
        super(model, year, fuelType, probeg);
        this.trekNumber = trekNumber;
    }
    public void getInfo() {
        System.out.println(this.getModel() + " " + this.getYear() + " " + this.getFuelType() + " "
                + this.getProbeg() + " " + this.getTrekNumber());
    }
    public String getTrekNumber(){
        return this.trekNumber;
    }
    }
