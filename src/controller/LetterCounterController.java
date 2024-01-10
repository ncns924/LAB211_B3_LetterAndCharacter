package controller;
import model.LetterCounterModel;
import view.LetterCounterView;

public class LetterCounterController {
    private LetterCounterModel model;
    private LetterCounterView view;

    public LetterCounterController(LetterCounterModel model, LetterCounterView view) {
        this.model = model;
        this.view = view;
    }

    public void processInput(String input) {
        model.countLettersAndWords(input);
        view.displayWordCounts(model.getWordCounts());
        view.displayLetterCounts(model.getLetterCounts());
    }
}