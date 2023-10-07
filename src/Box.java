/* Description: The class creates instances of a box using width, height, and depth for dimensions.
 * removeItem function uses Last In,First Out (LIFO) method to remove items in array
 * */
public class Box {
    private double width;
    private double height;
    private double depth;
    //index for stack like behavior
    private int index = 0;
    private String[] items = new String[10];

    public Box(double width, double height, double depth) {
        if (width > 0 && height > 0 && depth > 0) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        } else {
            throw new IllegalArgumentException("Dimensions need to be positive");
        }
    }

    //volume method
    public double volume() {
        return Math.round(this.width * this.height * this.depth * 100.0) / 100.0;
    }

    //add item
    public boolean addItem(String item) {
        if (hasSpace()) {
            this.items[this.index] = item;
            System.out.println("Added: " + item);
            this.index++;
            return true;
        }
        return false;
    }

    public boolean hasSpace() {
        return this.index < this.items.length;
    }

    public boolean removeItem() {
        this.index -= 1;
        if (hasItems()) {
            System.out.println("removed: " + this.items[this.index]);
            this.items[this.index] = null;
            return true;
        }
        return false;

    }

    public boolean hasItems() {
        return this.index > -1;
    }

    public void printItems() {
        System.out.print("items in box: ");
        for (int i = 0; i < this.index; i++) {
            System.out.print(this.items[i]);
            if (i < this.index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
