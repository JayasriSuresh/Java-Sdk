
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.link;

import javax.annotation.Nonnull;
import com.sap.cloud.sdk.datamodel.odata.helper.EntityLink;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmObject;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.Role;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.RoleSelectable;


/**
 * Template class to represent entity navigation links of {@link com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.Role Role} to other entities. Instances of this object are used in query modifier methods of the entity
 * fluent helpers. Contains methods to compare a field's value with a provided value.
 * 
 * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData
 * field names, so use the constructor with caution.
 * 
 * @param <ObjectT>
 * Entity type of subclasses from {@link com.sap.cloud.sdk.datamodel.odata.helper.VdmObject VdmObject}.
 * 
 */
public class RoleLink<ObjectT extends VdmObject<?> >
    extends EntityLink<RoleLink<ObjectT> , Role, ObjectT>
    implements RoleSelectable
{


    /**
     * Use the constants declared in each entity inner class. Instantiating directly requires knowing the underlying OData field names, so use with caution.
     * 
     * @param fieldName
     *     OData navigation field name. Must match the field returned by the underlying OData service.
     */
    public RoleLink(final String fieldName) {
        super(fieldName);
    }

    private RoleLink(final EntityLink<RoleLink<ObjectT> , Role, ObjectT> toClone) {
        super(toClone);
    }

    @Nonnull
    @Override
    protected RoleLink<ObjectT> translateLinkType(final EntityLink<RoleLink<ObjectT> , Role, ObjectT> link) {
        return new RoleLink<ObjectT>(link);
    }

}
