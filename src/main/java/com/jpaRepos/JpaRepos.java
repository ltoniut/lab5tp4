package com.jpaRepos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tp4.entities.BrowsingData;

public interface JpaRepos extends JpaRepository<BrowsingData, Long> {

}
