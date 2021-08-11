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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInferenceServerRequest extends RpcAcsRequest<CreateInferenceServerResponse> {
	   

	private String pipelineId;

	private String userData;

	private String modelType;

	private String functionName;

	private String testId;

	private String modelPath;
	public CreateInferenceServerRequest() {
		super("Mts", "2014-06-18", "CreateInferenceServer", "mts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
		if(modelType != null){
			putQueryParameter("ModelType", modelType);
		}
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
		if(functionName != null){
			putQueryParameter("FunctionName", functionName);
		}
	}

	public String getTestId() {
		return this.testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
		if(testId != null){
			putQueryParameter("TestId", testId);
		}
	}

	public String getModelPath() {
		return this.modelPath;
	}

	public void setModelPath(String modelPath) {
		this.modelPath = modelPath;
		if(modelPath != null){
			putQueryParameter("ModelPath", modelPath);
		}
	}

	@Override
	public Class<CreateInferenceServerResponse> getResponseClass() {
		return CreateInferenceServerResponse.class;
	}

}
