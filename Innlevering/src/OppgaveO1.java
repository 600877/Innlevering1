import static javax.swing.JOptionPane.showInputDialog;
public class OppgaveO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double inntekt = Double.parseDouble(showInputDialog("Inntekt:"));
		double skattTrinn1 = 0;
		double skattTrinn2 = 0;
		double skattTrinn3 = 0;
		double skattTrinn4 = 0;
		double skattTotalt = 0;
		double grunnlag = 0;
		
		if (inntekt > 164100.0) {
			if (inntekt < 230950.0) {
				grunnlag = inntekt - 164100.0;
			}
			else {
				grunnlag = 230950.0 - 164100.0;
			}
			skattTrinn1 = grunnlag * 0.0093;
			System.out.println("Trinn1: " + skattTrinn1);
		}
			
		if (inntekt > 230950.0) {
			if (inntekt < 580650.0) {
				grunnlag = inntekt - 230950.0;
			}
			else {
				grunnlag = 580650.0 - 230950.0;
			}
			skattTrinn2 = grunnlag * 0.0241;
			System.out.println("Trinn2: " + skattTrinn2);
			
		}
		if (inntekt > 580650.0) {
			if (inntekt < 934050.0) {
				grunnlag = inntekt - 580650.0;
			}
			else {
				grunnlag = 934050.0 - 580650.0;
			}
			skattTrinn3 = grunnlag * 0.1152;
			System.out.println("Trinn3: " + skattTrinn3);
			
		}
		if (inntekt > 934050.0) {
			grunnlag = inntekt - 934050.0;
			skattTrinn4 = grunnlag * 0.1452;
			System.out.println("Trinn4: " + skattTrinn4);
			
		}
		
		skattTotalt = skattTrinn1 + skattTrinn2 + skattTrinn3 + skattTrinn4;
		
		System.out.println("Skatt: " + skattTotalt);
		

	}

}
