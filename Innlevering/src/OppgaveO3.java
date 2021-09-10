import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(showInputDialog("n:"));
		if (n <= 0) {
			System.out.println("Ugyldig tall");
			return;
		}
		int fakultet = 1;
		
//		
		for (int i = 2; i <= n; i++) {
			fakultet = fakultet * i;
		}
		System.out.println("n! = " + fakultet);

	}

}
