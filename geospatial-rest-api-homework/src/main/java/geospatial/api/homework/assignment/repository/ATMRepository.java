package geospatial.api.homework.assignment.repository;

import geospatial.api.homework.assignment.model.ATM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ManiSamani on 17/06/22.
 */

@Repository
public interface ATMRepository extends JpaRepository<ATM, Long> {

}
