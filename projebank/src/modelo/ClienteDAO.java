package modelo;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Component;

@Component
public class ClienteDAO extends HibernateDAO<Cliente> {

	public ClienteDAO() {
		super(HibernateUtil.getSession());

	}

	// Metodo para consulta no banco HQL com hibernate
	public Cliente clienteporid(int id) {

		session.clear();
		
		Query query = session
				.createQuery("SELECT c FROM Cliente c WHERE c.id LIKE :paramid");
		query.setParameter("paramid", id);
		return (Cliente) query.uniqueResult();

	}
	
	// Metodo para consulta no banco HQL com hibernate
		public List<Cliente> clienteNome(String nome) {

			
			
			Query query = session
					.createQuery("SELECT c FROM Cliente c WHERE c.nome  LIKE :paramNome");
			query.setParameter("paramNome", nome + "%");
			List<Cliente> list = (List<Cliente>) query.list();

		
			return list;

		}


}
