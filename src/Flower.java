
public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private Integer lifeSpan;

    @Override
    public String toString() {
        return "Цветок " + flowerColor  +
                ", страна происхождения " + country +
                ", цена " + cost +
                ", срок стояния " + lifeSpan +
                " дней.";
    }

    public Flower(String flowerColor, String country, double cost, Integer lifeSpan) {
        if (flowerColor == null || flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost == 0 || cost < 0) {
            this.cost = 1;
        } else {
            this.cost = cost;

        }
        if (lifeSpan == null) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }


    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
