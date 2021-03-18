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
public class ListTrafficMirrorSessionsRequest extends RpcAcsRequest<ListTrafficMirrorSessionsResponse> {
	   

	private Long resourceOwnerId;

	private String trafficMirrorSourceId;

	private Boolean enabled;

	private String trafficMirrorSessionName;

	private String nextToken;

	private List<String> trafficMirrorSessionIdss;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer priority;

	private Long ownerId;

	private String trafficMirrorTargetId;

	private String trafficMirrorFilterId;

	private Integer maxResults;

	private Integer virtualNetworkId;
	public ListTrafficMirrorSessionsRequest() {
		super("Vpc", "2016-04-28", "ListTrafficMirrorSessions", "vpc");
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

	public String getTrafficMirrorSourceId() {
		return this.trafficMirrorSourceId;
	}

	public void setTrafficMirrorSourceId(String trafficMirrorSourceId) {
		this.trafficMirrorSourceId = trafficMirrorSourceId;
		if(trafficMirrorSourceId != null){
			putQueryParameter("TrafficMirrorSourceId", trafficMirrorSourceId);
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public String getTrafficMirrorSessionName() {
		return this.trafficMirrorSessionName;
	}

	public void setTrafficMirrorSessionName(String trafficMirrorSessionName) {
		this.trafficMirrorSessionName = trafficMirrorSessionName;
		if(trafficMirrorSessionName != null){
			putQueryParameter("TrafficMirrorSessionName", trafficMirrorSessionName);
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

	public List<String> getTrafficMirrorSessionIdss() {
		return this.trafficMirrorSessionIdss;
	}

	public void setTrafficMirrorSessionIdss(List<String> trafficMirrorSessionIdss) {
		this.trafficMirrorSessionIdss = trafficMirrorSessionIdss;	
		if (trafficMirrorSessionIdss != null) {
			for (int i = 0; i < trafficMirrorSessionIdss.size(); i++) {
				putQueryParameter("TrafficMirrorSessionIds." + (i + 1) , trafficMirrorSessionIdss.get(i));
			}
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
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

	public String getTrafficMirrorTargetId() {
		return this.trafficMirrorTargetId;
	}

	public void setTrafficMirrorTargetId(String trafficMirrorTargetId) {
		this.trafficMirrorTargetId = trafficMirrorTargetId;
		if(trafficMirrorTargetId != null){
			putQueryParameter("TrafficMirrorTargetId", trafficMirrorTargetId);
		}
	}

	public String getTrafficMirrorFilterId() {
		return this.trafficMirrorFilterId;
	}

	public void setTrafficMirrorFilterId(String trafficMirrorFilterId) {
		this.trafficMirrorFilterId = trafficMirrorFilterId;
		if(trafficMirrorFilterId != null){
			putQueryParameter("TrafficMirrorFilterId", trafficMirrorFilterId);
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

	public Integer getVirtualNetworkId() {
		return this.virtualNetworkId;
	}

	public void setVirtualNetworkId(Integer virtualNetworkId) {
		this.virtualNetworkId = virtualNetworkId;
		if(virtualNetworkId != null){
			putQueryParameter("VirtualNetworkId", virtualNetworkId.toString());
		}
	}

	@Override
	public Class<ListTrafficMirrorSessionsResponse> getResponseClass() {
		return ListTrafficMirrorSessionsResponse.class;
	}

}
