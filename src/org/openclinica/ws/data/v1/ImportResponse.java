/**
 * ImportResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.data.v1;

public class ImportResponse  implements java.io.Serializable {
    private java.lang.String result;

    private java.lang.String[] warning;

    private java.lang.String[] error;

    private org.openclinica.ws.data.v1.AuditMessagesType auditMessages;

    public ImportResponse() {
    }

    public ImportResponse(
           java.lang.String result,
           java.lang.String[] warning,
           java.lang.String[] error,
           org.openclinica.ws.data.v1.AuditMessagesType auditMessages) {
           this.result = result;
           this.warning = warning;
           this.error = error;
           this.auditMessages = auditMessages;
    }


    /**
     * Gets the result value for this ImportResponse.
     * 
     * @return result
     */
    public java.lang.String getResult() {
        return result;
    }


    /**
     * Sets the result value for this ImportResponse.
     * 
     * @param result
     */
    public void setResult(java.lang.String result) {
        this.result = result;
    }


    /**
     * Gets the warning value for this ImportResponse.
     * 
     * @return warning
     */
    public java.lang.String[] getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this ImportResponse.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String[] warning) {
        this.warning = warning;
    }

    public java.lang.String getWarning(int i) {
        return this.warning[i];
    }

    public void setWarning(int i, java.lang.String _value) {
        this.warning[i] = _value;
    }


    /**
     * Gets the error value for this ImportResponse.
     * 
     * @return error
     */
    public java.lang.String[] getError() {
        return error;
    }


    /**
     * Sets the error value for this ImportResponse.
     * 
     * @param error
     */
    public void setError(java.lang.String[] error) {
        this.error = error;
    }

    public java.lang.String getError(int i) {
        return this.error[i];
    }

    public void setError(int i, java.lang.String _value) {
        this.error[i] = _value;
    }


    /**
     * Gets the auditMessages value for this ImportResponse.
     * 
     * @return auditMessages
     */
    public org.openclinica.ws.data.v1.AuditMessagesType getAuditMessages() {
        return auditMessages;
    }


    /**
     * Sets the auditMessages value for this ImportResponse.
     * 
     * @param auditMessages
     */
    public void setAuditMessages(org.openclinica.ws.data.v1.AuditMessagesType auditMessages) {
        this.auditMessages = auditMessages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImportResponse)) return false;
        ImportResponse other = (ImportResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              java.util.Arrays.equals(this.warning, other.getWarning()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              java.util.Arrays.equals(this.error, other.getError()))) &&
            ((this.auditMessages==null && other.getAuditMessages()==null) || 
             (this.auditMessages!=null &&
              this.auditMessages.equals(other.getAuditMessages())));
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
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getWarning() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWarning());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWarning(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getError());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getError(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditMessages() != null) {
            _hashCode += getAuditMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImportResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/data/v1", ">importResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/data/v1", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/data/v1", "warning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/data/v1", "error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/data/v1", "auditMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/data/v1", "auditMessagesType"));
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
