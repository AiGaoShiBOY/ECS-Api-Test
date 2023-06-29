package com.apitest.service;

import com.apitest.domain.Worker;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface WorkerService {
    /**
     * save
     * @param worker
     * @return boolean
     */
    public boolean saveWorker(Worker worker);

    /**
     * get worker
     * @param id
     * @return Worker
     */
    public Worker getWorkerById(Integer id);

    /**
     * update worker info
     * @param worker
     * @return boolean
     */
    public boolean updateWorker(Worker worker);
}
