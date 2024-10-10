package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(4, 4);
        Room room2 = new Room(5, 5);
        Room room3 = new Room(6, 6);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 3);

        System.out.println("Total number of lamps: " + countLampInBuilding(building));
        System.out.println("Total number of windows: " + countWindowsInBuilding(building));
        System.out.println("Total number of rooms: " + countRoomsInBuilding(building));


        System.out.println("Is the building normal? " + isNormal(building));
    }


    public static int countLampInBuilding(Building building) {
        int lampSum = 0;

        for (Room r : building.getRooms()) {
            lampSum += r.getNumberOfLamps();
        }
        return lampSum;
    }

    public static int countWindowsInBuilding(Building building) {
        int windowSum = 0;

        for (Room r : building.getRooms()) {
            windowSum += r.getNumberOfWinddows();
        }
        return windowSum;
    }

    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }


    public static boolean isNormal(Building building) {
        return building.getNumberOfFloors() >= building.getRooms().size();
    }
}
