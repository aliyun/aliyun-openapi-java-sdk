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

package com.aliyuncs.hsm.model.v20180111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ConfigWhiteListRequest extends RpcAcsRequest<ConfigWhiteListResponse> {
	
	public ConfigWhiteListRequest() {
		super("hsm", "2018-01-11", "ConfigWhiteList", "hsm");
	}

	private Long resourceOwnerId;

	private String instanceId;

	private String sourceIp;

	private String whiteList;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getWhiteList() {
		return this.whiteList;
	}

	public void setWhiteList(String whiteList) {
		this.whiteList = whiteList;
		if(whiteList != null){
			putQueryParameter("WhiteList", whiteList);
		}
	}

	@Override
	public Class<ConfigWhiteListResponse> getResponseClass() {
		return ConfigWhiteListResponse.class;
	}

}
