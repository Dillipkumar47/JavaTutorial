package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortPremitive {
	
	

		public static void main(String[] args) {
			
			ArrayList<String> companies = new ArrayList<String>();
			companies.add("IBM");
			companies.add("Google");
			companies.add("Infosys");
			companies.add("Indosys");

			Collections.sort(companies);
			System.out.println(companies);
			// Output: [Google, IBM, Infosys]
		
			
		}
		
		

	}


