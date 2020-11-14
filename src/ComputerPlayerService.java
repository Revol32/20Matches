public class ComputerPlayerService {
    public int computerPlayerMove(int matchesLeft, int matchesPlayerTake) {
        int matchesComputerTake = matchesLeft == 20 ? 3 : 4 - matchesPlayerTake;
        matchesLeft -= matchesComputerTake;
        Messenger messenger = new Messenger();
        messenger.printComputerMove(matchesComputerTake);
        messenger.printLeftMatches(matchesLeft);
        return matchesLeft;
    }
}
