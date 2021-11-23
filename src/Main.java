import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> Aircraft = new LinkedList<String>();
        //создание LinkedList и добавление элементов в него
        Aircraft.add("F-15C Eagle");
        Aircraft.add("Gripen E");
        Aircraft.add("Su-47 Berkut");
        Aircraft.add("Su-57");
        Aircraft.addLast("ADFX-01 Morgan");
        Aircraft.addFirst("XFA-27");
        Aircraft.add(1, "Arsenal Bird");

        System.out.printf("List has %d elements \n", Aircraft.size());
        System.out.println(Aircraft.get(1));
        Aircraft.set(1, "FB-22 Strike Raptor");
        System.out.println(Aircraft.get(1));


        for(String Plane : Aircraft) {

            System.out.println(Plane);
        }

        if(Aircraft.contains("Gripen E")){

            System.out.println("List contains Gripen E");
        }

        Aircraft.remove("Gripen E");
        Aircraft.removeFirst();
        Aircraft.removeLast();
    }
}
