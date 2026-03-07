package module5;
class NumberPrinter {
    int num = 1;
    int limit = 10;

    synchronized void printOdd() {
        while (num <= limit) {
            if (num % 2 == 0) {
                try {
                    wait();
                } catch (Exception e) {}
            } else {
                System.out.println("Odd: " + num);
                num++;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (num <= limit) {
            if (num % 2 != 0) {
                try {
                    wait();
                } catch (Exception e) {}
            } else {
                System.out.println("Even: " + num);
                num++;
                notify();
            }
        }
    }
}

class OddThread extends Thread {
    NumberPrinter np;

    OddThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printOdd();
    }
}

class EvenThread extends Thread {
    NumberPrinter np;

    EvenThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printEven();
    }
}

public class AlternateNumbers {
    public static void main(String[] args) {

        NumberPrinter np = new NumberPrinter();

        OddThread t1 = new OddThread(np);
        EvenThread t2 = new EvenThread(np);

        t1.start();
        t2.start();
    }
}

