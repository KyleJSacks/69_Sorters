import java.util.ArrayList;

public class SubSortThenMerge_Sorter extends Sorter{
	
	Merger toMerge;

    public SubSortThenMerge_Sorter(  ArrayList< String> usersData) {
        super(usersData);
		toMerge = new Merger(elements);
    }
    
	public void mySort(){
		elements = mySortR(elements);
		//System.out.println(elements);
	}
	
	public int mySort(ArrayList<String> section, int from, int to){
		if (to - from == 0) return from;
		else {
				System.out.println(from + "" + to);
				int nextOne = (from + to) / 2;
				System.out.println(nextOne);
				if (nextOne == 0) System.out.println("nextOne is 0");
				toMerge.merge((mySort(section, from, nextOne)), 
							  (mySort(section, nextOne + 1, to)), 
							  (to - from)
							  );
				return 0;
		}
	}
	
	public ArrayList mySortR(ArrayList<String> section){
		if (section.size() == 1) return section;
		else{System.out.println(section);
			return Merger.mergeR(mySortR(new ArrayList(section.subList(0, section.size() / 2))), 
								  mySortR(new ArrayList(section.subList(section.size() / 2, section.size())))
								  );
		}
		
	}
	
}
		
			