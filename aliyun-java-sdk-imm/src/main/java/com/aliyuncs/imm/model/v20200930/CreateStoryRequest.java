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
	   

	private String customLabels;

	@SerializedName("notification")
	private Notification notification;

	private String projectName;

	private String notifyTopicName;

	private String storyType;

	@SerializedName("tags")
	private Map<String,String> tags;

	private String storySubType;

	private Long minFileCount;

	private String userData;

	private Long maxFileCount;

	private String datasetName;

	private String storyStartTime;

	@SerializedName("address")
	private Address address;

	private String customId;

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

	public String getCustomLabels() {
		return this.customLabels;
	}

	public void setCustomLabels(String customLabels) {
		this.customLabels = customLabels;
		if(customLabels != null){
			putBodyParameter("CustomLabels", customLabels);
		}
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putQueryParameter("Notification" , new Gson().toJson(notification));
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

	public Map<String,String> getTags() {
		return this.tags;
	}

	public void setTags(Map<String,String> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
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

	public Long getMinFileCount() {
		return this.minFileCount;
	}

	public void setMinFileCount(Long minFileCount) {
		this.minFileCount = minFileCount;
		if(minFileCount != null){
			putBodyParameter("MinFileCount", minFileCount.toString());
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

	public Long getMaxFileCount() {
		return this.maxFileCount;
	}

	public void setMaxFileCount(Long maxFileCount) {
		this.maxFileCount = maxFileCount;
		if(maxFileCount != null){
			putBodyParameter("MaxFileCount", maxFileCount.toString());
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

	public String getStoryStartTime() {
		return this.storyStartTime;
	}

	public void setStoryStartTime(String storyStartTime) {
		this.storyStartTime = storyStartTime;
		if(storyStartTime != null){
			putBodyParameter("StoryStartTime", storyStartTime);
		}
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;	
		if (address != null) {
			putBodyParameter("Address" , new Gson().toJson(address));
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

	public static class Notification {

		@SerializedName("MNS")
		private MNS mNS;

		@SerializedName("RocketMQ")
		private RocketMQ rocketMQ;

		public MNS getMNS() {
			return this.mNS;
		}

		public void setMNS(MNS mNS) {
			this.mNS = mNS;
		}

		public RocketMQ getRocketMQ() {
			return this.rocketMQ;
		}

		public void setRocketMQ(RocketMQ rocketMQ) {
			this.rocketMQ = rocketMQ;
		}

		public static class MNS {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}

		public static class RocketMQ {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}
	}

	public static class Address {

		@SerializedName("Country")
		private String country;

		@SerializedName("Province")
		private String province;

		@SerializedName("City")
		private String city;

		@SerializedName("District")
		private String district;

		@SerializedName("Township")
		private String township;

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDistrict() {
			return this.district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getTownship() {
			return this.township;
		}

		public void setTownship(String township) {
			this.township = township;
		}
	}

	@Override
	public Class<CreateStoryResponse> getResponseClass() {
		return CreateStoryResponse.class;
	}

}
