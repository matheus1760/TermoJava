class DensidadeEmKgPorMetroCubico {
	private double massaEmKg;
	private double volumeEmMetrosCubicos;

	public double getMassaEmKg() {
		return massaEmKg;
	}

	public void setMassaEmKg(double massaEmKg) {
		if (massaEmKg > 0.0) {
			this.massaEmKg = massaEmKg;
		} else {
			System.out.println("Massa Inválida!");
		}
	}

	public double getVolumeEmMetrosCubicos() {
		return volumeEmMetrosCubicos;
	}

	public void setVolumeEmMetrosCubicos(double volumeEmMetrosCubicos) {
		if (volumeEmMetrosCubicos > 0.0) {
			this.volumeEmMetrosCubicos = massaEmKg;
		} else {
			System.out.println("Volume Inválido!");
		}
	}
}
