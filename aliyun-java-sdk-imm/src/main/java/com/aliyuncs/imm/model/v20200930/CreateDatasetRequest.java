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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDatasetRequest extends RpcAcsRequest<CreateDatasetResponse> {
	   

	private String projectName;

	private Long datasetMaxBindCount;

	private Long datasetMaxTotalFileSize;

	private Long datasetMaxRelationCount;

	private String datasetName;

	private String description;

	private Long datasetMaxEntityCount;

	private Long datasetMaxFileCount;

	private String templateId;
	public CreateDatasetRequest() {
		super("imm", "2020-09-30", "CreateDataset", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Long getDatasetMaxBindCount() {
		return this.datasetMaxBindCount;
	}

	public void setDatasetMaxBindCount(Long datasetMaxBindCount) {
		this.datasetMaxBindCount = datasetMaxBindCount;
		if(datasetMaxBindCount != null){
			putQueryParameter("DatasetMaxBindCount", datasetMaxBindCount.toString());
		}
	}

	public Long getDatasetMaxTotalFileSize() {
		return this.datasetMaxTotalFileSize;
	}

	public void setDatasetMaxTotalFileSize(Long datasetMaxTotalFileSize) {
		this.datasetMaxTotalFileSize = datasetMaxTotalFileSize;
		if(datasetMaxTotalFileSize != null){
			putQueryParameter("DatasetMaxTotalFileSize", datasetMaxTotalFileSize.toString());
		}
	}

	public Long getDatasetMaxRelationCount() {
		return this.datasetMaxRelationCount;
	}

	public void setDatasetMaxRelationCount(Long datasetMaxRelationCount) {
		this.datasetMaxRelationCount = datasetMaxRelationCount;
		if(datasetMaxRelationCount != null){
			putQueryParameter("DatasetMaxRelationCount", datasetMaxRelationCount.toString());
		}
	}

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putQueryParameter("DatasetName", datasetName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getDatasetMaxEntityCount() {
		return this.datasetMaxEntityCount;
	}

	public void setDatasetMaxEntityCount(Long datasetMaxEntityCount) {
		this.datasetMaxEntityCount = datasetMaxEntityCount;
		if(datasetMaxEntityCount != null){
			putQueryParameter("DatasetMaxEntityCount", datasetMaxEntityCount.toString());
		}
	}

	public Long getDatasetMaxFileCount() {
		return this.datasetMaxFileCount;
	}

	public void setDatasetMaxFileCount(Long datasetMaxFileCount) {
		this.datasetMaxFileCount = datasetMaxFileCount;
		if(datasetMaxFileCount != null){
			putQueryParameter("DatasetMaxFileCount", datasetMaxFileCount.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	@Override
	public Class<CreateDatasetResponse> getResponseClass() {
		return CreateDatasetResponse.class;
	}

}
