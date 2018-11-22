/**
 * StudyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class StudyType  implements java.io.Serializable {
    private org.apache.axis.types.NormalizedString identifier;

    private org.apache.axis.types.NormalizedString oid;

    private org.apache.axis.types.NormalizedString name;

    private org.openclinica.ws.beans.SiteType[] sites;

    public StudyType() {
    }

    public StudyType(
           org.apache.axis.types.NormalizedString identifier,
           org.apache.axis.types.NormalizedString oid,
           org.apache.axis.types.NormalizedString name,
           org.openclinica.ws.beans.SiteType[] sites) {
           this.identifier = identifier;
           this.oid = oid;
           this.name = name;
           this.sites = sites;
    }


    /**
     * Gets the identifier value for this StudyType.
     * 
     * @return identifier
     */
    public org.apache.axis.types.NormalizedString getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this StudyType.
     * 
     * @param identifier
     */
    public void setIdentifier(org.apache.axis.types.NormalizedString identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the oid value for this StudyType.
     * 
     * @return oid
     */
    public org.apache.axis.types.NormalizedString getOid() {
        return oid;
    }


    /**
     * Sets the oid value for this StudyType.
     * 
     * @param oid
     */
    public void setOid(org.apache.axis.types.NormalizedString oid) {
        this.oid = oid;
    }


    /**
     * Gets the name value for this StudyType.
     * 
     * @return name
     */
    public org.apache.axis.types.NormalizedString getName() {
        return name;
    }


    /**
     * Sets the name value for this StudyType.
     * 
     * @param name
     */
    public void setName(org.apache.axis.types.NormalizedString name) {
        this.name = name;
    }


    /**
     * Gets the sites value for this StudyType.
     * 
     * @return sites
     */
    public org.openclinica.ws.beans.SiteType[] getSites() {
        return sites;
    }


    /**
     * Sets the sites value for this StudyType.
     * 
     * @param sites
     */
    public void setSites(org.openclinica.ws.beans.SiteType[] sites) {
        this.sites = sites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudyType)) return false;
        StudyType other = (StudyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.oid==null && other.getOid()==null) || 
             (this.oid!=null &&
              this.oid.equals(other.getOid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sites==null && other.getSites()==null) || 
             (this.sites!=null &&
              java.util.Arrays.equals(this.sites, other.getSites())));
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
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getOid() != null) {
            _hashCode += getOid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("sites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "sites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "siteType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "site"));
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
