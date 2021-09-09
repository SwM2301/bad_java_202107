package com.bad_java.homework.hyperskill.tictactoe.part_4;

public class TicTacToe {
    public static void main(String[] args) {
        Terminal console = new Terminal();
        Game curGame = new Game(console);
        console.print("Enter cells: ");
        String gameBoard = console.readLine();
        CheckInput check = new CheckInput() {
            @Override
            public boolean checkBoardInput(String inputBoard) {
                if (inputBoard.length() != curGame.getHeight() * curGame.getWidth()) {
                    // добавить проверку на неподходящие симвоlы
                    return false;
                }
                return true;
            }
        };
        if (check.checkBoardInput(gameBoard)) {
            for (int i = 0; i < 9; i++) {
                curGame.getState().nextStep(i % 3, i / 3, gameBoard.charAt(i));
            }
            curGame.printBoard();
            boolean wasDone;
            do {
                wasDone = curGame.getState().nextStep();
            } while (!wasDone);
            curGame.printBoard();
            //System.out.println(curGame.getState().printState());
        }
    }

}
