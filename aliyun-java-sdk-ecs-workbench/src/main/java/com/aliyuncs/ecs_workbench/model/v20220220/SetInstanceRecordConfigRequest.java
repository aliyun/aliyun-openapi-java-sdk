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

package com.aliyuncs.ecs_workbench.model.v20220220;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetInstanceRecordConfigRequest extends RpcAcsRequest<SetInstanceRecordConfigResponse> {
	   

	private Boolean enabled;

	private String recordStorageTarget;

	private String instanceId;

	private Integer expirationDays;
	public SetInstanceRecordConfigRequest() {
		super("ecs-workbench", "2022-02-20", "SetInstanceRecordConfig", "ecs-workbench");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putBodyParameter("Enabled", enabled.toString());
		}
	}

	public String getRecordStorageTarget() {
		return this.recordStorageTarget;
	}

	public void setRecordStorageTarget(String recordStorageTarget) {
		this.recordStorageTarget = recordStorageTarget;
		if(recordStorageTarget != null){
			putBodyParameter("RecordStorageTarget", recordStorageTarget);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Integer getExpirationDays() {
		return this.expirationDays;
	}

	public void setExpirationDays(Integer expirationDays) {
		this.expirationDays = expirationDays;
		if(expirationDays != null){
			putBodyParameter("ExpirationDays", expirationDays.toString());
		}
	}

	@Override
	public Class<SetInstanceRecordConfigResponse> getResponseClass() {
		return SetInstanceRecordConfigResponse.class;
	}

}
