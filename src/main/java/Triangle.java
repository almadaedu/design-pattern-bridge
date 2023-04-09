public class Triangle extends Shape{

    public Triangle(Color c) {
        super(c);
    }

    @Override
    public String applyColor() {
        return String.format("Triangle filled with blue", color.applyColor());
    }
}
