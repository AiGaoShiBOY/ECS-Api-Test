package com.apitest.service.impl;

import com.apitest.dao.WorkerDao;
import com.apitest.domain.Worker;
import com.apitest.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerDao workerDao;
    @Override
    public boolean saveWorker(Worker worker) {
        workerDao.saveWorker(worker);
        return true;
    }

    @Override
    public Worker getWorkerById(Integer id) {
        return workerDao.getWorkerById(id);
    }

    @Override
    public boolean updateWorker(Worker worker) {
        workerDao.updateWorker(worker);
        return true;
    }
}
