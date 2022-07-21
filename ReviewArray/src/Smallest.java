public class Smallest {
    public static void main(String[] args) {
        System.out.println("Smallest Number in Array");
        int[] arrayArray = new int[]{76,223,35,46,35,636,73};
        System.out.println("The Array is:");
        for(int i =0; i< arrayArray.length; i++) {
            System.out.println(arrayArray[i]);
        }
        int minimumValue= arrayArray[0];
        for(int i =0; i < arrayArray.length; i++){
            if(arrayArray[0]<minimumValue)
                minimumValue = arrayArray[i];
            System.out.println("The Smallest value is " + minimumValue);
        }
    }
}