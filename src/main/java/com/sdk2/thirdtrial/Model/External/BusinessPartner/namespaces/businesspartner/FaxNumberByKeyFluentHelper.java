
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.FaxNumberSelectable;


/**
 * Fluent helper to fetch a single {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.FaxNumber FaxNumber} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class FaxNumberByKeyFluentHelper
    extends FluentHelperByKey<FaxNumberByKeyFluentHelper, FaxNumber, FaxNumberSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.FaxNumber FaxNumber} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code FaxNumber}
     * @param sequenceNumber
     *     Sequence Number<p>Constraints: Not nullable, Maximum length: 3</p>
     * @param servicePath
     *     Service path to be used to fetch a single {@code FaxNumber}
     * @param addressNumber
     *     Address Number<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param personNumber
     *     Person Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public FaxNumberByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String addressNumber, final String personNumber, final String sequenceNumber) {
        super(servicePath, entityCollection);
        this.key.put("AddressID", addressNumber);
        this.key.put("Person", personNumber);
        this.key.put("OrdinalNumber", sequenceNumber);
    }

    @Override
    @Nonnull
    protected Class<FaxNumber> getEntityClass() {
        return FaxNumber.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
