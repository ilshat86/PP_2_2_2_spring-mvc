package web.model;

public class Car {

    private String model;
    private String marka;
    private int series;

    public Car(String model, String marka, int series) {
        this.model = model;
        this.marka = marka;
        this.series = series;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", series=" + series +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
