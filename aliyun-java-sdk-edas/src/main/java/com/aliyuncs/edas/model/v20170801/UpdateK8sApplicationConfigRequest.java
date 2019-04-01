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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateK8sApplicationConfigRequest extends RoaAcsRequest<UpdateK8sApplicationConfigResponse> {
	
	public UpdateK8sApplicationConfigRequest() {
		super("Edas", "2017-08-01", "UpdateK8sApplicationConfig");
		setUriPattern("/pop/v5/k8s/acs/k8s_app_configuration");
		setMethod(MethodType.PUT);
	}

	private String appId;

	private String memoryLimit;

	private String clusterId;

	private String cpuLimit;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getMemoryLimit() {
		return this.memoryLimit;
	}

	public void setMemoryLimit(String memoryLimit) {
		this.memoryLimit = memoryLimit;
		if(memoryLimit != null){
			putQueryParameter("MemoryLimit", memoryLimit);
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

	public String getCpuLimit() {
		return this.cpuLimit;
	}

	public void setCpuLimit(String cpuLimit) {
		this.cpuLimit = cpuLimit;
		if(cpuLimit != null){
			putQueryParameter("CpuLimit", cpuLimit);
		}
	}

	@Override
	public Class<UpdateK8sApplicationConfigResponse> getResponseClass() {
		return UpdateK8sApplicationConfigResponse.class;
	}

}
