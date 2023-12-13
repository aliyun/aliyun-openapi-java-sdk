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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListEventSubResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEventSubResponse extends AcsResponse {

	private String requestId;

	private List<Data> subscribers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getSubscribers() {
		return this.subscribers;
	}

	public void setSubscribers(List<Data> subscribers) {
		this.subscribers = subscribers;
	}

	public static class Data {

		private String subId;

		private String channelId;

		private String callbackUrl;

		private String createTime;

		private String modifyTime;

		private Integer roles;

		private List<String> events;

		private List<String> users;

		public String getSubId() {
			return this.subId;
		}

		public void setSubId(String subId) {
			this.subId = subId;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getCallbackUrl() {
			return this.callbackUrl;
		}

		public void setCallbackUrl(String callbackUrl) {
			this.callbackUrl = callbackUrl;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Integer getRoles() {
			return this.roles;
		}

		public void setRoles(Integer roles) {
			this.roles = roles;
		}

		public List<String> getEvents() {
			return this.events;
		}

		public void setEvents(List<String> events) {
			this.events = events;
		}

		public List<String> getUsers() {
			return this.users;
		}

		public void setUsers(List<String> users) {
			this.users = users;
		}
	}

	@Override
	public ListEventSubResponse getInstance(UnmarshallerContext context) {
		return	ListEventSubResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
