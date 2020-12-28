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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateModelRequest extends RpcAcsRequest<CreateModelResponse> {
	   

	private String isIncrementalTrain;

	private String modelName;

	private List<Object> datasetIdList;

	private List<Object> testDatasetIdList;

	private String modelType;

	private Long projectId;

	private Long modelId;
	public CreateModelRequest() {
		super("nlp-automl", "2019-11-11", "CreateModel", "nlpautoml");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsIncrementalTrain() {
		return this.isIncrementalTrain;
	}

	public void setIsIncrementalTrain(String isIncrementalTrain) {
		this.isIncrementalTrain = isIncrementalTrain;
		if(isIncrementalTrain != null){
			putBodyParameter("IsIncrementalTrain", isIncrementalTrain);
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putBodyParameter("ModelName", modelName);
		}
	}

	public List<Object> getDatasetIdList() {
		return this.datasetIdList;
	}

	public void setDatasetIdList(List<Object> datasetIdList) {
		this.datasetIdList = datasetIdList;
		if(datasetIdList != null){
			putBodyParameter("DatasetIdList", new Gson().toJson(datasetIdList));
		}
	}

	public List<Object> getTestDatasetIdList() {
		return this.testDatasetIdList;
	}

	public void setTestDatasetIdList(List<Object> testDatasetIdList) {
		this.testDatasetIdList = testDatasetIdList;
		if(testDatasetIdList != null){
			putBodyParameter("TestDatasetIdList", new Gson().toJson(testDatasetIdList));
		}
	}

	public String getModelType() {
		return this.modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
		if(modelType != null){
			putBodyParameter("ModelType", modelType);
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

	public Long getModelId() {
		return this.modelId;
	}

	public void setModelId(Long modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putBodyParameter("ModelId", modelId.toString());
		}
	}

	@Override
	public Class<CreateModelResponse> getResponseClass() {
		return CreateModelResponse.class;
	}

}
