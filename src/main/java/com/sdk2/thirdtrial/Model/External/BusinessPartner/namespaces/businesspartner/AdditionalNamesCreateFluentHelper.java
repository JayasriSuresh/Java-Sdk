
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperCreate;


/**
 * Fluent helper to create a new {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.AdditionalNames AdditionalNames} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class AdditionalNamesCreateFluentHelper
    extends FluentHelperCreate<AdditionalNamesCreateFluentHelper, AdditionalNames>
{

    /**
     * {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.AdditionalNames AdditionalNames} entity object that will be created in the S/4HANA system.
     * 
     */
    private final AdditionalNames entity;

    /**
     * Creates a fluent helper object that will create a {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.AdditionalNames AdditionalNames} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection  to direct the create requests to.
     * @param servicePath
     *     The service path to direct the create requests to.
     * @param entity
     *     The AdditionalNames to create.
     */
    public AdditionalNamesCreateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final AdditionalNames entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected AdditionalNames getEntity() {
        return entity;
    }

}
