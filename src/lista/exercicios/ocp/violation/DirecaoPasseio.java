package lista.exercicios.ocp.violation;

public class DirecaoPasseio extends Veiculo implements Direcao {

	@Override
	public void mudarDirecao() {
		 super.setPotencia(400);
		 super.setAlturaSuspencao(20);
	}

}
