package problems;


public class mergepalindrome {
	public static void MergeOperations(int []arr,int i,int j) {
		int cnt=0;
		while(i<j) {
			if(arr[i]==arr[j]) {
				i++;
				j--;
			}
				
				else if(arr[i]>arr[j]) {
					j--;
					arr[j]=arr[j]+arr[j+1];
					cnt++;
				}
				else {
					i++;
					arr[i]=arr[i]+arr[i-1];
					cnt++;
				}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		int []array= {6,1,4,3,1,7};
			
			MergeOperations(array,0,array.length-1);
		}

	}


