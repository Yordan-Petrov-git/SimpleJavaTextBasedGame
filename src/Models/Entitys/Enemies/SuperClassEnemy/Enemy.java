package Models.Entitys.Enemies.SuperClassEnemy;

import Models.Entitys.SuperClassEntity.Entity;

public class Enemy extends Entity {

    private double dropAmmountExpiriance;
    private double dropAmmountGold;
    private double dropAmmountItems;

    public double getDropAmmountExpiriance() {
        return this.dropAmmountExpiriance;
    }

    public void setDropAmmountExpiriance(double dropAmmountExpiriance) {
        this.dropAmmountExpiriance = dropAmmountExpiriance;
    }

    public double getDropAmmountGold() {
        return this.dropAmmountGold;
    }

    public void setDropAmmountGold(double dropAmmountGold) {
        this.dropAmmountGold = dropAmmountGold;
    }

    public double getDropAmmountItems() {
        return this.dropAmmountItems;
    }

    public void setDropAmmountItems(double dropAmmountItems) {
        this.dropAmmountItems = dropAmmountItems;
    }
}
