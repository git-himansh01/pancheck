package com.example.pancheck.controller;

import com.example.pancheck.request.NsdlPanCheckRequest;
import com.example.pancheck.request.UserPanCheckRequest;
import com.example.pancheck.response.NsdlPanCheckResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api")
public class NsdlController {

    @PostMapping("/verify-user")
    public Mono<NsdlPanCheckResponse> verifyUserDetails(@RequestBody NsdlPanCheckRequest nsdlPanCheckRequest) {
        NsdlPanCheckResponse nsdlPanCheckResponse = new NsdlPanCheckResponse("Himanshu", "Gupta");
        nsdlPanCheckResponse.setPanMatchingScore("E");
        nsdlPanCheckResponse.setJourneyId(nsdlPanCheckRequest.getJourneyId());
        nsdlPanCheckResponse.setJourneyType(nsdlPanCheckRequest.getJourneyType());

        return Mono.just(nsdlPanCheckResponse);
    }
}












//
//@RestController
//@RequestMapping("/api")
//public class MockApiController {
//
//    @GetMapping("/mock-users")
//    public Mono<List<User>> getMockUsers() {
//        List<User> users = Arrays.asList(
//                new User(1, "Leanne Graham", "Bret", "Sincere@april.biz"),
//                new User(2, "Ervin Howell", "Antonette", "Shanna@melissa.tv")
//        );
//        return Mono.just(users);
//    }
//}