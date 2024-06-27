
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
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.field.CustomerCompanyTextField;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.CustomerCompanyTextSelectable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Customer Company Text<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerCompanyTextType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class CustomerCompanyText
    extends VdmEntity<CustomerCompanyText>
{

    /**
     * Selector for all available fields of CustomerCompanyText.
     * 
     */
    public final static CustomerCompanyTextSelectable ALL_FIELDS = () -> "*";
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @return
     *     Customer Number
     */
    @Key
    @SerializedName("Customer")
    @JsonProperty("Customer")
    @Nullable
    @ODataField(odataName = "Customer")
    private String customer;
    /**
     * Use with available fluent helpers to apply the <b>Customer</b> field to query operations.
     * 
     */
    public final static CustomerCompanyTextField<String> CUSTOMER = new CustomerCompanyTextField<String>("Customer");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @return
     *     Company Code
     */
    @Key
    @SerializedName("CompanyCode")
    @JsonProperty("CompanyCode")
    @Nullable
    @ODataField(odataName = "CompanyCode")
    private String companyCode;
    /**
     * Use with available fluent helpers to apply the <b>CompanyCode</b> field to query operations.
     * 
     */
    public final static CustomerCompanyTextField<String> COMPANY_CODE = new CustomerCompanyTextField<String>("CompanyCode");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @return
     *     Language key
     */
    @Key
    @SerializedName("Language")
    @JsonProperty("Language")
    @Nullable
    @ODataField(odataName = "Language")
    private String language;
    /**
     * Use with available fluent helpers to apply the <b>Language</b> field to query operations.
     * 
     */
    public final static CustomerCompanyTextField<String> LANGUAGE = new CustomerCompanyTextField<String>("Language");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>LongTextID</b></p>
     * 
     * @return
     *     Text ID
     */
    @Key
    @SerializedName("LongTextID")
    @JsonProperty("LongTextID")
    @Nullable
    @ODataField(odataName = "LongTextID")
    private String textID;
    /**
     * Use with available fluent helpers to apply the <b>LongTextID</b> field to query operations.
     * 
     */
    public final static CustomerCompanyTextField<String> TEXT_ID = new CustomerCompanyTextField<String>("LongTextID");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>LongText</b></p>
     * 
     * @return
     *     String
     */
    @SerializedName("LongText")
    @JsonProperty("LongText")
    @Nullable
    @ODataField(odataName = "LongText")
    private String string;
    /**
     * Use with available fluent helpers to apply the <b>LongText</b> field to query operations.
     * 
     */
    public final static CustomerCompanyTextField<String> STRING = new CustomerCompanyTextField<String>("LongText");

    @Nonnull
    @Override
    public Class<CustomerCompanyText> getType() {
        return CustomerCompanyText.class;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 10 <p>Original property name from the Odata EDM: <b>Customer</b></p>
     * 
     * @param customer
     *     Customer Number
     */
    public void setCustomer(
        @Nullable
        final String customer) {
        rememberChangedField("Customer", this.customer);
        this.customer = customer;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>CompanyCode</b></p>
     * 
     * @param companyCode
     *     Company Code
     */
    public void setCompanyCode(
        @Nullable
        final String companyCode) {
        rememberChangedField("CompanyCode", this.companyCode);
        this.companyCode = companyCode;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>Language</b></p>
     * 
     * @param language
     *     Language key
     */
    public void setLanguage(
        @Nullable
        final String language) {
        rememberChangedField("Language", this.language);
        this.language = language;
    }

    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>LongTextID</b></p>
     * 
     * @param textID
     *     Text ID
     */
    public void setTextID(
        @Nullable
        final String textID) {
        rememberChangedField("LongTextID", this.textID);
        this.textID = textID;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>LongText</b></p>
     * 
     * @param string
     *     String
     */
    public void setString(
        @Nullable
        final String string) {
        rememberChangedField("LongText", this.string);
        this.string = string;
    }

    @Override
    protected String getEntityCollection() {
        return "A_CustomerCompanyText";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("CompanyCode", getCompanyCode());
        result.put("Language", getLanguage());
        result.put("LongTextID", getTextID());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("CompanyCode", getCompanyCode());
        values.put("Language", getLanguage());
        values.put("LongTextID", getTextID());
        values.put("LongText", getString());
        return values;
    }

    @Override
    protected void fromMap(final Map<String, Object> inputValues) {
        final Map<String, Object> values = Maps.newHashMap(inputValues);
        // simple properties
        {
            if (values.containsKey("Customer")) {
                final Object value = values.remove("Customer");
                if ((value == null)||(!value.equals(getCustomer()))) {
                    setCustomer(((String) value));
                }
            }
            if (values.containsKey("CompanyCode")) {
                final Object value = values.remove("CompanyCode");
                if ((value == null)||(!value.equals(getCompanyCode()))) {
                    setCompanyCode(((String) value));
                }
            }
            if (values.containsKey("Language")) {
                final Object value = values.remove("Language");
                if ((value == null)||(!value.equals(getLanguage()))) {
                    setLanguage(((String) value));
                }
            }
            if (values.containsKey("LongTextID")) {
                final Object value = values.remove("LongTextID");
                if ((value == null)||(!value.equals(getTextID()))) {
                    setTextID(((String) value));
                }
            }
            if (values.containsKey("LongText")) {
                final Object value = values.remove("LongText");
                if ((value == null)||(!value.equals(getString()))) {
                    setString(((String) value));
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
    public static<T >CustomerCompanyTextField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new CustomerCompanyTextField<T>(fieldName);
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
    public static<T,DomainT >CustomerCompanyTextField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new CustomerCompanyTextField<T>(fieldName, typeConverter);
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
