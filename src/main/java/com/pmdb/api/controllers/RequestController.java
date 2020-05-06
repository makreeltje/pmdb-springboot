package com.pmdb.api.controllers;

import com.pmdb.api.models.movie.Movie;
import com.pmdb.api.models.request.Request;
import com.pmdb.api.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/request")
public class RequestController {

    @Autowired
    RequestService requestService;

    @GetMapping("/movie")
    @PreAuthorize("hasRole('USER')")
    public Request[] getSearchResults(@Valid @RequestBody String searchTerm) {
        Request[] requests = requestService.searchMovie(searchTerm);
        return requests;
    }
}
