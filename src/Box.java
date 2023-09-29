import java.util.Arrays;

public class Box {
    //var for width, height, and depth
    double width;
    double height;
    double depth;
    //index for stack like behavior
    int index = 0;
    //String Array of 10 items
    String[] items = new String[10];

    //constructor for instantiation
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

    //remove item: behavior is Last In, First Out (LIFO)
    public void removeItem() {
        this.index -= 1;
        if (this.index > -1) {
            System.out.println("removed: " + this.items[this.index]);
            this.items[this.index] = null;

        } else {
            throw new ArrayIndexOutOfBoundsException("Box is empty, nothing to remove");
        }

    }

    //print items using loop
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
