package Models.Items.Weapons;

public class Weapon {

    private String iDWeapon;

    private double damage;
    private double weight;

    private double bleedDamage;

    private double slashDamage;
    private double punctureDamage;

    private double magickDamage;

    private double lifeStealDamage;

    private double frostDamage;
    private double shockDamage;
    private double fireDamage;
    private double darkDamage;

    public Weapon(String iDWeapon, double damage, double weight, double bleedDamage, double slashDamage, double punctureDamage
            , double magickDamage, double lifeStealDamage, double frostDamage, double shockDamage, double fireDamage
            , double darkDamage) {

        setIdWepon(iDWeapon);
        setDamage(damage);
        setWeight(weight);
        setBleedDamage(bleedDamage);
        setSlashDamage(slashDamage);
        setPunctureDamage(punctureDamage);
        setMagickDamage(magickDamage);
        setLifeStealDamage(lifeStealDamage);
        setFrostDamage(frostDamage);
        setShockDamage(shockDamage);
        setFrostDamage(fireDamage);
        setDamage(darkDamage);
    }




    public String getIdWepon() {
        return this.iDWeapon;
    }

    public void setIdWepon(String idWepon) {
        this.iDWeapon = idWepon;
    }

    public double getDamage() {
        return this.damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBleedDamage() {
        return this.bleedDamage;
    }

    public void setBleedDamage(double bleedDamage) {
        this.bleedDamage = bleedDamage;
    }

    public double getSlashDamage() {
        return this.slashDamage;
    }

    public void setSlashDamage(double slashDamage) {
        this.slashDamage = slashDamage;
    }

    public double getPunctureDamage() {
        return this.punctureDamage;
    }

    public void setPunctureDamage(double punctureDamage) {
        this.punctureDamage = punctureDamage;
    }

    public double getMagickDamage() {
        return this.magickDamage;
    }

    public void setMagickDamage(double magickDamage) {
        this.magickDamage = magickDamage;
    }

    public double getLifeStealDamage() {
        return this.lifeStealDamage;
    }

    public void setLifeStealDamage(double lifeStealDamage) {
        this.lifeStealDamage = lifeStealDamage;
    }

    public double getFrostDamage() {
        return this.frostDamage;
    }

    public void setFrostDamage(double frostDamage) {
        this.frostDamage = frostDamage;
    }

    public Double getShockDamage() {
        return this.shockDamage;
    }

    public void setShockDamage(double shockDamage) {
        this.shockDamage = shockDamage;
    }

    public Double getFireDamage() {
        return this.fireDamage;
    }

    public void setFireDamage(double fireDamage) {
        this.fireDamage = fireDamage;
    }

    public Double getDarkDamage() {
        return this.darkDamage;
    }

    public void setDarkDamage(double darkDamage) {
        this.darkDamage = darkDamage;
    }



}
