public class Spacecraft {
    private int x;
    private int y;
    private int z;
    private char direction;

    public Spacecraft(int x, int y, int z, char direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void moveForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
        }
    }

    public void turnUp() {
        if (direction == 'N' || direction == 'S') {
            direction = 'U';
        } else if (direction == 'U') {
            direction = 'S';
        } else if (direction == 'D') {
            direction = 'N';
        }
    }

    public void turnDown() {
        if (direction == 'N' || direction == 'S') {
            direction = 'D';
        } else if (direction == 'D') {
            direction = 'S';
        } else if (direction == 'U') {
            direction = 'N';
        }
    }

}
