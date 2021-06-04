package гл10б;

public interface Edge {
    Node getInPoint();
    Node getOutPoint();
    Object getDirection();
    void setDirection(String direction) throws InvalidOperation;

}
