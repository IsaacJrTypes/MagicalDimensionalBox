public class Box {
    //var for width, height, and depth
    double width; double height; double depth;
    //index for stack array
    int index = 0;
    //String Array of 10 items
    String[] items = new String[10];
    //constructor for instantiation
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    //volume method
    public double volume() {
        return this.width * this.height * this.depth;
    }
    //add item
    public void addItem(String item) {
        if (index < this.items.length - 1) {
            this.items[this.index] = item;
            System.out.println("Added: " + item);
            this.index++;
        } else {
            System.out.println("The box has reached capacity: " + this.items.length);
        }


    }
    //remove item need accept string
    public void removeItem() {
        if (this.index != -1) {
            this.index -= 1;
            System.out.println("removed: " + this.items[this.index]);
            this.items[this.index] = null;

        } else {
            System.out.println("The box is empty, no items to remove");
        }


    }
    //print items
    public void printItems() {
        System.out.print("items in box: ");
        for(int i = 0; i < this.index; i++) {
            System.out.print(this.items[i]);
            if(i < this.index - 1) {
              System.out.print(", ");
            }
        }
        System.out.println();
    }
}
