/**
 * 
 */
package examples;

import org.junit.Test;

/**
 * @author dennis
 *
 */
public class Clock {

	private static final int TOTAL_DEGREES=360;
	private static final int MINUTES_PER_HR_SECTION=5;
	private static final int MINUTES_PER_FACE=60;

	public double getAngle(double hour,double minutes){
		if(hour>=12){
			hour -=12;
		}
		double minutePercent = minutes/MINUTES_PER_FACE;
		double minuteDegree = minutePercent * TOTAL_DEGREES;
		double hourPercent = (hour*MINUTES_PER_HR_SECTION + minutePercent)/MINUTES_PER_FACE;
		double hourDegree = hourPercent*TOTAL_DEGREES;
		if(hourDegree>minuteDegree){
			return hourDegree-minuteDegree;
		}else{
			return minuteDegree-hourDegree;
		}
	}
	
	
	@Test
	public void testAngles(){
		//needs Assert
		System.out.println(getAngle(4,30));
		System.out.println(getAngle(1,36));
		
		
	}
	
	
}
