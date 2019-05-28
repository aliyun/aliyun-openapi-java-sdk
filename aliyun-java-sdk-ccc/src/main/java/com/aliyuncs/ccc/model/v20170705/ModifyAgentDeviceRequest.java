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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyAgentDeviceRequest extends RpcAcsRequest<ModifyAgentDeviceResponse> {
	
	public ModifyAgentDeviceRequest() {
		super("CCC", "2017-07-05", "ModifyAgentDevice");
	}

	private Long agentDeviceId;

	private String instanceId;

	private Integer isLogin;

	public Long getAgentDeviceId() {
		return this.agentDeviceId;
	}

	public void setAgentDeviceId(Long agentDeviceId) {
		this.agentDeviceId = agentDeviceId;
		if(agentDeviceId != null){
			putQueryParameter("AgentDeviceId", agentDeviceId.toString());
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

	public Integer getIsLogin() {
		return this.isLogin;
	}

	public void setIsLogin(Integer isLogin) {
		this.isLogin = isLogin;
		if(isLogin != null){
			putQueryParameter("IsLogin", isLogin.toString());
		}
	}

	@Override
	public Class<ModifyAgentDeviceResponse> getResponseClass() {
		return ModifyAgentDeviceResponse.class;
	}

}
