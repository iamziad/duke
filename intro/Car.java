public class Car {
    private String brand;
    private String color;
    private String model;
    private int doors;
    private boolean convertable;

    public void setBrand(String brand) {
        if (brand == null) brand = "Unknown";

        String lowerCaseBrand = brand.toLowerCase();

        switch (lowerCaseBrand) {
            case "porsche", "bmw", "mercedes" -> this.brand = brand;
            default -> this.brand = "Unsupported";
        }
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
