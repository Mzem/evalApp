package fr.aymax.RateMyManager.dao;

import java.util.List;

import fr.aymax.RateMyManager.entity.Manager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerDAO extends JpaRepository<Manager, String>
{
	Manager findByUsername(String username);
} 