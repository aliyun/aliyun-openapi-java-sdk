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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateMonitorAgentProcessRequest extends RpcAcsRequest<CreateMonitorAgentProcessResponse> {
	
	public CreateMonitorAgentProcessRequest() {
		super("Cms", "2019-01-01", "CreateMonitorAgentProcess", "cms");
	}

	private String instanceId;

	private String processName;

	private String processUser;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
		if(processName != null){
			putQueryParameter("ProcessName", processName);
		}
	}

	public String getProcessUser() {
		return this.processUser;
	}

	public void setProcessUser(String processUser) {
		this.processUser = processUser;
		if(processUser != null){
			putQueryParameter("ProcessUser", processUser);
		}
	}

	@Override
	public Class<CreateMonitorAgentProcessResponse> getResponseClass() {
		return CreateMonitorAgentProcessResponse.class;
	}

}
