package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		
		String email = "TESte@GMail.Com";
		System.out.println("Original: " + email);
		System.out.println("Minuscula :" + email.toLowerCase());
		System.out.println("Maiuscula :" + email.toUpperCase());
		System.out.println("Tem Arroba? :" + email.contains("@"));	
		//teste de posição de caracteres
		//teste@gma i  l  .  c  o  m
		//123456789 10 11 12 13 14 15
		System.out.println("posição do @" + email.indexOf ("@"));
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Do 2º até o quinto caracter: " + email.substring(1,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		// usuário do email
		// o servidor do email
		
		// boas praticas para nomenclatura
	}

}
