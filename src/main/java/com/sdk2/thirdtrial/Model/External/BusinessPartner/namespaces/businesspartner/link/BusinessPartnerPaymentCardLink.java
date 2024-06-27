
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.BusinessPartnerPaymentCard;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.BusinessPartnerPaymentCardSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.BusinessPartnerPaymentCard BusinessPartnerPaymentCard} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class BusinessPartnerPaymentCardLink<ObjectT extends VdmObject<?> >
    extends EntityLink<BusinessPartnerPaymentCardLink<ObjectT> , BusinessPartnerPaymentCard, ObjectT>
    implements BusinessPartnerPaymentCardSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public BusinessPartnerPaymentCardLink(final String fieldName) {
        super(fieldName);
    }

    private BusinessPartnerPaymentCardLink(final EntityLink<BusinessPartnerPaymentCardLink<ObjectT> , BusinessPartnerPaymentCard, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected BusinessPartnerPaymentCardLink<ObjectT> translateLinkType(final EntityLink<BusinessPartnerPaymentCardLink<ObjectT> , BusinessPartnerPaymentCard, ObjectT> link) {
        return new BusinessPartnerPaymentCardLink<ObjectT>(link);
    }

}
