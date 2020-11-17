package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer series;
    @Column
    private String model;

    public Car() {

    }

    public Car(String model) {
        this.model = model;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
