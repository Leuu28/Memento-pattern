public class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showDetails(){
        System.out.println("Cerchio --- Raggio: " + radius + ", Colore: "+ color);
    }

    public CircleMemento save(){
        return new CircleMemento(radius, color);
    }

    public void restore(CircleMemento memento){
        this.radius = memento.getRadius();
        this.color = memento.getColor();
        System.out.println("Stato del cerchio ripristinato.");
    }
}
