
public class Program {
public static void main(String[] args) {
	String a = "hello howare you    uuuu";
	int count = 1;
	char[] b = a.toCharArray();
	for (int i = 0; i < b.length; i++) {
		if (b[i] != '0' && b[i] != ' ') {
			count = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j]) {
				
				count++;
				b[j] = '0';
				} 
			}
			System.out.println(b[i] + " - " + count);
		}
	}

}
}
