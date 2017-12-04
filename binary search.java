import java.util.*;
class Binarysearch
{
int ele,n;
binarysearch(int x)
{
n=x;
}
void sort()
{
int a[]=new a[n];
System.out.println("Enter array element");
Scanner S=new Scanner(System.in);
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
for(j=0;j<n;j++)
{
for(k=j+1;k<n;k++)
{
if(a[j]>a[k])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
}
}
}
System.out.println("The ascending order is");
for(j=0;j<=n;j++)
{
System.out.println(a[j]);
}
}
void search()
{
int left=0;right=n,ele;
Scanner S=new Scanner(System.in);
System.out.println("Enter elemnt search");
ele=s.nextInt();
int middle;
while(left<right)
{
middle=(left+right)/2
if(ele==a[middle])
{
System.out.println("Element is found");
break;
}
else if(a[middle]>ele)
{
right=m-1
}
else
{
left=m+1;
}
}
}
class 
{|
public static void main(String args[])
{
int n;
Binarysearch b= new binarysearch();
Scanner s=new Scanner(System.in);
System.out.println("no of ele to be entered is"=+n);
b.Binarysearch(n);
}
}