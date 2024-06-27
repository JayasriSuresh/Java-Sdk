
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.CustomerSalesAreaAddressDependentInformation;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.CustomerSalesAreaAddressDependentInformationSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.CustomerSalesAreaAddressDependentInformation CustomerSalesAreaAddressDependentInformation} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class CustomerSalesAreaAddressDependentInformationLink<ObjectT extends VdmObject<?> >
    extends EntityLink<CustomerSalesAreaAddressDependentInformationLink<ObjectT> , CustomerSalesAreaAddressDependentInformation, ObjectT>
    implements CustomerSalesAreaAddressDependentInformationSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public CustomerSalesAreaAddressDependentInformationLink(final String fieldName) {
        super(fieldName);
    }

    private CustomerSalesAreaAddressDependentInformationLink(final EntityLink<CustomerSalesAreaAddressDependentInformationLink<ObjectT> , CustomerSalesAreaAddressDependentInformation, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected CustomerSalesAreaAddressDependentInformationLink<ObjectT> translateLinkType(final EntityLink<CustomerSalesAreaAddressDependentInformationLink<ObjectT> , CustomerSalesAreaAddressDependentInformation, ObjectT> link) {
        return new CustomerSalesAreaAddressDependentInformationLink<ObjectT>(link);
    }

}
