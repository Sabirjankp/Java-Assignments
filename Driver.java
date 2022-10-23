package sabir;
import java.awt.List;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lists obj=new Lists();
		obj.array_list();
		
		System.out.println("------------------end of Array list--------------------");
		obj.linked_list();
		
		System.out.println("------------------=end of linked_list--------------------");
		obj.Vector_list();
		System.out.println("------------------=end of vector_list--------------------");
		obj.Stack_();
		System.out.println("------------------=end of stack--------------------");
		obj.queue_();
		System.out.println("------------------=end of queue--------------------");
		obj.Priorityqueue();
		System.out.println("------------------=end of queue--------------------");
		obj.Deq();
		System.out.println("------------------=end of Deque--------------------");
		obj.Hash();
	}

}
