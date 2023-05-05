public class MyFarm {
    public static void main(String[] arge) {
        MyFarm charlie = new MyFarm();
    }

    public Plot[][] grid;

    public MyFarm() {
        System.out.println("Hello from my farm!");
        Plot Nelson = new Plot();
        Nelson.printPlot();

//        Nelson.NumberOfPlant;

        grid = new Plot[4][5];

        for (int n = 0; n < grid.length; n++) {
            for (int r = 0; r < grid[n].length; r++) {
                grid[n][r] = new Plot();
                grid[n][r].printPlot();
            }
        }


        //call methods here
        totalPlants();
        printPlantNames();
        totalCarrots();
        averageNumberOfPlants();

    }

    public void totalPlants() {
        //how many total plants are there in the grid?
        int sumOfPlants = 0;
        for (int e = 0; e < grid.length; e++) {
            for (int c = 0; c < grid[e].length; c++) {
                sumOfPlants += grid[e][c].NumberOfPlants;
            }
        }
        System.out.println(sumOfPlants);
    }

    public void printPlantNames() {
        // print the name of each plant in each row and column
        // row: 0 col: 0 corn
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                System.out.println("row: " + r + " col: " + c + " " + grid[r][c].PlantName);
            }
        }
    }

    public void totalCarrots() {
        // how many total carrot plants are there?
        int sumOfcarrots = 0;
        for (int h = 0; h < grid.length; h++) {
            for (int k = 0; k < grid[h].length; k++) {
                if (grid[h][k].PlantName.equals("carrot")) {
                    sumOfcarrots += grid[h][k].NumberOfPlants;

                }

            }

        }
        System.out.println("The total carrots are " + sumOfcarrots);
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?
            int numOfPlants = 0;
            int totalPlants = 0;
            for (int z = 0; z < grid.length; z++) {
                for (int g = 0; g < grid[z].length; g++) {
                    numOfPlants += grid [z][g].NumberOfPlants;
                    totalPlants = totalPlants +1 ;
                }
            }
        System.out.println("the average number of plants is" + numOfPlants/totalPlants);
    }
}

