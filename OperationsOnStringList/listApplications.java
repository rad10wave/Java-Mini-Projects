package new_project;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
 class Names {

    static String s;

    public Names(String s) {

        Names.s = s;

    }
}
public class listApplications {

	public static void main(String[] args) {
		 HashSet<String> hashSet = new HashSet<String>();

	        hashSet.add("A");

	        hashSet.add("B");

	        hashSet.add("C");

	        hashSet.add("D");

	        hashSet.add("E");


	        HashSet<String> subSet = new HashSet<String>();

	        subSet.add("E");

	        subSet.add("B");

	        subSet.add("A");

	        subSet.add("F");

	        hashSet.retainAll(subSet);
    }
	}


