package CollectionFramework;

public class VowelsConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int vowel=0, consonent=0;
			String s = "Subhash";
			s = s.toLowerCase();

			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'u');
				vowel++;
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				consonent++;
			}
			System.out.println("Number of vowels : " + vowel);
			System.out.println("Number of consonents : " + consonent);
}
}