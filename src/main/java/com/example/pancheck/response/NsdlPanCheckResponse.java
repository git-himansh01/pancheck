package com.example.pancheck.response;

import com.example.pancheck.request.NsdlPanCheckRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NsdlPanCheckResponse {

    private String firstName;
    private String lastName;
    private String panMatchingScore;
    private String journeyId;
    private String journeyType;



    public NsdlPanCheckResponse(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    public NsdlPanCheckResponse nsdlReqToResMapper(NsdlPanCheckRequest nsdlPanCheckRequest){
//        NsdlPanCheckResponse nsdlPanCheckResponse = new NsdlPanCheckResponse();
//        nsdlPanCheckResponse.setFirstName(nsdlPanCheckRequest.getFirstName());
//        nsdlPanCheckResponse.setLastName(nsdlPanCheckRequest.getLastName());
//        nsdlPanCheckResponse.setJourneyId(nsdlPanCheckRequest.getJourneyId());
//
//        return nsdlPanCheckResponse;
//    }
}

