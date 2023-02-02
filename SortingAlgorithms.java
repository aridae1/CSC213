import java.util.Random;

public class SortingAlgorithms {
	
  private static final int ARRAY_SIZE = 10000;

  public static void main(String[] args) {

  	//You should create an ElapsedTimer object here
  	ElapsedTimer timer = new ElapsedTimer();
  	for(int i = 0; i < 100; i++){
		// You should start the ElapsedTimer here
		timer.startTimer();
		int[] array = generateArrayOfInts();
		bubbleSort(array);
		// You should stop the ElapsedTimer here
		timer.stopTimer();
    }
    // Your ElapsedTimer should have the ability to give the average time
    // for all start/stop pairs in the for loop above. 
    long averageTime = timer.averageTime();
    System.out.println("Bubble Sort average time: " + averageTime + " ms");

    //  Initially will create another new ElapsedTimer object here.
    //  The last step of the lab will have you NOT create a new ElapsedTimer object.
    //  You will reuse the one defined above.
    //  You will reset the class variables of the ElapsedTimer object to do this.
    timer.resetTimer();
    
    for(int i = 0; i < 100; i++){
		// You should start the ElapsedTimer here
		timer.startTimer();
		double[] array = generateArrayOfDoubles();
		bubbleSort(array);
		// You should stop the ElapsedTimer here
		timer.stopTimer();
    }

    // Your ElapsedTimer should have the ability to give the average time
    // for all start/stop pairs in the for loop above. 
    averageTime = timer.averageTime();
    System.out.println("Bubble Sort average time: " + averageTime + " ms");

  }

  
  
  
  /*
  You can mostly ignore the rest of this file.  It has:
  - functions to generate an array with random ints or doubles,
  - functions to perform bubblesort on array with ints or doubles.
  */
  
  
  private static int[] generateArrayOfInts() {
    int[] array = new int[ARRAY_SIZE];
    Random random = new Random();
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array[i] = random.nextInt();
    }
    return array;
  }

  private static double[] generateArrayOfDoubles() {
    double[] array = new double[ARRAY_SIZE];
    Random random = new Random();
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array[i] = random.nextDouble();
    }
    return array;
  }

  
  private static void bubbleSort(double[] arr) {
    int n = arr.length;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                // Swap arr[j] and arr[j+1]
                double temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
     }
  }


  private static void bubbleSort(int[] array) {
    for (int i = 0; i < ARRAY_SIZE - 1; i++) {
      for (int j = 0; j < ARRAY_SIZE - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}