class sort
{
// function for insertion sort
public static void InsertionSort(int array[])
{
int n=array.length;
for(int j=1;j<n;j++)
{
int key=array[j];
int i=j-1;
while ((i>-1)&&(array[i]>key))
{
array[i+1]=array[i];
i--;
}
array[i+1]=key; // inserting the key in proper place
}
}

// function for insertion sort
public static void SelectionSort(int array[])
{
for (int i=0;i<array.length;i++)
{
int index=i;
//finding smallest number
for (int j=i+1;j<array.length;j++)
{

if (array[j]<array[index])
{
index=j;
}
}
int smallernumber=array[index];
//placing smallest number in proper location
array[index]=array[i];
array[i]=smallernumber;
}
}

//main function
public static void main(String args[])
{
int[]arr={9,14,3,2,43,11,58,22}; // array of numbers
//display all elements before performing insertion sort
System.out.println("Before insertion sort");
for(int i:arr)
{
System.out.println(i+" ");
}
// System.out.println();
InsertionSort(arr); //calling insertion sort
//display all elements after performing insertion sort
System.out.println("After insertion sort");
for(int i:arr)
{
System.out.println(i+"");
}

int arrk[] ={9,14,3,2,43,11,58,22}; // array of numbers
//display all elements before performing selection sort

System.out.println("Before selection sort");
for(int i:arr)
{
System.out.println(i+"");
}
// System.out.println();
SelectionSort (arrk); //calling selection sort
//display all elements after performing selection sort
System.out.println("After selection sort");
for(int i:arr)
{
System.out.println(i+"");
}}}