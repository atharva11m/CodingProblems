package prb.array;

public class FindSmallestElementInArray {
    public static void main(String[] args) {
        int [] array={11,44,55,22,44,88,12,34,56,7,5,5};
        int num=array[0];
        for(int i=1;i<array.length;i++){
            if(num>array[i]){
                num=array[i];
            }
        }
        System.out.println(num);
    }
}
