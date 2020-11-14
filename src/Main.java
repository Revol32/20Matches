public class Main {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        if (PlayerService.isComputerPlayerWin()) {
            messenger.endGame();
        } else {
            messenger.endGameFalse();
        }
    }
}
