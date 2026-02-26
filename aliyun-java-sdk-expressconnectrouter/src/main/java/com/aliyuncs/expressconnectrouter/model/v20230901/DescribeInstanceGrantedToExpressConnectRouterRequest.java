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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.expressconnectrouter.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceGrantedToExpressConnectRouterRequest extends RpcAcsRequest<DescribeInstanceGrantedToExpressConnectRouterResponse> {
	   

	private String clientToken;

	private List<TagModels> tagModelss;

	private String resourceGroupId;

	private String ecrId;

	private String instanceRegionId;

	private Long instanceOwnerId;

	private String nextToken;

	private String instanceType;

	private Boolean dryRun;

	private String instanceId;

	private Integer maxResults;
	public DescribeInstanceGrantedToExpressConnectRouterRequest() {
		super("ExpressConnectRouter", "2023-09-01", "DescribeInstanceGrantedToExpressConnectRouter", "ecr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public List<TagModels> getTagModelss() {
		return this.tagModelss;
	}

	public void setTagModelss(List<TagModels> tagModelss) {
		this.tagModelss = tagModelss;	
		if (tagModelss != null) {
			for (int depth1 = 0; depth1 < tagModelss.size(); depth1++) {
				putBodyParameter("TagModels." + (depth1 + 1) + ".Id" , tagModelss.get(depth1).getId());
				putBodyParameter("TagModels." + (depth1 + 1) + ".ResourceId" , tagModelss.get(depth1).getResourceId());
				putBodyParameter("TagModels." + (depth1 + 1) + ".ResuorceType" , tagModelss.get(depth1).getResuorceType());
				putBodyParameter("TagModels." + (depth1 + 1) + ".RegionNo" , tagModelss.get(depth1).getRegionNo());
				putBodyParameter("TagModels." + (depth1 + 1) + ".AliUid" , tagModelss.get(depth1).getAliUid());
				putBodyParameter("TagModels." + (depth1 + 1) + ".TagKey" , tagModelss.get(depth1).getTagKey());
				putBodyParameter("TagModels." + (depth1 + 1) + ".TagValue" , tagModelss.get(depth1).getTagValue());
				putBodyParameter("TagModels." + (depth1 + 1) + ".Scope" , tagModelss.get(depth1).getScope());
				putBodyParameter("TagModels." + (depth1 + 1) + ".Category" , tagModelss.get(depth1).getCategory());
			}
		}	
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getEcrId() {
		return this.ecrId;
	}

	public void setEcrId(String ecrId) {
		this.ecrId = ecrId;
		if(ecrId != null){
			putBodyParameter("EcrId", ecrId);
		}
	}

	public String getInstanceRegionId() {
		return this.instanceRegionId;
	}

	public void setInstanceRegionId(String instanceRegionId) {
		this.instanceRegionId = instanceRegionId;
		if(instanceRegionId != null){
			putBodyParameter("InstanceRegionId", instanceRegionId);
		}
	}

	public Long getInstanceOwnerId() {
		return this.instanceOwnerId;
	}

	public void setInstanceOwnerId(Long instanceOwnerId) {
		this.instanceOwnerId = instanceOwnerId;
		if(instanceOwnerId != null){
			putBodyParameter("InstanceOwnerId", instanceOwnerId.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putBodyParameter("InstanceType", instanceType);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public static class TagModels {

		private Long id;

		private String resourceId;

		private String resuorceType;

		private String regionNo;

		private Long aliUid;

		private String tagKey;

		private String tagValue;

		private Integer scope;

		private Integer category;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResuorceType() {
			return this.resuorceType;
		}

		public void setResuorceType(String resuorceType) {
			this.resuorceType = resuorceType;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public Integer getScope() {
			return this.scope;
		}

		public void setScope(Integer scope) {
			this.scope = scope;
		}

		public Integer getCategory() {
			return this.category;
		}

		public void setCategory(Integer category) {
			this.category = category;
		}
	}

	@Override
	public Class<DescribeInstanceGrantedToExpressConnectRouterResponse> getResponseClass() {
		return DescribeInstanceGrantedToExpressConnectRouterResponse.class;
	}

}
