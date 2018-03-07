package by.epam.preTraining.SiarheiHuba.tasks.Task9.Controller;

import by.epam.preTraining.SiarheiHuba.tasks.Task9.Model.ContentManipulator;
import by.epam.preTraining.SiarheiHuba.tasks.Task9.View.View;

public class Controller {

    public static void main(String[] args) {
        ContentManipulator manipulator = new ContentManipulator();
        String testString = "Sentence 1number one has six words. Sentence 2number two has seven seven words. " +
                "Sentence 3number three has five. Sentence 4number four has eight different nice words. ";
        View.view(manipulator.sortContentShortToLongSentences(testString));
        View.view(manipulator.swithcSentenceFirstAndLastWord(testString));
        View.view(manipulator.sortAllWordsAlphabeticOrder(testString));
   //   View.view(manipulator.sortContentShortToLongSentences(testString));
    }
}
