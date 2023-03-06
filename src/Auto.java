public class Auto extends Transport {
    private String fuelType;
    private double probeg;

    Auto( String model, int year, String fuelType, double probeg) {
        super(model, year);
        this.fuelType = fuelType;
        this.probeg = probeg;
    }
    @Override
    public void getInfo() {
        System.out.println(this.getModel() + " " + this.getYear() + " " + this.getFuelType() + " "
                + this.getProbeg() + " ");
    }
    public String getFuelType() {
        return this.fuelType;
    };
    public Double getProbeg() {
        return this.probeg;

    };
}
