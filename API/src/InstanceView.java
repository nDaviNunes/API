import java.util.ArrayList;

public class InstanceView {
	
	public static void main(String[] args) {
	
		ArrayList<InstanceModel> valores = new InstanceControl().loader("instancia.csv");

		
		System.out.println(valores.size());

		
		for(InstanceModel n: valores)
			System.out.println(n.getDocente() + ": " + n.getDisciplina());
			
		//for(int i=0; i < valores.size(); i++) System.out.println();
				
	}
	
}
