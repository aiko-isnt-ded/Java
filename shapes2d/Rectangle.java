package shapes2d;

public class Rectangle {

    /* Valores default para la base y la altura del rectángulo 
    en caso de que NO se ingresen valores o sean inválidos */
    public double base = 1;
    public double height = 1;

    // ============================
    // Constructores
    // ============================

    public Rectangle(double l) {
        setBase(l);
        setHeight(l);
    }

    // Custom constructor
    public Rectangle(double b, double h) {
        base = b;
        height = h;
    }

    public Rectangle() {
    }

    // ============================
    // Métodos
    // ============================

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public void print() {
        System.out.println(this.base + ", " + this.height);
    }

    public double area() {
        return this.height * this.base;
    }

    public double perimeter() {
        return 2 * this.height * this.base;
    }
    
    @Override 
    public String toString() {
        return String.format("[Base = %.1f, Height = %.1f]", this.base, this.height);
    }

    @Override 
    public boolean equals(Object obj) {
        // En caso de que el objeto ingresado no pueda ser casteado a Rectangle
        if (!(obj instanceof Rectangle)) return false;

        // De lo general (Object) a lo particular (Rectangle)
        Rectangle r = (Rectangle) obj;

        // this es el objeto antes del punto
        return r.base == this.base && r.height == this.height;
    }

    public Rectangle clone() {
        return new Rectangle(this.base, this.height);
    }


}