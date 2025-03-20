public class Complex {
    private double real;
    private double imag;

    // 1. Default constructor that sets both real and imaginary parts to 0
    public Complex() {
        real = 0;
        imag = 0;
    }

    // 2. Constructor that initializes the real part only
    public Complex(double r) {
        real = r;
        imag = 0;
    }

    // 3. Constructor that initializes both real and imaginary parts
    public Complex(double r, double i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImag = this.imag + other.imag;
        return new Complex(newReal, newImag);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imag * other.imag);
        double newImag = (this.real * other.imag) + (this.imag * other.real);
        return new Complex(newReal, newImag);
    }

    // Method to display the complex number
    public void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }

    // Main method to test everything
    public static void main(String[] args) {
        // Create two complex numbers: 3 + 2i and 4 - 2i
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(4, -2);

        // Add the two complex numbers
        Complex sum = c1.add(c2);

        // Multiply the two complex numbers
        Complex product = c1.multiply(c2);

        // Display results
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Product: ");
        product.display();
    }
}
