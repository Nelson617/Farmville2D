public class MyFarm {
    public static void main(String[] arge) {
        MyFarm charlie = new MyFarm();
    }


    public MyFarm() {
        System.out.println("Hello from my farm!");
        Plot Nelson = new Plot();
        Nelson.printPlot();

        Plot[][] grid = new Plot[100][50];

        for (int n = 1; n < grid.length; n++) {
            for (int r = 1; r < grid[n].length; r++) {
                grid[n][r] =new Plot();
                grid[n][r].printPlot();
            }
        }
    }
}

