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
public class RemoveClusterHostsRequest extends RpcAcsRequest<RemoveClusterHostsResponse> {
	
	public RemoveClusterHostsRequest() {
		super("Emr", "2016-04-08", "RemoveClusterHosts", "emr");
	}

	private Long resourceOwnerId;

	private String clusterId;

	private List<String> hostIdLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public List<String> getHostIdLists() {
		return this.hostIdLists;
	}

	public void setHostIdLists(List<String> hostIdLists) {
		this.hostIdLists = hostIdLists;	
		if (hostIdLists != null) {
			for (int i = 0; i < hostIdLists.size(); i++) {
				putQueryParameter("HostIdList." + (i + 1) , hostIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<RemoveClusterHostsResponse> getResponseClass() {
		return RemoveClusterHostsResponse.class;
	}

}
