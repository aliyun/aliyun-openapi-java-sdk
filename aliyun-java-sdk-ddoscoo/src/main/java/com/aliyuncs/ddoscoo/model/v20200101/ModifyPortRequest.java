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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPortRequest extends RpcAcsRequest<ModifyPortResponse> {
	   

	private String backendPort;

	private String frontendProtocol;

	private String instanceId;

	private List<String> realServerss;

	private String frontendPort;
	public ModifyPortRequest() {
		super("ddoscoo", "2020-01-01", "ModifyPort");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBackendPort() {
		return this.backendPort;
	}

	public void setBackendPort(String backendPort) {
		this.backendPort = backendPort;
		if(backendPort != null){
			putQueryParameter("BackendPort", backendPort);
		}
	}

	public String getFrontendProtocol() {
		return this.frontendProtocol;
	}

	public void setFrontendProtocol(String frontendProtocol) {
		this.frontendProtocol = frontendProtocol;
		if(frontendProtocol != null){
			putQueryParameter("FrontendProtocol", frontendProtocol);
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

	public List<String> getRealServerss() {
		return this.realServerss;
	}

	public void setRealServerss(List<String> realServerss) {
		this.realServerss = realServerss;	
		if (realServerss != null) {
			for (int i = 0; i < realServerss.size(); i++) {
				putQueryParameter("RealServers." + (i + 1) , realServerss.get(i));
			}
		}	
	}

	public String getFrontendPort() {
		return this.frontendPort;
	}

	public void setFrontendPort(String frontendPort) {
		this.frontendPort = frontendPort;
		if(frontendPort != null){
			putQueryParameter("FrontendPort", frontendPort);
		}
	}

	@Override
	public Class<ModifyPortResponse> getResponseClass() {
		return ModifyPortResponse.class;
	}

}
