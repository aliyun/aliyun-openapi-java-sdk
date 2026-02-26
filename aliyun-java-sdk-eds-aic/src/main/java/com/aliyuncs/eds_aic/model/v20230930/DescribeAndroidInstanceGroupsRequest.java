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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAndroidInstanceGroupsRequest extends RpcAcsRequest<DescribeAndroidInstanceGroupsResponse> {
	   

	private String bizRegionId;

	private String nextToken;

	private String saleMode;

	private String instanceGroupName;

	private List<String> instanceGroupIdss;

	private Integer maxResults;

	private String chargeType;

	private String policyGroupId;

	private String keyPairId;

	private String status;
	public DescribeAndroidInstanceGroupsRequest() {
		super("eds-aic", "2023-09-30", "DescribeAndroidInstanceGroups");
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getSaleMode() {
		return this.saleMode;
	}

	public void setSaleMode(String saleMode) {
		this.saleMode = saleMode;
		if(saleMode != null){
			putQueryParameter("SaleMode", saleMode);
		}
	}

	public String getInstanceGroupName() {
		return this.instanceGroupName;
	}

	public void setInstanceGroupName(String instanceGroupName) {
		this.instanceGroupName = instanceGroupName;
		if(instanceGroupName != null){
			putQueryParameter("InstanceGroupName", instanceGroupName);
		}
	}

	public List<String> getInstanceGroupIdss() {
		return this.instanceGroupIdss;
	}

	public void setInstanceGroupIdss(List<String> instanceGroupIdss) {
		this.instanceGroupIdss = instanceGroupIdss;	
		if (instanceGroupIdss != null) {
			for (int i = 0; i < instanceGroupIdss.size(); i++) {
				putQueryParameter("InstanceGroupIds." + (i + 1) , instanceGroupIdss.get(i));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	public String getKeyPairId() {
		return this.keyPairId;
	}

	public void setKeyPairId(String keyPairId) {
		this.keyPairId = keyPairId;
		if(keyPairId != null){
			putQueryParameter("KeyPairId", keyPairId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeAndroidInstanceGroupsResponse> getResponseClass() {
		return DescribeAndroidInstanceGroupsResponse.class;
	}

}
