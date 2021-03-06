public class SecondSmallestInArray{
    public static int getSecondSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];//2nd element because index starts from 0
    }
    public static void main(String args[]){
        int arrayA[]={1,2,5,6,3,2};
        int arrayB[]={44,66,99,77,33,22,55};
        int aTotal = arrayA.length;
        int bTotal = arrayB.length;
        System.out.println("Second smallest number of Array arrayA: "+getSecondSmallest(arrayA,aTotal));
        System.out.println("Second smallest number of Array arrayB: "+getSecondSmallest(arrayB,bTotal));
    }}