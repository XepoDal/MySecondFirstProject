package com.google;

public class TestGamePlay extends HeirClass{

    public void testGamePlay() {
    MainPage mainPage = new MainPage(driver);
    mainPage.pageOpen();
    GameObject Game1Obj = mainPage.game1Open();
    Game1Obj.timeOutTest(10);
    Game1Obj.incorrectAnswersTest(10);
    Game1Obj.correctAnswersTest(1);
    }
}
