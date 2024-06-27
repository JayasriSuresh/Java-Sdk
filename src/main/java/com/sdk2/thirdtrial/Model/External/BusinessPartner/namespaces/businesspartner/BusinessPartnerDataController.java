
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.field.BusinessPartnerDataControllerField;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.BusinessPartnerDataControllerSelectable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Business Partner Data Controller<p></p><p>Original entity name from the Odata EDM: <b>A_BPDataControllerType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerDataController
    extends VdmEntity<BusinessPartnerDataController>
{

    /**
     * Selector for all available fields of BusinessPartnerDataController.
     * 
     */
    public final static BusinessPartnerDataControllerSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @return
     *     Business Partner Number
     */
    @Key
    @SerializedName("BusinessPartner")
    @JsonProperty("BusinessPartner")
    @Nullable
    @ODataField(odataName = "BusinessPartner")
    private String businessPartner;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPartner</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> BUSINESS_PARTNER = new BusinessPartnerDataControllerField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>DataController</b></p>
     * 
     * @return
     *     BP: Data Controller
     */
    @Key
    @SerializedName("DataController")
    @JsonProperty("DataController")
    @Nullable
    @ODataField(odataName = "DataController")
    private String dataController;
    /**
     * Use with available fluent helpers to apply the <b>DataController</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> DATA_CONTROLLER = new BusinessPartnerDataControllerField<String>("DataController");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>PurposeForPersonalData</b></p>
     * 
     * @return
     *     BP: Purpose
     */
    @Key
    @SerializedName("PurposeForPersonalData")
    @JsonProperty("PurposeForPersonalData")
    @Nullable
    @ODataField(odataName = "PurposeForPersonalData")
    private String purpose;
    /**
     * Use with available fluent helpers to apply the <b>PurposeForPersonalData</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> PURPOSE = new BusinessPartnerDataControllerField<String>("PurposeForPersonalData");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DataControlAssignmentStatus</b></p>
     * 
     * @return
     *     BP: Data Controller Purpose Assignment Status
     */
    @SerializedName("DataControlAssignmentStatus")
    @JsonProperty("DataControlAssignmentStatus")
    @Nullable
    @ODataField(odataName = "DataControlAssignmentStatus")
    private String asgmtStatus;
    /**
     * Use with available fluent helpers to apply the <b>DataControlAssignmentStatus</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> ASGMT_STATUS = new BusinessPartnerDataControllerField<String>("DataControlAssignmentStatus");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BPDataControllerIsDerived</b></p>
     * 
     * @return
     *     BP: Derivation Indicator for Data Controller (DC)
     */
    @SerializedName("BPDataControllerIsDerived")
    @JsonProperty("BPDataControllerIsDerived")
    @Nullable
    @ODataField(odataName = "BPDataControllerIsDerived")
    private String dCDervInd;
    /**
     * Use with available fluent helpers to apply the <b>BPDataControllerIsDerived</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> DC_DERV_IND = new BusinessPartnerDataControllerField<String>("BPDataControllerIsDerived");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PurposeDerived</b></p>
     * 
     * @return
     *     BP: Derivation Indicator for Purpose
     */
    @SerializedName("PurposeDerived")
    @JsonProperty("PurposeDerived")
    @Nullable
    @ODataField(odataName = "PurposeDerived")
    private String purDervInd;
    /**
     * Use with available fluent helpers to apply the <b>PurposeDerived</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> PUR_DERV_IND = new BusinessPartnerDataControllerField<String>("PurposeDerived");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PurposeType</b></p>
     * 
     * @return
     *     BP: Purpose Type
     */
    @SerializedName("PurposeType")
    @JsonProperty("PurposeType")
    @Nullable
    @ODataField(odataName = "PurposeType")
    private String purposeType;
    /**
     * Use with available fluent helpers to apply the <b>PurposeType</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> PURPOSE_TYPE = new BusinessPartnerDataControllerField<String>("PurposeType");
    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BusinessPurposeFlag</b></p>
     * 
     * @return
     *     Business Purpose Completed Flag
     */
    @SerializedName("BusinessPurposeFlag")
    @JsonProperty("BusinessPurposeFlag")
    @Nullable
    @ODataField(odataName = "BusinessPurposeFlag")
    private String purposeCompleted;
    /**
     * Use with available fluent helpers to apply the <b>BusinessPurposeFlag</b> field to query operations.
     * 
     */
    public final static BusinessPartnerDataControllerField<String> PURPOSE_COMPLETED = new BusinessPartnerDataControllerField<String>("BusinessPurposeFlag");

    @Nonnull
    @Override
    public Class<BusinessPartnerDataController> getType() {
        return BusinessPartnerDataController.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>BusinessPartner</b></p>
     * 
     * @param businessPartner
     *     Business Partner Number
     */
    public void setBusinessPartner(
        @Nullable
        final String businessPartner) {
        rememberChangedField("BusinessPartner", this.businessPartner);
        this.businessPartner = businessPartner;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>DataController</b></p>
     * 
     * @param dataController
     *     BP: Data Controller
     */
    public void setDataController(
        @Nullable
        final String dataController) {
        rememberChangedField("DataController", this.dataController);
        this.dataController = dataController;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 30 <p>Original property name from the Odata EDM: <b>PurposeForPersonalData</b></p>
     * 
     * @param purpose
     *     BP: Purpose
     */
    public void setPurpose(
        @Nullable
        final String purpose) {
        rememberChangedField("PurposeForPersonalData", this.purpose);
        this.purpose = purpose;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>DataControlAssignmentStatus</b></p>
     * 
     * @param asgmtStatus
     *     BP: Data Controller Purpose Assignment Status
     */
    public void setAsgmtStatus(
        @Nullable
        final String asgmtStatus) {
        rememberChangedField("DataControlAssignmentStatus", this.asgmtStatus);
        this.asgmtStatus = asgmtStatus;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BPDataControllerIsDerived</b></p>
     * 
     * @param dCDervInd
     *     BP: Derivation Indicator for Data Controller (DC)
     */
    public void setDCDervInd(
        @Nullable
        final String dCDervInd) {
        rememberChangedField("BPDataControllerIsDerived", this.dCDervInd);
        this.dCDervInd = dCDervInd;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PurposeDerived</b></p>
     * 
     * @param purDervInd
     *     BP: Derivation Indicator for Purpose
     */
    public void setPurDervInd(
        @Nullable
        final String purDervInd) {
        rememberChangedField("PurposeDerived", this.purDervInd);
        this.purDervInd = purDervInd;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>PurposeType</b></p>
     * 
     * @param purposeType
     *     BP: Purpose Type
     */
    public void setPurposeType(
        @Nullable
        final String purposeType) {
        rememberChangedField("PurposeType", this.purposeType);
        this.purposeType = purposeType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 1 <p>Original property name from the Odata EDM: <b>BusinessPurposeFlag</b></p>
     * 
     * @param purposeCompleted
     *     Business Purpose Completed Flag
     */
    public void setPurposeCompleted(
        @Nullable
        final String purposeCompleted) {
        rememberChangedField("BusinessPurposeFlag", this.purposeCompleted);
        this.purposeCompleted = purposeCompleted;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BPDataController";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("DataController", getDataController());
        result.put("PurposeForPersonalData", getPurpose());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("DataController", getDataController());
        values.put("PurposeForPersonalData", getPurpose());
        values.put("DataControlAssignmentStatus", getAsgmtStatus());
        values.put("BPDataControllerIsDerived", getDCDervInd());
        values.put("PurposeDerived", getPurDervInd());
        values.put("PurposeType", getPurposeType());
        values.put("BusinessPurposeFlag", getPurposeCompleted());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("BusinessPartner")) {
                final Object value = values.remove("BusinessPartner");
                if ((value == null)||(!value.equals(getBusinessPartner()))) {
                    setBusinessPartner(((String) value));
                }
            }
            if (values.containsKey("DataController")) {
                final Object value = values.remove("DataController");
                if ((value == null)||(!value.equals(getDataController()))) {
                    setDataController(((String) value));
                }
            }
            if (values.containsKey("PurposeForPersonalData")) {
                final Object value = values.remove("PurposeForPersonalData");
                if ((value == null)||(!value.equals(getPurpose()))) {
                    setPurpose(((String) value));
                }
            }
            if (values.containsKey("DataControlAssignmentStatus")) {
                final Object value = values.remove("DataControlAssignmentStatus");
                if ((value == null)||(!value.equals(getAsgmtStatus()))) {
                    setAsgmtStatus(((String) value));
                }
            }
            if (values.containsKey("BPDataControllerIsDerived")) {
                final Object value = values.remove("BPDataControllerIsDerived");
                if ((value == null)||(!value.equals(getDCDervInd()))) {
                    setDCDervInd(((String) value));
                }
            }
            if (values.containsKey("PurposeDerived")) {
                final Object value = values.remove("PurposeDerived");
                if ((value == null)||(!value.equals(getPurDervInd()))) {
                    setPurDervInd(((String) value));
                }
            }
            if (values.containsKey("PurposeType")) {
                final Object value = values.remove("PurposeType");
                if ((value == null)||(!value.equals(getPurposeType()))) {
                    setPurposeType(((String) value));
                }
            }
            if (values.containsKey("BusinessPurposeFlag")) {
                final Object value = values.remove("BusinessPurposeFlag");
                if ((value == null)||(!value.equals(getPurposeCompleted()))) {
                    setPurposeCompleted(((String) value));
                }
            }
        }
        // structured properties
        {
        }
        // navigation properties
        {
        }
        super.fromMap(values);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param fieldType
     *     The Java type to use for the extension field when performing value comparisons.
     * @return
     *     A representation of an extension field from this entity.
     */
    @Nonnull
    public static<T >BusinessPartnerDataControllerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerDataControllerField<T>(fieldName);
    }

    /**
     * Use with available fluent helpers to apply an extension field to query operations.
     * 
     * @param typeConverter
     *     A TypeConverter<T, DomainT> instance whose first generic type matches the Java type of the field
     * @param fieldName
     *     The name of the extension field as returned by the OData service.
     * @param <T>
     *     The type of the extension field when performing value comparisons.
     * @param <DomainT>
     *     The type of the extension field as returned by the OData service.
     * @return
     *     A representation of an extension field from this entity, holding a reference to the given TypeConverter.
     */
    @Nonnull
    public static<T,DomainT >BusinessPartnerDataControllerField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerDataControllerField<T>(fieldName, typeConverter);
    }

    @Override
    @Nullable
    public Destination getDestinationForFetch() {
        return super.getDestinationForFetch();
    }

    @Override
    protected void setServicePathForFetch(
        @Nullable
        final String servicePathForFetch) {
        super.setServicePathForFetch(servicePathForFetch);
    }

    @Override
    public void attachToService(
        @Nullable
        final String servicePath,
        @Nonnull
        final Destination destination) {
        super.attachToService(servicePath, destination);
    }

    @Override
    protected String getDefaultServicePath() {
        return (com.sdk2.thirdtrial.Model.External.BusinessPartner.services.APIBUSINESSPARTNERService.DEFAULT_SERVICE_PATH);
    }

}
