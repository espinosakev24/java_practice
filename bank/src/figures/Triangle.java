package figures;

public class Triangle {
    int width;
    int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return ((this.width * this.height) / 2);
    }
}
