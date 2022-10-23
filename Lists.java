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
			list.poll();
			System.out.println(list);
	}
	public void Priorityqueue()
	{
		PriorityQueue<Integer> list=new PriorityQueue<Integer>();
		for(int i=0;i<=5;i++)
		{
			list.add(i);
		}
		System.out.println(" first pop operation");
			System.out.println(list);
		list.remove();
		list.poll();
		System.out.println("second pop operation after poll");
		System.out.println(list);
		//System.out.println("third pop operation after remove");
		//System.out.println(list);
	}
	public void Deq()
	{
		Deque<String> list = new ArrayDeque<String>();
		list.add("Khan");  
		list.add("Wali");  
		list.add("Jan"); 
		list.addLast("Pari");
		list.addFirst("Sabir");
		
		for(String item: list)
		{
			System.out.println(item);
		}
	}
	public void Hash()
	{
		HashSet<String> set=new HashSet<String>();
		
		set.add("Shah");
		set.add("Konar");
		set.add("last");
		
		for(String item: set)
		{
			System.out.println(item);
		}
		set.removeAll(set);
		System.out.println(set);
	}
}
