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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetAiotStorageInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAiotStorageInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private AiotStorageInfo aiotStorageInfo;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AiotStorageInfo getAiotStorageInfo() {
		return this.aiotStorageInfo;
	}

	public void setAiotStorageInfo(AiotStorageInfo aiotStorageInfo) {
		this.aiotStorageInfo = aiotStorageInfo;
	}

	public static class AiotStorageInfo {

		private EventAlarmMq eventAlarmMq;

		private EventAlarmPictureStorage eventAlarmPictureStorage;

		public EventAlarmMq getEventAlarmMq() {
			return this.eventAlarmMq;
		}

		public void setEventAlarmMq(EventAlarmMq eventAlarmMq) {
			this.eventAlarmMq = eventAlarmMq;
		}

		public EventAlarmPictureStorage getEventAlarmPictureStorage() {
			return this.eventAlarmPictureStorage;
		}

		public void setEventAlarmPictureStorage(EventAlarmPictureStorage eventAlarmPictureStorage) {
			this.eventAlarmPictureStorage = eventAlarmPictureStorage;
		}

		public static class EventAlarmMq {

			private String mqType;

			private String alarmTopic;

			private String eventTopic;

			private String instanceId;

			private String regionId;

			private String ramArnRole;

			public String getMqType() {
				return this.mqType;
			}

			public void setMqType(String mqType) {
				this.mqType = mqType;
			}

			public String getAlarmTopic() {
				return this.alarmTopic;
			}

			public void setAlarmTopic(String alarmTopic) {
				this.alarmTopic = alarmTopic;
			}

			public String getEventTopic() {
				return this.eventTopic;
			}

			public void setEventTopic(String eventTopic) {
				this.eventTopic = eventTopic;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getRamArnRole() {
				return this.ramArnRole;
			}

			public void setRamArnRole(String ramArnRole) {
				this.ramArnRole = ramArnRole;
			}
		}

		public static class EventAlarmPictureStorage {

			private String storageType;

			private String endpoint;

			private String bucket;

			private String path;

			private String ramArnRole;

			private String proxy;

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

			public String getProxy() {
				return this.proxy;
			}

			public void setProxy(String proxy) {
				this.proxy = proxy;
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
