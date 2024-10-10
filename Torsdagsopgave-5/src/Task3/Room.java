package Task3;

public class Room {
    private int numberOfLamps;
    private int numberOfWinddows;

    Room(int numberOfLamps, int numberOfWinddows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWinddows = numberOfWinddows;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getNumberOfWinddows() {
        return numberOfWinddows;
    }

    public void setNumberOfWinddows(int numberOfWinddows) {
        this.numberOfWinddows = numberOfWinddows;
    }
}
