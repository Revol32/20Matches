public class Messenger {
    public void startGame() {
        System.out.println("Правила игры\n" +
                "В начале игры на столе лежит 20 спичек.\n" +
                "Игроки ходят по очереди, убирая на выбор 1, 2 или 3 спички.\n" +
                "Проигравшим считается тот, кто возьмет со стола последнюю спичку.");
    }

    public void printLeftMatches(int matchesLeft) {
        String endPrintLeft = "спичек.";
        if (matchesLeft < 5) {
            endPrintLeft = "спички.";
        }
        System.out.println("На столе осталось " + matchesLeft + " " + endPrintLeft);
    }

    public void printComputerMove(int matchesComputerTake) {
        System.out.println("Ход компьютера. Количество убраных спичек: " + matchesComputerTake);
    }

    public void printPlayerMove() {
        System.out.print("Ход игрока. Введите количество убираемых спичек: ");
    }

    public void printErrorPlayerInput() {
        System.out.print("Введено не коректное значение! \n Введите количество убираемых спичек: ");
    }

    public void endGame() {
        System.out.println("Вы проиграли! На столе осталась последняя спичка.");
    }

    public void endGameFalse() {
        System.out.println("Ошибка логики компьютера.");
    }
}
