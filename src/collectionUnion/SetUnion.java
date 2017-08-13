package collectionUnion;

/**
 * Creating a program to copy all the elements from set2 to set1,
    so that the set1 becomes the union of set1 and set2.
 */
import java.util.HashSet;
import java.util.Set;


public class SetUnion { //Creates class 
	public static void main(String args[]) { //Main class

		// Creating set1 object
		Set<Integer> setA = new HashSet<Integer>();
		// Adding integer elements in the set1
		setA.add(11);
		setA.add(12);
		setA.add(13);

		System.out.println("Set A:"); // Prints all elements of set1
		for (Integer sA : setA) {
			System.out.println(sA);
		}

		// Creating set2 object
		Set<Integer> setB = new HashSet<Integer>();
		// Adding integer elements in the set2
		setB.add(14);
		setB.add(15);
		setB.add(16);

		System.out.println("\nSet B:"); // Prints all elements of setB
		for (Integer sB : setB) {
			System.out.println(sB);
		}

		Set<Integer> union = new HashSet<Integer>(setA); // Creates new collection set to store setA union elements.
									 
		union.addAll(setB); // Adding all the elements of setB in setA or it contains union.
						

		System.out.println("\nElements of Set B is sucessfully copied to Set A.");
		System.out.println("\nSet A :"); // Prints the new collection having setA.
											
		for (Object u : union) { // Prints the new collection having setA union.
			System.out.println(u);
		}

	}

}
