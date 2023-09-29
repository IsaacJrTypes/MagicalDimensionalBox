/*
 * Description: The program creates a box with dimensions of width, height and length.
 * The box can also store 10 items
 * @author: Isaac Jimenez
 * @version: 1.0
 *
 * */
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
            box.addItem("dog");
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