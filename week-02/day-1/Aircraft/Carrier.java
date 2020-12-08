import javax.naming.spi.DirectoryManager;
import java.util.ArrayList;
import java.util.Comparator;

public class Carrier {
    private ArrayList<Aircraft> aircrafts;
    private int ammoStore;
    private int healthLevel;

    public Carrier(int ammoStore, int healthLevel) {
        aircrafts = new ArrayList<>();
        this.ammoStore = ammoStore;
        this.healthLevel = healthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getAmmoStore() {
        return ammoStore;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public ArrayList<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
        System.out.println("Aircraft has been added!");
    }

    public void fill() {
        if (this.ammoStore == 0) {
            throw new IllegalArgumentException("There is no ammo :/");
        }
        aircrafts.sort(new Comparator<Aircraft>() {
            @Override
            public int compare(Aircraft o1, Aircraft o2) {
                if (o1 instanceof F16) {
                    if (o2 instanceof F16) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    if (o2 instanceof F16) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        for (Aircraft aircraft: aircrafts) {
            ammoStore = aircraft.refill(ammoStore);
            if (ammoStore == 0) {
                break;
            }
        }
        System.out.println("Aircrafts on carrier locked and loaded!");
    }

    public int calculateDamageCapability() {
        int result = 0;
        for (Aircraft aircraft: aircrafts) {
            result += aircraft.assessDamage();
        }
        return result;
    }

    public String getStatus() {
        if (healthLevel <= 0) {
            return "It's dead Jim";
        }
        StringBuilder s = new StringBuilder();
        s.append(String.format("HP: %d, Aircraft count: %d, Ammo Storage: %d, Total damage: %d\n", healthLevel, aircrafts.size(),
                ammoStore, calculateDamageCapability()));
        for (Aircraft aircraft: aircrafts) {
            s.append(aircraft.getStatus());
        }
        return s.toString();
    }


    public void fight(Carrier c) {
        c.fill();
        this.fill();
        for (Aircraft aircraft: aircrafts) {
            aircraft.fight();
        }
        for (Aircraft aircraft: c.getAircrafts()) {
            aircraft.fight();
        }
        this.setHealthLevel(this.getHealthLevel()-c.calculateDamageCapability());
        c.setHealthLevel(c.getHealthLevel()-this.calculateDamageCapability());
    }
}
