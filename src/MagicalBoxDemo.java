// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MagicalBoxDemo {
    public static void main(String[] args) {
        //create instance
        Box box = new Box(3.0,2.0,1.0);
        box.addItem("Teddy bear");
        box.addItem("Dice");
        box.addItem("Rubber Ducky");
        box.addItem("Chew Toy");
        box.printItems();
        box.removeItem();
        box.printItems();
        box.addItem("Car");
        box.printItems();
        System.out.println("Volume: " + box.volume());
    }
}