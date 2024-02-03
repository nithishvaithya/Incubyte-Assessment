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


    public void moveForward() {}

    public void moveBackward() {}

    public void turnLeft() {}

    public void turnRight() {}

    public void turnUp() {}

    public void turnDown() {}
    
}
