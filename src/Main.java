

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(null, "Россия", 35.595, 4);
        Flower chrysanthemum = new Flower(null, null, 15, 5);
        Flower peony = new Flower(null, "England", 69.999, 1);
        Flower gypsophila = new Flower(null, "Турция", 19.5, 10);


        printCostOfFlowers( rose,rose,rose,
                chrysanthemum,chrysanthemum,
                gypsophila );

        System.out.println(peony.toString());


}

    private static void printCostOfFlowers(Flower... flowers) {
        int minimumLifeSpan = Integer.MAX_VALUE;
        double totalCost = 0;
        for (Flower flower : flowers) {
           if(flower.getLifeSpan()< minimumLifeSpan){
               minimumLifeSpan = flower.getLifeSpan(); }
            totalCost += flower.getCost();
        }
        System.out.println("Стоимость букета: " + totalCost * 1.1);
        System.out.println("Срок стояния букета: " + minimumLifeSpan);

    }
}