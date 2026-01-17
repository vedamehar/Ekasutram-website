package com.ekasutram.backend.controller;

import com.ekasutram.backend.model.Resource;
import com.ekasutram.backend.service.ResourceService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    // ✅ GET all / filter by subject
    @GetMapping
    public List<Resource> getResources(
            @RequestParam(required = false) String subject) {

        if (subject != null) {
            return resourceService.getResourcesBySubject(subject);
        }
        return resourceService.getAllResources();
    }

    @PostMapping(
            value = "/upload",
            consumes = "multipart/form-data"
    )
    public Resource uploadResource(
            @RequestParam("subject") String subject,
            @RequestParam("chapterName") String chapterName,
            @RequestParam("file") MultipartFile file
    ) throws IOException {

        return resourceService.saveResource(subject, chapterName, file);
    }

    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable Long id) throws IOException {
        resourceService.deleteResource(id);
    }

}
