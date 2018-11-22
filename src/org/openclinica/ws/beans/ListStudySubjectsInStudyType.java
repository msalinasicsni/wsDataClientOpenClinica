/**
 * ListStudySubjectsInStudyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class ListStudySubjectsInStudyType  implements java.io.Serializable {
    private org.openclinica.ws.beans.StudyRefType studyRef;

    public ListStudySubjectsInStudyType() {
    }

    public ListStudySubjectsInStudyType(
           org.openclinica.ws.beans.StudyRefType studyRef) {
           this.studyRef = studyRef;
    }


    /**
     * Gets the studyRef value for this ListStudySubjectsInStudyType.
     * 
     * @return studyRef
     */
    public org.openclinica.ws.beans.StudyRefType getStudyRef() {
        return studyRef;
    }


    /**
     * Sets the studyRef value for this ListStudySubjectsInStudyType.
     * 
     * @param studyRef
     */
    public void setStudyRef(org.openclinica.ws.beans.StudyRefType studyRef) {
        this.studyRef = studyRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListStudySubjectsInStudyType)) return false;
        ListStudySubjectsInStudyType other = (ListStudySubjectsInStudyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.studyRef==null && other.getStudyRef()==null) || 
             (this.studyRef!=null &&
              this.studyRef.equals(other.getStudyRef())));
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
        if (getStudyRef() != null) {
            _hashCode += getStudyRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListStudySubjectsInStudyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "listStudySubjectsInStudyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyRefType"));
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
