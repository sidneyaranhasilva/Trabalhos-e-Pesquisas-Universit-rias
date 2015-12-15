package modelo;

public class Movimentacao {

	private int idconta;
	public Double valor = 0.0;
	public String tipomovimentacao;
	public int getIdconta() {
		return idconta;
	}
	public void setIdconta(int idconta) {
		this.idconta = idconta;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getTipomovimentacao() {
		return tipomovimentacao;
	}
	public void setTipomovimentacao(String tipomovimentacao) {
		this.tipomovimentacao = tipomovimentacao;
	}
	@Override
	public String toString() {
		return "Movimentacao [idconta=" + idconta + ", valor=" + valor
				+ ", tipomovimentacao=" + tipomovimentacao + "]";
	}
	
	
	
	
	

	
	
}
