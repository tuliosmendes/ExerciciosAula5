package lista.exercicios.ocp.violation;

public class DirecaoEsporte extends Veiculo implements Direcao {

	@Override
	public void mudarDirecao() {
		 super.setPotencia(500);
		 super.setAlturaSuspencao(10);
	}

}
