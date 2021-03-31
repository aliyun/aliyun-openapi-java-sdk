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
public class GetDeploymentArchiveRequest extends RpcAcsRequest<GetDeploymentArchiveResponse> {
	   

	private String deploymentArchiveId;
	public GetDeploymentArchiveRequest() {
		super("scsp", "2020-07-02", "GetDeploymentArchive");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeploymentArchiveId() {
		return this.deploymentArchiveId;
	}

	public void setDeploymentArchiveId(String deploymentArchiveId) {
		this.deploymentArchiveId = deploymentArchiveId;
		if(deploymentArchiveId != null){
			putQueryParameter("deploymentArchiveId", deploymentArchiveId);
		}
	}

	@Override
	public Class<GetDeploymentArchiveResponse> getResponseClass() {
		return GetDeploymentArchiveResponse.class;
	}

}
