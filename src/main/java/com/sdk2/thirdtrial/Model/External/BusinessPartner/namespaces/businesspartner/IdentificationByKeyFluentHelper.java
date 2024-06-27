
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.IdentificationSelectable;


/**
 * Fluent helper to fetch a single {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.Identification Identification} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class IdentificationByKeyFluentHelper
    extends FluentHelperByKey<IdentificationByKeyFluentHelper, Identification, IdentificationSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.Identification Identification} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code Identification}
     * @param iDNumber
     *     Identification Number<p>Constraints: Not nullable, Maximum length: 60</p>
     * @param businessPartner
     *     Business Partner Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code Identification}
     * @param identificationType
     *     Identification Type<p>Constraints: Not nullable, Maximum length: 6</p>
     */
    public IdentificationByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String businessPartner, final String identificationType, final String iDNumber) {
        super(servicePath, entityCollection);
        this.key.put("BusinessPartner", businessPartner);
        this.key.put("BPIdentificationType", identificationType);
        this.key.put("BPIdentificationNumber", iDNumber);
    }

    @Override
    @Nonnull
    protected Class<Identification> getEntityClass() {
        return Identification.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
