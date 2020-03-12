package lambdaExpressionChallenge1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		List<String> users = new ArrayList<String>();
		users.add("jack");
		users.add("Jill");
		users.add("Ram");
		users.stream().forEach((name)-> showSupplier(name));
	}

	private static void showSupplier(String name) {
	System.out.println("Welcome:"+name);
	
}
}
