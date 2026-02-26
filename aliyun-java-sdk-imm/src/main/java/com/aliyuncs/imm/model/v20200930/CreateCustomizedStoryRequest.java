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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCustomizedStoryRequest extends RpcAcsRequest<CreateCustomizedStoryResponse> {
	   

	@SerializedName("customLabels")
	private Map<String,String> customLabels;

	@SerializedName("cover")
	private Cover cover;

	private String datasetName;

	private String projectName;

	private String storyType;

	private String storySubType;

	@SerializedName("files")
	private List<Files> files;

	private String storyName;
	public CreateCustomizedStoryRequest() {
		super("imm", "2020-09-30", "CreateCustomizedStory", "imm");
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
			putBodyParameter("CustomLabels" , new Gson().toJson(customLabels));
		}	
	}

	public Cover getCover() {
		return this.cover;
	}

	public void setCover(Cover cover) {
		this.cover = cover;	
		if (cover != null) {
			putBodyParameter("Cover" , new Gson().toJson(cover));
		}	
	}

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putBodyParameter("DatasetName", datasetName);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getStoryType() {
		return this.storyType;
	}

	public void setStoryType(String storyType) {
		this.storyType = storyType;
		if(storyType != null){
			putBodyParameter("StoryType", storyType);
		}
	}

	public String getStorySubType() {
		return this.storySubType;
	}

	public void setStorySubType(String storySubType) {
		this.storySubType = storySubType;
		if(storySubType != null){
			putBodyParameter("StorySubType", storySubType);
		}
	}

	public List<Files> getFiles() {
		return this.files;
	}

	public void setFiles(List<Files> files) {
		this.files = files;	
		if (files != null) {
			putBodyParameter("Files" , new Gson().toJson(files));
		}	
	}

	public String getStoryName() {
		return this.storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
		if(storyName != null){
			putBodyParameter("StoryName", storyName);
		}
	}

	public static class Cover {

		@SerializedName("URI")
		private String uRI;

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}
	}

	public static class Files {

		@SerializedName("URI")
		private String uRI;

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}
	}

	@Override
	public Class<CreateCustomizedStoryResponse> getResponseClass() {
		return CreateCustomizedStoryResponse.class;
	}

}
