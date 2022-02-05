package fi.vamk.e2001875.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fi.vamk.e2001875.app.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{

}