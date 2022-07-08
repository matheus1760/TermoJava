/**
 * Guarda, cria e retorna a história dos cientistas Termodinamicos
 */
class CientistasTermodinamicos {
	private final String descricaoGeral;
	private final String descricaoAdicional;

	CientistasTermodinamicos(String nome, String dataDeNascimento, String dataDeFalecimento, String cidadania, String almaMater,
							 String descricaoAdicional) {
		this.descricaoGeral = "O(a) Cientista " + nome + "nasceu em " + dataDeNascimento + "e viveu sua vida " +
				"como " + cidadania  + ". Seu(ua) alma mater foi " + almaMater + ". Sua morte foi em + " +
				dataDeFalecimento + ".";
		this.descricaoAdicional = descricaoAdicional;
	}

	public String verHistoria() {
		return descricaoGeral + " " + descricaoAdicional;
	}
}