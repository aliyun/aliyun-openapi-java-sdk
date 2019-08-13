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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PlanHostNameRequest extends RpcAcsRequest<PlanHostNameResponse> {
	
	public PlanHostNameRequest() {
		super("Emr", "2016-04-08", "PlanHostName", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private List<HostGroup> hostGroups;

	private List<HostInfo> hostInfos;

	private String clusterId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<HostGroup> getHostGroups() {
		return this.hostGroups;
	}

	public void setHostGroups(List<HostGroup> hostGroups) {
		this.hostGroups = hostGroups;	
		if (hostGroups != null) {
			for (int depth1 = 0; depth1 < hostGroups.size(); depth1++) {
				putQueryParameter("HostGroup." + (depth1 + 1) + ".GroupType" , hostGroups.get(depth1).getGroupType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".GroupName" , hostGroups.get(depth1).getGroupName());
			}
		}	
	}

	public List<HostInfo> getHostInfos() {
		return this.hostInfos;
	}

	public void setHostInfos(List<HostInfo> hostInfos) {
		this.hostInfos = hostInfos;	
		if (hostInfos != null) {
			for (int depth1 = 0; depth1 < hostInfos.size(); depth1++) {
				putQueryParameter("HostInfo." + (depth1 + 1) + ".HpHostBizId" , hostInfos.get(depth1).getHpHostBizId());
				putQueryParameter("HostInfo." + (depth1 + 1) + ".HostGroupName" , hostInfos.get(depth1).getHostGroupName());
			}
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public static class HostGroup {

		private String groupType;

		private String groupName;

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	public static class HostInfo {

		private String hpHostBizId;

		private String hostGroupName;

		public String getHpHostBizId() {
			return this.hpHostBizId;
		}

		public void setHpHostBizId(String hpHostBizId) {
			this.hpHostBizId = hpHostBizId;
		}

		public String getHostGroupName() {
			return this.hostGroupName;
		}

		public void setHostGroupName(String hostGroupName) {
			this.hostGroupName = hostGroupName;
		}
	}

	@Override
	public Class<PlanHostNameResponse> getResponseClass() {
		return PlanHostNameResponse.class;
	}

}
