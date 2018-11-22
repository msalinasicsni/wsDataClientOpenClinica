/**
 * StudySubjectWithEventsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.openclinica.ws.beans;

public class StudySubjectWithEventsType  implements java.io.Serializable {
    private org.apache.axis.types.NormalizedString label;

    private org.apache.axis.types.NormalizedString secondaryLabel;

    private java.util.Date enrollmentDate;

    private org.openclinica.ws.beans.SubjectType subject;

    private org.openclinica.ws.beans.StudyRefType studyRef;

    private org.openclinica.ws.beans.EventType[] events;

    public StudySubjectWithEventsType() {
    }

    public StudySubjectWithEventsType(
           org.apache.axis.types.NormalizedString label,
           org.apache.axis.types.NormalizedString secondaryLabel,
           java.util.Date enrollmentDate,
           org.openclinica.ws.beans.SubjectType subject,
           org.openclinica.ws.beans.StudyRefType studyRef,
           org.openclinica.ws.beans.EventType[] events) {
           this.label = label;
           this.secondaryLabel = secondaryLabel;
           this.enrollmentDate = enrollmentDate;
           this.subject = subject;
           this.studyRef = studyRef;
           this.events = events;
    }


    /**
     * Gets the label value for this StudySubjectWithEventsType.
     * 
     * @return label
     */
    public org.apache.axis.types.NormalizedString getLabel() {
        return label;
    }


    /**
     * Sets the label value for this StudySubjectWithEventsType.
     * 
     * @param label
     */
    public void setLabel(org.apache.axis.types.NormalizedString label) {
        this.label = label;
    }


    /**
     * Gets the secondaryLabel value for this StudySubjectWithEventsType.
     * 
     * @return secondaryLabel
     */
    public org.apache.axis.types.NormalizedString getSecondaryLabel() {
        return secondaryLabel;
    }


    /**
     * Sets the secondaryLabel value for this StudySubjectWithEventsType.
     * 
     * @param secondaryLabel
     */
    public void setSecondaryLabel(org.apache.axis.types.NormalizedString secondaryLabel) {
        this.secondaryLabel = secondaryLabel;
    }


    /**
     * Gets the enrollmentDate value for this StudySubjectWithEventsType.
     * 
     * @return enrollmentDate
     */
    public java.util.Date getEnrollmentDate() {
        return enrollmentDate;
    }


    /**
     * Sets the enrollmentDate value for this StudySubjectWithEventsType.
     * 
     * @param enrollmentDate
     */
    public void setEnrollmentDate(java.util.Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }


    /**
     * Gets the subject value for this StudySubjectWithEventsType.
     * 
     * @return subject
     */
    public org.openclinica.ws.beans.SubjectType getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this StudySubjectWithEventsType.
     * 
     * @param subject
     */
    public void setSubject(org.openclinica.ws.beans.SubjectType subject) {
        this.subject = subject;
    }


    /**
     * Gets the studyRef value for this StudySubjectWithEventsType.
     * 
     * @return studyRef
     */
    public org.openclinica.ws.beans.StudyRefType getStudyRef() {
        return studyRef;
    }


    /**
     * Sets the studyRef value for this StudySubjectWithEventsType.
     * 
     * @param studyRef
     */
    public void setStudyRef(org.openclinica.ws.beans.StudyRefType studyRef) {
        this.studyRef = studyRef;
    }


    /**
     * Gets the events value for this StudySubjectWithEventsType.
     * 
     * @return events
     */
    public org.openclinica.ws.beans.EventType[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this StudySubjectWithEventsType.
     * 
     * @param events
     */
    public void setEvents(org.openclinica.ws.beans.EventType[] events) {
        this.events = events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudySubjectWithEventsType)) return false;
        StudySubjectWithEventsType other = (StudySubjectWithEventsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.secondaryLabel==null && other.getSecondaryLabel()==null) || 
             (this.secondaryLabel!=null &&
              this.secondaryLabel.equals(other.getSecondaryLabel()))) &&
            ((this.enrollmentDate==null && other.getEnrollmentDate()==null) || 
             (this.enrollmentDate!=null &&
              this.enrollmentDate.equals(other.getEnrollmentDate()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.studyRef==null && other.getStudyRef()==null) || 
             (this.studyRef!=null &&
              this.studyRef.equals(other.getStudyRef()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getSecondaryLabel() != null) {
            _hashCode += getSecondaryLabel().hashCode();
        }
        if (getEnrollmentDate() != null) {
            _hashCode += getEnrollmentDate().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getStudyRef() != null) {
            _hashCode += getStudyRef().hashCode();
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(StudySubjectWithEventsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studySubjectWithEventsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "secondaryLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enrollmentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "enrollmentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "subjectType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("studyRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "studyRefType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "eventType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://openclinica.org/ws/beans", "event"));
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
