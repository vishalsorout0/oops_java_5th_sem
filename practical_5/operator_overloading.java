
class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int r, int i) {
        real = r;
        imaginary = i;
    }

    ComplexNumber add(ComplexNumber c) {
        int r = real + c.real;
        int i = imaginary + c.imaginary;
        return new ComplexNumber(r, i);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        ComplexNumber sum = c1.add(c2);

        System.out.print("Sum: ");
        sum.display();
    }
}
