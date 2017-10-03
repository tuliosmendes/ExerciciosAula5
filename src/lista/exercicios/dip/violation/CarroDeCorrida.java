package lista.exercicios.dip.violation;

public class CarroDeCorrida implements Velocidade {

    private final int capacidadeTanqueCombustivel;
    private int quantidadeCombustivel;
    private int potencia;

    public CarroDeCorrida(final int combustivel) {
        this.capacidadeTanqueCombustivel = combustivel;
        this.quantidadeCombustivel = combustivel;
    }

    private void acelerar(){
        potencia++;
        quantidadeCombustivel--;
    }

	@Override
	public void aumentarVelocidade() {
		acelerar();
	}

}