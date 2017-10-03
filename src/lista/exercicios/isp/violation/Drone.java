package lista.exercicios.isp.violation;

public class Drone extends Veiculo implements LigaCamera, DesligaCamera {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

	@Override
	public void ligarCamera() {
		cameraOn = true;
	}

	@Override
	public void desligarCamera() {
		cameraOn = false;
	}
}