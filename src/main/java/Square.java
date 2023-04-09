public class Square extends Shape{
    public Square(Color c) {
        super(c);
    }

    @Override
    public String applyColor() {
        return String.format("Square filled with red", color.applyColor());
    }
}
