
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
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.field.BusinessPartnerAddressDependentTaxNumbersField;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.BusinessPartnerAddressDependentTaxNumbersSelectable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Business Partner Address Dependent Tax Numbers<p></p><p>Original entity name from the Odata EDM: <b>A_BusPartAddrDepdntTaxNmbrType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class BusinessPartnerAddressDependentTaxNumbers
    extends VdmEntity<BusinessPartnerAddressDependentTaxNumbers>
{

    /**
     * Selector for all available fields of BusinessPartnerAddressDependentTaxNumbers.
     * 
     */
    public final static BusinessPartnerAddressDependentTaxNumbersSelectable ALL_FIELDS = () -> "*";
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
    public final static BusinessPartnerAddressDependentTaxNumbersField<String> BUSINESS_PARTNER = new BusinessPartnerAddressDependentTaxNumbersField<String>("BusinessPartner");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @return
     *     Address Number
     */
    @Key
    @SerializedName("AddressID")
    @JsonProperty("AddressID")
    @Nullable
    @ODataField(odataName = "AddressID")
    private String addressNumber;
    /**
     * Use with available fluent helpers to apply the <b>AddressID</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentTaxNumbersField<String> ADDRESS_NUMBER = new BusinessPartnerAddressDependentTaxNumbersField<String>("AddressID");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BPTaxType</b></p>
     * 
     * @return
     *     Tax Number Category
     */
    @Key
    @SerializedName("BPTaxType")
    @JsonProperty("BPTaxType")
    @Nullable
    @ODataField(odataName = "BPTaxType")
    private String taxNumberCategory;
    /**
     * Use with available fluent helpers to apply the <b>BPTaxType</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentTaxNumbersField<String> TAX_NUMBER_CATEGORY = new BusinessPartnerAddressDependentTaxNumbersField<String>("BPTaxType");
    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BPTaxNumber</b></p>
     * 
     * @return
     *     Business Partner Tax Number
     */
    @SerializedName("BPTaxNumber")
    @JsonProperty("BPTaxNumber")
    @Nullable
    @ODataField(odataName = "BPTaxNumber")
    private String taxNumber;
    /**
     * Use with available fluent helpers to apply the <b>BPTaxNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentTaxNumbersField<String> TAX_NUMBER = new BusinessPartnerAddressDependentTaxNumbersField<String>("BPTaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BPTaxLongNumber</b></p>
     * 
     * @return
     *     Business Partner Tax Number
     */
    @SerializedName("BPTaxLongNumber")
    @JsonProperty("BPTaxLongNumber")
    @Nullable
    @ODataField(odataName = "BPTaxLongNumber")
    private String taxNumberLong;
    /**
     * Use with available fluent helpers to apply the <b>BPTaxLongNumber</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentTaxNumbersField<String> TAX_NUMBER_LONG = new BusinessPartnerAddressDependentTaxNumbersField<String>("BPTaxLongNumber");
    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AuthorizationGroup</b></p>
     * 
     * @return
     *     Authorization Group
     */
    @SerializedName("AuthorizationGroup")
    @JsonProperty("AuthorizationGroup")
    @Nullable
    @ODataField(odataName = "AuthorizationGroup")
    private String authorizationGroup;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationGroup</b> field to query operations.
     * 
     */
    public final static BusinessPartnerAddressDependentTaxNumbersField<String> AUTHORIZATION_GROUP = new BusinessPartnerAddressDependentTaxNumbersField<String>("AuthorizationGroup");

    @Nonnull
    @Override
    public Class<BusinessPartnerAddressDependentTaxNumbers> getType() {
        return BusinessPartnerAddressDependentTaxNumbers.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>AddressID</b></p>
     * 
     * @param addressNumber
     *     Address Number
     */
    public void setAddressNumber(
        @Nullable
        final String addressNumber) {
        rememberChangedField("AddressID", this.addressNumber);
        this.addressNumber = addressNumber;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>BPTaxType</b></p>
     * 
     * @param taxNumberCategory
     *     Tax Number Category
     */
    public void setTaxNumberCategory(
        @Nullable
        final String taxNumberCategory) {
        rememberChangedField("BPTaxType", this.taxNumberCategory);
        this.taxNumberCategory = taxNumberCategory;
    }

    /**
     * Constraints: Not nullable, Maximum length: 20 <p>Original property name from the Odata EDM: <b>BPTaxNumber</b></p>
     * 
     * @param taxNumber
     *     Business Partner Tax Number
     */
    public void setTaxNumber(
        @Nullable
        final String taxNumber) {
        rememberChangedField("BPTaxNumber", this.taxNumber);
        this.taxNumber = taxNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 60 <p>Original property name from the Odata EDM: <b>BPTaxLongNumber</b></p>
     * 
     * @param taxNumberLong
     *     Business Partner Tax Number
     */
    public void setTaxNumberLong(
        @Nullable
        final String taxNumberLong) {
        rememberChangedField("BPTaxLongNumber", this.taxNumberLong);
        this.taxNumberLong = taxNumberLong;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AuthorizationGroup</b></p>
     * 
     * @param authorizationGroup
     *     Authorization Group
     */
    public void setAuthorizationGroup(
        @Nullable
        final String authorizationGroup) {
        rememberChangedField("AuthorizationGroup", this.authorizationGroup);
        this.authorizationGroup = authorizationGroup;
    }

    @Override
    protected String getEntityCollection() {
        return "A_BusPartAddrDepdntTaxNmbr";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("BusinessPartner", getBusinessPartner());
        result.put("AddressID", getAddressNumber());
        result.put("BPTaxType", getTaxNumberCategory());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("BusinessPartner", getBusinessPartner());
        values.put("AddressID", getAddressNumber());
        values.put("BPTaxType", getTaxNumberCategory());
        values.put("BPTaxNumber", getTaxNumber());
        values.put("BPTaxLongNumber", getTaxNumberLong());
        values.put("AuthorizationGroup", getAuthorizationGroup());
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
            if (values.containsKey("AddressID")) {
                final Object value = values.remove("AddressID");
                if ((value == null)||(!value.equals(getAddressNumber()))) {
                    setAddressNumber(((String) value));
                }
            }
            if (values.containsKey("BPTaxType")) {
                final Object value = values.remove("BPTaxType");
                if ((value == null)||(!value.equals(getTaxNumberCategory()))) {
                    setTaxNumberCategory(((String) value));
                }
            }
            if (values.containsKey("BPTaxNumber")) {
                final Object value = values.remove("BPTaxNumber");
                if ((value == null)||(!value.equals(getTaxNumber()))) {
                    setTaxNumber(((String) value));
                }
            }
            if (values.containsKey("BPTaxLongNumber")) {
                final Object value = values.remove("BPTaxLongNumber");
                if ((value == null)||(!value.equals(getTaxNumberLong()))) {
                    setTaxNumberLong(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorizationGroup()))) {
                    setAuthorizationGroup(((String) value));
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
    public static<T >BusinessPartnerAddressDependentTaxNumbersField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new BusinessPartnerAddressDependentTaxNumbersField<T>(fieldName);
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
    public static<T,DomainT >BusinessPartnerAddressDependentTaxNumbersField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new BusinessPartnerAddressDependentTaxNumbersField<T>(fieldName, typeConverter);
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
