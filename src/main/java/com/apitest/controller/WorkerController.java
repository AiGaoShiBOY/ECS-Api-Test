package com.apitest.controller;

import com.apitest.domain.Worker;
import com.apitest.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanfeng
 */
@RestController
@RequestMapping("/workers")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @PostMapping
    public Result saveWorker(@RequestBody Worker worker) {
        boolean success = workerService.saveWorker(worker);
        return new Result(success ? Code.Code_OK : Code.Code_Not_FOUND, worker, IPDetector.getIpAddress());
    }

    @GetMapping("/{id}")
    public Result getWorkerById(@PathVariable Integer id) {
        IPDetector.getIpAddress();
        Worker res =  workerService.getWorkerById(id);
        Integer code = res != null ? Code.Code_OK : Code.Code_Not_FOUND;
        return new Result(code, res, IPDetector.getIpAddress());
    }

    @PutMapping
    public Result updateWorker(@RequestBody Worker worker) {
        boolean success = workerService.saveWorker(worker);
        return new Result(success ? Code.Code_OK : Code.Code_Not_FOUND, worker, IPDetector.getIpAddress());
    }

}
