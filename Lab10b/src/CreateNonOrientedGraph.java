package гл10б;

import java.util.ArrayList;
import java.util.Collection;

public class CreateNonOrientedGraph implements Graph{

String name;
    int numN = 0;
    int numE = 0;
   ArrayList nodes = new ArrayList<NodeG>();
   ArrayList edges = new ArrayList<EdgeG>();

    @Override
    public Collection getNodes() {
        return nodes;
    }

    @Override
    public Collection getEdges() {
        return edges;
    }

    @Override
    public  NodeG createNode(Object value) {
        nodes.add(numN, value);
        numN++;
        return new NodeG(value);
    }

    @Override
    public EdgeG createEdge(NodeG in, NodeG out, String direction) {
        EdgeG valueE = new EdgeG(in, out, direction);
        edges.add(numE, valueE);
        return valueE;
    }

    @Override
    public void deleteNode(int node) throws InvalidOperation {
        nodes.remove(node);
    }

    @Override
    public void deleteEdge(int edge) throws InvalidOperation {
        edges.remove(edge);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
