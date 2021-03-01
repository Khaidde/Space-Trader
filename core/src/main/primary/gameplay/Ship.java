package main.primary.gameplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ship {

    private final String name;

    private int maxHp;
    private int attack;
    private int fuelCapacity;

    public int hp;
    public int fuel;

    private int cargo;
    private final List<Item> items;

    private int upgradeSlots;
    private final List<CharacterUpgrade> upgrades;

    public Ship() {
        this.name = "AFO";

        this.maxHp = 50;
        this.attack = 10;
        this.fuelCapacity = 3000;

        this.hp = maxHp;
        this.fuel = fuelCapacity;

        this.cargo = 5;
        this.items = new ArrayList<>();
        this.upgradeSlots = 3;
        this.upgrades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHp;
    }

    public int getHP() {
        return hp;
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }

    public int getAttack() {
        return attack;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getCargo() {
        return cargo;
    }

    public boolean hasCargoSpace() {
        return items.size() < cargo;
    }

    public int getTotalItems() {
        return items.size();
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void clearItems() {
        items.clear();
    }

    public int getUpgradeSlots() {
        return upgradeSlots;
    }

    public CharacterUpgrade getUpgrade(int index) {
        return upgrades.get(index);
    }

    public boolean hasUpgradeSlotSpace() {
        return upgrades.size() < upgradeSlots;
    }

    public int getTotalUpgrades() {
        return upgrades.size();
    }

    public void addUpgrade(CharacterUpgrade upgrade) {
        upgrades.add(upgrade);
    }

    public void removeUpgrade(CharacterUpgrade upgrade) {
        upgrades.remove(upgrade);
    }

}