package ru.geekbrains_Java_one_lesson_5_HW;

public class Cat extends Animal {

    public Cat(String animal, int maxLengthRun, float maxHeightJump, int maxLengthSwim) {
        super(animal, maxLengthRun, maxHeightJump, maxLengthSwim);
    }

    public void getRun() {
        System.out.println(animal + " run" + maxLengthRun + " meters");
    }

    public void getSwim() {
        System.out.println("Ohhh, Cat can't swim");
    }

    public void getJumpOverSolder() {
        System.out.println(animal + " can jump over solder" + maxHeightJump + " meters high");
    }
}
