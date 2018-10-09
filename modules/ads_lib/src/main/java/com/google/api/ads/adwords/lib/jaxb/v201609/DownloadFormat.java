// Copyright 2016 Google Inc. All Rights Reserved.
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

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
//


package com.google.api.ads.adwords.lib.jaxb.v201609;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DownloadFormat"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CSVFOREXCEL"/&gt;
 *     &lt;enumeration value="CSV"/&gt;
 *     &lt;enumeration value="TSV"/&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="GZIPPED_CSV"/&gt;
 *     &lt;enumeration value="GZIPPED_XML"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DownloadFormat")
@XmlEnum
public enum DownloadFormat {

    CSVFOREXCEL,
    CSV,
    TSV,
    XML,
    GZIPPED_CSV,
    GZIPPED_XML;

    public String value() {
        return name();
    }

    public static DownloadFormat fromValue(String v) {
        return valueOf(v);
    }

}
