package adm.atelieSilvia.adm.atelieSilvia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adm.atelieSilvia.adm.atelieSilvia.model.ClienteModel;
import adm.atelieSilvia.adm.atelieSilvia.model.ServicoModel;

@Repository
public interface ServicoRepository extends JpaRepository <ServicoModel, Long>{

}
