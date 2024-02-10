package web.model;

public class Car {
    private int series;
    private String colors;
    private String model;


    public Car(int series, String colors, String model) {
        this.series = series;
        this.colors = colors;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", colors='" + colors + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
