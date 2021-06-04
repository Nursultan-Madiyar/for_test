
public class Tank {

    int x, y;
    int dir;
    int fuel;
    static int tankNumber;
    static final String tankName = "T34-";
    private int n;

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++tankNumber;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
        n = ++tankNumber;
    }

    public Tank() {
        this.x = 0;
        this.y = 0;
        this.fuel = 100;
        n = ++tankNumber;
    }

    public void goForward(int i) {
        i = setFuel(i);
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= i;
    }

    public void printPosition() {
        System.out.println("The Tank " + tankName + n +" is at " + x +", " + y + " now.");
    }

    public void goBackward(int i) {
        goForward(-i);
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir=0;
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir=3;
    }

    public int setFuel(int i) {
        if (Math.abs(i) <= fuel) return i;
        else {
            if (i<0) return -fuel;
            else return fuel;
        }
    }
}
