package vn.edu.iuh.fit.backEnds.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backEnds.models.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
