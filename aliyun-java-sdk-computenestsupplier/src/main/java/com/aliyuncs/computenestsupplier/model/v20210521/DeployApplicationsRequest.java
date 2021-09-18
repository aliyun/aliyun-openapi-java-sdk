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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployApplicationsRequest extends RpcAcsRequest<DeployApplicationsResponse> {
	   

	private String clientToken;

	private String deploymentVersion;

	private List<String> applicationGroupNamess;

	private String deploymentId;
	public DeployApplicationsRequest() {
		super("ComputeNestSupplier", "2021-05-21", "DeployApplications");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDeploymentVersion() {
		return this.deploymentVersion;
	}

	public void setDeploymentVersion(String deploymentVersion) {
		this.deploymentVersion = deploymentVersion;
		if(deploymentVersion != null){
			putQueryParameter("DeploymentVersion", deploymentVersion);
		}
	}

	public List<String> getApplicationGroupNamess() {
		return this.applicationGroupNamess;
	}

	public void setApplicationGroupNamess(List<String> applicationGroupNamess) {
		this.applicationGroupNamess = applicationGroupNamess;	
		if (applicationGroupNamess != null) {
			for (int i = 0; i < applicationGroupNamess.size(); i++) {
				putQueryParameter("ApplicationGroupNames." + (i + 1) , applicationGroupNamess.get(i));
			}
		}	
	}

	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		if(deploymentId != null){
			putQueryParameter("DeploymentId", deploymentId);
		}
	}

	@Override
	public Class<DeployApplicationsResponse> getResponseClass() {
		return DeployApplicationsResponse.class;
	}

}
