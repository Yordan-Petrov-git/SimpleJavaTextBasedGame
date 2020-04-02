package Models.Entitys.SuperClassEntity;

public class Entity {

    private String name;

    private int entityClass;
    private int entityRace;
    private int entityLevel;

    private double health;
    private double mana;
    private double stamina;

    private double movementSpeed;

    private double attackDamage;
    private double abilityPower;
    private double attackSpeed;

    private double castingSpeed;
    private double lifeSteal;

    private double criticalChance;
    private double lifeStealChance;

    private double defence;
    private double block;

    private double parryChance;
    private double hitChance;
    private double missChance;

    private double bleedResist;
    private double slashResist;
    private double punctureResist;

    private double magickResist;
    private double holyResist;
    private double darkResist;

    private double fireResist;
    private double frostResist;



    private double shockResist;

    private double souls;

    private double hunger;

    private boolean isEntityBoss;

    public Entity(String name, int entityClass, int entityRace, int entityLevel, double health, double mana, double stamina
            , double movementSpeed, double attackDamage, double abilityPower, double attackSpeed, double castingSpeed, double lifeSteal
            , double criticalChance, double lifeStealChance, double defence, double block, double parryChance, double hitChance
            , double missChance, double bleedResist, double slashResist, double punctureResist, double magickResist, double holyResist
            , double darkResist, double fireResist, double frostResist, double shockResist, double souls, double hunger, boolean isEntityBoss) {

        setName(name);
        setEntityClass(entityClass);
        setEntityRace(entityRace);
        setEntityLevel(entityLevel);
        setHealth(health);
        setMana(mana);
        setStamina(stamina);
        setMovementSpeed(movementSpeed);
        setAttackDamage(attackDamage);
        setAbilityPower(abilityPower);
        setAttackSpeed(attackSpeed);
        setCastingSpeed(castingSpeed);
        setLifeSteal(lifeSteal);
        setCriticalChance(criticalChance);
        setLifeStealChance(lifeStealChance);
        setDefence(defence);
        setBlock(block);
        setParryChance(parryChance);
        setHitChance(hitChance);
        setMissChance(missChance);
        setBleedResist(bleedResist);
        setSlashResist(slashResist);
        setPunctureResist(punctureResist);
        setMagickResist(magickResist);
        setHolyResist(holyResist);
        setDarkResist(darkResist);
        setFireResist(fireResist);
        setFireResist(frostResist);
        setShockResist(shockResist);
        setSouls(souls);
        setHunger(hunger);
        setEntityBoss(isEntityBoss);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEntityClass() {
        return this.entityClass;
    }

    public void setEntityClass(int entityClass) {
        this.entityClass = entityClass;
    }

    public int getEntityRace() {
        return this.entityRace;
    }

    public void setEntityRace(int entityRace) {
        this.entityRace = entityRace;
    }

    public int getEntityLevel() {
        return this.entityLevel;
    }

    public void setEntityLevel(int entityLevel) {
        this.entityLevel = entityLevel;
    }

    public double getHealth() {
        return this.health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMana() {
        return this.mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getStamina() {
        return this.stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public double getMovementSpeed() {
        return this.movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public double getAttackDamage() {
        return this.attackDamage;
    }

    public void setAttackDamage(double attackDamage) {
        this.attackDamage = attackDamage;
    }

    public double getAbilityPower() {
        return this.abilityPower;
    }

    public void setAbilityPower(double abilityPower) {
        this.abilityPower = abilityPower;
    }

    public double getAttackSpeed() {
        return this.attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public double getCastingSpeed() {
        return this.castingSpeed;
    }

    public void setCastingSpeed(double castingSpeed) {
        this.castingSpeed = castingSpeed;
    }

    public double getLifeSteal() {
        return this.lifeSteal;
    }

    public void setLifeSteal(double lifeSteal) {
        this.lifeSteal = lifeSteal;
    }

    public double getCriticalChance() {
        return this.criticalChance;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public double getLifeStealChance() {
        return this.lifeStealChance;
    }

    public void setLifeStealChance(double lifeStealChance) {
        this.lifeStealChance = lifeStealChance;
    }

    public double getDefence() {
        return this.defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getBlock() {
        return this.block;
    }

    public void setBlock(double block) {
        this.block = block;
    }

    public double getParryChance() {
        return this.parryChance;
    }

    public void setParryChance(double parryChance) {
        this.parryChance = parryChance;
    }

    public double getHitChance() {
        return this.hitChance;
    }

    public void setHitChance(double hitChance) {
        this.hitChance = hitChance;
    }

    public double getMissChance() {
        return this.missChance;
    }

    public void setMissChance(double missChance) {
        this.missChance = missChance;
    }

    public double getBleedResist() {
        return this.bleedResist;
    }

    public void setBleedResist(double bleedResist) {
        this.bleedResist = bleedResist;
    }

    public double getSlashResist() {
        return this.slashResist;
    }

    public void setSlashResist(double slashResist) {
        this.slashResist = slashResist;
    }

    public double getPunctureResist() {
        return this.punctureResist;
    }

    public void setPunctureResist(double punctureResist) {
        this.punctureResist = punctureResist;
    }

    public double getMagickResist() {
        return this.magickResist;
    }

    public void setMagickResist(double magickResist) {
        this.magickResist = magickResist;
    }

    public double getHolyResist() {
        return this.holyResist;
    }

    public void setHolyResist(double holyResist) {
        this.holyResist = holyResist;
    }

    public double getDarkResist() {
        return this.darkResist;
    }

    public void setDarkResist(double darkResist) {
        this.darkResist = darkResist;
    }

    public double getFireResist() {
        return this.fireResist;
    }

    public void setFireResist(double fireResist) {
        this.fireResist = fireResist;
    }

    public double getFrostResist() {
        return this.frostResist;
    }

    public void setFrostResist(double frostResist) {
        this.frostResist = frostResist;
    }

    public double getShockResist() {
        return this.shockResist;
    }

    public void setShockResist(double shockResist) {
        this.shockResist = shockResist;
    }

    public double getSouls() {
        return this.souls;
    }

    public void setSouls(double souls) {
        this.souls = souls;
    }

    public double getHunger() {
        return this.hunger;
    }

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public boolean isEntityBoss() {
        return this.isEntityBoss;
    }

    public void setEntityBoss(boolean entityBoss) {
        isEntityBoss = entityBoss;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entity{");
        sb.append("name='").append(name).append('\'');
        sb.append(", entityClass=").append(entityClass);
        sb.append(", entityRace=").append(entityRace);
        sb.append(", entityLevel=").append(entityLevel);
        sb.append(", health=").append(health);
        sb.append(", mana=").append(mana);
        sb.append(", stamina=").append(stamina);
        sb.append(", movementSpeed=").append(movementSpeed);
        sb.append(", attackDamage=").append(attackDamage);
        sb.append(", abilityPower=").append(abilityPower);
        sb.append(", attackSpeed=").append(attackSpeed);
        sb.append(", castingSpeed=").append(castingSpeed);
        sb.append(", lifeSteal=").append(lifeSteal);
        sb.append(", criticalChance=").append(criticalChance);
        sb.append(", lifeStealChance=").append(lifeStealChance);
        sb.append(", defence=").append(defence);
        sb.append(", block=").append(block);
        sb.append(", parryChance=").append(parryChance);
        sb.append(", hitChance=").append(hitChance);
        sb.append(", missChance=").append(missChance);
        sb.append(", bleedResist=").append(bleedResist);
        sb.append(", slashResist=").append(slashResist);
        sb.append(", punctureResist=").append(punctureResist);
        sb.append(", magickResist=").append(magickResist);
        sb.append(", holyResist=").append(holyResist);
        sb.append(", darkResist=").append(darkResist);
        sb.append(", fireResist=").append(fireResist);
        sb.append(", frostResist=").append(frostResist);
        sb.append(", shockResist=").append(shockResist);
        sb.append(", souls=").append(souls);
        sb.append(", hunger=").append(hunger);
        sb.append(", isEntityBoss=").append(isEntityBoss);
        sb.append('}');
        return sb.toString();
    }
}
