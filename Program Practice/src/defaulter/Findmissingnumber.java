package defaulter;

public class Findmissingnumber {
  static int[] a={1,3,4,6};
	public static void main(String[] args) {
	  	for(int i=0;i<=a.length-1;i++){
	  		if((a[i]+1)!=a[i+1]){
	  			System.out.println(a[i]+1);
	  		}
	  	}

	}

}
