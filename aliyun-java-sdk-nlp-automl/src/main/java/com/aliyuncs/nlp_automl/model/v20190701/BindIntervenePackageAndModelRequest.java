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

package com.aliyuncs.nlp_automl.model.v20190701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindIntervenePackageAndModelRequest extends RpcAcsRequest<BindIntervenePackageAndModelResponse> {
	   

	private Long modelId;

	private Long packageId;

	private Long projectId;

	private String modelVersion;
	public BindIntervenePackageAndModelRequest() {
		super("nlp-automl", "2019-07-01", "BindIntervenePackageAndModel", "nlpautoml");
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
			putQueryParameter("ModelId", modelId.toString());
		}
	}

	public Long getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Long packageId) {
		this.packageId = packageId;
		if(packageId != null){
			putQueryParameter("PackageId", packageId.toString());
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
		if(modelVersion != null){
			putQueryParameter("ModelVersion", modelVersion);
		}
	}

	@Override
	public Class<BindIntervenePackageAndModelResponse> getResponseClass() {
		return BindIntervenePackageAndModelResponse.class;
	}

}
