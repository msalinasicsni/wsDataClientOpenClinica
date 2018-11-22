/**
 * CrfsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class CrfsType  implements java.io.Serializable {
    private org.openclinica.ws.beans.CrfObjType crf;

    public CrfsType() {
    }

    public CrfsType(
           org.openclinica.ws.beans.CrfObjType crf) {
           this.crf = crf;
    }


    /**
     * Gets the crf value for this CrfsType.
     * 
     * @return crf
     */
    public org.openclinica.ws.beans.CrfObjType getCrf() {
        return crf;
    }


    /**
     * Sets the crf value for this CrfsType.
     * 
     * @param crf
     */
    public void setCrf(org.openclinica.ws.beans.CrfObjType crf) {
        this.crf = crf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrfsType)) return false;
        CrfsType other = (CrfsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.crf==null && other.getCrf()==null) || 
             (this.crf!=null &&
              this.crf.equals(other.getCrf())));
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
        if (getCrf() != null) {
            _hashCode += getCrf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrfsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "crfsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "crf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "crfObjType"));
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
