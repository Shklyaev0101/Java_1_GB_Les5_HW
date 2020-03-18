package ru.geekbrains_Java_one_lesson_5_HW;

public abstract class Animal {
    protected String animal;
    protected int maxLengthRun;
    protected float maxHeightJump;
    protected int maxLengthSwim;

    public Animal(String animal, int maxLengthRun, float maxHeightJump, int maxLengthSwim) {
        this.animal = animal;
        this.maxLengthRun = maxLengthRun;
        this.maxHeightJump = maxHeightJump;
        this.maxLengthSwim = maxLengthSwim;
    }

    public void getRun() {
        System.out.println(animal + this.maxLengthRun + " meters");
    }
    public void getSwim() {
        System.out.println(animal + this.maxHeightJump + " meters");
    }
    public void getJumpOverSolder() {
        System.out.println(animal + this.maxLengthSwim + " meters");
    }
}
