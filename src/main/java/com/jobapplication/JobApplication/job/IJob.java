package com.jobapplication.JobApplication.job;

import java.util.List;
import java.util.Optional;

public interface IJob {
    List<Job> findAll();
    void createJobs(Job job);

    Job getJobById(Long id);
}
