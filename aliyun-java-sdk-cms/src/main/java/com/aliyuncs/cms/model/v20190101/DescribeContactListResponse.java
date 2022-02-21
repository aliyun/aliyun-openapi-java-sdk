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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeContactListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContactListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Integer total;

	private Boolean success;

	private List<Contact> contacts;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Contact> getContacts() {
		return this.contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public static class Contact {

		private Long updateTime;

		private String name;

		private Long createTime;

		private String lang;

		private String desc;

		private List<String> contactGroups;

		private Channels channels;

		private ChannelsState channelsState;

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getLang() {
			return this.lang;
		}

		public void setLang(String lang) {
			this.lang = lang;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public List<String> getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(List<String> contactGroups) {
			this.contactGroups = contactGroups;
		}

		public Channels getChannels() {
			return this.channels;
		}

		public void setChannels(Channels channels) {
			this.channels = channels;
		}

		public ChannelsState getChannelsState() {
			return this.channelsState;
		}

		public void setChannelsState(ChannelsState channelsState) {
			this.channelsState = channelsState;
		}

		public static class Channels {

			private String mail;

			private String aliIM;

			private String dingWebHook;

			private String sMS;

			public String getMail() {
				return this.mail;
			}

			public void setMail(String mail) {
				this.mail = mail;
			}

			public String getAliIM() {
				return this.aliIM;
			}

			public void setAliIM(String aliIM) {
				this.aliIM = aliIM;
			}

			public String getDingWebHook() {
				return this.dingWebHook;
			}

			public void setDingWebHook(String dingWebHook) {
				this.dingWebHook = dingWebHook;
			}

			public String getSMS() {
				return this.sMS;
			}

			public void setSMS(String sMS) {
				this.sMS = sMS;
			}
		}

		public static class ChannelsState {

			private String mail;

			private String aliIM;

			private String dingWebHook;

			private String sMS;

			public String getMail() {
				return this.mail;
			}

			public void setMail(String mail) {
				this.mail = mail;
			}

			public String getAliIM() {
				return this.aliIM;
			}

			public void setAliIM(String aliIM) {
				this.aliIM = aliIM;
			}

			public String getDingWebHook() {
				return this.dingWebHook;
			}

			public void setDingWebHook(String dingWebHook) {
				this.dingWebHook = dingWebHook;
			}

			public String getSMS() {
				return this.sMS;
			}

			public void setSMS(String sMS) {
				this.sMS = sMS;
			}
		}
	}

	@Override
	public DescribeContactListResponse getInstance(UnmarshallerContext context) {
		return	DescribeContactListResponseUnmarshaller.unmarshall(this, context);
	}
}
