public class MyFarm {


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
        plotWithMaxNumber();
        plantWithMaxNumber();

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
                numOfPlants += grid[z][g].NumberOfPlants;
                totalPlants = totalPlants + 1;
            }
        }
        System.out.println("The average number of plants is " + numOfPlants / totalPlants);
    }

    public void plotWithMaxNumber() {
        // which plot type has the most total plants?
        int maxNumber = grid[0][0].NumberOfPlants;
        String name = grid[0][0].PlantName;
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g > grid[b].length; g++) {
                if (grid[b][g].NumberOfPlants > maxNumber) {
                    maxNumber = grid[b][g].NumberOfPlants;
                    name = grid[b][g].PlantName;

                }
            }
        }
        System.out.println(name + " has the most plants with a total of " + maxNumber + " plants");
    }

    public void plantWithMaxNumber() {
        int numCorn = 0;
        int numTomato = 0;
        int numCarrot = 0;
        int numSunflower = 0;

        // which plant type has the most total plants?
        for (int b = 0; b < grid.length; b++) {
            for (int g = 0; g > grid[b].length; g++) {
                switch(grid[b][g].PlantName){
                    case "corn":
                        numCorn += grid[b][g].NumberOfPlants;
                        break;
                    case "snuflower":
                        numSunflower += grid[b][g].NumberOfPlants;
                        break;
                    case "Tomato":
                        numTomato += grid[b][g].NumberOfPlants;
                        break;
                    default:
                        numCarrot += grid[b][g].NumberOfPlants;
                    break;
                }
                if(grid[b][g].PlantName.equals("corn")){

                }
            }
        }

        if(numCorn > numCarrot && numCorn > numSunflower && numCarrot > numTomato) {
            System.out.println("Corn has the most plants with " + numCorn + " plants");
        }

        if(numTomato > numCarrot && numTomato > numSunflower && numTomato > numCorn) {
            System.out.println("Tomato has the most plants with " + numTomato + " plants");
        }

        if(numCarrot > numTomato && numCarrot > numSunflower && numCarrot > numCorn) {
            System.out.println("Carrot has the most plants with " + numCarrot + " plants");
        }
        if(numSunflower > numCarrot && numSunflower > numTomato && numSunflower > numCorn) {
            System.out.println("Sunflower has the most plants with " + numSunflower + " plants");
        }
        else{
        }

    }
}





