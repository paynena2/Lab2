import bridges.connect.Bridges;
import bridges.base.Array;
import bridges.base.Element;

public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "paynena2", "197701776935");

	    /* Set an assignment title */
	    bridges.setTitle("Nathaniel Payne");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    int z = 2;
	    for(int x = 0; x < arraySize; x++) {
	    	if(x == 0) {
	    		arr.getElement(x).setValue(0);
	    		arr.getElement(x).setLabel(String.valueOf(0));
	    	}
	    	else if(x == 1) {
	    		arr.getElement(x).setValue(1);
	    		arr.getElement(x).setLabel(String.valueOf(1));
	    	}
	    	else if(x == 2) {
	    		arr.getElement(x).setValue(2);
	    		arr.getElement(x).setLabel(String.valueOf(2));
	    	}
	    	else {
	    		int square;
	    		square = z*z;
	    		arr.getElement(x).setValue(square);
	    		arr.getElement(x).setLabel(String.valueOf(square));
	    		z++;
	    	}
	    }
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	}
}
