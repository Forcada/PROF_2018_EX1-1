package PROF_2018_EX1.Forcada;

public class MyString {
	
	private String self;
	
	public MyString(String string) {
		
		this.self = string;
	}

	public int compareTo(MyString other) {
		
		// node 1
		
		int res = 0;
		
		int maxLength;
		
		if (self.length() < other.getString().length()) {
			
			// node 2
			
			maxLength = other.getString().length();
		} else {
			
			// node 3
			
			maxLength = self.length();
		}
		
		// node 4
		
		for (int n = 0; n<maxLength; n++) {
			
			try {
				
				// node 5
				
				res = self.charAt(n)-other.getString().charAt(n);
				if (res != 0) {
					
					// node 6
					
					break;
				}
			} catch (Exception e) {
				
				// node 7
				
				res = -1;
				break;
			}
		}		
		
		// node 8
		
		if (res == -1) {
			
			// node 9
			
			res = self.length() - other.getString().length();
		} 
			
		// node 10
			
		// puede valer 0 o un número hayado en el bucle
		return res;		
	}
	
	public String getString() {
		return self;
	}
}
