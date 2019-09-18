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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetCasterSyncGroupRequest extends RpcAcsRequest<SetCasterSyncGroupResponse> {
	
	public SetCasterSyncGroupRequest() {
		super("live", "2016-11-01", "SetCasterSyncGroup", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String casterId;

	private Long ownerId;

	private List<SyncGroup> syncGroups;

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
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

	public List<SyncGroup> getSyncGroups() {
		return this.syncGroups;
	}

	public void setSyncGroups(List<SyncGroup> syncGroups) {
		this.syncGroups = syncGroups;	
		if (syncGroups != null) {
			for (int depth1 = 0; depth1 < syncGroups.size(); depth1++) {
				putQueryParameter("SyncGroup." + (depth1 + 1) + ".Mode" , syncGroups.get(depth1).getMode());
				putQueryParameter("SyncGroup." + (depth1 + 1) + ".HostResourceId" , syncGroups.get(depth1).getHostResourceId());
				if (syncGroups.get(depth1).getResourceIdss() != null) {
					for (int i = 0; i < syncGroups.get(depth1).getResourceIdss().size(); i++) {
						putQueryParameter("SyncGroup." + (depth1 + 1) + ".ResourceIds." + (i + 1) , syncGroups.get(depth1).getResourceIdss().get(i));
					}
				}
			}
		}	
	}

	public static class SyncGroup {

		private Integer mode;

		private String hostResourceId;

		private List<String> resourceIdss;

		public Integer getMode() {
			return this.mode;
		}

		public void setMode(Integer mode) {
			this.mode = mode;
		}

		public String getHostResourceId() {
			return this.hostResourceId;
		}

		public void setHostResourceId(String hostResourceId) {
			this.hostResourceId = hostResourceId;
		}

		public List<String> getResourceIdss() {
			return this.resourceIdss;
		}

		public void setResourceIdss(List<String> resourceIdss) {
			this.resourceIdss = resourceIdss;
		}
	}

	@Override
	public Class<SetCasterSyncGroupResponse> getResponseClass() {
		return SetCasterSyncGroupResponse.class;
	}

}
