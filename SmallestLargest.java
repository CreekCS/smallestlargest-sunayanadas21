//Sunayana Das
public class SmallestLargest{
    public static void main (String [] args){
       int [] arr= new int[10];
       for (int i=0; i<arr.length; i++){
        arr[i]= (int)((Math.random()*100)+1);
    } 
    System.out.println(smallestValue(arr));
    System.out.println(largestValue(arr));
    }
    public static int smallestValue(int[]a1){
        int min= a1[0];
        for (int i: a1){
            if (i<min)
            min=i;
        }
        return min;
    }
    public static int largestValue(int[] a2){
        int max= a2[0];
        for (int i: a2){
            if (i>max)
            max=i;
        }
        return max;
    }
       
}  