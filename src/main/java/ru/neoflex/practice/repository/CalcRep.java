package ru.neoflex.practice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.neoflex.practice.db.Calc;
@Repository
public interface CalcRep extends CrudRepository<Calc, Long> {
}
