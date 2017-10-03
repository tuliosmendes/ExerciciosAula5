package lista.exercicios.lsp.violation;

public class Carro {

	private Marcha marcha;

    public Marcha getMarcha() {
        return marcha;
    }

    public void mudaMarcha(Marcha marcha) {
        if(Marcha.R.equals(marcha) && getMarcha().equals(Marcha.D)){
            throw new RuntimeException("Não pode mudar para REVERSE quando " + getMarcha().toString() + " marcha está engatada!");
        }
    }
}
