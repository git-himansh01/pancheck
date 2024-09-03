package com.example.pancheck.request;

import lombok.Data;
import reactor.core.publisher.Mono;

@Data
public class NsdlPanCheckRequest {

    private String firstName;
    private String lastName;
    private String pan;
    private String journeyId;
    private String journeyType;

    public NsdlPanCheckRequest dtoMapper(UserPanCheckRequest user){
        NsdlPanCheckRequest nsdlPanCheckRequest = new NsdlPanCheckRequest();

        nsdlPanCheckRequest.setFirstName(user.getFirstName());
        nsdlPanCheckRequest.setLastName(user.getLastName());
        nsdlPanCheckRequest.setPan(user.getPan());
        nsdlPanCheckRequest.setJourneyId("Alpha-Beta-Gamma");
        nsdlPanCheckRequest.setJourneyType("Dummy Project");

        return nsdlPanCheckRequest;
    }


}
