package com.polidoraian.librarymanagmentsystem.database.dao;

import com.polidoraian.librarymanagmentsystem.database.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO extends JpaRepository<Book, Long> {
    
}
