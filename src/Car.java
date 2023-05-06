import java.time.LocalDateTime;
import java.time.LocalTime;

public class Car {

   private final String brand;
   private final String region;


    public Car(String brand, String region) {
        this.brand = brand;
        this.region = region;
    }

    public String getBrand() {
        return brand;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Brand: ".concat(brand).concat("\n")
                .concat("Region: ").concat(region);
    }
}
