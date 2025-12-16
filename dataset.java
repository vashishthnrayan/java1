public class dataset {
    private double [] data;
    private int dataSize;
    private double  sum;

    public dataset(){
        data = new double[100];
        dataSize =0;
        sum=0;
    }

    public void add(double value){
        data[dataSize]=value;
        dataSize++;
        sum+=value;

    }
    public double getAverage(){
        if(dataSize==0){
            return 0;
        }
        return sum/dataSize;
    }
    public double  getStandardDeviation(){
        double mean = getAverage();
        double sumSquaredDiffs =0.0;
        for(int i=0;i<dataSize;i++){
            double diff = data[i] - mean;
            sumSquaredDiffs += diff *diff;
        }
        return Math.sqrt(sumSquaredDiffs/dataSize);
    }
    public static double calculateAverage(dataset[] datasets){
            double totalSum =0.0;
            for (dataset ds : datasets){
                totalSum += ds.getAverage();
            }
            return totalSum / datasets.length;
        }
    @Override
    public String toString() {
        return "DataSet [size=" + dataSize + ", average=" + getAverage() +"]";
    }
}



