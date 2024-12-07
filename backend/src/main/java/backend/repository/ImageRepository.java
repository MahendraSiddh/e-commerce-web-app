package backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}

