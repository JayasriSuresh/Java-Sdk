
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperRead;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.BusinessPartnerAddressDependentTaxNumbersSelectable;


/**
 * Fluent helper to fetch multiple {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.BusinessPartnerAddressDependentTaxNumbers BusinessPartnerAddressDependentTaxNumbers} entities. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class BusinessPartnerAddressDependentTaxNumbersFluentHelper
    extends FluentHelperRead<BusinessPartnerAddressDependentTaxNumbersFluentHelper, BusinessPartnerAddressDependentTaxNumbers, BusinessPartnerAddressDependentTaxNumbersSelectable>
{


    /**
     * Creates a fluent helper using the specified service path and entity collection to send the read requests.
     * 
     * @param entityCollection
     *     The entity collection to direct the requests to.
     * @param servicePath
     *     The service path to direct the read requests to.
     */
    public BusinessPartnerAddressDependentTaxNumbersFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
    }

    @Override
    @Nonnull
    protected Class<BusinessPartnerAddressDependentTaxNumbers> getEntityClass() {
        return BusinessPartnerAddressDependentTaxNumbers.class;
    }

}
