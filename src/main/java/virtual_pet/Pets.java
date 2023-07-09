package virtual_pet;

public class Pets {
    private String name;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;
    private int day;

    public Pets(String name) {
        this.name = name;
        this.hunger = (int) (Math.random() * 100 + 1);
        this.thirst = (int) (Math.random() * 100 + 1);
        this.waste = (int) (Math.random() * 100 + 1);
        this.boredom = (int) (Math.random() * 100 + 1);
        this.sickness = (int) (Math.random() * 100 + 1);
        this.day = (int) 1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSickness() {
        return sickness;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getBoredom() {
        return boredom;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void feed() {
        setHunger(getHunger() - 40);
        setWaste(getWaste() + 10);
        setBoredom(getBoredom() + 5);
        setThirst(getThirst() + 5);

    }

    public void water() {
        setThirst(getThirst() - 40);
        setWaste(getWaste() + 10);
        setThirst(getThirst() + 10);
        setBoredom(getBoredom() + 5);
    }

    public void play() {
        setBoredom(getBoredom() - 40);
        setHunger(getHunger() + 10);
        setThirst(getThirst() + 10);

    }

    public void goToBathroom() {
        setWaste(getWaste() - 40);
        setHunger(getHunger() + 10);
        setSickness(getSickness() - 5);
    }

    public void visitDoctor() {
        setSickness(getSickness() - 60);
        setHunger(getHunger() + 5);
        setBoredom(getBoredom() + 5);
    }

    public void sleep() {
        setBoredom(getBoredom() + 10);
        setHunger(getHunger() + 5);
        setThirst(getThirst() + 10);
        setSickness(getSickness() - 5);
        setWaste(getWaste() + 8);
    }

    public void tick() {
        setDay(getDay() + 1);
        setHunger(getHunger() + 10);
        setBoredom(getBoredom() + 5);
        setThirst(getThirst() + 3);
        setWaste(getWaste() + 2);
        setSickness(getSickness() + 3);
    }

}
