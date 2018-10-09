// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * MutateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201702.cm;


/**
 * The result of a single mutate operation. Contains either the resulting
 * Operand
 *             or the error(s) that occurred when attempting the mutate.
 */
public class MutateResult  implements java.io.Serializable {
    /* The result if there is one. */
    private com.google.api.ads.adwords.axis.v201702.cm.Operand result;

    /* The errors if there are any. */
    private com.google.api.ads.adwords.axis.v201702.cm.ErrorList errorList;

    /* The 0-based index of the result record. */
    private java.lang.Long index;

    public MutateResult() {
    }

    public MutateResult(
           com.google.api.ads.adwords.axis.v201702.cm.Operand result,
           com.google.api.ads.adwords.axis.v201702.cm.ErrorList errorList,
           java.lang.Long index) {
           this.result = result;
           this.errorList = errorList;
           this.index = index;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("errorList", getErrorList())
            .add("index", getIndex())
            .add("result", getResult())
            .toString();
    }

    /**
     * Gets the result value for this MutateResult.
     * 
     * @return result   * The result if there is one.
     */
    public com.google.api.ads.adwords.axis.v201702.cm.Operand getResult() {
        return result;
    }


    /**
     * Sets the result value for this MutateResult.
     * 
     * @param result   * The result if there is one.
     */
    public void setResult(com.google.api.ads.adwords.axis.v201702.cm.Operand result) {
        this.result = result;
    }


    /**
     * Gets the errorList value for this MutateResult.
     * 
     * @return errorList   * The errors if there are any.
     */
    public com.google.api.ads.adwords.axis.v201702.cm.ErrorList getErrorList() {
        return errorList;
    }


    /**
     * Sets the errorList value for this MutateResult.
     * 
     * @param errorList   * The errors if there are any.
     */
    public void setErrorList(com.google.api.ads.adwords.axis.v201702.cm.ErrorList errorList) {
        this.errorList = errorList;
    }


    /**
     * Gets the index value for this MutateResult.
     * 
     * @return index   * The 0-based index of the result record.
     */
    public java.lang.Long getIndex() {
        return index;
    }


    /**
     * Sets the index value for this MutateResult.
     * 
     * @param index   * The 0-based index of the result record.
     */
    public void setIndex(java.lang.Long index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MutateResult)) return false;
        MutateResult other = (MutateResult) obj;
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
            ((this.errorList==null && other.getErrorList()==null) || 
             (this.errorList!=null &&
              this.errorList.equals(other.getErrorList()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex())));
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
        if (getErrorList() != null) {
            _hashCode += getErrorList().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MutateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "MutateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "Operand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "errorList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "ErrorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201702", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
