/**
 * StudyEventDefinitionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class StudyEventDefinitionType  implements java.io.Serializable {
    private org.apache.axis.types.NormalizedString oid;

    private org.apache.axis.types.NormalizedString name;

    private org.openclinica.ws.beans.CrfsType eventDefinitionCrfs;

    public StudyEventDefinitionType() {
    }

    public StudyEventDefinitionType(
           org.apache.axis.types.NormalizedString oid,
           org.apache.axis.types.NormalizedString name,
           org.openclinica.ws.beans.CrfsType eventDefinitionCrfs) {
           this.oid = oid;
           this.name = name;
           this.eventDefinitionCrfs = eventDefinitionCrfs;
    }


    /**
     * Gets the oid value for this StudyEventDefinitionType.
     * 
     * @return oid
     */
    public org.apache.axis.types.NormalizedString getOid() {
        return oid;
    }


    /**
     * Sets the oid value for this StudyEventDefinitionType.
     * 
     * @param oid
     */
    public void setOid(org.apache.axis.types.NormalizedString oid) {
        this.oid = oid;
    }


    /**
     * Gets the name value for this StudyEventDefinitionType.
     * 
     * @return name
     */
    public org.apache.axis.types.NormalizedString getName() {
        return name;
    }


    /**
     * Sets the name value for this StudyEventDefinitionType.
     * 
     * @param name
     */
    public void setName(org.apache.axis.types.NormalizedString name) {
        this.name = name;
    }


    /**
     * Gets the eventDefinitionCrfs value for this StudyEventDefinitionType.
     * 
     * @return eventDefinitionCrfs
     */
    public org.openclinica.ws.beans.CrfsType getEventDefinitionCrfs() {
        return eventDefinitionCrfs;
    }


    /**
     * Sets the eventDefinitionCrfs value for this StudyEventDefinitionType.
     * 
     * @param eventDefinitionCrfs
     */
    public void setEventDefinitionCrfs(org.openclinica.ws.beans.CrfsType eventDefinitionCrfs) {
        this.eventDefinitionCrfs = eventDefinitionCrfs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyEventDefinitionType)) return false;
        StudyEventDefinitionType other = (StudyEventDefinitionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oid==null && other.getOid()==null) || 
             (this.oid!=null &&
              this.oid.equals(other.getOid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.eventDefinitionCrfs==null && other.getEventDefinitionCrfs()==null) || 
             (this.eventDefinitionCrfs!=null &&
              this.eventDefinitionCrfs.equals(other.getEventDefinitionCrfs())));
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
        if (getOid() != null) {
            _hashCode += getOid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getEventDefinitionCrfs() != null) {
            _hashCode += getEventDefinitionCrfs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudyEventDefinitionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyEventDefinitionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "oid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDefinitionCrfs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "eventDefinitionCrfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "crfsType"));
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
