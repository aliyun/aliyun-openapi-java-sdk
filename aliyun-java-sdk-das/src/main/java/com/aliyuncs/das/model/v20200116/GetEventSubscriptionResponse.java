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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.GetEventSubscriptionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEventSubscriptionResponse extends AcsResponse {

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

		private String minInterval;

		private String contactName;

		private String contactGroupName;

		private String channelType;

		private String level;

		private Long id;

		private Long gmtCreate;

		private Long gmtModified;

		private List<ContactsItem> contacts;

		private List<ContactGroupsItem> contactGroups;

		private List<String> eventSendGroup;

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

		public String getMinInterval() {
			return this.minInterval;
		}

		public void setMinInterval(String minInterval) {
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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<ContactsItem> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<ContactsItem> contacts) {
			this.contacts = contacts;
		}

		public List<ContactGroupsItem> getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(List<ContactGroupsItem> contactGroups) {
			this.contactGroups = contactGroups;
		}

		public List<String> getEventSendGroup() {
			return this.eventSendGroup;
		}

		public void setEventSendGroup(List<String> eventSendGroup) {
			this.eventSendGroup = eventSendGroup;
		}

		public static class ContactsItem {

			private String name;

			private String phone;

			private String email;

			private String dingtalkHook;

			private Boolean isCmsReduplicated;

			private String userId;

			private List<String> groups;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getDingtalkHook() {
				return this.dingtalkHook;
			}

			public void setDingtalkHook(String dingtalkHook) {
				this.dingtalkHook = dingtalkHook;
			}

			public Boolean getIsCmsReduplicated() {
				return this.isCmsReduplicated;
			}

			public void setIsCmsReduplicated(Boolean isCmsReduplicated) {
				this.isCmsReduplicated = isCmsReduplicated;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public List<String> getGroups() {
				return this.groups;
			}

			public void setGroups(List<String> groups) {
				this.groups = groups;
			}
		}

		public static class ContactGroupsItem {

			private String name;

			private String description;

			private String contacts;

			private String userId;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getContacts() {
				return this.contacts;
			}

			public void setContacts(String contacts) {
				this.contacts = contacts;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public GetEventSubscriptionResponse getInstance(UnmarshallerContext context) {
		return	GetEventSubscriptionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
