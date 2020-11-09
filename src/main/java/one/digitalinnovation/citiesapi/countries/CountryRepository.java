package one.digitalinnovation.citiesapi.countries;

import one.digitalinnovation.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
