import javafx.application.Application;

public aspect Change
{
pointcut cambio():execution(void *handle*(..));
	
	after(): cambio()
	{
		char[] letras = thisJoinPoint.getSignature().toString().split(" ")[1].toCharArray();
		String valorcito = String.valueOf(letras[6]);
		if(valorcito.equals("1")) 
		{
			System.out.println("La ventana cambi� a Azul");
		}
		
		else if(valorcito.equals("2")) 
		{
			System.out.println("La ventana cambi� a Amarillo");
		}
		
		if(valorcito.equals("3")) 
		{
			System.out.println("La ventana cambi� a Negro");
		}
	}
}
