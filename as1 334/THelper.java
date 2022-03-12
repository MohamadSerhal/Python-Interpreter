import java.util.ArrayList;
import java.util.HashMap;

public class THelper {
	
	HashMap<String, ArrayList<Object>> lists = new HashMap<String, ArrayList<Object>>();
	
	public void printList(String name) {
		if (lists.containsKey(name) ){
			ArrayList<Object> arr = lists.get(name);
			String elem = "";
			for (int i = 0 ; i<arr.size() ; i++) {
				if (i == arr.size()-1) {
					elem = elem + arr.get(i).toString();
				}
				else {
					elem = elem + arr.get(i).toString() + ", ";
				}
			}
			System.out.println( name + " is [ " + elem + " ]");
		}
		else {
			System.out.println("ERROR : LIST DOES NOT EXIST");
		}
		
	}
	
	
	// adds a list to the lists or replaces an old one
	public void addList( String name, ArrayList<Object> arr) {
		// add the list to the hash map or replace it if it exists
		if (lists.containsKey(name) ){
			lists.replace(name, arr);
		}
		else {
			lists.put(name, arr);
		}
		
	}
	
	// add element to an array list of objects
	public void addToList(ArrayList<Object> arl, Object obj) {
		arl.add(obj);
	}
	
	// change an element at index k if the list exists
	public void changeInList(String name , int k , Object obj) {
		if (lists.containsKey(name)) {
			ArrayList<Object> aa = lists.get(name);
			if (k<aa.size()) {
				aa.set(k, obj);
			}
			else {
				System.out.println("ERROR : INDEX OUT OF BOUND");
			}
			
		}
		else {
			System.out.println("ERROR : LIST DOES NOT EXIST");
		}
	}
	
	
	// takes 2 already existing lists and concatenates into one list
	public void listConcatenation(String nameOfList , ArrayList<Object> ar ) {
		// check if lists to concatenate exist or not
		for (int i =0 ; i<ar.size() ; i++) {
			@SuppressWarnings("unchecked")
			ArrayList<Object> arrObj = (ArrayList<Object>) ar.get(i);
			if ( lists.containsValue(arrObj)==false ) {
				System.out.println("ERROR : DETECTED A LIST THAT DOES NOT EXIST");
			}
		}
		// if they do exist we concatenate
		// first we go thru the list of lists, then into each list to create a string that will contain all elements 
		// then if list with name n exits we replace it's content
		// else we add it to the hashmap
		ArrayList<Object> ele = new ArrayList<>();
		for (int i =0 ; i<ar.size() ; i++) {
			@SuppressWarnings("unchecked")
			ArrayList<Object> ara = (ArrayList<Object>) ar.get(i);
			for (int j =0 ; j<ara.size() ; j++) {
				ele.add(ara.get(j));
			}
		}
		
		if (lists.containsKey(nameOfList)) {
			lists.replace(nameOfList, ele);
		}
		else {
			lists.put(nameOfList, ele);
		}
		
		
	}
	
	public void listConcatenationByID(String nameof, ArrayList<String> arr) {
		for (String s: arr ) {
			if ( lists.containsKey(s)==false ) {
				System.out.println("ERROR : DETECTED A LIST THAT DOES NOT EXIST");
			}
		}
		ArrayList<Object> ele = new ArrayList<>();
		for (String ss: arr) {
			ArrayList<Object> ara = lists.get(ss);
			for (int j =0 ; j<ara.size() ; j++) {
				ele.add(ara.get(j));
			}
		}
		
		if (lists.containsKey(nameof)) {
			lists.replace(nameof, ele);
		}
		else {
			lists.put(nameof, ele);
		}
	}
	
	
	public void slicing(String nameNew, String nameOld, int beginIndex, int endIndex) {
		if (lists.containsKey(nameOld)==false) {
			System.out.println("ERROR : LIST FOR SLICING DOES NOT EXIST");
		}
		else {
			ArrayList<Object> arr = new ArrayList<Object>();
			ArrayList<Object> oldie = lists.get(nameOld);
			for(int i = beginIndex; i<endIndex; i++) {
				arr.add(oldie.get(i));
			}
			if (lists.containsKey(nameNew)) {
				lists.replace(nameNew, arr);
			}
			else {
				lists.put(nameNew, arr);
			}
		}
	}
	
	public void slicingTotheEnd(String nameNew, String nameOld, int beginIndex) {
		if (lists.containsKey(nameOld)==false) {
			System.out.println("ERROR : LIST FOR SLICING DOES NOT EXIST");
		}
		else {
			ArrayList<Object> arr = new ArrayList<Object>();
			ArrayList<Object> oldie = lists.get(nameOld);
			for(int i = beginIndex; i<oldie.size(); i++) {
				arr.add(oldie.get(i));
			}
			if (lists.containsKey(nameNew)) {
				lists.replace(nameNew, arr);
			}
			else {
				lists.put(nameNew, arr);
			}
		}
	}
	
	
	
	
	// conditions
	
	public boolean checkList(ArrayList<Object> L) {
		//boolean fff = true;
        for (int i=0; i<L.size(); i++) {
        	//System.out.println(L.get(i));
            if (!( isInteger(L.get(i).toString())) ) {
            	//fff = false;
                return false;
            }
            //System.out.println("bool is "+ fff);
        }
        return true;
    }
	
	
	

    public boolean isInteger(String s) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    
    
    public void listComprehension(String list, String forList, ArrayList<Boolean> result) {
        ArrayList<Object> forL = lists.get(forList);
        ArrayList<Object> res = new ArrayList<>();
        for (int i=0; i<forL.size(); i++) {
            if (result.get(i)) {
                res.add(forL.get(i));
            }
        }
        lists.put(list, res);
    }

    
    
    public ArrayList<Boolean> evaluateAndOr(ArrayList<Boolean> arrAndOr, ArrayList<Boolean> res2, String op) {
        ArrayList<Boolean> result = new ArrayList<>();
        for (int i=0; i<arrAndOr.size(); i++) {
            if (op.equals("and")) {
                result.add(arrAndOr.get(i) && res2.get(i));
            }
            else if (op.equals("or")) {
                result.add(arrAndOr.get(i) || res2.get(i));
            }
        }
        return result;
    }

    
    
    public ArrayList<Boolean> evaluateNot(ArrayList<Boolean> arrNot, String op) {
        ArrayList<Boolean> result = new ArrayList<>();
        for (int i=0; i<arrNot.size(); i++) {
            if (op.equals("not")) {
                result.add(!(arrNot.get(i)));
            }
        }
        return result;
    }



    public ArrayList<Boolean> comparison(String listl, String op1, String op2, String op, String x) {
        ArrayList<Object> L = lists.get(listl);
        ArrayList<Boolean> result = new ArrayList<>();
        int n = L.size();
        for (int i=0; i<n; i++) {
            if (isInteger(op1) && isInteger(op2)) {
                if (Integer.parseInt(op1) != Integer.parseInt(op2)) {
                    result.add(false);
                }
                else {
                    result.add(true);
                }
                continue;
            }
            else if (!isInteger(op1) && isInteger(op2)) {
                int num = Integer.parseInt(op2);
                if (!op1.equals(x)) {
                    System.out.println("Unknown variable " + op1 + ". Did you mean " + x);
                    result.add(false);
                }
                else if (!checkList(L)) {
                    System.out.println("List is not list of integers.");
                    result.add(false);
                }
                else if (op.equals("==")) {
                    result.add(Integer.parseInt(L.get(i).toString()) == num);
                }
                else if (op.equals("!=")) {
                    result.add(Integer.parseInt(L.get(i).toString()) != num);
                }
                else if (op.equals("<")) {
                    result.add(Integer.parseInt(L.get(i).toString()) < num);
                }
                else if (op.equals("<=")) {
                    result.add(Integer.parseInt(L.get(i).toString()) <= num);
                }
                else if (op.equals(">")) {
                    result.add(Integer.parseInt(L.get(i).toString()) > num);
                }
                else if (op.equals(">=")) {
                    result.add(Integer.parseInt(L.get(i).toString()) >= num);
                }
            }
            else if (isInteger(op1) && !isInteger(op2)) {
                int num = Integer.parseInt(op1);
                if (!op2.equals(x)) {
                    System.out.println("Unknown variable " + op2 + ". Did you mean " + x);
                    result.add(false);
                }
                else if (op.equals("==")) {
                    result.add(Integer.parseInt(L.get(i).toString()) == num);
                }
                else if (op.equals("!=")) {
                    result.add(Integer.parseInt(L.get(i).toString()) != num);
                }
                else if (op.equals("<")) {
                    result.add(Integer.parseInt(L.get(i).toString()) > num);
                }
                else if (op.equals("<=")) {
                    result.add(Integer.parseInt(L.get(i).toString()) >= num);
                }
                else if (op.equals(">")) {
                    result.add(Integer.parseInt(L.get(i).toString()) < num);
                }
                else if (op.equals(">=")) {
                    result.add(Integer.parseInt(L.get(i).toString()) <= num);
                }
            }
            else {
                if (op1.equals(x) && op1.equals(op2) ) {
                    result.add(true);
                }
                else {
                    result.add(false);
                }
            }
        }
        return result;
    }

}



 












