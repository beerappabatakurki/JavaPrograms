//import java.util.Scanner;
class Prime
{
public static void main(String[] args)
{
//Scanner s=new Scanner(System.in);
//System.out.println("enter the number");
//int n=s.nextInt();
for(int n=1;n<=100;n++)
	{
int temp=0;
for(int i=2;i<=n-1;i++)
{
if(n%i==0)
{
temp=temp+1;
}}
if(temp==0)
{
	System.out.println(n);
//System.out.println(n+" is a prime no");
//}else 
//{
//System.out.println(n+" is not a prime no");
}
}
}}