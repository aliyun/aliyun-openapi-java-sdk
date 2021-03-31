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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CollectDeploymentArchiveRequest extends RpcAcsRequest<CollectDeploymentArchiveResponse> {
	   

	private String deploymentCode;

	private Integer envType;

	private String name;
	public CollectDeploymentArchiveRequest() {
		super("scsp", "2020-07-02", "CollectDeploymentArchive");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeploymentCode() {
		return this.deploymentCode;
	}

	public void setDeploymentCode(String deploymentCode) {
		this.deploymentCode = deploymentCode;
		if(deploymentCode != null){
			putQueryParameter("DeploymentCode", deploymentCode);
		}
	}

	public Integer getEnvType() {
		return this.envType;
	}

	public void setEnvType(Integer envType) {
		this.envType = envType;
		if(envType != null){
			putQueryParameter("EnvType", envType.toString());
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

	@Override
	public Class<CollectDeploymentArchiveResponse> getResponseClass() {
		return CollectDeploymentArchiveResponse.class;
	}

}
