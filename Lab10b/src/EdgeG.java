package гл10б;

public class EdgeG implements Edge{
    NodeG inpoint;
    NodeG outpoint;
    String direction;

    public EdgeG(NodeG inpoint, NodeG outpoint, String direction) {
        this.inpoint = inpoint;
        this.outpoint = outpoint;
        this.direction = direction;
    }

    @Override
    public NodeG getInPoint() {
        return inpoint;
    }

    @Override
    public NodeG getOutPoint() {
        return outpoint;
    }

    @Override
    public Object getDirection() {
        return direction;
    }

    @Override
    public void setDirection(String direction) throws InvalidOperation {
    this.direction = direction;
    }

    @Override
    public String toString() {
        return "Ребро: " +
                 inpoint.Name +
                direction + outpoint.Name;
    }
}
