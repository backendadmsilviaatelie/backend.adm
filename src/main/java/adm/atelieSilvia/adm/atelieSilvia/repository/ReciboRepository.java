package adm.atelieSilvia.adm.atelieSilvia.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
	
	@Query("SELECT r FROM ReciboModel r WHERE r.dataPagamento >= :inicio AND r.dataPagamento <= :fim")
	List<ReciboModel> buscarPorPeriodo(@Param("inicio") LocalDate inicio,
	                                    @Param("fim") LocalDate fim);
	
}

