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

/**
 * @author auto create
 * @version 
 */
public class RestartClusterRequest extends RpcAcsRequest<RestartClusterResponse> {
	
	public RestartClusterRequest() {
		super("Emr", "2016-04-08", "RestartCluster");
	}

	private Boolean rollingRestart;

	private Long resourceOwnerId;

	private Boolean upgradedHostGroupOnly;

	private String clusterId;

	public Boolean getRollingRestart() {
		return this.rollingRestart;
	}

	public void setRollingRestart(Boolean rollingRestart) {
		this.rollingRestart = rollingRestart;
		if(rollingRestart != null){
			putQueryParameter("RollingRestart", rollingRestart.toString());
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

	public Boolean getUpgradedHostGroupOnly() {
		return this.upgradedHostGroupOnly;
	}

	public void setUpgradedHostGroupOnly(Boolean upgradedHostGroupOnly) {
		this.upgradedHostGroupOnly = upgradedHostGroupOnly;
		if(upgradedHostGroupOnly != null){
			putQueryParameter("UpgradedHostGroupOnly", upgradedHostGroupOnly.toString());
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
	public Class<RestartClusterResponse> getResponseClass() {
		return RestartClusterResponse.class;
	}

}
