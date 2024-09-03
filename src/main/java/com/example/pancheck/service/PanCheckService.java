package com.example.pancheck.service;

import com.example.pancheck.request.NsdlPanCheckRequest;
import com.example.pancheck.request.UserPanCheckRequest;
import com.example.pancheck.response.NsdlPanCheckResponse;
import reactor.core.publisher.Mono;

public interface PanCheckService {
    Mono<NsdlPanCheckResponse> verifyPan(UserPanCheckRequest userPanCheckRequest);
}
