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

package com.aliyuncs.nlp_automl.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployModelRequest extends RpcAcsRequest<DeployModelResponse> {
	   

	private Long modelId;

	private String optType;

	private Long projectId;

	private String modelVersion;
	public DeployModelRequest() {
		super("nlp-automl", "2019-11-11", "DeployModel", "nlpautoml");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getModelId() {
		return this.modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putBodyParameter("ModelId", modelId.toString());
		}
	}

	public String getOptType() {
		return this.optType;
	}

	public void setOptType(String optType) {
		this.optType = optType;
		if(optType != null){
			putBodyParameter("OptType", optType);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putBodyParameter("ModelVersion", modelVersion);
		}
	}

	@Override
	public Class<DeployModelResponse> getResponseClass() {
		return DeployModelResponse.class;
	}

}
