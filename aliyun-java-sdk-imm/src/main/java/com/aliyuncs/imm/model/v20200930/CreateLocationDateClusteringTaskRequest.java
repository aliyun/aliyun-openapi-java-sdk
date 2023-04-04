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
public class CreateLocationDateClusteringTaskRequest extends RpcAcsRequest<CreateLocationDateClusteringTaskResponse> {
	   

	private String userData;

	@SerializedName("notification")
	private Notification notification;

	private String datasetName;

	private String projectName;

	@SerializedName("locationOptions")
	private LocationOptions locationOptions;

	private String tags;

	@SerializedName("dateOptions")
	private DateOptions dateOptions;
	public CreateLocationDateClusteringTaskRequest() {
		super("imm", "2020-09-30", "CreateLocationDateClusteringTask", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putQueryParameter("Notification" , new Gson().toJson(notification));
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

	public LocationOptions getLocationOptions() {
		return this.locationOptions;
	}

	public void setLocationOptions(LocationOptions locationOptions) {
		this.locationOptions = locationOptions;	
		if (locationOptions != null) {
			putQueryParameter("LocationOptions" , new Gson().toJson(locationOptions));
		}	
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public DateOptions getDateOptions() {
		return this.dateOptions;
	}

	public void setDateOptions(DateOptions dateOptions) {
		this.dateOptions = dateOptions;	
		if (dateOptions != null) {
			putQueryParameter("DateOptions" , new Gson().toJson(dateOptions));
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

	public static class LocationOptions {

		@SerializedName("LocationDateClusterLevels")
		private List<String> locationDateClusterLevels;

		public List<String> getLocationDateClusterLevels() {
			return this.locationDateClusterLevels;
		}

		public void setLocationDateClusterLevels(List<String> locationDateClusterLevels) {
			this.locationDateClusterLevels = locationDateClusterLevels;
		}
	}

	public static class DateOptions {

		@SerializedName("MinDays")
		private Long minDays;

		@SerializedName("GapDays")
		private Long gapDays;

		@SerializedName("MaxDays")
		private Long maxDays;

		public Long getMinDays() {
			return this.minDays;
		}

		public void setMinDays(Long minDays) {
			this.minDays = minDays;
		}

		public Long getGapDays() {
			return this.gapDays;
		}

		public void setGapDays(Long gapDays) {
			this.gapDays = gapDays;
		}

		public Long getMaxDays() {
			return this.maxDays;
		}

		public void setMaxDays(Long maxDays) {
			this.maxDays = maxDays;
		}
	}

	@Override
	public Class<CreateLocationDateClusteringTaskResponse> getResponseClass() {
		return CreateLocationDateClusteringTaskResponse.class;
	}

}
