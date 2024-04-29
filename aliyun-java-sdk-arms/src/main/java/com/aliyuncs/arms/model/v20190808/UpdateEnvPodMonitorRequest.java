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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateEnvPodMonitorRequest extends RpcAcsRequest<UpdateEnvPodMonitorResponse> {
	   

	private Boolean dryRun;

	private String aliyunLang;

	private String configYaml;

	private String podMonitorName;

	private String environmentId;

	private String namespace;
	public UpdateEnvPodMonitorRequest() {
		super("ARMS", "2019-08-08", "UpdateEnvPodMonitor", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getAliyunLang() {
		return this.aliyunLang;
	}

	public void setAliyunLang(String aliyunLang) {
		this.aliyunLang = aliyunLang;
		if(aliyunLang != null){
			putQueryParameter("AliyunLang", aliyunLang);
		}
	}

	public String getConfigYaml() {
		return this.configYaml;
	}

	public void setConfigYaml(String configYaml) {
		this.configYaml = configYaml;
		if(configYaml != null){
			putBodyParameter("ConfigYaml", configYaml);
		}
	}

	public String getPodMonitorName() {
		return this.podMonitorName;
	}

	public void setPodMonitorName(String podMonitorName) {
		this.podMonitorName = podMonitorName;
		if(podMonitorName != null){
			putQueryParameter("PodMonitorName", podMonitorName);
		}
	}

	public String getEnvironmentId() {
		return this.environmentId;
	}

	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
		if(environmentId != null){
			putQueryParameter("EnvironmentId", environmentId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<UpdateEnvPodMonitorResponse> getResponseClass() {
		return UpdateEnvPodMonitorResponse.class;
	}

}
