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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetAiotStorageInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAiotStorageInfoResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private AiotStorageInfo aiotStorageInfo;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AiotStorageInfo getAiotStorageInfo() {
		return this.aiotStorageInfo;
	}

	public void setAiotStorageInfo(AiotStorageInfo aiotStorageInfo) {
		this.aiotStorageInfo = aiotStorageInfo;
	}

	public static class AiotStorageInfo {

		private EventAlarmPictureStorage eventAlarmPictureStorage;

		private EventAlarmMq eventAlarmMq;

		public EventAlarmPictureStorage getEventAlarmPictureStorage() {
			return this.eventAlarmPictureStorage;
		}

		public void setEventAlarmPictureStorage(EventAlarmPictureStorage eventAlarmPictureStorage) {
			this.eventAlarmPictureStorage = eventAlarmPictureStorage;
		}

		public EventAlarmMq getEventAlarmMq() {
			return this.eventAlarmMq;
		}

		public void setEventAlarmMq(EventAlarmMq eventAlarmMq) {
			this.eventAlarmMq = eventAlarmMq;
		}

		public static class EventAlarmPictureStorage {

			private String path;

			private String ramArnRole;

			private String storageType;

			private String endpoint;

			private String bucket;

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getRamArnRole() {
				return this.ramArnRole;
			}

			public void setRamArnRole(String ramArnRole) {
				this.ramArnRole = ramArnRole;
			}

			public String getStorageType() {
				return this.storageType;
			}

			public void setStorageType(String storageType) {
				this.storageType = storageType;
			}

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}
		}

		public static class EventAlarmMq {

			private String ramArnRole;

			private String version;

			private String instanceId;

			private String eventTopic;

			private String regionId;

			private String mqType;

			private String domain;

			private String alarmTopic;

			private List<String> brokers;

			public String getRamArnRole() {
				return this.ramArnRole;
			}

			public void setRamArnRole(String ramArnRole) {
				this.ramArnRole = ramArnRole;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
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

			public String getMqType() {
				return this.mqType;
			}

			public void setMqType(String mqType) {
				this.mqType = mqType;
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

			public List<String> getBrokers() {
				return this.brokers;
			}

			public void setBrokers(List<String> brokers) {
				this.brokers = brokers;
			}
		}
	}

	@Override
	public GetAiotStorageInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAiotStorageInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
