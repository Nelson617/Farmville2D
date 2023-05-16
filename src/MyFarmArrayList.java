import java.util.ArrayList;

public class MyFarmArrayList {

    public ArrayList<Plot> row = new ArrayList<Plot>(); //array list
    public MyFarmArrayList(){
        System.out.println("my farm using array list");



//        for(Plot a : row) {
//
//            System.out.println(row.size());
//            row.add(new Plot());
//            a.printPlot();
//        }

        for(int p = 0; p <10; p++) {

            System.out.println(row.size());
            row.add(new Plot());
            row.get(p).printPlot();
        }
//        row.add(new Plot());

        System.out.println(row.size());

        totalplants();
    }

    public void totalplants() {
        // how many total plants are there in the row?

        int total = 0;

        for(Plot a: row){
            total += a.NumberOfPlants;
        }

        System.out.println("total plant in my farm is " + total);


    }
}
