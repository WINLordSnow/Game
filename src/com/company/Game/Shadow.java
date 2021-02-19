package com.company.Game;

public abstract class Shadow implements Fighter{
    //    private String name;
    private int armor = 5;
    private int health = 20;
    private int attack = 20;
    private int speed = 5;

    private int currentArmor;
    private int currentHealth;
    private int currentAttack;
    private int currentSpeed;
    private boolean isUseAbility;

    public Shadow(int armor, int health, int attack, int speed) {
        this.armor += armor;
        this.health += health;
        this.attack += attack;
        this.speed += speed;
    }

    public int getCurrentArmor() {
        return currentArmor;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getCurrentAttack() {
        return currentAttack;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCurrentArmor(int currentArmor) {
        this.currentArmor = currentArmor;
    }

    public  void reduceCurrentArmor(int armorBonus) {
        this.currentArmor -= armorBonus;
    }

    public  void addCurrentArmor(int armorBonus) {
        this.currentArmor += armorBonus;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public void reduceCurrentHealth(int currentHealth) {
        this.currentHealth -= currentHealth;
    }

    @Override
    public void addCurrentHealth(int health) {
        this.currentHealth += health;
    }

    public void setCurrentAttack(int currentAttack) {
        this.currentAttack = currentAttack;
    }

    public void reduceCurrentAttack(int attackBonus) {
        this.currentAttack -= attackBonus;
    }

    public void addCurrentAttack(int attackBonus) {
        this.currentAttack += attackBonus;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public abstract void useAbility();
}
