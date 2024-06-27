package com.sdk2.thirdtrial.Control;

import com.google.gson.Gson;
import com.sap.cloud.sdk.cloudplatform.connectivity.DefaultDestination;
import com.sap.cloud.sdk.cloudplatform.connectivity.HttpDestination;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.BusinessPartner;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.services.DefaultAPIBUSINESSPARTNERService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BpControl {
    private static final String APIKEY_HEADER = "apikey";
    private static final String SANDBOX_APIKEY = "QB008HaGZYwEZEGbnVyBoceOk8VB1wlR";

    @GetMapping("/getBusinessPartnersVDM")
    public String getBusinessPartnersVDM()
    {
        final HttpDestination destination = DefaultDestination.builder()
                                                 .property("Name", "myDestination")
                                                 .property("URL", "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/API_BUSINESS_PARTNER")
                                                 .property("Type", "HTTP")
                                                 .property("Authentication", "NoAuthentication")
                                                 .build().asHttp();

        final List<BusinessPartner> businessPartners =
                new DefaultAPIBUSINESSPARTNERService()
                        .getAllBusinessPartner()
                        .top(1)
                        .withHeader(APIKEY_HEADER, SANDBOX_APIKEY)
                        .executeRequest(destination);

        return new Gson().toJson(businessPartners);
    }

}
