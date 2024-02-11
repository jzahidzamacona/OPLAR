package mx.com.primer.diamante.oplar.repository;

import mx.com.primer.diamante.oplar.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
