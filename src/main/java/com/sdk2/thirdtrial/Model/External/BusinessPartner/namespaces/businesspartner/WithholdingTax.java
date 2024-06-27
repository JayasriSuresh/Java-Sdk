
/*
 * Generated by OData VDM code generator of SAP Cloud SDK in version 5.9.0
 */

package com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.sap.cloud.sdk.cloudplatform.connectivity.Destination;
import com.sap.cloud.sdk.datamodel.odata.helper.VdmEntity;
import com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataField;
import com.sap.cloud.sdk.s4hana.datamodel.odata.annotation.Key;
import com.sap.cloud.sdk.typeconverter.TypeConverter;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.field.WithholdingTaxField;
import com.sdk2.thirdtrial.Model.External.BusinessPartner.namespaces.businesspartner.selectable.WithholdingTaxSelectable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


/**
 * Withholding Tax<p></p><p>Original entity name from the Odata EDM: <b>A_CustomerWithHoldingTaxType</b></p>
 * 
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true, callSuper = true)
@EqualsAndHashCode(doNotUseGetters = true, callSuper = true)
@JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataVdmEntityAdapterFactory.class)
public class WithholdingTax
    extends VdmEntity<WithholdingTax>
{

    /**
     * Selector for all available fields of WithholdingTax.
     * 
     */
    public final static WithholdingTaxSelectable ALL_FIELDS = () -> "*";
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
    public final static WithholdingTaxField<String> CUSTOMER = new WithholdingTaxField<String>("Customer");
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
    public final static WithholdingTaxField<String> COMPANY_CODE = new WithholdingTaxField<String>("CompanyCode");
    /**
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxType</b></p>
     * 
     * @return
     *     Indicator for Withholding Tax Type
     */
    @Key
    @SerializedName("WithholdingTaxType")
    @JsonProperty("WithholdingTaxType")
    @Nullable
    @ODataField(odataName = "WithholdingTaxType")
    private String withholdingTaxType;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxType</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<String> WITHHOLDING_TAX_TYPE = new WithholdingTaxField<String>("WithholdingTaxType");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxCode</b></p>
     * 
     * @return
     *     Withholding Tax Code
     */
    @SerializedName("WithholdingTaxCode")
    @JsonProperty("WithholdingTaxCode")
    @Nullable
    @ODataField(odataName = "WithholdingTaxCode")
    private String wTaxCode;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCode</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<String> W_TAX_CODE = new WithholdingTaxField<String>("WithholdingTaxCode");
    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>WithholdingTaxAgent</b></p>
     * 
     * @return
     *     Indicator: Withholding Tax Agent?
     */
    @SerializedName("WithholdingTaxAgent")
    @JsonProperty("WithholdingTaxAgent")
    @Nullable
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.ODataBooleanAdapter.class)
    @ODataField(odataName = "WithholdingTaxAgent")
    private Boolean wTaxAgent;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxAgent</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<Boolean> W_TAX_AGENT = new WithholdingTaxField<Boolean>("WithholdingTaxAgent");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateBegin</b></p>
     * 
     * @return
     *     Obligated to Withhold Tax From
     */
    @SerializedName("ObligationDateBegin")
    @JsonProperty("ObligationDateBegin")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ObligationDateBegin", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime wTaxObligatedFrm;
    /**
     * Use with available fluent helpers to apply the <b>ObligationDateBegin</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<LocalDateTime> W_TAX_OBLIGATED_FRM = new WithholdingTaxField<LocalDateTime>("ObligationDateBegin");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateEnd</b></p>
     * 
     * @return
     *     Obligated to Withhold Tax Until
     */
    @SerializedName("ObligationDateEnd")
    @JsonProperty("ObligationDateEnd")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ObligationDateEnd", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime obligtoWTaxUntil;
    /**
     * Use with available fluent helpers to apply the <b>ObligationDateEnd</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<LocalDateTime> OBLIGTO_W_TAX_UNTIL = new WithholdingTaxField<LocalDateTime>("ObligationDateEnd");
    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>WithholdingTaxNumber</b></p>
     * 
     * @return
     *     Withholding tax identification number
     */
    @SerializedName("WithholdingTaxNumber")
    @JsonProperty("WithholdingTaxNumber")
    @Nullable
    @ODataField(odataName = "WithholdingTaxNumber")
    private String wtaxNumber;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxNumber</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<String> WTAX_NUMBER = new WithholdingTaxField<String>("WithholdingTaxNumber");
    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>WithholdingTaxCertificate</b></p>
     * 
     * @return
     *     Exemption Certificate Number
     */
    @SerializedName("WithholdingTaxCertificate")
    @JsonProperty("WithholdingTaxCertificate")
    @Nullable
    @ODataField(odataName = "WithholdingTaxCertificate")
    private String exemptionNumber;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxCertificate</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<String> EXEMPTION_NUMBER = new WithholdingTaxField<String>("WithholdingTaxCertificate");
    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxExmptPercent</b></p>
     * 
     * @return
     *     Exemption Rate
     */
    @SerializedName("WithholdingTaxExmptPercent")
    @JsonProperty("WithholdingTaxExmptPercent")
    @Nullable
    @ODataField(odataName = "WithholdingTaxExmptPercent")
    private BigDecimal exemptionRate;
    /**
     * Use with available fluent helpers to apply the <b>WithholdingTaxExmptPercent</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<BigDecimal> EXEMPTION_RATE = new WithholdingTaxField<BigDecimal>("WithholdingTaxExmptPercent");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateBegin</b></p>
     * 
     * @return
     *     Date on Which Exemption Begins
     */
    @SerializedName("ExemptionDateBegin")
    @JsonProperty("ExemptionDateBegin")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ExemptionDateBegin", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptionStartDate;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionDateBegin</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<LocalDateTime> EXEMPTION_START_DATE = new WithholdingTaxField<LocalDateTime>("ExemptionDateBegin");
    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateEnd</b></p>
     * 
     * @return
     *     Date on Which Exemption Ends
     */
    @SerializedName("ExemptionDateEnd")
    @JsonProperty("ExemptionDateEnd")
    @Nullable
    @JsonSerialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeSerializer.class)
    @JsonDeserialize(using = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.JacksonLocalDateTimeDeserializer.class)
    @JsonAdapter(com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeAdapter.class)
    @ODataField(odataName = "ExemptionDateEnd", converter = com.sap.cloud.sdk.s4hana.datamodel.odata.adapter.LocalDateTimeCalendarConverter.class)
    private LocalDateTime exemptionEndDate;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionDateEnd</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<LocalDateTime> EXEMPTION_END_DATE = new WithholdingTaxField<LocalDateTime>("ExemptionDateEnd");
    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ExemptionReason</b></p>
     * 
     * @return
     *     Reason for Exemption
     */
    @SerializedName("ExemptionReason")
    @JsonProperty("ExemptionReason")
    @Nullable
    @ODataField(odataName = "ExemptionReason")
    private String exemptionReason;
    /**
     * Use with available fluent helpers to apply the <b>ExemptionReason</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<String> EXEMPTION_REASON = new WithholdingTaxField<String>("ExemptionReason");
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
    private String authorization;
    /**
     * Use with available fluent helpers to apply the <b>AuthorizationGroup</b> field to query operations.
     * 
     */
    public final static WithholdingTaxField<String> AUTHORIZATION = new WithholdingTaxField<String>("AuthorizationGroup");

    @Nonnull
    @Override
    public Class<WithholdingTax> getType() {
        return WithholdingTax.class;
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
     * (Key Field) Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxType</b></p>
     * 
     * @param withholdingTaxType
     *     Indicator for Withholding Tax Type
     */
    public void setWithholdingTaxType(
        @Nullable
        final String withholdingTaxType) {
        rememberChangedField("WithholdingTaxType", this.withholdingTaxType);
        this.withholdingTaxType = withholdingTaxType;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxCode</b></p>
     * 
     * @param wTaxCode
     *     Withholding Tax Code
     */
    public void setWTaxCode(
        @Nullable
        final String wTaxCode) {
        rememberChangedField("WithholdingTaxCode", this.wTaxCode);
        this.wTaxCode = wTaxCode;
    }

    /**
     * Constraints: none<p>Original property name from the Odata EDM: <b>WithholdingTaxAgent</b></p>
     * 
     * @param wTaxAgent
     *     Indicator: Withholding Tax Agent?
     */
    public void setWTaxAgent(
        @Nullable
        final Boolean wTaxAgent) {
        rememberChangedField("WithholdingTaxAgent", this.wTaxAgent);
        this.wTaxAgent = wTaxAgent;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateBegin</b></p>
     * 
     * @param wTaxObligatedFrm
     *     Obligated to Withhold Tax From
     */
    public void setWTaxObligatedFrm(
        @Nullable
        final LocalDateTime wTaxObligatedFrm) {
        rememberChangedField("ObligationDateBegin", this.wTaxObligatedFrm);
        this.wTaxObligatedFrm = wTaxObligatedFrm;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ObligationDateEnd</b></p>
     * 
     * @param obligtoWTaxUntil
     *     Obligated to Withhold Tax Until
     */
    public void setObligtoWTaxUntil(
        @Nullable
        final LocalDateTime obligtoWTaxUntil) {
        rememberChangedField("ObligationDateEnd", this.obligtoWTaxUntil);
        this.obligtoWTaxUntil = obligtoWTaxUntil;
    }

    /**
     * Constraints: Not nullable, Maximum length: 16 <p>Original property name from the Odata EDM: <b>WithholdingTaxNumber</b></p>
     * 
     * @param wtaxNumber
     *     Withholding tax identification number
     */
    public void setWtaxNumber(
        @Nullable
        final String wtaxNumber) {
        rememberChangedField("WithholdingTaxNumber", this.wtaxNumber);
        this.wtaxNumber = wtaxNumber;
    }

    /**
     * Constraints: Not nullable, Maximum length: 25 <p>Original property name from the Odata EDM: <b>WithholdingTaxCertificate</b></p>
     * 
     * @param exemptionNumber
     *     Exemption Certificate Number
     */
    public void setExemptionNumber(
        @Nullable
        final String exemptionNumber) {
        rememberChangedField("WithholdingTaxCertificate", this.exemptionNumber);
        this.exemptionNumber = exemptionNumber;
    }

    /**
     * Constraints: Not nullable, Precision: 5, Scale: 2 <p>Original property name from the Odata EDM: <b>WithholdingTaxExmptPercent</b></p>
     * 
     * @param exemptionRate
     *     Exemption Rate
     */
    public void setExemptionRate(
        @Nullable
        final BigDecimal exemptionRate) {
        rememberChangedField("WithholdingTaxExmptPercent", this.exemptionRate);
        this.exemptionRate = exemptionRate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateBegin</b></p>
     * 
     * @param exemptionStartDate
     *     Date on Which Exemption Begins
     */
    public void setExemptionStartDate(
        @Nullable
        final LocalDateTime exemptionStartDate) {
        rememberChangedField("ExemptionDateBegin", this.exemptionStartDate);
        this.exemptionStartDate = exemptionStartDate;
    }

    /**
     * Constraints: Not nullable, Precision: 0 <p>Original property name from the Odata EDM: <b>ExemptionDateEnd</b></p>
     * 
     * @param exemptionEndDate
     *     Date on Which Exemption Ends
     */
    public void setExemptionEndDate(
        @Nullable
        final LocalDateTime exemptionEndDate) {
        rememberChangedField("ExemptionDateEnd", this.exemptionEndDate);
        this.exemptionEndDate = exemptionEndDate;
    }

    /**
     * Constraints: Not nullable, Maximum length: 2 <p>Original property name from the Odata EDM: <b>ExemptionReason</b></p>
     * 
     * @param exemptionReason
     *     Reason for Exemption
     */
    public void setExemptionReason(
        @Nullable
        final String exemptionReason) {
        rememberChangedField("ExemptionReason", this.exemptionReason);
        this.exemptionReason = exemptionReason;
    }

    /**
     * Constraints: Not nullable, Maximum length: 4 <p>Original property name from the Odata EDM: <b>AuthorizationGroup</b></p>
     * 
     * @param authorization
     *     Authorization Group
     */
    public void setAuthorization(
        @Nullable
        final String authorization) {
        rememberChangedField("AuthorizationGroup", this.authorization);
        this.authorization = authorization;
    }

    @Override
    protected String getEntityCollection() {
        return "A_CustomerWithHoldingTax";
    }

    @Nonnull
    @Override
    protected Map<String, Object> getKey() {
        final Map<String, Object> result = Maps.newHashMap();
        result.put("Customer", getCustomer());
        result.put("CompanyCode", getCompanyCode());
        result.put("WithholdingTaxType", getWithholdingTaxType());
        return result;
    }

    @Nonnull
    @Override
    protected Map<String, Object> toMapOfFields() {
        final Map<String, Object> values = super.toMapOfFields();
        values.put("Customer", getCustomer());
        values.put("CompanyCode", getCompanyCode());
        values.put("WithholdingTaxType", getWithholdingTaxType());
        values.put("WithholdingTaxCode", getWTaxCode());
        values.put("WithholdingTaxAgent", getWTaxAgent());
        values.put("ObligationDateBegin", getWTaxObligatedFrm());
        values.put("ObligationDateEnd", getObligtoWTaxUntil());
        values.put("WithholdingTaxNumber", getWtaxNumber());
        values.put("WithholdingTaxCertificate", getExemptionNumber());
        values.put("WithholdingTaxExmptPercent", getExemptionRate());
        values.put("ExemptionDateBegin", getExemptionStartDate());
        values.put("ExemptionDateEnd", getExemptionEndDate());
        values.put("ExemptionReason", getExemptionReason());
        values.put("AuthorizationGroup", getAuthorization());
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
            if (values.containsKey("WithholdingTaxType")) {
                final Object value = values.remove("WithholdingTaxType");
                if ((value == null)||(!value.equals(getWithholdingTaxType()))) {
                    setWithholdingTaxType(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCode")) {
                final Object value = values.remove("WithholdingTaxCode");
                if ((value == null)||(!value.equals(getWTaxCode()))) {
                    setWTaxCode(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxAgent")) {
                final Object value = values.remove("WithholdingTaxAgent");
                if ((value == null)||(!value.equals(getWTaxAgent()))) {
                    setWTaxAgent(((Boolean) value));
                }
            }
            if (values.containsKey("ObligationDateBegin")) {
                final Object value = values.remove("ObligationDateBegin");
                if ((value == null)||(!value.equals(getWTaxObligatedFrm()))) {
                    setWTaxObligatedFrm(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ObligationDateEnd")) {
                final Object value = values.remove("ObligationDateEnd");
                if ((value == null)||(!value.equals(getObligtoWTaxUntil()))) {
                    setObligtoWTaxUntil(((LocalDateTime) value));
                }
            }
            if (values.containsKey("WithholdingTaxNumber")) {
                final Object value = values.remove("WithholdingTaxNumber");
                if ((value == null)||(!value.equals(getWtaxNumber()))) {
                    setWtaxNumber(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxCertificate")) {
                final Object value = values.remove("WithholdingTaxCertificate");
                if ((value == null)||(!value.equals(getExemptionNumber()))) {
                    setExemptionNumber(((String) value));
                }
            }
            if (values.containsKey("WithholdingTaxExmptPercent")) {
                final Object value = values.remove("WithholdingTaxExmptPercent");
                if ((value == null)||(!value.equals(getExemptionRate()))) {
                    setExemptionRate(((BigDecimal) value));
                }
            }
            if (values.containsKey("ExemptionDateBegin")) {
                final Object value = values.remove("ExemptionDateBegin");
                if ((value == null)||(!value.equals(getExemptionStartDate()))) {
                    setExemptionStartDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ExemptionDateEnd")) {
                final Object value = values.remove("ExemptionDateEnd");
                if ((value == null)||(!value.equals(getExemptionEndDate()))) {
                    setExemptionEndDate(((LocalDateTime) value));
                }
            }
            if (values.containsKey("ExemptionReason")) {
                final Object value = values.remove("ExemptionReason");
                if ((value == null)||(!value.equals(getExemptionReason()))) {
                    setExemptionReason(((String) value));
                }
            }
            if (values.containsKey("AuthorizationGroup")) {
                final Object value = values.remove("AuthorizationGroup");
                if ((value == null)||(!value.equals(getAuthorization()))) {
                    setAuthorization(((String) value));
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
    public static<T >WithholdingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final Class<T> fieldType) {
        return new WithholdingTaxField<T>(fieldName);
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
    public static<T,DomainT >WithholdingTaxField<T> field(
        @Nonnull
        final String fieldName,
        @Nonnull
        final TypeConverter<T, DomainT> typeConverter) {
        return new WithholdingTaxField<T>(fieldName, typeConverter);
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
