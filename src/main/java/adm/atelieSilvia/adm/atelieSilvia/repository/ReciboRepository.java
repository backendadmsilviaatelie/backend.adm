package adm.atelieSilvia.adm.atelieSilvia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import adm.atelieSilvia.adm.atelieSilvia.model.ReciboModel;

@Repository
public interface ReciboRepository extends JpaRepository <ReciboModel, Long> {

	
	@Query("SELECT MAX(r.id) FROM ReciboModel r")
    Long findUltimoId();
	

	@Override
	default Optional<ReciboModel> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
}

