// Lab Program No : 9
// Java program to illustrate Constructor Overloading
class Box {
    double width, height, depth;
    // constructor with three arguments
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor with no arguments
    Box() {
        width = height = depth = 0;
    }
    // constructor with one argument
    Box(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
class lab9 
{      public static void main(String args[]) 
        { // create boxes using the various constructors
            Box mybox1 = new Box(10, 20, 15);
       	 Box mybox2 = new Box();
       	 Box mycube = new Box(7);
       	 double vol;
        	// get volume of first box
       	 vol = mybox1.volume();
        	  System.out.println("Volume of mybox1 is " + vol);
        	// get volume of second box
        	vol = mybox2.volume();
        	System.out.println("Volume of mybox2 is " + vol);
        	// get volume of cube
        	vol = mycube.volume();
       	 System.out.println("Volume of mycube is " + vol);
    	}
}