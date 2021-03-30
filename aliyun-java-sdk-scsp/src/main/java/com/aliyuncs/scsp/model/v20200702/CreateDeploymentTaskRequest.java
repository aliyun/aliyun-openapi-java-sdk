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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeploymentTaskRequest extends RpcAcsRequest<CreateDeploymentTaskResponse> {
	   

	private String deploymentCode;

	private String deploymentArchiveId;

	private List<String> appArchiveIds;

	private String envType;
	public CreateDeploymentTaskRequest() {
		super("scsp", "2020-07-02", "CreateDeploymentTask");
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

	public String getDeploymentArchiveId() {
		return this.deploymentArchiveId;
	}

	public void setDeploymentArchiveId(String deploymentArchiveId) {
		this.deploymentArchiveId = deploymentArchiveId;
		if(deploymentArchiveId != null){
			putQueryParameter("DeploymentArchiveId", deploymentArchiveId);
		}
	}

	public List<String> getAppArchiveIds() {
		return this.appArchiveIds;
	}

	public void setAppArchiveIds(List<String> appArchiveIds) {
		this.appArchiveIds = appArchiveIds;	
		if (appArchiveIds != null) {
			for (int depth1 = 0; depth1 < appArchiveIds.size(); depth1++) {
				putQueryParameter("AppArchiveIds." + (depth1 + 1) , appArchiveIds.get(depth1));
			}
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

	@Override
	public Class<CreateDeploymentTaskResponse> getResponseClass() {
		return CreateDeploymentTaskResponse.class;
	}

}
