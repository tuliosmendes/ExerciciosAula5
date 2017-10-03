package lista.exercicios.isp.violation;

public class Carro extends Veiculo implements LigaRadio, DesligaRadio {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

	@Override
	public void ligarRadio() {
		radioOn = true;
	}

	@Override
	public void desligarRadio() {
        radioOn = false;
	}

}