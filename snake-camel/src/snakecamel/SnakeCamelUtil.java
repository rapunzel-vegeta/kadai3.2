package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i <camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}		
		sb.append(camelcase.substring(j));//大文字にしたもの(j)を飛ばしてそれ以降のものを表示
		return new String(sb);
	}	
	static String capitalize(String s) {//大文字にする				
		for(int i=0;i<s.length();i++){
			char first = s.charAt(i);//0だと1文字のときだけになる
			char upperFirst = Character.toUpperCase(first);
			String rest = s.substring(1);
			return upperFirst + rest;
		}
		return s;
	}
	static String uncapitalize(String s) {//小文字にする
		for(int i=0;i<s.length();i++){
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
		}
		return s;
	}	
}
