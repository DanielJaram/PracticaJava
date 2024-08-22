package oops;

public class RGBColor {
	 // The Red, Green, Blue color values range from 0 to 255.
    private int red;
    private int green;
    private int blue;

    // Constructor for RGBColor class which initializes the color with provided red, green and blue values.
    public RGBColor(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	// Getter method to get the red value of the color.
    public int getRed() {
    	return red;
        // write your code here
    }

    // Getter method to get the green value of the color.
    public int getGreen() {
    	return green;
        // write your code here
    }

    // Getter method to get the blue value of the color.
    public int getBlue() {
    	return blue;
        // write your code here
    }

    // Method to invert the color. The inversion is done by subtracting each color component from 255.
    public void invert() {
        // write your code here
    	if(this.red >= 0) {
    		this.red = 255 - this.red;
    	}
    	if(this.green >= 0) {
    		this.green = 255 - this.green;
    	}
    	if(this.blue >= 0) {
    		this.blue = 255 - this.blue;
    	}
    }
}
