public class activity7 {
    public static void main(String[] args) {
        dataset Dataset = new dataset();
        Dataset.add(10);
        Dataset.add(12);
        Dataset.add(14);
        Dataset.add(16);
        Dataset.add(18);
        System.out.println("Standard Deviation: " + Dataset.getStandardDeviation());

        dataset[] datasets = new dataset[3];

        dataset ds1 = new dataset();
        ds1.add(2);
        ds1.add(4);
        ds1.add(6);

        dataset ds2 = new dataset();
        ds2.add(1);
        ds2.add(3);
        ds2.add(5);

        dataset ds3 = new dataset();
        ds3.add(10);
        ds3.add(20);

        datasets[0] = ds1;
        datasets[1] = ds2;
        datasets[2] = ds3;

        System.out.println("Average of Averages: " + dataset.calculateAverage(datasets));
    }
}
