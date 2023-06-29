package com.apitest.service;

import com.apitest.config.SpringConfig;
import com.apitest.domain.Worker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)

public class WorkerServiceTest {
    @Autowired
    private WorkerService workerService;
    @Test
    public void testGetWorkerById(){
        Worker worker = workerService.getWorkerById(1);
        System.out.println(worker);
    }
}
