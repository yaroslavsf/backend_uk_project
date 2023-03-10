package ch.noseryoung.realestate.domain.realestate;

import ch.noseryoung.realestate.domain.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RealEstateRepository  extends JpaRepository<RealEstate, UUID> {
    List<RealEstate> findByCantonLike(String cantonCriteria);

    List<RealEstate> findByNameLike(String nameCriteria);
}