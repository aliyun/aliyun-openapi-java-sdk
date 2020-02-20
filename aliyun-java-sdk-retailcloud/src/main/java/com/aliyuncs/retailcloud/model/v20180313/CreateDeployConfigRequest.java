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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeployConfigRequest extends RpcAcsRequest<CreateDeployConfigResponse> {
	   

	private String codePath;

	private List<String> configMapLists;

	private Long appId;

	private String configMap;

	private String statefulSet;

	private String envType;

	private String name;

	private String deployment;
	public CreateDeployConfigRequest() {
		super("retailcloud", "2018-03-13", "CreateDeployConfig", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCodePath() {
		return this.codePath;
	}

	public void setCodePath(String codePath) {
		this.codePath = codePath;
		if(codePath != null){
			putQueryParameter("CodePath", codePath);
		}
	}

	public List<String> getConfigMapLists() {
		return this.configMapLists;
	}

	public void setConfigMapLists(List<String> configMapLists) {
		this.configMapLists = configMapLists;	
		if (configMapLists != null) {
			for (int i = 0; i < configMapLists.size(); i++) {
				putQueryParameter("ConfigMapList." + (i + 1) , configMapLists.get(i));
			}
		}	
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getConfigMap() {
		return this.configMap;
	}

	public void setConfigMap(String configMap) {
		this.configMap = configMap;
		if(configMap != null){
			putQueryParameter("ConfigMap", configMap);
		}
	}

	public String getStatefulSet() {
		return this.statefulSet;
	}

	public void setStatefulSet(String statefulSet) {
		this.statefulSet = statefulSet;
		if(statefulSet != null){
			putQueryParameter("StatefulSet", statefulSet);
		}
	}

	public String getEnvType() {
		return this.envType;
	}

	public void setEnvType(String envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDeployment() {
		return this.deployment;
	}

	public void setDeployment(String deployment) {
		this.deployment = deployment;
		if(deployment != null){
			putQueryParameter("Deployment", deployment);
		}
	}

	@Override
	public Class<CreateDeployConfigResponse> getResponseClass() {
		return CreateDeployConfigResponse.class;
	}

}
