import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.AllArgsConstructor;

@ToString
@EqualsAndHashCode(exclude={"model","year","price", "color", "quantity"})
@AllArgsConstructor
@Getter
@Setter
public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

}

class CarDemoWithLombok {
    public static void main(String[] args) {
        CarWithLombok CarWithLombok1 = new CarWithLombok("GLE", "Mercedes", 2020, 350_000, "white", 5);
        CarWithLombok CarWithLombok2 = new CarWithLombok("GLC", "Mercedes", 2023, 200_000, "silver", 3);
        System.out.println(CarWithLombok1);
        System.out.println(CarWithLombok2);
        System.out.println(CarWithLombok1.getColor());
//        int year = CarWithLombok1.geatYear();
        CarWithLombok1.setColor("black");
        System.out.println("Are these objects equal? " + CarWithLombok1.equals(CarWithLombok2));
        System.out.println("The Hash code of this object is " + CarWithLombok1.hashCode());
        System.out.println("The Hash code of this object is " + CarWithLombok2.hashCode());
    }
}
