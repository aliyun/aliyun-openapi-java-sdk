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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.SetEventSubscriptionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetEventSubscriptionResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private String success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String userId;

		private String instanceId;

		private String eventContext;

		private String lang;

		private Integer active;

		private Integer minInterval;

		private String contactName;

		private String contactGroupName;

		private String channelType;

		private String level;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEventContext() {
			return this.eventContext;
		}

		public void setEventContext(String eventContext) {
			this.eventContext = eventContext;
		}

		public String getLang() {
			return this.lang;
		}

		public void setLang(String lang) {
			this.lang = lang;
		}

		public Integer getActive() {
			return this.active;
		}

		public void setActive(Integer active) {
			this.active = active;
		}

		public Integer getMinInterval() {
			return this.minInterval;
		}

		public void setMinInterval(Integer minInterval) {
			this.minInterval = minInterval;
		}

		public String getContactName() {
			return this.contactName;
		}

		public void setContactName(String contactName) {
			this.contactName = contactName;
		}

		public String getContactGroupName() {
			return this.contactGroupName;
		}

		public void setContactGroupName(String contactGroupName) {
			this.contactGroupName = contactGroupName;
		}

		public String getChannelType() {
			return this.channelType;
		}

		public void setChannelType(String channelType) {
			this.channelType = channelType;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	}

	@Override
	public SetEventSubscriptionResponse getInstance(UnmarshallerContext context) {
		return	SetEventSubscriptionResponseUnmarshaller.unmarshall(this, context);
	}
}
