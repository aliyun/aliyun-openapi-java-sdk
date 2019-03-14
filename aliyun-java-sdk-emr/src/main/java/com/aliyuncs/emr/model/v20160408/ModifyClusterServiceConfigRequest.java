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
public class ModifyClusterServiceConfigRequest extends RpcAcsRequest<ModifyClusterServiceConfigResponse> {
	
	public ModifyClusterServiceConfigRequest() {
		super("Emr", "2016-04-08", "ModifyClusterServiceConfig", "emr");
	}

	private Long resourceOwnerId;

	private String customConfigParams;

	private String configType;

	private String hostInstanceId;

	private String groupId;

	private String serviceName;

	private String comment;

	private String clusterId;

	private String configParams;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getCustomConfigParams() {
		return this.customConfigParams;
	}

	public void setCustomConfigParams(String customConfigParams) {
		this.customConfigParams = customConfigParams;
		if(customConfigParams != null){
			putQueryParameter("CustomConfigParams", customConfigParams);
		}
	}

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
		if(configType != null){
			putQueryParameter("ConfigType", configType);
		}
	}

	public String getHostInstanceId() {
		return this.hostInstanceId;
	}

	public void setHostInstanceId(String hostInstanceId) {
		this.hostInstanceId = hostInstanceId;
		if(hostInstanceId != null){
			putQueryParameter("HostInstanceId", hostInstanceId);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
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

	public String getConfigParams() {
		return this.configParams;
	}

	public void setConfigParams(String configParams) {
		this.configParams = configParams;
		if(configParams != null){
			putQueryParameter("ConfigParams", configParams);
		}
	}

	@Override
	public Class<ModifyClusterServiceConfigResponse> getResponseClass() {
		return ModifyClusterServiceConfigResponse.class;
	}

}
