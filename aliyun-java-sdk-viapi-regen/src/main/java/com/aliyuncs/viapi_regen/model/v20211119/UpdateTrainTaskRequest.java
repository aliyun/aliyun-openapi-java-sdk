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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.viapi_regen.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTrainTaskRequest extends RpcAcsRequest<UpdateTrainTaskResponse> {
	   

	private String description;

	private String trainMode;

	private Long id;

	private String datasetIds;

	private Long preTrainTaskId;

	private Boolean preTrainTaskFlag;

	private String advancedParameters;

	private String name;

	private String labelIds;
	public UpdateTrainTaskRequest() {
		super("viapi-regen", "2021-11-19", "UpdateTrainTask", "selflearning");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getTrainMode() {
		return this.trainMode;
	}

	public void setTrainMode(String trainMode) {
		this.trainMode = trainMode;
		if(trainMode != null){
			putBodyParameter("TrainMode", trainMode);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getDatasetIds() {
		return this.datasetIds;
	}

	public void setDatasetIds(String datasetIds) {
		this.datasetIds = datasetIds;
		if(datasetIds != null){
			putBodyParameter("DatasetIds", datasetIds);
		}
	}

	public Long getPreTrainTaskId() {
		return this.preTrainTaskId;
	}

	public void setPreTrainTaskId(Long preTrainTaskId) {
		this.preTrainTaskId = preTrainTaskId;
		if(preTrainTaskId != null){
			putBodyParameter("PreTrainTaskId", preTrainTaskId.toString());
		}
	}

	public Boolean getPreTrainTaskFlag() {
		return this.preTrainTaskFlag;
	}

	public void setPreTrainTaskFlag(Boolean preTrainTaskFlag) {
		this.preTrainTaskFlag = preTrainTaskFlag;
		if(preTrainTaskFlag != null){
			putBodyParameter("PreTrainTaskFlag", preTrainTaskFlag.toString());
		}
	}

	public String getAdvancedParameters() {
		return this.advancedParameters;
	}

	public void setAdvancedParameters(String advancedParameters) {
		this.advancedParameters = advancedParameters;
		if(advancedParameters != null){
			putBodyParameter("AdvancedParameters", advancedParameters);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getLabelIds() {
		return this.labelIds;
	}

	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
		if(labelIds != null){
			putBodyParameter("LabelIds", labelIds);
		}
	}

	@Override
	public Class<UpdateTrainTaskResponse> getResponseClass() {
		return UpdateTrainTaskResponse.class;
	}

}
