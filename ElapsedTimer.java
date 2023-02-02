public class ElapsedTimer{

	// You will define class variables here
	// Class variables do not need to be static.
	//  For example:.
	public long startTime;
	public long endTime;
	public long totalTimeElapsed;
	public int totalTimesRun = 0;
	public long averageTime;
	
	public int exampleInt = 0;
	
	
	// You will define four methods here.
	// One hint to get elapsed time in Java you do:
	// long startTime = System.currentTimeMillis()
	// long endTime = System.currentTimeMillis();
	// long elapsedTime = endtime - startTime;
	
	// The methods should be public and do not need the static keyword.
	// For example:
	public void printExampleInt(){
		exampleInt = exampleInt + 20;
		System.out.println(exampleInt);
	}

	// 1. Need a method that starts the timer
	public void startTimer(){
		startTime = System.currentTimeMillis();
		totalTimesRun += 1;
	}	
	
	
	// 2. Need a method that stops the timer
	public void stopTimer(){
		endTime = System.currentTimeMillis();
		totalTimeElapsed += endTime - startTime;
		//System.out.println(totalTimeElapsed);
	}	
	
	
	// 3. Need a method that gives the average time for all start/stop events.
	public long averageTime(){
		//averageTime = totalTimeElapsed / totalTimesRun;
		return totalTimeElapsed / totalTimesRun;
	}
		
	
	// 4. Need a method that resets the class variables so you may reuse the object
	// This may be the hardest task.
	public void resetTimer(){
		startTime = 0;
		endTime = 0;
		totalTimeElapsed = 0;
		totalTimesRun = 0;
	}
}