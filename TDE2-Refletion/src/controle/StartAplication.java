package controle;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class StartAplication {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException,
			NoSuchMethodException, SecurityException, InvocationTargetException, InstantiationException {

		Scanner scanner;
		Class objClass = null;
		Object objeto = null;

		// Boco que recebe o nome da classe para instanciar.

		scanner = new Scanner(System.in);
		System.out.println("Digite nome da classe: ");
		String nome = scanner.nextLine();
		System.out.println("Vamos instanciar a Classe: " + nome);

		// Utilização da do Reflation

		try {
			objClass = Class.forName(nome);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Classe não encontrada");
		}

		System.out.println("--------Metodos de " + objClass.getName() + "--------");

		Method[] metodos = objClass.getDeclaredMethods();

		for (Method m : metodos) {
			System.out.println(m.toString());
		}

		System.out.println("--------Atributos de " + objClass.getName() + "--------");

		Field[] atributos = objClass.getDeclaredFields();

		for (Field field : atributos) {
			System.out.println(field);
		}

		System.out.println("--------" + objClass.getName() + "--------");

		try {
			objeto = objClass.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("--------Bloco para instanciar a classe e preencher seu atributos-------");

		Field[] atributosiniciar = objeto.getClass().getDeclaredFields();
		Method metodo;

		for (Field field : atributosiniciar) {

			

			String palavra = field.getName();

			palavra = palavra.substring(0, 1).toUpperCase() + palavra.substring(1);

			System.out.println(field.getType());

			metodo = objeto.getClass().getMethod("set" + palavra, field.getType());
			
			//Class retorno = metodo.getReturnType();

			
			System.out.println("Digite valor para o : " + field.getName());
			
			Object valor = scanner.nextLine();
			
			/*
			 * Procuro no tipo especificado um construtor que recebe uma String
			 */
			Constructor<?> cons =  
			        (Constructor<?>) field.getType().getConstructor(new Class<?>[]{String.class});  

			       /*
			        * Instancio a classe do tipo da classe, passando o valor lido. 
			        * 
			        * igual a Integer teste = new Integer("2") para o caso de Integer
			        */
			      Object valorDoTipo = (Object) cons.newInstance(new Object[]{valor});  

			metodo.invoke(objeto, valorDoTipo);
			
			/*
			if(field.getType().toString().equals("class java.lang.String")){
			scanner = new Scanner(System.in);
			System.out.println("Digite valor para o : " + field.getName());
			String valor = scanner.nextLine();
			metodo.invoke(objeto, valor);
			}else if(field.getType().toString().equals("Integer")){
				System.out.println("Digite valor para o : " + field.getName());
				
				Object valor = scanner.nextLine();
				metodo.invoke(objeto, field.getType().cast(valor));
			}
			*/
		}
		
		System.out.println( objeto.toString());
		
	
	}
	
	


}
