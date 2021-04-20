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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddAgentDeviceRequest extends RpcAcsRequest<AddAgentDeviceResponse> {
	   

	private String remark;

	private String clientPort;

	private String instanceId;

	private String clientIp;

	private String browserVersion;
	public AddAgentDeviceRequest() {
		super("CCC", "2017-07-05", "AddAgentDevice", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("Remark", remark);
		}
	}

	public String getClientPort() {
		return this.clientPort;
	}

	public void setClientPort(String clientPort) {
		this.clientPort = clientPort;
		if(clientPort != null){
			putQueryParameter("ClientPort", clientPort);
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

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putQueryParameter("ClientIp", clientIp);
		}
	}

	public String getBrowserVersion() {
		return this.browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
		if(browserVersion != null){
			putBodyParameter("BrowserVersion", browserVersion);
		}
	}

	@Override
	public Class<AddAgentDeviceResponse> getResponseClass() {
		return AddAgentDeviceResponse.class;
	}

}
