package com.google;

public abstract class GameObject {

    abstract void checkResult();
    abstract void winClose();
    abstract void timeOutTest(int summ);
    abstract void incorrectAnswersTest(int summ);
    abstract void correctAnswersTest(int breakpoint);
}
