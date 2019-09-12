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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GatherAppEnvLogRequest extends RoaAcsRequest<GatherAppEnvLogResponse> {
	
	public GatherAppEnvLogRequest() {
		super("WebPlus", "2019-03-20", "GatherAppEnvLog");
		setUriPattern("/pop/v1/wam/appEnv/gatherLog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String logPath;

	private String targetInstances;

	private String envId;

	public String getLogPath() {
		return this.logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
		if(logPath != null){
			putBodyParameter("LogPath", logPath);
		}
	}

	public String getTargetInstances() {
		return this.targetInstances;
	}

	public void setTargetInstances(String targetInstances) {
		this.targetInstances = targetInstances;
		if(targetInstances != null){
			putBodyParameter("TargetInstances", targetInstances);
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putBodyParameter("EnvId", envId);
		}
	}

	@Override
	public Class<GatherAppEnvLogResponse> getResponseClass() {
		return GatherAppEnvLogResponse.class;
	}

}
