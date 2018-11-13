package allannog.com.github.colecaodedados;

/**
 * 
 * @author Allan Nogueira
 *Criada Classe Produtos
 */
public class Produtos {

	/**
	 * atributo privado id do tipo int
	 * atributo privado descricao do tipo String
	 */
	private int id;
	private String descricao;

	/**
	 * Construtor para novas instancias do Objeto Produtos
	 * @param id
	 * @param descricao
	 */
	public Produtos(int id, String descricao) {

		this.id = id;
		this.descricao = descricao;
	}

	/**
	 * o m�todo hashCode � usado para gerar um c�digo para cada novo Produto instanciado
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
		return result;
	}

	/**
	 * o m�todo equals � usado para fazer uma compara��o entre os objetos se os mesmos s�o iguais
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
				
		return id + " , " + descricao; 
	}

}
