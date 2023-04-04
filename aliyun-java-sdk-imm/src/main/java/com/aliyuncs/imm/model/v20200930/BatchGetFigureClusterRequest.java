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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchGetFigureClusterRequest extends RpcAcsRequest<BatchGetFigureClusterResponse> {
	   

	private String datasetName;

	private String projectName;

	@SerializedName("objectIds")
	private List<String> objectIds;
	public BatchGetFigureClusterRequest() {
		super("imm", "2020-09-30", "BatchGetFigureCluster", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public List<String> getObjectIds() {
		return this.objectIds;
	}

	public void setObjectIds(List<String> objectIds) {
		this.objectIds = objectIds;	
		if (objectIds != null) {
			putQueryParameter("ObjectIds" , new Gson().toJson(objectIds));
		}	
	}

	@Override
	public Class<BatchGetFigureClusterResponse> getResponseClass() {
		return BatchGetFigureClusterResponse.class;
	}

}
