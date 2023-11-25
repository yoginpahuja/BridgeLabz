import java.util.*;
public class Arrsubset{
 public static boolean arrCheck(int arr1[],int arr2[],int n1,int n2)
      {
	int count=0;
 	for(int i=0;i<n2;i++)
			{
			   for(int j=0;j<n1;j++)
                              {
				  if(arr2[i]==arr1[j])
                                    {
                                        count++;
                                        break;
                                     }
                               } 
                         }
		if(count==n2)
		  {
                     return true;
	 	  }
		else
		  {
		     return false;
                  }
        }
 public static void main(String[] args)
	{
		int n1=5,n2=3
  		int arr1[] =new int[n1];
		int arr2[]= new int[n2];
                
                Scanner scan=new Scanner(System.in);
                for(int i=0;i<n1;i++)
		  {
                     arr1[i]=scan.nextInt();
	          }
		for(int i=0;i<n2;i++)
		  {
                     arr2[i]=scan.nextInt();
	          }

		if(arrCheck(arr1,arr2,n1,n2))
		  {
                     System.out.println("Yes , arr2 is a subset of arr1");
	 	  }
		else
		  {
		     System.out.println("No , arr2 is not a subset of arr1");
                  }
       }
}



//firstly initialise the variable with value 1
//then iterate the array 
//Use this code segment ( temp*=arr[i])
//Print the temp element