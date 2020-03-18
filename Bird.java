package ru.geekbrains_Java_one_lesson_5_HW;

public class Bird extends Animal {

    public Bird(String animal, int maxLengthRun, float maxHeightJump, int maxLengthSwim) {
        super(animal, maxLengthRun, maxHeightJump, maxLengthSwim);
    }

    public void getRun() {
        System.out.println(animal + " ran" + maxLengthRun + " meters");
    }

    public void getSwim() {
        System.out.println("Ohhh, Bird can't swim");
    }

    public void getJumpOverSolder() {
        System.out.println(animal + " can jump over solder" + maxHeightJump + " meters high");
    }
}
