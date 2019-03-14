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

/**
 * @author auto create
 * @version 
 */
public class MigrateClusterHostGroupHostRequest extends RpcAcsRequest<MigrateClusterHostGroupHostResponse> {
	
	public MigrateClusterHostGroupHostRequest() {
		super("Emr", "2016-04-08", "MigrateClusterHostGroupHost");
	}

	private List<String> hostInstanceIdLists;

	private Long resourceOwnerId;

	private String hostGroupId;

	private String clusterId;

	public List<String> getHostInstanceIdLists() {
		return this.hostInstanceIdLists;
	}

	public void setHostInstanceIdLists(List<String> hostInstanceIdLists) {
		this.hostInstanceIdLists = hostInstanceIdLists;	
		if (hostInstanceIdLists != null) {
			for (int i = 0; i < hostInstanceIdLists.size(); i++) {
				putQueryParameter("HostInstanceIdList." + (i + 1) , hostInstanceIdLists.get(i));
			}
		}	
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

	public String getHostGroupId() {
		return this.hostGroupId;
	}

	public void setHostGroupId(String hostGroupId) {
		this.hostGroupId = hostGroupId;
		if(hostGroupId != null){
			putQueryParameter("HostGroupId", hostGroupId);
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

	@Override
	public Class<MigrateClusterHostGroupHostResponse> getResponseClass() {
		return MigrateClusterHostGroupHostResponse.class;
	}

}
