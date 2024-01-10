package main;

import java.util.Scanner;

import controller.LetterCounterController;
import model.LetterCounterModel;
import view.LetterCounterView;

public class LetterCounterApp {
    public static void main(String[] args) {

        LetterCounterModel model = new LetterCounterModel();
        LetterCounterView view = new LetterCounterView();
        LetterCounterController controller = new LetterCounterController(model, view);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String userInput = scanner.nextLine();

        controller.processInput(userInput);

        scanner.close();
    }
}