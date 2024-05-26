package org.newshop.favoritesservice.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Favorites")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Favorites {
    @Id
    @Column(name = "FavoriteId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartId;

    @Column(name = "UserId")
    private long userId;

    @Column(name = "ProductId")
    private long productId;
}