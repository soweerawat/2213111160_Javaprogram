package System.out;

public class PiggyBank {
	public int one;
	public int two;
	public int five;
	public int ten;
	public int size;
	
public void setPiggyBank(int s) {
	clear();
	size = s;
}
public int getPiggyBank() {
	return size;
}
public void clear() {
	one = 0;
	two = 0;
	five = 0;
	ten = 0;
}
public int getTotal() {
	return one+(two*2)+(five*5)+(ten*10);
}
public void addOne(int c) {
	if(getTotal()+c<=size) {
		one += c;
	}else {
		System.err.println("Piggy Bank Full");
	}
}
public void addTwo(int c) {
	if(getTotal()+c<=size) {
		two += (c*2);
	}else {
		System.err.println("Piggy Bank Full");
	}
}
public void addFive(int c) {
	if(getTotal()+c<=size) {
		five += (c*5);
	}else {
		System.err.println("Piggy Bank Full");
	}
}
public void addTen(int c) {
	if(getTotal()+c<=size) {
		ten += (c*10);
	}else {
		System.err.println("Piggy Bank Full");
	}
}

}
