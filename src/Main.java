public class Main {
    public static void main(String[] args) {
        /*Rect rect = new Rect(2, 3);
        rect.w = 1;
        System.out.println(rect.getW() * rect.getH() == rect.getS());*/

        Tank justTank = new Tank();
// В (10;20) с fuel = 100
        Tank anywareTank = new Tank(10, 10);
// В (20;30) с fuel = 200
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();
    }
}
