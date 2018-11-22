/**
 * SubjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class SubjectType  implements java.io.Serializable {
    private org.apache.axis.types.NormalizedString uniqueIdentifier;

    private org.openclinica.ws.beans.GenderType gender;

    private java.util.Date dateOfBirth;

    private java.math.BigInteger yearOfBirth;

    public SubjectType() {
    }

    public SubjectType(
           org.apache.axis.types.NormalizedString uniqueIdentifier,
           org.openclinica.ws.beans.GenderType gender,
           java.util.Date dateOfBirth,
           java.math.BigInteger yearOfBirth) {
           this.uniqueIdentifier = uniqueIdentifier;
           this.gender = gender;
           this.dateOfBirth = dateOfBirth;
           this.yearOfBirth = yearOfBirth;
    }


    /**
     * Gets the uniqueIdentifier value for this SubjectType.
     * 
     * @return uniqueIdentifier
     */
    public org.apache.axis.types.NormalizedString getUniqueIdentifier() {
        return uniqueIdentifier;
    }


    /**
     * Sets the uniqueIdentifier value for this SubjectType.
     * 
     * @param uniqueIdentifier
     */
    public void setUniqueIdentifier(org.apache.axis.types.NormalizedString uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }


    /**
     * Gets the gender value for this SubjectType.
     * 
     * @return gender
     */
    public org.openclinica.ws.beans.GenderType getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this SubjectType.
     * 
     * @param gender
     */
    public void setGender(org.openclinica.ws.beans.GenderType gender) {
        this.gender = gender;
    }


    /**
     * Gets the dateOfBirth value for this SubjectType.
     * 
     * @return dateOfBirth
     */
    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this SubjectType.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the yearOfBirth value for this SubjectType.
     * 
     * @return yearOfBirth
     */
    public java.math.BigInteger getYearOfBirth() {
        return yearOfBirth;
    }


    /**
     * Sets the yearOfBirth value for this SubjectType.
     * 
     * @param yearOfBirth
     */
    public void setYearOfBirth(java.math.BigInteger yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubjectType)) return false;
        SubjectType other = (SubjectType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueIdentifier==null && other.getUniqueIdentifier()==null) || 
             (this.uniqueIdentifier!=null &&
              this.uniqueIdentifier.equals(other.getUniqueIdentifier()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.yearOfBirth==null && other.getYearOfBirth()==null) || 
             (this.yearOfBirth!=null &&
              this.yearOfBirth.equals(other.getYearOfBirth())));
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
        if (getUniqueIdentifier() != null) {
            _hashCode += getUniqueIdentifier().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getYearOfBirth() != null) {
            _hashCode += getYearOfBirth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "subjectType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "uniqueIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "genderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "yearOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
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
