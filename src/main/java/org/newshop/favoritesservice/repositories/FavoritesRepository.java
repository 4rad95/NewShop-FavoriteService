package org.newshop.favoritesservice.repositories;


import org.newshop.favoritesservice.entity.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritesRepository extends JpaRepository<Favorites,Long> {
}