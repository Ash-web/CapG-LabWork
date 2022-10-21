package lab2;
import java.util.*;
 
interface WorkService
{
	void doWork();
}
class WorkImpl implements WorkService{
	public void doWork() {
		System.out.println("I am doing work");
	}
}
public class test
{
	public static void main(String[] args) {
		WorkService obj = new WorkImpl();
		obj.doWork();
	}
}