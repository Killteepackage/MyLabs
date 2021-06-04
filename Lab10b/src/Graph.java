package гл10б;

import java.util.Collection;

public interface Graph {
    Collection getNodes();
    Collection getEdges();
    NodeG createNode(Object value);
    EdgeG createEdge(NodeG in, NodeG out, String direction);
    void deleteNode(int node) throws InvalidOperation;
    void deleteEdge(int edge) throws InvalidOperation;
    String getName();
    void setName(String name);
}
