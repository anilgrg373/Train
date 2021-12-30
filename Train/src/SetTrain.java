import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTrain {

	public static void main(String[] args) {
		
		Set<String> st = new HashSet<>();
          st.add("car");
          st.add("honda");
          st.add("suzuki");
          st.add("audi");
          st.add("ford");
          st.add("dodge");
          st.add("honda");
          st.add("bmw");
          
          for(String x: st) {
		System.out.println(x+" ");
	}
	
System.out.println();

          Set<String> ts = new TreeSet<>();
          ts.add("car");
          ts.add("honda");
          ts.add("suzuki");
          ts.add("audi");
          ts.add("ford");
          ts.add("dodge");
          ts.add("honda");
          ts.add("bmw");
           
           for(String i: ts) {
     	System.out.println(i+" ");
           }
}
}