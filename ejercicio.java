public class ejercicio{
    public static void main(String [] args) {
        int[] vector = new int[10];
        int i = 0;
        int o = 0;

        while(i < 10){
            vector[i] = 10;
            i++;
        }

        while(o < 13){
            System.out.println("Vector ["+o+"] = " + vector[o]);
            o++;
        } 
    }
}