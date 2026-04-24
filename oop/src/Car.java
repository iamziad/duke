public class Car {
    private String brand;
    private String color;
    private String model;
    private int doors;
    private boolean convertable;

    public Car() {
        this("Unkown", "White", "Unknown", 4, false);
        System.out.println("Empty car constructor called");
    }

    public Car(String brand, String color, String model, int doors, boolean convertable) {
        System.out.println("Args constructor called");

        this.brand = validateBrand(brand);
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertable = convertable;
    }

    private String validateBrand(String brand) {
        String lowerCaseBrand = brand.toLowerCase();

        return switch (lowerCaseBrand) {
            case "porsche", "bmw", "mercedes" -> this.brand = brand;
            default -> this.brand = "Unsupported";
        };
    }

    public void setBrand(String brand) {
        if (brand == null) brand = "Unknown";

        this.brand = validateBrand(brand);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertable(boolean convertable) {
        this.convertable = convertable;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertable() {
        return convertable;
    }

    public void printCar() {
        System.out.printf("Brand: %s\nModel: %s\nColor: %s\nDoors: %d-doors\nConvertable: %s",
                brand, model, color, doors, convertable ? "Yes" : "No");
    }
}
