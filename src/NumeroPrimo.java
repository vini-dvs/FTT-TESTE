import javax.swing.JOptionPane;

public class NumeroPrimo {

	public static void main(String[] args) {
		boolean ehErro = false;
		do
		{
			try
			{
				String r = JOptionPane.showInputDialog("Digite um n�mero para saber se � primo:");
				int  i = Integer.parseInt(r);
				if(ehPrimo(i)){
					JOptionPane.showMessageDialog(null ,i + " � primo!");
				}
				else
				{
					JOptionPane.showMessageDialog(null ,i + " N�o � primo!");
				}
				ehErro = false;
			}
			catch(Exception err )
			{
				JOptionPane.showMessageDialog(null ,"Digite um n�mero, n�o uma letra!");
				ehErro = true;
			}
		}while(ehErro);
			
	}
	public static boolean ehPrimo(int num)
	{
		
		if(num <= 0)
			throw new ArithmeticException("Valor deve ser > 0");
		int qtd = 0;
		for(int i = 2; i <= num; i++)
		{
			if(num % i == 0)
			{				
				qtd++;
			}
		}		
		return qtd == 1;
	}

}

