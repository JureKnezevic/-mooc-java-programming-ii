
public class MagicSquareFactory {

    public int x;
    public int y;
    public int oldX;
    public int oldY;
    public MagicSquare square;

    public MagicSquare createMagicSquare(int size) {
        square = new MagicSquare(size);
        // implement the creation of a magic square with the Siamese method algorithm here
        int n = 1;
        x = square.getHeight() / 2;
        y = 0;
        square.placeValue(x, y, n);
        for (int i = 2; i <= size * size; i++) {
            n = i;
            move();
            square.placeValue(x, y, n);
        }
        return square;
    }

    public void move() { 
        oldX = x;
        oldY = y;
        x = x + 1;
        y = y - 1;
        outside();
        checkTaken();
    }

    public void outside() {
        if (y < 0) {
            y = square.getHeight() - 1;
        } else if (y >= square.getHeight()) {
            y = 0;
        }
        if (x < 0) {
            x = square.getWidth() - 1;
        } else if (x >= square.getWidth()) {
            x = 0;
        }
    }

    public void checkTaken() {
        if (square.readValue(x, y) != 0) {
            x = oldX;
            y = oldY + 1;
               
        }
    }
}
