package date19_05_2018;
/*
* Printing longest Increasing consecutive subsequence Given n elements,
 * write a program that prints the longest increasing
 subsequence whose adjacent element difference is one.
*/
import java.util.Arrays;


public class FindLangestSubSequence {
    public static void longestSubSequence(int[] arr)
    {
        Arrays.sort(arr);
        int subSeqLength = 1;
        int longest = 1;
        int indexStart = 0;
        int indexEnd = 0;

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] == arr[i + 1] - 1)
            {
                subSeqLength++;
                if (subSeqLength>longest){
                    longest = subSeqLength;
                    indexStart = i+2-subSeqLength;
                    indexEnd = i+2;
                }

            }
            else
                subSeqLength = 1;
        }



        for (int i = indexStart; i < indexEnd; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {

            int[] arrC = {2,4,6,8,10,11};
            int[] arrA = {1, 2, 3, 4, 5, 7};
            int[] arrB = {7, 6, 5, 4, 1, 2};
            int[] arrD = {3,3,10,11,4,7,5,6,12};

            longestSubSequence(arrD);

        }

}
