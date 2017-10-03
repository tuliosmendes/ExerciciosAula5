package lista.exercicios.lsp.violation;

public class Aviao {

	private Marcha marcha;

    public Marcha getMarcha() {
        return marcha;
    }
    
    // Um avião pode reverter o motor enquanto se movimenta para frente
    public void mudaMarcha(Marcha marcha) {
        this.marcha = marcha;
    }
    
}
