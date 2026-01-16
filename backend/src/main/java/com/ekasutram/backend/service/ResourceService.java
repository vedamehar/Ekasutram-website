package com.ekasutram.backend.service;

import com.ekasutram.backend.model.Resource;
import com.ekasutram.backend.repository.ResourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {

    private final ResourceRepository resourceRepository;

    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    public List<Resource> getResourcesBySubject(String subject) {
        return resourceRepository.findBySubject(subject);
    }

    public Resource addResource(Resource resource) {
        return resourceRepository.save(resource);
    }

}
