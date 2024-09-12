import java.util.Stack;

public class StateManager {
    private Stack<CircleMemento> history = new Stack<>();

    public void save(Circle circle){
        history.push(circle.save());
    }

    public void undo(Circle circle){
        if (!history.isEmpty()){
            circle.restore(history.pop());
        }else {
            System.out.println("Nessun stato precedente per poter ripristinare.");
        }
    }
}
