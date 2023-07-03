package Testss;


public class SameElements {
public static void printsame(char []arr1,char []arr2) {
	for(int i=0,j=0;i<arr2.length;i++) {
		if(arr2[i]==arr1[j]) {
			System.out.println(i);
			j++;
			break;
		}else {
			System.out.println("NA");
			j++;
	}
		}
	}

	public static void main(String[] args) {
char []ch= {'A','B','D','Z'};
char[]chh= {'Z','C','H','D'};
printsame(ch,chh);
	}

}
