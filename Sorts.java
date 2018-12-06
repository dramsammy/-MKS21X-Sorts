import java.util.Arrays;
public class Sorts{
  public static void selectionsort(int [] ary){
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
  //TEST
  public static void main(String[] args) {
    int[] Test = {1,3,5,67,73,2,2,-1,23,-41};
    System.out.println(Arrays.toString(Test));
    selectionsort(Test);
    System.out.println(Arrays.toString(Test));
    }
  }
