public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20, "Verde");
        StateManager stateManager = new StateManager();

        circle.showDetails();

        stateManager.save(circle);

        circle.setRadius(50);
        stateManager.save(circle);

        circle.setColor("Rosso");
        stateManager.save(circle);

        stateManager.undo(circle);
        circle.showDetails();

        stateManager.undo(circle);
        circle.showDetails();

        stateManager.undo(circle);
        circle.showDetails();
    }
}