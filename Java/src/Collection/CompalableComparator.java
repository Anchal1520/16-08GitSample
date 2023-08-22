
package Collection;
import java.io.*; 
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CompalableComparator {
	public static void main(String[] agrs) {
	  Comparator<Integer>cr=new Comparator<Integer>()  
	  {
		public int compare(Integer i, Integer j) {
			if(i%10> j%10) {
				return 1;
			}else {
				return -1;
			}
		}
	  };
	  
	  List<Integer> al= new ArrayList<>();
	  al.add(31);
	  al.add(98);
	  al.add(76);
	  al.add(57);
	  Collections.sort(al, cr);
	  System.out.println(al);          ///[31, 76, 57, 98]
	  
	}
	

}



