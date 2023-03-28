class Fibonace
{
public static void main(String[] args)
{
int Fib1=10;
int Fib2=1;
int Fib3=0;
System.out.println(Fib1+Fib2+" ");
for(int i=1;i<=10;i++)
{
Fib3=Fib1+Fib2;
Fib1=Fib2;
Fib2=Fib3;
System.out.println(Fib3+" ");
}
}
}
