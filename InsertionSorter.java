/**
  Precondition: Is given a list of elements comparable to each other
  Will, for each unsorted element in a list, shift through each sorted element until the place
  for that element is found, doing this process for each index in the list
  Postcondition: List will be sorted from smallest to largest
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }
    

    public void insert1(int alreadyInserted){
	String valueToInsert = elements.get(alreadyInserted);
	for(int index = alreadyInserted; index > 0; index--){
		if (((Comparable)elements.get(index - 1)).compareTo(valueToInsert) > 0){
			elements.set(index, elements.get(index - 1));
		}
		else {
			elements.set(index, valueToInsert);
			index = 0;
		}
		if (((Comparable)elements.get(0)).compareTo(valueToInsert) > 0)elements.set(0, valueToInsert);
	}
	}
    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
	for(int position = 1; position < elements.size(); position++){
		insert1(position);
	}
        
    }
}
