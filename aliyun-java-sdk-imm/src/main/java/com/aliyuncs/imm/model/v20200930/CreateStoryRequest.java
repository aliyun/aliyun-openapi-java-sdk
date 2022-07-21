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
public class CreateStoryRequest extends RpcAcsRequest<CreateStoryResponse> {
	   

	private Long minFileCount;

	private String projectName;

	private String customLabels;

	private String storyStartTime;

	private String notifyTopicName;

	private String storyType;

	private String customId;

	@SerializedName("tags")
	private Map<String,String> tags;

	private String userData;

	private String notifyEndpoint;

	private Long maxFileCount;

	private String storySubType;

	private String datasetName;

	private String storyEndTime;

	private String objectId;

	private String storyName;
	public CreateStoryRequest() {
		super("imm", "2020-09-30", "CreateStory", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getMinFileCount() {
		return this.minFileCount;
	}

	public void setMinFileCount(Long minFileCount) {
		this.minFileCount = minFileCount;
		if(minFileCount != null){
			putBodyParameter("MinFileCount", minFileCount.toString());
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

	public String getCustomLabels() {
		return this.customLabels;
	}

	public void setCustomLabels(String customLabels) {
		this.customLabels = customLabels;
		if(customLabels != null){
			putBodyParameter("CustomLabels", customLabels);
		}
	}

	public String getStoryStartTime() {
		return this.storyStartTime;
	}

	public void setStoryStartTime(String storyStartTime) {
		this.storyStartTime = storyStartTime;
		if(storyStartTime != null){
			putBodyParameter("StoryStartTime", storyStartTime);
		}
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putBodyParameter("NotifyTopicName", notifyTopicName);
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

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
		if(customId != null){
			putBodyParameter("CustomId", customId);
		}
	}

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
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

	public String getNotifyEndpoint() {
		return this.notifyEndpoint;
	}

	public void setNotifyEndpoint(String notifyEndpoint) {
		this.notifyEndpoint = notifyEndpoint;
		if(notifyEndpoint != null){
			putBodyParameter("NotifyEndpoint", notifyEndpoint);
		}
	}

	public Long getMaxFileCount() {
		return this.maxFileCount;
	}

	public void setMaxFileCount(Long maxFileCount) {
		this.maxFileCount = maxFileCount;
		if(maxFileCount != null){
			putBodyParameter("MaxFileCount", maxFileCount.toString());
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

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putBodyParameter("DatasetName", datasetName);
		}
	}

	public String getStoryEndTime() {
		return this.storyEndTime;
	}

	public void setStoryEndTime(String storyEndTime) {
		this.storyEndTime = storyEndTime;
		if(storyEndTime != null){
			putBodyParameter("StoryEndTime", storyEndTime);
		}
	}

	public String getObjectId() {
		return this.objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
		if(objectId != null){
			putBodyParameter("ObjectId", objectId);
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

	@Override
	public Class<CreateStoryResponse> getResponseClass() {
		return CreateStoryResponse.class;
	}

}
