package sabir;
import java.util.*;
public class Lists {

	public void array_list()
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Sabir");
		list.add("Wali");
		list.add("mark");
		list.add("Shafi");
		//list.clear();
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		if(list.contains("Wali"))
		{
			System.out.println("\nexist");
		}
		else
		{
			System.out.println("not exist");
		}
	}
	public void linked_list()
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("masood");
		list.add("gabrial");
		list.add("Elham");
		
		for(String item: list)
		{
			System.out.println(item);
		}
		
	}
	public void Vector_list()
	{
		Vector<String> list=new Vector<String>();
		list.add("masood");
		list.add("gabrial");
		list.add("Elham");
		
		
		for(String item: list)
		{
			System.out.println(item);
		}
		
	}
	public void Stack_(){

		Stack<String> list=new Stack<String>();
		list.push("Messi");
		list.push("Ronaldo");
		list.push("Neymar");
		//list.pop();
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(list.pop());
		}
	}
	public void queue_()
	{
		Queue<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<=5;i++)
		{
			list.add(i);
		}
		
		System.out.println("pop operation");
			System.out.println(list);
	}
}
