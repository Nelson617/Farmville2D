import java.util.ArrayList;

public class MyFarmArrayList {

    public ArrayList<Plot> row = new ArrayList<Plot>(); //array list
    public Plot[] arr = new Plot[10]; //array
    public MyFarmArrayList(){
        System.out.println("my farm using array list");

        arr[0] = new Plot();
       // arr[0].printPlot();


        for(int p = 0; p <10; p++) {

            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }
        row.add(new Plot());

        System.out.println(row.size());
    }
}
