package ru.mirea.tvksp3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "element", path = "element")
public interface ElementRepository extends JpaRepository<Element, UUID> {
}
