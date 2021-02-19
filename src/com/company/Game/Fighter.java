package com.company.Game;

public interface Fighter {
    int hit();
    void takeDamage(Fighter fighter);
    int getCurrentHealth();
    void addCurrentHealth(int health);
    void reduceCurrentHealth(int health);
}
