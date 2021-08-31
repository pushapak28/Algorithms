import java.io.*;

class GFG {
        static int search(int arr[],int n,int ele){
            
            for(int i=0;i<n;i++){
                if(arr[i]==ele){
                return i;}
            }return -1;
        }
        
	public static void main (String[] args) {
		int arr[] = {1,23,21,34,12,43};
		int ele=34;
		int n = arr.length;
		System.out.printf("%d is present at aray index %d",ele,search(arr,n,ele));
	}
}
