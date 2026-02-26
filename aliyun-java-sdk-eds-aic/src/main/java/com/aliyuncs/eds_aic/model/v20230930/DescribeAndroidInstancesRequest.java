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
public class DescribeAndroidInstancesRequest extends RpcAcsRequest<DescribeAndroidInstancesResponse> {
	   

	private String bizRegionId;

	private String instanceGroupId;

	private List<String> androidInstanceIdss;

	private List<String> qosRuleIdss;

	private String authorizedUserId;

	private String nextToken;

	private List<String> officeSiteIdss;

	private String saleMode;

	private List<Tag> tags;

	private String nodeId;

	private String instanceGroupName;

	private String androidInstanceName;

	private List<String> instanceGroupIdss;

	private String appManagePolicyId;

	private String privateIpAddress;

	private String nodeName;

	private Integer maxResults;

	private String chargeType;

	private String keyPairId;

	private String status;
	public DescribeAndroidInstancesRequest() {
		super("eds-aic", "2023-09-30", "DescribeAndroidInstances");
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

	public String getInstanceGroupId() {
		return this.instanceGroupId;
	}

	public void setInstanceGroupId(String instanceGroupId) {
		this.instanceGroupId = instanceGroupId;
		if(instanceGroupId != null){
			putQueryParameter("InstanceGroupId", instanceGroupId);
		}
	}

	public List<String> getAndroidInstanceIdss() {
		return this.androidInstanceIdss;
	}

	public void setAndroidInstanceIdss(List<String> androidInstanceIdss) {
		this.androidInstanceIdss = androidInstanceIdss;	
		if (androidInstanceIdss != null) {
			for (int i = 0; i < androidInstanceIdss.size(); i++) {
				putQueryParameter("AndroidInstanceIds." + (i + 1) , androidInstanceIdss.get(i));
			}
		}	
	}

	public List<String> getQosRuleIdss() {
		return this.qosRuleIdss;
	}

	public void setQosRuleIdss(List<String> qosRuleIdss) {
		this.qosRuleIdss = qosRuleIdss;	
		if (qosRuleIdss != null) {
			for (int i = 0; i < qosRuleIdss.size(); i++) {
				putQueryParameter("QosRuleIds." + (i + 1) , qosRuleIdss.get(i));
			}
		}	
	}

	public String getAuthorizedUserId() {
		return this.authorizedUserId;
	}

	public void setAuthorizedUserId(String authorizedUserId) {
		this.authorizedUserId = authorizedUserId;
		if(authorizedUserId != null){
			putQueryParameter("AuthorizedUserId", authorizedUserId);
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

	public List<String> getOfficeSiteIdss() {
		return this.officeSiteIdss;
	}

	public void setOfficeSiteIdss(List<String> officeSiteIdss) {
		this.officeSiteIdss = officeSiteIdss;	
		if (officeSiteIdss != null) {
			for (int i = 0; i < officeSiteIdss.size(); i++) {
				putQueryParameter("OfficeSiteIds." + (i + 1) , officeSiteIdss.get(i));
			}
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
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

	public String getAndroidInstanceName() {
		return this.androidInstanceName;
	}

	public void setAndroidInstanceName(String androidInstanceName) {
		this.androidInstanceName = androidInstanceName;
		if(androidInstanceName != null){
			putQueryParameter("AndroidInstanceName", androidInstanceName);
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

	public String getAppManagePolicyId() {
		return this.appManagePolicyId;
	}

	public void setAppManagePolicyId(String appManagePolicyId) {
		this.appManagePolicyId = appManagePolicyId;
		if(appManagePolicyId != null){
			putQueryParameter("AppManagePolicyId", appManagePolicyId);
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putQueryParameter("NodeName", nodeName);
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

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<DescribeAndroidInstancesResponse> getResponseClass() {
		return DescribeAndroidInstancesResponse.class;
	}

}
