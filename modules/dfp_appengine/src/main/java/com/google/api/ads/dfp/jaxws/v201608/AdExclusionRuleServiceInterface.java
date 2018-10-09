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


package com.google.api.ads.dfp.jaxws.v201608;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link AdExclusionRule} objects.
 *       
 *       <p>An {@link AdExclusionRule} provides a way to block specified ads from showing on portions of
 *       your site. Each rule specifies the inventory on which the rule is in effect, and the labels to
 *       block on that inventory.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AdExclusionRuleServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AdExclusionRuleServiceInterface {


    /**
     * 
     *         Creates new {@link AdExclusionRule} objects.
     *         @param adExclusionRules the ad exclusion rules to create
     *         @return the created rules with their IDs filled in
     *       
     * 
     * @param adExclusionRules
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201608.AdExclusionRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
    @RequestWrapper(localName = "createAdExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfacecreateAdExclusionRules")
    @ResponseWrapper(localName = "createAdExclusionRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfacecreateAdExclusionRulesResponse")
    public List<AdExclusionRule> createAdExclusionRules(
        @WebParam(name = "adExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        List<AdExclusionRule> adExclusionRules)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link AdExclusionRulePage} of {@link AdExclusionRule} objects that satisfy the
     *         given {@link Statement#query}.  The following fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link AdExclusionRule#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link AdExclusionRule#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link AdExclusionRule#status}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of rules
     *         @return the rules that match the given filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201608.AdExclusionRulePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
    @RequestWrapper(localName = "getAdExclusionRulesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfacegetAdExclusionRulesByStatement")
    @ResponseWrapper(localName = "getAdExclusionRulesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfacegetAdExclusionRulesByStatementResponse")
    public AdExclusionRulePage getAdExclusionRulesByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs action on {@link AdExclusionRule} objects that satisfy the
     *         given {@link Statement#query}.
     *         
     *         @param adExclusionRuleAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of ad exclusion rules
     *         @return the result of the action performed
     *       
     * 
     * @param adExclusionRuleAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201608.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
    @RequestWrapper(localName = "performAdExclusionRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfaceperformAdExclusionRuleAction")
    @ResponseWrapper(localName = "performAdExclusionRuleActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfaceperformAdExclusionRuleActionResponse")
    public UpdateResult performAdExclusionRuleAction(
        @WebParam(name = "adExclusionRuleAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        AdExclusionRuleAction adExclusionRuleAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link AdExclusionRule} objects.
     *         
     *         @param adExclusionRules the ad exclusion rules to update
     *         @return the updated rules
     *       
     * 
     * @param adExclusionRules
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201608.AdExclusionRule>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
    @RequestWrapper(localName = "updateAdExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfaceupdateAdExclusionRules")
    @ResponseWrapper(localName = "updateAdExclusionRulesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608", className = "com.google.api.ads.dfp.jaxws.v201608.AdExclusionRuleServiceInterfaceupdateAdExclusionRulesResponse")
    public List<AdExclusionRule> updateAdExclusionRules(
        @WebParam(name = "adExclusionRules", targetNamespace = "https://www.google.com/apis/ads/publisher/v201608")
        List<AdExclusionRule> adExclusionRules)
        throws ApiException_Exception
    ;

}
