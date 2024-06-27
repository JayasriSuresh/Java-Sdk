
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperUpdate;


/**
 * Fluent helper to update an existing {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.TaxNumber TaxNumber} entity and save it to the S/4HANA system.<p>
 * To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
 * 
 */
public class TaxNumberUpdateFluentHelper
    extends FluentHelperUpdate<TaxNumberUpdateFluentHelper, TaxNumber>
{

    /**
     * {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.TaxNumber TaxNumber} entity object that will be updated in the S/4HANA system.
     * 
     */
    private final TaxNumber entity;

    /**
     * Creates a fluent helper object that will update a {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.TaxNumber TaxNumber} entity on the OData endpoint. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param servicePath
     *     The service path to direct the update requests to.
     * @param entity
     *     The TaxNumber to take the updated values from.
     */
    public TaxNumberUpdateFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final TaxNumber entity,
        @Nonnull
        final String entityCollection) {
        super(servicePath, entityCollection);
        this.entity = entity;
    }

    @Override
    @Nonnull
    protected TaxNumber getEntity() {
        return entity;
    }

}
