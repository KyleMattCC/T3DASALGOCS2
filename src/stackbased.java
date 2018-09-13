import java.util.*;

public class stackbased{
	public static void InitializeRan(Stack <Integer> S){	
		S.push(5);
		S.push(1);
		S.push(4);
		S.push(6);
		S.push(2);
		S.push(3);
	}

	public static void InitializeAsc(Stack <Integer> S){				
		S.push(1);
		S.push(2);
		S.push(3);
		S.push(4);
		S.push(5);
		S.push(6);
	}

	public static void InitializeDes(Stack <Integer> S){				
		S.push(6);
		S.push(5);
		S.push(4);
		S.push(3);
		S.push(2);
		S.push(1);
	}		

	public static void Traverse(Stack <Integer> S){
		while(!(S.empty()))
			System.out.println(S.pop());
	}

	public static void SortStackDescend(Stack <Integer> S){
		Stack <Integer> SortS = new Stack <Integer> ();
		Stack <Integer> Temp = new Stack <Integer> ();

		if(!(S.empty())){
			SortS.push(S.pop());
			while(!(S.empty())){
				if(SortS.peek() <= S.peek())
					SortS.push(S.pop());
				else{
					while(!(SortS.empty()) && SortS.peek() > S.peek())
						Temp.push(SortS.pop());
					SortS.push(S.pop());
					while(!(Temp.empty()))
						SortS.push(Temp.pop());
				}
			}
			while(!(SortS.empty()))
				S.push(SortS.pop());

			Traverse(S);
		}
	}

	public static void SortStackAscend(Stack <Integer> S){
		Stack <Integer> SortS = new Stack <Integer> ();
		Stack <Integer> Temp = new Stack <Integer> ();

		if(!(S.empty())){
			SortS.push(S.pop());
			while(!(S.empty())){
				if(SortS.peek() >= S.peek())
					SortS.push(S.pop());
				else{
					while(!(SortS.empty()) && SortS.peek() < S.peek())
						Temp.push(SortS.pop());
					SortS.push(S.pop());
					while(!(Temp.empty()))
						SortS.push(Temp.pop());
				}
			}
			while(!(SortS.empty()))
				S.push(SortS.pop());

			Traverse(S);
		}
	}

	
	public static void main(String[]args){
		Stack <Integer> S = new Stack <Integer> ();
		System.out.println("RANDOM ORDER");
		System.out.println("********Orig********");
		InitializeRan(S);
		Traverse(S);
		System.out.println("********Descend********");
		InitializeRan(S);
		SortStackDescend(S);
		Traverse(S);
		System.out.println("********Ascend********");
		InitializeRan(S);
		SortStackAscend(S);
		Traverse(S);

		System.out.println("\nASCENDING ORDER");
		System.out.println("********Orig********");
		InitializeAsc(S);
		Traverse(S);
		System.out.println("********Descend********");
		InitializeAsc(S);
		SortStackDescend(S);
		Traverse(S);
		System.out.println("********Ascend********");
		InitializeAsc(S);
		SortStackAscend(S);
		Traverse(S);

		System.out.println("\nDESCENDING ORDER");
		System.out.println("********Orig********");
		InitializeDes(S);
		Traverse(S);
		System.out.println("********Descend********");
		InitializeDes(S);
		SortStackDescend(S);
		Traverse(S);
		System.out.println("********Ascend********");
		InitializeDes(S);
		SortStackAscend(S);
		Traverse(S);
	}
}
				
			
	
	