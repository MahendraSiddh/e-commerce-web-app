package backend.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID> {
    
    @SuppressWarnings("null")
    Optional<Item> findById(UUID id);

    @SuppressWarnings("null")
    List<Item> findAll();
}

