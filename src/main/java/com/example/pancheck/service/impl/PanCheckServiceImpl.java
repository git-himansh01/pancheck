package com.example.pancheck.service.impl;

import com.example.pancheck.request.NsdlPanCheckRequest;
import com.example.pancheck.request.UserPanCheckRequest;
import com.example.pancheck.response.NsdlPanCheckResponse;
import com.example.pancheck.service.PanCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class PanCheckServiceImpl implements PanCheckService {
    private final WebClient webClient;

//@Autowired(required = false)
//    private UserRepository UserRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    public PanCheckServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080").build();
    }

    public Mono<NsdlPanCheckResponse> verifyPan(UserPanCheckRequest userPanCheckRequest) {
        NsdlPanCheckRequest nsdlPanCheckRequest = new NsdlPanCheckRequest();
        return webClient.post()
                .uri("/api/verify-user")
                .body(Mono.just(nsdlPanCheckRequest.dtoMapper(userPanCheckRequest)), NsdlPanCheckRequest.class)
                .retrieve()
                .bodyToMono(NsdlPanCheckResponse.class);
    }
}

//webClientBuilder.build().post()
