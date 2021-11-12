public class GardenShop {
    private Flower[] flowers = new Flower[10];
    private int flowerIndex = 0;

    private Fertilizer[] fertilizers = new Fertilizer[10];
    private int fertilizerIndex = 0;

    private WorkWear[] workWears = new WorkWear[10];
    private int workWearIndex = 0;

    public void addFlower(Flower flower) {
        if (flowerIndex < flowers.length) {
            flowers[flowerIndex++] = flower;
        }
    }

    public void addFertilizer(Fertilizer fertilizer) {
        if (fertilizerIndex < fertilizers.length)
            fertilizers[fertilizerIndex++] = fertilizer;
    }

    public void addWorkWear(WorkWear workWear) {
        if (workWearIndex < workWears.length)
            workWears[workWearIndex++] = workWear;
    }

    public void displayAll() {
        for (int i = 0; i < flowerIndex; i++) {
            Flower flower = flowers[i];
            System.out.println("Name: " + flower.getName());
            System.out.println("Price: " + flower.getPrice());
            System.out.println("Type: " + flower.getType());
        }
        for (int i = 0; i < fertilizerIndex; i++) {
            Fertilizer fertilizer = fertilizers[i];
            System.out.println("Name: " + fertilizer.getName());
            System.out.println("Price: " + fertilizer.getPrice());
            System.out.println("Purpose: " + fertilizer.getPurpose());
        }
        for (int i = 0; i < workWearIndex; i++) {
            WorkWear workWear = workWears[i];
            System.out.println("Name: " + workWear.getName());
            System.out.println("Price: " + workWear.getPrice());
            System.out.println("Size: " + workWear.getSize());
        }
    }
}
