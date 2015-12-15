package modelo;

import org.springframework.stereotype.Component;

@Component
public class ContaDAO extends HibernateDAO<Conta>{

	public ContaDAO() {
		super(HibernateUtil.getSession());
	}

}
