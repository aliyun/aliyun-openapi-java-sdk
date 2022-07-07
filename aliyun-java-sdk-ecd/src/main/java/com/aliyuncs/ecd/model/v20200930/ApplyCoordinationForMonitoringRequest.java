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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyCoordinationForMonitoringRequest extends RpcAcsRequest<ApplyCoordinationForMonitoringResponse> {
	   

	private String uuid;

	private String initiatorType;

	private String coordinatePolicyType;

	private List<ResourceCandidates> resourceCandidatess;

	private String endUserId;
	public ApplyCoordinationForMonitoringRequest() {
		super("ecd", "2020-09-30", "ApplyCoordinationForMonitoring");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	public String getInitiatorType() {
		return this.initiatorType;
	}

	public void setInitiatorType(String initiatorType) {
		this.initiatorType = initiatorType;
		if(initiatorType != null){
			putQueryParameter("InitiatorType", initiatorType);
		}
	}

	public String getCoordinatePolicyType() {
		return this.coordinatePolicyType;
	}

	public void setCoordinatePolicyType(String coordinatePolicyType) {
		this.coordinatePolicyType = coordinatePolicyType;
		if(coordinatePolicyType != null){
			putQueryParameter("CoordinatePolicyType", coordinatePolicyType);
		}
	}

	public List<ResourceCandidates> getResourceCandidatess() {
		return this.resourceCandidatess;
	}

	public void setResourceCandidatess(List<ResourceCandidates> resourceCandidatess) {
		this.resourceCandidatess = resourceCandidatess;	
		if (resourceCandidatess != null) {
			for (int depth1 = 0; depth1 < resourceCandidatess.size(); depth1++) {
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".ResourceId" , resourceCandidatess.get(depth1).getResourceId());
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".ResourceProperties" , resourceCandidatess.get(depth1).getResourceProperties());
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".ResourceName" , resourceCandidatess.get(depth1).getResourceName());
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".ResourceType" , resourceCandidatess.get(depth1).getResourceType());
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".OwnerWyId" , resourceCandidatess.get(depth1).getOwnerWyId());
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".ResourceRegionId" , resourceCandidatess.get(depth1).getResourceRegionId());
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".OwnerAliUid" , resourceCandidatess.get(depth1).getOwnerAliUid());
				putQueryParameter("ResourceCandidates." + (depth1 + 1) + ".OwnerEndUserId" , resourceCandidatess.get(depth1).getOwnerEndUserId());
			}
		}	
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putQueryParameter("EndUserId", endUserId);
		}
	}

	public static class ResourceCandidates {

		private String resourceId;

		private String resourceProperties;

		private String resourceName;

		private String resourceType;

		private String ownerWyId;

		private String resourceRegionId;

		private Long ownerAliUid;

		private String ownerEndUserId;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceProperties() {
			return this.resourceProperties;
		}

		public void setResourceProperties(String resourceProperties) {
			this.resourceProperties = resourceProperties;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getOwnerWyId() {
			return this.ownerWyId;
		}

		public void setOwnerWyId(String ownerWyId) {
			this.ownerWyId = ownerWyId;
		}

		public String getResourceRegionId() {
			return this.resourceRegionId;
		}

		public void setResourceRegionId(String resourceRegionId) {
			this.resourceRegionId = resourceRegionId;
		}

		public Long getOwnerAliUid() {
			return this.ownerAliUid;
		}

		public void setOwnerAliUid(Long ownerAliUid) {
			this.ownerAliUid = ownerAliUid;
		}

		public String getOwnerEndUserId() {
			return this.ownerEndUserId;
		}

		public void setOwnerEndUserId(String ownerEndUserId) {
			this.ownerEndUserId = ownerEndUserId;
		}
	}

	@Override
	public Class<ApplyCoordinationForMonitoringResponse> getResponseClass() {
		return ApplyCoordinationForMonitoringResponse.class;
	}

}
