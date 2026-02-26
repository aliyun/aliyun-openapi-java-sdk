/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRulesRequest extends RpcAcsRequest<DescribeRulesResponse> {
	   

	private Long ruleGroupId;

	private Integer protectionType;

	private Integer pageNumber;

	private String cveIdKey;

	private String resourceGroupId;

	private String sourceIp;

	private Integer pageSize;

	private String lang;

	private Integer riskLevel;

	private String instanceId;

	private String ruleIdKey;

	private String region;

	private Integer applicationType;
	public DescribeRulesRequest() {
		super("waf-openapi", "2019-09-10", "DescribeRules", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRuleGroupId() {
		return this.ruleGroupId;
	}

	public void setRuleGroupId(Long ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
		if(ruleGroupId != null){
			putQueryParameter("RuleGroupId", ruleGroupId.toString());
		}
	}

	public Integer getProtectionType() {
		return this.protectionType;
	}

	public void setProtectionType(Integer protectionType) {
		this.protectionType = protectionType;
		if(protectionType != null){
			putQueryParameter("ProtectionType", protectionType.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getCveIdKey() {
		return this.cveIdKey;
	}

	public void setCveIdKey(String cveIdKey) {
		this.cveIdKey = cveIdKey;
		if(cveIdKey != null){
			putQueryParameter("CveIdKey", cveIdKey);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getRiskLevel() {
		return this.riskLevel;
	}

	public void setRiskLevel(Integer riskLevel) {
		this.riskLevel = riskLevel;
		if(riskLevel != null){
			putQueryParameter("RiskLevel", riskLevel.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getRuleIdKey() {
		return this.ruleIdKey;
	}

	public void setRuleIdKey(String ruleIdKey) {
		this.ruleIdKey = ruleIdKey;
		if(ruleIdKey != null){
			putQueryParameter("RuleIdKey", ruleIdKey);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public Integer getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(Integer applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putQueryParameter("ApplicationType", applicationType.toString());
		}
	}

	@Override
	public Class<DescribeRulesResponse> getResponseClass() {
		return DescribeRulesResponse.class;
	}

}
