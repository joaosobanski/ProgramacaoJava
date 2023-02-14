package aula1;

public class main {

	// metodos print 
	// exemplo de polimorfismo
	public static void print(String mensagem) {
		System.out.println(mensagem);
	}
	
	public static void print(int numero) {
		System.out.println(numero);
	}
	public static double print(double numeroDecimal) {
		System.out.println(numeroDecimal);
		return numeroDecimal;
	}
	
//  	funções de contas esperando como parametro valores int 
//		e terão como retorno outro atributo int respectivo a operação definida do metodo
	public static int soma(int x, int y) {
		return x + y;
	} 
	public static int subtracao(int x, int y) {
		return x - y;
	} 
	public static int mult(int x, int y) {
		return x * y;
	}
	
	// lembrando que é inteiros e eles podem possuir valores inesperados nesses metodos.
	// como 3/2 é 1.5 e este valor não é inteiro.
	public static int divisao(int x, int y) {
		return x / y;
	}
	public static int restoDivisao(int x, int y) {
		return x % y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

		// execução dos metodos print e soma
		 
		print("teste");
		int resultado = soma(10, 5);
		print(resultado);

		int x = 2;
		int y = 7;
		int resultadoSoma = soma(x, y); 
		print(x);
		print(y);
		print(resultadoSoma); 
		
		 
		// exemplos de laçoes de repetição em java
		
		int[] numeros = {1,2,3,4,5,6,7,8,9,10};
		
		// laço de repetição definido por um indice incremental do tipo for
		for(int indice = 0 ; indice < numeros.length;indice++) {
			System.out.println(numeros[indice]);
		}

		// laço de repetição definido por um indice incremental do tipo do while
		int c=0;
		do {
			System.out.println(numeros[c]);
			c++;
		}while(c < numeros.length);
		
		//laco de repetição definido por indice incremental do tipo while
		int cc = 0;
		while(cc < numeros.length) {
			System.out.println(numeros[cc]);
			cc++;
		}
  
		//laco de repetição definido por documento, onde será percorrido cada item da lista e instanciado seu respectivo valor dentro
		//da variavel item.
		
		// este modelo não permite pegar um valor anterior ou posterior
		
		for(int item : numeros) {
			System.out.println(item); 
		}
		
		
		 
		 
		
	}

}
