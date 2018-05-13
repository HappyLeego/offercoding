package Problem4;

public class Replace {
	public String replace(String input){
		StringBuilder builder = new StringBuilder();
		if(input == null|| input.length()==0){
			return null;
		}
		for(int i = 0; i < input.length();i++){
			if(input.charAt(i) == ' '){
				builder.append('%');
				builder.append('2');
				builder.append('0');
			}
			else{
				builder.append(input.charAt(i));
			}
		}
		return builder.toString();
		
	}
	public static void main(String[] args) {
		Replace r = new Replace();
		String s = "We are happy.";
		System.out.println(r.replace(s));
	}
}
