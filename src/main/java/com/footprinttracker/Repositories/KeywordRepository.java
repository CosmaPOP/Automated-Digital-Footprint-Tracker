package com.footprinttracker.Repositories;

import com.footprinttracker.Entities.Keywords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeywordRepository extends JpaRepository<Keywords, Long> {
}
