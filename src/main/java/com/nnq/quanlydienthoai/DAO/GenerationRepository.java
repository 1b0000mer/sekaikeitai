package com.nnq.quanlydienthoai.DAO;
import com.nnq.quanlydienthoai.Model.Generation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenerationRepository extends CrudRepository<Generation,String> {
}
