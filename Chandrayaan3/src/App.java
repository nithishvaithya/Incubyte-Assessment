import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial position (x y z) and direction (N/S/E/W/U/D) :");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        char direction = scanner.next().charAt(0);

        Spacecraft spacecraft = new Spacecraft(x, y, z, direction);

        System.out.println("Enter the commands (f/b/l/r/u/d). Enter 'q' to quit:");
        while (scanner.hasNext()) {
            String command = scanner.next();
            if (command.equals("q")) {
                break;
            }
            executeCommand(spacecraft, command);
        }

        System.out.println("Final Position: (" + spacecraft.getX() + ", " + spacecraft.getY() + ", " + spacecraft.getZ() + ")");
        System.out.println("Final Direction: " + spacecraft.getDirection());

        scanner.close();
    }

    private static void executeCommand(Spacecraft spacecraft, String command) {
        switch (command) {
            case "f":
                spacecraft.moveForward();
                break;
            case "b":
                spacecraft.moveBackward();
                break;
            case "l":
                spacecraft.turnLeft();
                break;
            case "r":
                spacecraft.turnRight();
                break;
            case "u":
                spacecraft.turnUp();
                break;
            case "d":
                spacecraft.turnDown();
                break;
            default:
                System.out.println("Invalid command: " + command);
        }
    }
}
