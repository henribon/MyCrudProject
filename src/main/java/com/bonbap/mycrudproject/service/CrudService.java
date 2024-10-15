package com.bonbap.mycrudproject.service;

import com.bonbap.mycrudproject.dto.IncludeClientRequestDTO;

public interface CrudService {

    public boolean createClient(IncludeClientRequestDTO request);
}
