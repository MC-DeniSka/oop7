class Complex extends ComplexFactory{
    private static Complex instance;
    private double real;
    private double imaginary;

    private Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex getInstance(double real, double imaginary) {
        if (instance == null) {
            instance = new Complex(real, imaginary);
        }
        return instance;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return "Результат: " + getReal() + " + " + getImaginary();
    }
}