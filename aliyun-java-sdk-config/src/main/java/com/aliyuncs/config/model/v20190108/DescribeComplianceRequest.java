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

package com.aliyuncs.config.model.v20190108;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeComplianceRequest extends RpcAcsRequest<DescribeComplianceResponse> {
	   

	private String configRuleId;

	private String resourceId;

	private Boolean multiAccount;

	private String resourceType;

	private String complianceType;

	private Long memberId;
	public DescribeComplianceRequest() {
		super("Config", "2019-01-08", "DescribeCompliance", "Config");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigRuleId() {
		return this.configRuleId;
	}

	public void setConfigRuleId(String configRuleId) {
		this.configRuleId = configRuleId;
		if(configRuleId != null){
			putQueryParameter("ConfigRuleId", configRuleId);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public Boolean getMultiAccount() {
		return this.multiAccount;
	}

	public void setMultiAccount(Boolean multiAccount) {
		this.multiAccount = multiAccount;
		if(multiAccount != null){
			putQueryParameter("MultiAccount", multiAccount.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getComplianceType() {
		return this.complianceType;
	}

	public void setComplianceType(String complianceType) {
		this.complianceType = complianceType;
		if(complianceType != null){
			putQueryParameter("ComplianceType", complianceType);
		}
	}

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
		if(memberId != null){
			putQueryParameter("MemberId", memberId.toString());
		}
	}

	@Override
	public Class<DescribeComplianceResponse> getResponseClass() {
		return DescribeComplianceResponse.class;
	}

}
