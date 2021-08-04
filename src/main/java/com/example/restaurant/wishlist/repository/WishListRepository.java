package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {
    @Override
    public List<WishListEntity> findAll() {
        return null;
    }
}