package fi.vamk.e2001875.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fi.vamk.e2001875.app.entity.Profile;
import fi.vamk.e2001875.app.entity.User;

public interface ProfileService {

	public Iterable<Profile> finAll();
	
	public Page<Profile> findAll(Pageable pageable);
	
	public Optional<Profile> findById(Long id);
	
	public Profile save(Profile profile);
	
	public void deleteById(Long Id);
}
