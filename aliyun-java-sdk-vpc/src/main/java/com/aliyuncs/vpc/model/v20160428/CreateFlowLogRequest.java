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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFlowLogRequest extends RpcAcsRequest<CreateFlowLogResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String resourceGroupId;

	private String ipVersion;

	private List<Tag> tags;

	private String resourceId;

	private String projectName;

	private String logStoreName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> trafficPaths;

	private Integer aggregationInterval;

	private Long ownerId;

	private String resourceType;

	private String trafficType;

	private String flowLogName;
	public CreateFlowLogRequest() {
		super("Vpc", "2016-04-28", "CreateFlowLog", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
		if(ipVersion != null){
			putQueryParameter("IpVersion", ipVersion);
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

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getLogStoreName() {
		return this.logStoreName;
	}

	public void setLogStoreName(String logStoreName) {
		this.logStoreName = logStoreName;
		if(logStoreName != null){
			putQueryParameter("LogStoreName", logStoreName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public List<String> getTrafficPaths() {
		return this.trafficPaths;
	}

	public void setTrafficPaths(List<String> trafficPaths) {
		this.trafficPaths = trafficPaths;	
		if (trafficPaths != null) {
			for (int i = 0; i < trafficPaths.size(); i++) {
				putQueryParameter("TrafficPath." + (i + 1) , trafficPaths.get(i));
			}
		}	
	}

	public Integer getAggregationInterval() {
		return this.aggregationInterval;
	}

	public void setAggregationInterval(Integer aggregationInterval) {
		this.aggregationInterval = aggregationInterval;
		if(aggregationInterval != null){
			putQueryParameter("AggregationInterval", aggregationInterval.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public String getTrafficType() {
		return this.trafficType;
	}

	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
		if(trafficType != null){
			putQueryParameter("TrafficType", trafficType);
		}
	}

	public String getFlowLogName() {
		return this.flowLogName;
	}

	public void setFlowLogName(String flowLogName) {
		this.flowLogName = flowLogName;
		if(flowLogName != null){
			putQueryParameter("FlowLogName", flowLogName);
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
	public Class<CreateFlowLogResponse> getResponseClass() {
		return CreateFlowLogResponse.class;
	}

}
