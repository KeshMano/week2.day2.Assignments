package week2.Assignments;

public class SumOfStrings {

	public static void main(String[] args) {
	
		 //* Method 1
		  String str1 = "Iniyan060712Nilavan";
		  int sum = 0;
		String str2= str1.replaceAll("[\\d]", "");
		System.out.println(str2);
		char[] ch = str2.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int ch1=Character.getNumericValue(ch[i]);
			sum=sum+ch1;
		}
			System.out.println(sum);
		 
		
		
		 // Method 2
		 
		
			String s = "Wel34c89om3e";
		    int sum1 = 0;
		    char[] cha1 = s.toCharArray();
		    for(int j=0;j<cha1.length;j++) {
		    	if(Character.isDigit(cha1[j])){
		    			sum1=sum1+cha1[j];
		    	}
		    	else {
		    		int cha2=Character.getNumericValue(ch[j]);
					sum1=sum1+cha2;
		    	}
		    }
		    
		 System.out.println(sum1);

	}

}
