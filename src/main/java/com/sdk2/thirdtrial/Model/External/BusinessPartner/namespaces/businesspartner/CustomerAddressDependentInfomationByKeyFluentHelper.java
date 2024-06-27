
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import com.google.common.collect.Maps;
import com.sap.cloud.sdk.datamodel.odata.helper.FluentHelperByKey;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.CustomerAddressDependentInfomationSelectable;


/**
 * Fluent helper to fetch a single {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.CustomerAddressDependentInfomation CustomerAddressDependentInfomation} entity using key fields. This fluent helper allows methods which modify the underlying query to be called before executing the query itself. 
 * 
 */
public class CustomerAddressDependentInfomationByKeyFluentHelper
    extends FluentHelperByKey<CustomerAddressDependentInfomationByKeyFluentHelper, CustomerAddressDependentInfomation, CustomerAddressDependentInfomationSelectable>
{

    private final Map<String, Object> key = Maps.newHashMap();

    /**
     * Creates a fluent helper object that will fetch a single {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.CustomerAddressDependentInfomation CustomerAddressDependentInfomation} entity with the provided key field values. To perform execution, call the {@link #executeRequest executeRequest} method on the fluent helper object.
     * 
     * @param entityCollection
     *     Entity Collection to be used to fetch a single {@code CustomerAddressDependentInfomation}
     * @param servicePath
     *     Service path to be used to fetch a single {@code CustomerAddressDependentInfomation}
     * @param addressNumber
     *     Business Partner Address Number (from BUT020)<p>Constraints: Not nullable, Maximum length: 10</p>
     * @param customer
     *     Customer Number<p>Constraints: Not nullable, Maximum length: 10</p>
     */
    public CustomerAddressDependentInfomationByKeyFluentHelper(
        @Nonnull
        final String servicePath,
        @Nonnull
        final String entityCollection, final String customer, final String addressNumber) {
        super(servicePath, entityCollection);
        this.key.put("Customer", customer);
        this.key.put("AddressID", addressNumber);
    }

    @Override
    @Nonnull
    protected Class<CustomerAddressDependentInfomation> getEntityClass() {
        return CustomerAddressDependentInfomation.class;
    }

    @Override
    @Nonnull
    protected Map<String, Object> getKey() {
        return key;
    }

}
