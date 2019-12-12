package co.grandcircus.TutorApp2019.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.TutorApp2019.entity.Tutor;

public interface TutorRepo extends JpaRepository<Tutor, Integer> {
	
	Tutor findByLatitudeAndLongitude(Double latitude, Double longitude); 
	
	Tutor findByEmail(String email); 

}
