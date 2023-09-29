// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MagicalBoxDemo {
    public static void main(String[] args) {
        //create instance
        try {
            //Box errBox = new Box(0, 2.0, 1.0);
            Box box = new Box(3.0, 2.0, 1.0);
            System.out.println(box.volume());
            //box.removeItem();
            box.addItem("Teddy bear");
            box.addItem("Dice");
            box.addItem("Rubber Ducky");
            box.addItem("Chew Toy");
            box.printItems();
            box.removeItem();
            box.printItems();
            box.addItem("Car");
            box.addItem("train");
            box.addItem("plane");
            box.addItem("bus");
            box.addItem("shoe");
            box.addItem("laptop");
            box.addItem("bed");
            box.addItem("pillow");
            box.removeItem();
            box.addItem("bed");
            box.printItems();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            box.removeItem();
            //box.removeItem();
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}