/**
 * EventDefinitionCrfType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class EventDefinitionCrfType  implements java.io.Serializable {
    private boolean required;

    private boolean doubleDataEntry;

    private boolean passwordRequired;

    private boolean hideCrf;

    private org.apache.axis.types.NormalizedString sourceDataVerificaiton;

    private org.openclinica.ws.beans.CrfObjType crf;

    private org.openclinica.ws.beans.CrfVersionType defaultCrfVersion;

    public EventDefinitionCrfType() {
    }

    public EventDefinitionCrfType(
           boolean required,
           boolean doubleDataEntry,
           boolean passwordRequired,
           boolean hideCrf,
           org.apache.axis.types.NormalizedString sourceDataVerificaiton,
           org.openclinica.ws.beans.CrfObjType crf,
           org.openclinica.ws.beans.CrfVersionType defaultCrfVersion) {
           this.required = required;
           this.doubleDataEntry = doubleDataEntry;
           this.passwordRequired = passwordRequired;
           this.hideCrf = hideCrf;
           this.sourceDataVerificaiton = sourceDataVerificaiton;
           this.crf = crf;
           this.defaultCrfVersion = defaultCrfVersion;
    }


    /**
     * Gets the required value for this EventDefinitionCrfType.
     * 
     * @return required
     */
    public boolean isRequired() {
        return required;
    }


    /**
     * Sets the required value for this EventDefinitionCrfType.
     * 
     * @param required
     */
    public void setRequired(boolean required) {
        this.required = required;
    }


    /**
     * Gets the doubleDataEntry value for this EventDefinitionCrfType.
     * 
     * @return doubleDataEntry
     */
    public boolean isDoubleDataEntry() {
        return doubleDataEntry;
    }


    /**
     * Sets the doubleDataEntry value for this EventDefinitionCrfType.
     * 
     * @param doubleDataEntry
     */
    public void setDoubleDataEntry(boolean doubleDataEntry) {
        this.doubleDataEntry = doubleDataEntry;
    }


    /**
     * Gets the passwordRequired value for this EventDefinitionCrfType.
     * 
     * @return passwordRequired
     */
    public boolean isPasswordRequired() {
        return passwordRequired;
    }


    /**
     * Sets the passwordRequired value for this EventDefinitionCrfType.
     * 
     * @param passwordRequired
     */
    public void setPasswordRequired(boolean passwordRequired) {
        this.passwordRequired = passwordRequired;
    }


    /**
     * Gets the hideCrf value for this EventDefinitionCrfType.
     * 
     * @return hideCrf
     */
    public boolean isHideCrf() {
        return hideCrf;
    }


    /**
     * Sets the hideCrf value for this EventDefinitionCrfType.
     * 
     * @param hideCrf
     */
    public void setHideCrf(boolean hideCrf) {
        this.hideCrf = hideCrf;
    }


    /**
     * Gets the sourceDataVerificaiton value for this EventDefinitionCrfType.
     * 
     * @return sourceDataVerificaiton
     */
    public org.apache.axis.types.NormalizedString getSourceDataVerificaiton() {
        return sourceDataVerificaiton;
    }


    /**
     * Sets the sourceDataVerificaiton value for this EventDefinitionCrfType.
     * 
     * @param sourceDataVerificaiton
     */
    public void setSourceDataVerificaiton(org.apache.axis.types.NormalizedString sourceDataVerificaiton) {
        this.sourceDataVerificaiton = sourceDataVerificaiton;
    }


    /**
     * Gets the crf value for this EventDefinitionCrfType.
     * 
     * @return crf
     */
    public org.openclinica.ws.beans.CrfObjType getCrf() {
        return crf;
    }


    /**
     * Sets the crf value for this EventDefinitionCrfType.
     * 
     * @param crf
     */
    public void setCrf(org.openclinica.ws.beans.CrfObjType crf) {
        this.crf = crf;
    }


    /**
     * Gets the defaultCrfVersion value for this EventDefinitionCrfType.
     * 
     * @return defaultCrfVersion
     */
    public org.openclinica.ws.beans.CrfVersionType getDefaultCrfVersion() {
        return defaultCrfVersion;
    }


    /**
     * Sets the defaultCrfVersion value for this EventDefinitionCrfType.
     * 
     * @param defaultCrfVersion
     */
    public void setDefaultCrfVersion(org.openclinica.ws.beans.CrfVersionType defaultCrfVersion) {
        this.defaultCrfVersion = defaultCrfVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventDefinitionCrfType)) return false;
        EventDefinitionCrfType other = (EventDefinitionCrfType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.required == other.isRequired() &&
            this.doubleDataEntry == other.isDoubleDataEntry() &&
            this.passwordRequired == other.isPasswordRequired() &&
            this.hideCrf == other.isHideCrf() &&
            ((this.sourceDataVerificaiton==null && other.getSourceDataVerificaiton()==null) || 
             (this.sourceDataVerificaiton!=null &&
              this.sourceDataVerificaiton.equals(other.getSourceDataVerificaiton()))) &&
            ((this.crf==null && other.getCrf()==null) || 
             (this.crf!=null &&
              this.crf.equals(other.getCrf()))) &&
            ((this.defaultCrfVersion==null && other.getDefaultCrfVersion()==null) || 
             (this.defaultCrfVersion!=null &&
              this.defaultCrfVersion.equals(other.getDefaultCrfVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDoubleDataEntry() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPasswordRequired() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHideCrf() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSourceDataVerificaiton() != null) {
            _hashCode += getSourceDataVerificaiton().hashCode();
        }
        if (getCrf() != null) {
            _hashCode += getCrf().hashCode();
        }
        if (getDefaultCrfVersion() != null) {
            _hashCode += getDefaultCrfVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventDefinitionCrfType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "eventDefinitionCrfType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleDataEntry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "doubleDataEntry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "passwordRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideCrf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "hideCrf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDataVerificaiton");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "sourceDataVerificaiton"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "crf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "crfObjType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultCrfVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "defaultCrfVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "crfVersionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
