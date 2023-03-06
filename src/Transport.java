public class Transport {
    private String model;
    private int year;

    Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void getInfo() {
        System.out.println(this.model + " " + this.year + " ");
    }

    public String getModel() {
        return this.model;
    };
    public Integer getYear() {
        return this.year;

    };
}

