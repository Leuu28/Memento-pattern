public class CircleMemento {
    private int radius;
    private String color;

    public CircleMemento(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public int getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }
}
