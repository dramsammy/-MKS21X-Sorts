import java.util.Arrays;
import java.util.Random;
public class Sorts{
  /**Selection sort of an int array.
 *Upon completion, the elements of the array will be in increasing order.
 *@param data  the elements to be sorted.
 */
  public static void selectionSort(int [] ary){
    int min;
    int larger = 0;
    int indexM = 0;
    for (int i = 0; i < ary.length; i++){
      min = ary[i];
      for (int a = i; a < ary.length; a++){
        if (ary[a] <= min){
          min = ary[a];
          indexM = a;
          larger = ary[a];
        }
      }
    min = ary[indexM];
    ary[indexM] = ary[i];
    ary[i] = min;
    }
  }
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int first;
    int second;
    for (int i = 0; i <data.length; i++){
      for (int a = i; a < data.length; a++){
        first = data[i];
        second = data[a];
        if (first > second){
          data[i] = second;
          data[a] = first;
        }
      }
    }
  }
  public static void insertionSort(int[] data){

  }
  public static void Shifter(int[] data, int element){
    int shift;
    for (int i = data.length - 1; i != -1; i--){
      if (data[i] < element){
        data[i + 1] = element;
      }
    }
  }
  //
  // //TEST
  // public static void main(String[] args) {
  //   System.out.println("--------Basic Testing--------");
  //   int[] Test = {1,3,5,67,73,2,2,-1,23,-41};
  //   System.out.println(Arrays.toString(Test));
  //   selectionsort(Test);
  //   System.out.println(Arrays.toString(Test));
  //   int[] Test2 = {1,3,5,67,73,2,2,-1,23,-41};
  //   System.out.println(Arrays.toString(Test2));
  //   bubbleSort(Test2);
  //   System.out.println(Arrays.toString(Test2));
  //   System.out.println("--------Arg Testing--------");
  //   if (args[0] != null){
  //     int iterations = Integer.parseInt(args[0]);
  //     for (int i = 0; i < iterations; i++){
  //
  //   }
  //   }
  // }
}
