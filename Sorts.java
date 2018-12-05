public class Sorts{
  public static void selectionsort(int [] ary){
    int min;
    int larger = 0;
    int indexM = 0;
    int indexL = 0;
    int current = 0;
    int counter = 0;
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
    int[] Test = new int[5];
    Test[0] = 0;
    Test[1] = 3;
    Test[2] = 7;
    Test[3] = 10;
    Test[4] = 4;
    selectionsort(Test);
    for (int i = 0; i < Test.length; i++){
      System.out.println(Test[i]);
    }
  }
}
