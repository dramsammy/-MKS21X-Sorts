public class Sorts{
  public static void selectionsort(int [] ary){
    int index = 0;
    int indexLast = 0;
    int temp = 0;
    int change = 0;
    for (int i = 0; i < ary.length; i++){
      for (int a = i; a < ary.length; a++){
        if (temp > ary[a]){
          temp = ary[a];
          indexLast = a;
        }
      }
      change = ary[i];
      ary[i] = temp;
      ary[i] = ary[indexLast];
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
