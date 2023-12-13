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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListRdUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRdUsersResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Boolean joined;

		private String joinedTime;

		private Boolean delegatedOrNot;

		private Long mainUserId;

		private Long subUserId;

		private String subUserName;

		public Boolean getJoined() {
			return this.joined;
		}

		public void setJoined(Boolean joined) {
			this.joined = joined;
		}

		public String getJoinedTime() {
			return this.joinedTime;
		}

		public void setJoinedTime(String joinedTime) {
			this.joinedTime = joinedTime;
		}

		public Boolean getDelegatedOrNot() {
			return this.delegatedOrNot;
		}

		public void setDelegatedOrNot(Boolean delegatedOrNot) {
			this.delegatedOrNot = delegatedOrNot;
		}

		public Long getMainUserId() {
			return this.mainUserId;
		}

		public void setMainUserId(Long mainUserId) {
			this.mainUserId = mainUserId;
		}

		public Long getSubUserId() {
			return this.subUserId;
		}

		public void setSubUserId(Long subUserId) {
			this.subUserId = subUserId;
		}

		public String getSubUserName() {
			return this.subUserName;
		}

		public void setSubUserName(String subUserName) {
			this.subUserName = subUserName;
		}
	}

	@Override
	public ListRdUsersResponse getInstance(UnmarshallerContext context) {
		return	ListRdUsersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
