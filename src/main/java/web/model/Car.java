package web.model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String model;
    private String series;
    private int year;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                '}';
    }
}
