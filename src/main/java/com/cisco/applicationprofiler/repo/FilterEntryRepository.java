package com.cisco.applicationprofiler.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.applicationprofiler.domain.FilterEntry;

public interface FilterEntryRepository extends JpaRepository<FilterEntry, Integer>{

}
