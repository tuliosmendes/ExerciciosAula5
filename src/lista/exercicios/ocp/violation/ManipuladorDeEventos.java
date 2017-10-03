package lista.exercicios.ocp.violation;

public class ManipuladorDeEventos {

    private Direcao direcao;

    public ManipuladorDeEventos(Direcao direcao) {
        this.direcao = direcao;
    }

    public void mudarModoDirecao(){
    	this.direcao.mudarDirecao();
    }
}
