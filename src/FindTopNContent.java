public class FindTopNContent{
 /*
  input : 
     toy : "ana","bella","crica"
     comments : "ana toy is better","bella is great than ana","best toy ana toy","crica is ok","bella good";
     top : <number of arraylist content>
  output:
    top = 1 , return ana ( because it comes 3 times in the comments )
    top = 2 , return ana and bella
 */
	public static void main(String[] args) {
		List<String> toys = new ArrayList<String>(Arrays.asList("ana","bella","crica"));
		List<String> comments = new ArrayList<String>(Arrays.asList("ana toy is better","bella is great than ana","best toy ana toy","crica is ok","bella good"));
		System.err.println(topNFinder(toys,comments, 2));

	}

	private static List<String> topNFinder(List<String> toys, List<String> comments,int top) {
    return null;
  }
  
  }
		
