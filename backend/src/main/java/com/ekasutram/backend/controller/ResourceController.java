package com.ekasutram.backend.controller;

import com.ekasutram.backend.model.Resource;
import com.ekasutram.backend.service.ResourceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resources")   // 🔥 THIS WAS MISSING
@CrossOrigin                        // optional, useful later for React
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @GetMapping
    public List<Resource> getResources(
            @RequestParam(required = false) String subject) {

        if (subject != null) {
            return resourceService.getResourcesBySubject(subject);
        }
        return resourceService.getAllResources();
    }

    @PostMapping
    public Resource addResource(@RequestBody Resource resource) {
        return resourceService.addResource(resource);
    }
}
