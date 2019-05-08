/* Precondition: Must be given a list which contains elements comparable
to each other
Will iterate through each index of a list, using the champIndex method to find the
smallest element at a larger index than the current one, and swap that value with the current
one
Postcondition: List will be sorted */
import java.util.ArrayList;
public class SelectionSorter extends Sorter{
	
    public SelectionSorter(  ArrayList usersData) {
        super(usersData);
    }
    
	public void mySort(){
		for(int pos=0;pos<elements.size();pos++){
				elements.set(champIndex(elements, pos), 
										elements.set(pos, 
										elements.get(champIndex(elements, pos)))
												 );
									  
		}
	}
	
	private int champIndex( ArrayList<String> challengers, int fromStart) {
        String smallest = "ZZZZZZZZZZ";
		int index = fromStart;
		int sindex = -1;
		while(index < challengers.size()){
			if (challengers.get(index).compareTo(smallest) < 0){ smallest = challengers.get(index);
								sindex = index;
			}

			index++;
		}
		return sindex;
     }
}