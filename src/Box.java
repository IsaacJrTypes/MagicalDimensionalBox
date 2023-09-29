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
    public String volume() {
        return "Volume of box: " + this.width * this.height * this.depth;
    }

    //add item
    public void addItem(String item) {
        if (index < this.items.length) {
            this.items[this.index] = item;
            System.out.println("Added: " + item);
            this.index++;
        } else {
            System.out.println("The box has reached capacity: " + this.items.length + ", cannot add: " + item);
        }


    }

    public void removeItem() {
        this.index -= 1;
        if (this.index > -1) {
            System.out.println("removed: " + this.items[this.index]);
            this.items[this.index] = null;

        } else {
            throw new ArrayIndexOutOfBoundsException("Box is empty, nothing to remove");
        }

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
