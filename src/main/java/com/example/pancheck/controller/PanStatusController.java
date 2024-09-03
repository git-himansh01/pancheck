package com.example.pancheck.controller;

import com.example.pancheck.request.NsdlPanCheckRequest;
import com.example.pancheck.request.UserPanCheckRequest;
import com.example.pancheck.response.NsdlPanCheckResponse;
import com.example.pancheck.service.impl.PanCheckServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api")
public class PanStatusController {
    @Autowired
    private PanCheckServiceImpl panCheckService;

    NsdlPanCheckRequest nsdlPanCheckRequest;

    @PostMapping("/verify-user-pan")
    public Mono<ResponseEntity<NsdlPanCheckResponse>> verifyPan(@RequestBody UserPanCheckRequest userPanCheckRequest) {
        return panCheckService.verifyPan(userPanCheckRequest)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build());
    }
}

//  .log("com.example.pancheck.service.impl.PanCheckServiceImpl", Level.INFO)

// .map(response -> ResponseEntity.ok(response))
//        .defaultIfEmpty(ResponseEntity.badRequest().build());