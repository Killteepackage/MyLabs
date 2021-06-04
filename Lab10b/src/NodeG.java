package гл10б;

public class NodeG implements Node {
    Object value;
    Object Name;

    public NodeG(Object value) {
        this.value = value;
    }

    public NodeG() {
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) throws InvalidOperation {
    this.value = value;
    }
}
