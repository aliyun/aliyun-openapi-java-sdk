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
public class QueryDeploymentArchiveRequest extends RpcAcsRequest<QueryDeploymentArchiveResponse> {
	   

	private Integer size;

	private String deploymentCode;

	private Integer envType;

	private Integer index;
	public QueryDeploymentArchiveRequest() {
		super("scsp", "2020-07-02", "QueryDeploymentArchive");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
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

	public Integer getIndex() {
		return this.index;
	}

	public void setIndex(Integer index) {
		this.index = index;
		if(index != null){
			putQueryParameter("Index", index.toString());
		}
	}

	@Override
	public Class<QueryDeploymentArchiveResponse> getResponseClass() {
		return QueryDeploymentArchiveResponse.class;
	}

}
