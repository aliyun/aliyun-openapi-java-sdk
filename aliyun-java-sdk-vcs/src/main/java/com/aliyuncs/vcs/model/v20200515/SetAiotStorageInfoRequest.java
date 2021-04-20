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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetAiotStorageInfoRequest extends RpcAcsRequest<SetAiotStorageInfoResponse> {
	   

	@SerializedName("eventAlarmMq")
	private EventAlarmMq eventAlarmMq;

	@SerializedName("eventAlarmPictureStorage")
	private EventAlarmPictureStorage eventAlarmPictureStorage;
	public SetAiotStorageInfoRequest() {
		super("Vcs", "2020-05-15", "SetAiotStorageInfo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public EventAlarmMq getEventAlarmMq() {
		return this.eventAlarmMq;
	}

	public void setEventAlarmMq(EventAlarmMq eventAlarmMq) {
		this.eventAlarmMq = eventAlarmMq;	
		if (eventAlarmMq != null) {
			putBodyParameter("EventAlarmMq" , new Gson().toJson(eventAlarmMq));
		}	
	}

	public EventAlarmPictureStorage getEventAlarmPictureStorage() {
		return this.eventAlarmPictureStorage;
	}

	public void setEventAlarmPictureStorage(EventAlarmPictureStorage eventAlarmPictureStorage) {
		this.eventAlarmPictureStorage = eventAlarmPictureStorage;	
		if (eventAlarmPictureStorage != null) {
			putBodyParameter("EventAlarmPictureStorage" , new Gson().toJson(eventAlarmPictureStorage));
		}	
	}

	public static class EventAlarmMq {

		@SerializedName("MqType")
		private String mqType;

		@SerializedName("InstanceId")
		private String instanceId;

		@SerializedName("Brokers")
		private List<String> brokers;

		@SerializedName("EventTopic")
		private String eventTopic;

		@SerializedName("RegionId")
		private String regionId;

		@SerializedName("Domain")
		private String domain;

		@SerializedName("AlarmTopic")
		private String alarmTopic;

		@SerializedName("Version")
		private String version;

		@SerializedName("RamArnRole")
		private String ramArnRole;

		public String getMqType() {
			return this.mqType;
		}

		public void setMqType(String mqType) {
			this.mqType = mqType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<String> getBrokers() {
			return this.brokers;
		}

		public void setBrokers(List<String> brokers) {
			this.brokers = brokers;
		}

		public String getEventTopic() {
			return this.eventTopic;
		}

		public void setEventTopic(String eventTopic) {
			this.eventTopic = eventTopic;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getAlarmTopic() {
			return this.alarmTopic;
		}

		public void setAlarmTopic(String alarmTopic) {
			this.alarmTopic = alarmTopic;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getRamArnRole() {
			return this.ramArnRole;
		}

		public void setRamArnRole(String ramArnRole) {
			this.ramArnRole = ramArnRole;
		}
	}

	public static class EventAlarmPictureStorage {

		@SerializedName("Bucket")
		private String bucket;

		@SerializedName("Path")
		private String path;

		@SerializedName("Endpoint")
		private String endpoint;

		@SerializedName("StorageType")
		private String storageType;

		@SerializedName("RamArnRole")
		private String ramArnRole;

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getRamArnRole() {
			return this.ramArnRole;
		}

		public void setRamArnRole(String ramArnRole) {
			this.ramArnRole = ramArnRole;
		}
	}

	@Override
	public Class<SetAiotStorageInfoResponse> getResponseClass() {
		return SetAiotStorageInfoResponse.class;
	}

}
