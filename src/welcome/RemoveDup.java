package welcome;
public class RemoveDup {
public static void main(String[] args) {
String s1="java is easy and interesting";
char[] a=s1.toCharArray();
int l=a.length;
for(int i=0;i<l-1;i++)
{
for(int j=i+1;j<=l-1;j++)
{
if(a[i]==a[j])
{
a[j]=0;
}
}
}
for(int i=0;i<=l-1;i++)
System.out.print(a[i]);
}

}
