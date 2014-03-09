/**
 * 
 */
package examples;

import org.junit.Test;

/**
 * @author dennis
 *
 */
public class BubbleSort {
	
	
	public int[] bubbleSort(int[] array){
		
		int toBeSorted = array.length;
		for(int i=0; i<array.length; i++){
			for(int j=0; j<toBeSorted; j++){
				if((j+1)<(array.length-1)){
					if(array[j]>array[j+1]){
						int tmp = array[j+1];
						array[j+1] = array[j];
						array[j]=tmp;
					}
				}
			}
			toBeSorted--;
		}
		
		return array;
	}

	
	
	@Test
	public void testSort(){
		int[] list = {7,8,23,9,2,0,47,37,2,3,77};
		int[] sortedList = bubbleSort(list);
		for(int i : sortedList){
			System.out.println(i);
		}
	}
}
