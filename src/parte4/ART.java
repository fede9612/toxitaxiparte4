package parte4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ART {
	private List<Chofer> choferesAsociados = new ArrayList<>();
	private int lapsoDeChequeo;
	
	public ART(int lapso){
		this.lapsoDeChequeo = lapso;
	}
	
	public void setAsociarChofer(Chofer chofer){
		this.choferesAsociados.add(chofer);
	}
	
	public List<Chofer> getChoferesQueDebeRealizarChequeosMedicos(){
		return this.choferesAsociados.stream().filter(c -> c.getCantViajesTotales() >= this.lapsoDeChequeo).collect(Collectors.toList());
	}
	
	public void hacerChequeosAChoferes(){
		for (int i = 0; i <= this.getChoferesQueDebeRealizarChequeosMedicos().size(); i++) {
			this.getChoferesQueDebeRealizarChequeosMedicos().get(i).irAHacerChequeoMedico();
		}
	}
}
