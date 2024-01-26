package it.antoniocaccamo.poc.repositories;



import io.quarkus.hibernate.orm.panache.PanacheRepository;
import it.antoniocaccamo.poc.entities.Poc;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PocRepository implements PanacheRepository<Poc> {


}
