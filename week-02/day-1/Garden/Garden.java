import java.util.ArrayList;

public class Garden {
    private ArrayList<Plant> plants;

    public Garden() {
        this.plants = new ArrayList<>();
    }

    public void waterGarden(int water) {
        System.out.println("Watering with " + water);
        int count = 0;
        for (Plant plant: plants) {
            if (plant.waterCheck()) {
                count++;
            }
        }
        int waterPerPlant = water/count;
        for (Plant plant: plants) {
            if (plant.needWater()) {
                plant.waterPlant(waterPerPlant);
            }
        }
    }

}
