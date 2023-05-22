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
        printPlantNames();
        addSunflower();
        addcorn();
        tomatolocations();
        totalCarrots();
    }

    public void totalplants() {
        // how many total plants are there in the row?

        int total = 0;

        for(Plot a: row){
            total += a.NumberOfPlants;
        }

        System.out.println("total plant in my farm is " + total);


    }

    public void printPlantNames() {
        // print the names of each plant in the row and its index
        for(int k = 0; k < row.size(); k++){
            System.out.print(k + ": " + row.get(k).PlantName + " \t");
        }
        System.out.println();
    }


    public void addSunflower(){
        Plot sunflower = new Plot();
        sunflower.PlantName = "sunflower";
        sunflower.NumberOfPlants = 42;
        sunflower.NeedsWater = true;
        sunflower.printPlot();

        row.add(sunflower);
        printPlantNames();

    }
    public void addcorn() {
        Plot corn = new Plot();
        corn.PlantName = "corn";
        corn.NumberOfPlants = 70;
        corn.NeedsWater = false;
        corn.printPlot();

        row.add(3, corn);
        printPlantNames();
    }

    public void tomatolocations() {

        for(int m = 0; m < row.size(); m++){

            if(row.get(m).PlantName.equals("tomato")){
                System.out.println(m);
            }

        }
    }

    public void totalCarrots() {
       // for()
    }

}
