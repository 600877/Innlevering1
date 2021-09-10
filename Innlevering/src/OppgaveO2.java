import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {

			int poeng = -1;
			
			while (poeng < 0 || poeng > 100) {
				poeng = Integer.parseInt(showInputDialog("Poeng:"));
				if (poeng < 0 || poeng > 100)
					System.out.println("Ugyldig poeng");
			}
			String karakter = "";
			
			if (poeng >= 90)
				karakter = "A";
			else if (poeng >= 80)
				karakter = "B";
			else if (poeng >= 60)
				karakter = "C";
			else if (poeng >= 50)
				karakter = "D";
			else if (poeng >= 40)
				karakter = "E";
			else 
				karakter = "F";
			
			System.out.println("Karakter: " + karakter);
		}
	}

}
