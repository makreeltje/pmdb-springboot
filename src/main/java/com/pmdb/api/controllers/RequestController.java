package com.pmdb.api.controllers;

import com.pmdb.api.models.request.Movie;
import com.pmdb.api.payload.request.MovieRequest;
import com.pmdb.api.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/request")
public class RequestController {

    final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/movie")
    @PreAuthorize("hasRole('ADMIN') or hasRole('REQUEST')")
    public Collection<Movie> getSearchResults(@Valid @RequestParam String query) {
        return requestService.searchMovie(query);
    }

    @GetMapping("/movie/popular")
    @PreAuthorize("hasRole('ADMIN') or hasRole('REQUEST')")
    public Collection<Movie> getPopularResults() {
        return requestService.popularMovie();
    }

    @PostMapping("/movie/post")
    @PreAuthorize("hasRole('ADMIN') or hasRole('REQUEST')")
    public ResponseEntity<?> requestMovie(@Valid @RequestBody MovieRequest movieRequest) {
        ResponseEntity<?> response = requestService.requestMovie(movieRequest);
        return response;
    }
}
