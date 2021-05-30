package labs;

public class Lab11 {
int num;
public boolean oddNum(int num) {
	if(num%2==1)
		return true;
	return false;
}
public boolean evenNum(int num) {
	if(num%2==0)
		return true;
	return false;
}
public boolean primeNum(int num) {
	if(num%2==1)
		return true;
	return false;
}
public int factorial(int num) {
	int fact=1;
	for(int i=1;i<=num;i++)
		fact=fact*i;
	
	return fact;
}
}
//updating lab11.java
