public abstract class Aircraft {

    protected int baseDamage;
    protected int maxAmmo;
    protected int presentAmmo;

    // Not sure what "All Damage" means, but I will assume it means the total damage caused by the aircraft.
    protected int damageDealt;

    public Aircraft(int baseDamage, int maxAmmo) {
        this.baseDamage = baseDamage;
        this.maxAmmo = maxAmmo;
        this.presentAmmo = 0;
        this.damageDealt = 0;
    }

    public abstract String getType();

    protected int assessDamage() {
        return presentAmmo*baseDamage;
    }

    public int fight() {
        if (presentAmmo == 0) {
            System.out.println("No ammo! Reload!");
        } else {
            int damage = presentAmmo*baseDamage;
            System.out.println(String.format("Damage dealt = %d", damage));
            damageDealt += damage;
        }
        this.presentAmmo = 0;
        return assessDamage();
    }

    public int refill(int reload) {
        int result = reload - (presentAmmo - maxAmmo);
        presentAmmo = Math.min(reload + presentAmmo, maxAmmo);
        System.out.println(String.format("Loaded up to %d units of ammo", presentAmmo));
        return result;
    }

    public String getStatus() {
        return String.format("Type %s, Ammo: %d, Base Damage: %d, All Damage: %d\n", getType(), presentAmmo, baseDamage, damageDealt);
    }

    public abstract boolean isPriority();
}
