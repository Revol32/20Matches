import java.util.Scanner;

public class PlayerService {
    private static int matchesLeft = 20;
    private static int matchesPlayerTake;

    public static boolean isComputerPlayerWin() {
        Scanner scanner = new Scanner(System.in);
        Messenger messenger = new Messenger();
        ComputerPlayerService computerPlayerService = new ComputerPlayerService();
        messenger.startGame();
        while (matchesLeft > 1) {
            messenger.printLeftMatches(matchesLeft);
            matchesLeft = computerPlayerService.computerPlayerMove(matchesLeft, matchesPlayerTake);
            if (matchesLeft == 1) {
                return true;
            }
            messenger.printPlayerMove();
            matchesPlayerTake = scanner.nextInt();
            while (matchesPlayerTake <= 0 || matchesPlayerTake > 3) {
                messenger.printErrorPlayerInput();
                matchesPlayerTake = scanner.nextInt();
            }
            matchesLeft -= matchesPlayerTake;
        }
        return false;
    }
}
