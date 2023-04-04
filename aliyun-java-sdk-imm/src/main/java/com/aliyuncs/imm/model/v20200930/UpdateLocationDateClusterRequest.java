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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLocationDateClusterRequest extends RpcAcsRequest<UpdateLocationDateClusterResponse> {
	   

	@SerializedName("customLabels")
	private Map<String,String> customLabels;

	private String title;

	private String datasetName;

	private String projectName;

	private String customId;

	private String objectId;
	public UpdateLocationDateClusterRequest() {
		super("imm", "2020-09-30", "UpdateLocationDateCluster", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<String,String> getCustomLabels() {
		return this.customLabels;
	}

	public void setCustomLabels(Map<String,String> customLabels) {
		this.customLabels = customLabels;	
		if (customLabels != null) {
			putQueryParameter("CustomLabels" , new Gson().toJson(customLabels));
		}	
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
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

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
		if(customId != null){
			putQueryParameter("CustomId", customId);
		}
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
		if(objectId != null){
			putQueryParameter("ObjectId", objectId);
		}
	}

	@Override
	public Class<UpdateLocationDateClusterResponse> getResponseClass() {
		return UpdateLocationDateClusterResponse.class;
	}

}
