import java.util.*;
public class queuebased{
	public static void displayQueue(Queue <Integer> Q){
		while(!(Q.isEmpty()))
			System.out.print(Q.remove());
	}
	
	public static void sortAscending(Queue <Integer> Q){
		Queue <Integer> qTemp1 = new ArrayDeque <Integer> ();
		Queue <Integer> qFinal = new ArrayDeque <Integer> ();
		int count = 0;
		
		while(!(Q.isEmpty())){
			qTemp1.add(Q.remove());
			count++;
		}
		for(int i=0; i<count; i++){	
			int min = qTemp1.remove();
			while(!(qTemp1.isEmpty())){
				if(!(qTemp1.isEmpty()))
					if(min > qTemp1.peek()){
						int temp = min;
						min = qTemp1.remove();
						Q.add(temp);
					}
					
					else
						Q.add(qTemp1.remove());
				else
					Q.add(min);
			}
			qFinal.add(min);	
			
			while(!(Q.isEmpty()))
				qTemp1.add(Q.remove());
		
		}
		
		while(!(qFinal.isEmpty()))
			Q.add(qFinal.remove());
	}
	

	public static void sortDescending(Queue <Integer> Q){
		Queue <Integer> qTemp1 = new ArrayDeque <Integer> ();
		Queue <Integer> qFinal = new ArrayDeque <Integer> ();
		int count = 0;
		
		while(!(Q.isEmpty())){
			qTemp1.add(Q.remove());
			count++;
		}
		for(int i=0; i<count; i++){	
			int max = qTemp1.remove();
			while(!(qTemp1.isEmpty())){
				if(!(qTemp1.isEmpty()))
					if(max < qTemp1.peek()){
						int temp = max;
						max = qTemp1.remove();
						Q.add(temp);
					}
					
					else
						Q.add(qTemp1.remove());
				else
					Q.add(max);
			}
			qFinal.add(max);	
			
			while(!(Q.isEmpty()))
				qTemp1.add(Q.remove());
		
		}
		
		while(!(qFinal.isEmpty()))
			Q.add(qFinal.remove());
	}
	
	
	public static void main(String[] args){
		Queue <Integer> Q = new ArrayDeque <Integer> ();
		
		
		System.out.println("********Orig********");
		
		
		Q.add(5);
		Q.add(1);
		Q.add(4);
		Q.add(9);
		Q.add(0);
		Q.add(2);
		displayQueue(Q);
		System.out.println("\n\n");
		
		System.out.println("********Ascending********");
		Q.add(5);
		Q.add(1);
		Q.add(4);
		Q.add(9);
		Q.add(0);
		Q.add(2);		
		sortAscending(Q);
		displayQueue(Q);
		System.out.println("\n\n");
		
		System.out.println("********Descending********");
		Q.add(5);
		Q.add(1);
		Q.add(4);
		Q.add(9);
		Q.add(0);
		Q.add(2);		
		sortDescending(Q);
		displayQueue(Q);
	}
}