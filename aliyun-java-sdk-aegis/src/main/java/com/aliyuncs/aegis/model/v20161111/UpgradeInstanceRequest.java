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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpgradeInstanceRequest extends RpcAcsRequest<UpgradeInstanceResponse> {
	
	public UpgradeInstanceRequest() {
		super("aegis", "2016-11-11", "UpgradeInstance", "vipaegis");
	}

	private String instanceId;

	private String clientToken;

	private Integer vmNumber;

	private Long ownerId;

	private Integer versionCode;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public Integer getVmNumber() {
		return this.vmNumber;
	}

	public void setVmNumber(Integer vmNumber) {
		this.vmNumber = vmNumber;
		if(vmNumber != null){
			putQueryParameter("VmNumber", vmNumber.toString());
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

	public Integer getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
		if(versionCode != null){
			putQueryParameter("VersionCode", versionCode.toString());
		}
	}

	@Override
	public Class<UpgradeInstanceResponse> getResponseClass() {
		return UpgradeInstanceResponse.class;
	}

}
