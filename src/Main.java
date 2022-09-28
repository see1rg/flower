

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(null, "Россия", 35.595, 0);
        Flower chrysanthemum = new Flower(null, null, 15, 5);
        Flower peony = new Flower(null, "England", 69.999, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5, 10);
        //int makeBouquet(){
//            double sum = (1 * rose.getCost() + 1 * chrysanthemum.getCost() + 1 * peony.getCost() + 1 * gypsophila.getCost());
//            double sumDuty = sum+ sum*0.1;

        System.out.println(peony.toString());
}
}