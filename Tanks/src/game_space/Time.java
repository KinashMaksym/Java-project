package game_space;

public class Time {

	public static int time_line;
	public static int time_line_anim_army_info;
	
	long Timer     = 0;
	long TimerDiff = 0;
	long TimerStop = 300;
	
	long Anim_Timer_army_info = 0;
	long Anim_Timer_army_info_Diff = 0;
	long Anim_Timer_army_info_Stop = 5;
	
	public Time() {}
	
	public void time_interval() {
	//System.out.println("Time = " + time_line);	
	if (Timer == 0) {Timer = System.nanoTime();}
		
	if (Timer > 0) {
			
	TimerDiff += (System.nanoTime() - Timer) / 10000000;	
	Timer = System.nanoTime();
	
	}
		
	if (TimerDiff >= TimerStop) {
	
	time_line ++;
		
	TimerDiff = 0;
	Timer = 0;

	}
		
	}
}
