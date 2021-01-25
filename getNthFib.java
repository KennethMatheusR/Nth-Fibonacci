import java.util.*;

class Program {
  public static int getNthFib(int n) {
    // Write your code here.
		int value[] = new int[n];
		
		for(int i = 0;i < n; i++){
			if(i==0){
				value[i] = i;
			}else if(i==1){
				value[i] = i;
			}else{
				value[i] = (value[i-1] + value[i-2]);
			}
			
		}
		return value[n - 1];
  }
}
