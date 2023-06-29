package com.apitest.dao;

import com.apitest.domain.Worker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface WorkerDao {
    @Insert("INSERT INTO worker VALUES(NULL, #{name})")
    public void saveWorker(Worker worker);

    @Select("SELECT * FROM worker WHERE id = #{id}")
    public Worker getWorkerById(Integer id);

    @Update("UPDATE worker SET name = #{name} WHERE id = #{id}")
    public void updateWorker(Worker worker);
}
