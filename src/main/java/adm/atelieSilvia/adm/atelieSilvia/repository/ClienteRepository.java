package adm.atelieSilvia.adm.atelieSilvia.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adm.atelieSilvia.adm.atelieSilvia.model.ClienteModel;

@Repository
public  interface ClienteRepository extends JpaRepository<ClienteModel, Long>{
	
	

    List<ClienteModel> findByNomeClienteAdmContaining(String nomeClienteAdm);

}


