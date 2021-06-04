package гл10б;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InvalidOperation {
        CreateNonOrientedGraph Graph = new CreateNonOrientedGraph();
        Graph.setName("Граф");
        CreateNonOrientedGraph Graph1 = new CreateNonOrientedGraph();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("\nВыберите опцию:");
            System.out.println("1. Добавить точку");
            System.out.println("2. Добавить ребро");
            System.out.println("3. Удалить точку");
            System.out.println("4. Удалить ребро");
            System.out.println("5. Показать точки");
            System.out.println("6. Показать рёбра");
            System.out.println("7. Показать граф");
            System.out.println("0. Выход");

            choice = scanner.nextInt();

            switch(choice) {
                case 1:{
                    Object node = new String();
                    System.out.println("Введите название точки: ");
                    node = scanner.next();
                    Graph.createNode(node);
                    break;
                }
                case 2:{
                    NodeG inpoint0;
                    NodeG outpoint0;
                    Object inpoint = new String();
                    System.out.println("Введите первую точку: ");
                    inpoint = scanner.next();
                    Object outpoint = new String();
                    System.out.println("введите вторую точку: ");
                    outpoint = scanner.next();
                    if(!Graph.nodes.contains(inpoint)){  inpoint0 = Graph.createNode(inpoint);}
                    else { inpoint0 = new NodeG(inpoint);}
                    if(!Graph.nodes.contains(outpoint)){  outpoint0 = Graph.createNode(outpoint);}
                    else { outpoint0 = new NodeG(outpoint);}
                    String direction;
                    System.out.println("Введите направление: -> или <-: ");
                    direction = scanner.next();
                    inpoint0.Name = inpoint;
                    outpoint0.Name = outpoint;
                        Graph.createEdge(inpoint0, outpoint0, direction);
                    break;
                }
                case 3:{
                    System.out.println("Какую точку удалить: ");
                    int s = scanner.nextInt();
                    Graph.deleteNode(s);
                    System.out.println("Точка удалена");
                    break;
                }
                case 4:{
                    System.out.println("Какое ребро удалить: ");
                    int N = scanner.nextInt();
                    Graph.deleteEdge(N);
                    System.out.println("Ребро удалено");
                    break;
                }
                case 5:{
                    System.out.println("Точки: ");
                    for (int i=0; i < Graph.getNodes().size(); i++) {
                        System.out.println(Graph.getNodes().toArray()[i].toString());
                    }
                   break;
                }

                case 6:{
                    System.out.println("Рёбра: ");
                    for(int j = 0; j < Graph.getEdges().size(); j++){
                        System.out.println(Graph.getEdges().toArray()[j].toString());
                    }
                    break;
                }
                case 7:{
                    System.out.println("Граф "+ Graph.getName());
                    System.out.println("Точки: ");
                    for (int i=0; i < Graph.getNodes().size(); i++) {System.out.println(Graph.getNodes().toArray()[i].toString());}
                    System.out.println("\nРёбра: ");
                    for(int j = 0; j < Graph.getEdges().size(); j++){System.out.println(Graph.getEdges().toArray()[j].toString());}
                    break;
                }
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
        }
}
