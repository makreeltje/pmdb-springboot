package com.pmdb.api.service;

import com.pmdb.api.models.request.Request;

public interface RequestService {
    Request[] searchMovie(String searchTerm);
}
