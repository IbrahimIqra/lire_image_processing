public class Main {
    public static void main(String[] args) throws Exception {
        ImageDataProcessor idp = new ImageDataProcessor();

        double[] rtrArr = idp.processImage("ADD IMAGE PATH");
        for (double val: rtrArr){
            System.out.println(val);
        }
    }
}