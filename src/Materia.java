public class Materia {
	private static final double constanteDeAvogadro = 6.0221415E-23;
	private DensidadeEmKgPorMetroCubico densidadeEmKgPorMetroCubico;
	private double temperaturaAtualEmCelcius;
	private double calorEspecificoEmCalPorGramaPorGrauCelcius;
	private String estadoFisico;

	public DensidadeEmKgPorMetroCubico getDensidadeEmKgPorMetroCubico() {
		return densidadeEmKgPorMetroCubico;
	}

	public void setDensidadeEmKgPorMetroCubico(DensidadeEmKgPorMetroCubico densidadeEmKgPorMetroCubico) {
		this.densidadeEmKgPorMetroCubico = densidadeEmKgPorMetroCubico;
	}

	public double getTemperaturaAtualEmCelcius() {
		return temperaturaAtualEmCelcius;
	}

	public void setTemperaturaAtualEmCelcius(double temperaturaAtualEmCelcius) {
		if (temperaturaAtualEmCelcius > -273.15) {
			this.temperaturaAtualEmCelcius = temperaturaAtualEmCelcius;
		} else {
			System.out.println("Temperatura Inválida! A mesma está abaixo de 0 Kelvin");
		}
	}

	public double getCalorEspecificoEmCalPorGramaPorGrauCelcius() {
		return calorEspecificoEmCalPorGramaPorGrauCelcius;
	}

	public void setCalorEspecificoEmCalPorGramaPorGrauCelcius(double calorEspecificoEmCalPorGramaPorGrauCelcius) {
		this.calorEspecificoEmCalPorGramaPorGrauCelcius = calorEspecificoEmCalPorGramaPorGrauCelcius;
	}

	public String getEstadoFisico() {
		return estadoFisico;
	}

	public void setEstadoFisico(String estadoFisico) {
		if (estadoFisico.equals("S") || estadoFisico.equals("L") || estadoFisico.equals("G")) {
			this.estadoFisico = estadoFisico;
		} else {
			System.out.println("Estado físico inválido! Digite 'S', 'L', ou 'G' (Em maiúsculo)");
		}
	}

	Materia(DensidadeEmKgPorMetroCubico densidadeEmKgPorMetroCubico, double temperaturaAtualEmCelcius,
			double calorEspecificoEmCalPorGramaPorGrauCelcius, String estadoFisico) {
		setDensidadeEmKgPorMetroCubico(densidadeEmKgPorMetroCubico);
		setTemperaturaAtualEmCelcius(temperaturaAtualEmCelcius);
		setCalorEspecificoEmCalPorGramaPorGrauCelcius(calorEspecificoEmCalPorGramaPorGrauCelcius);
		setEstadoFisico(estadoFisico);
	}
}
