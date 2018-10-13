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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryDeviceGroupInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceGroupInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String groupId;

		private String utcCreate;

		private String groupName;

		private String groupDesc;

		private Integer deviceCount;

		private Integer deviceActive;

		private Integer deviceOnline;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupDesc() {
			return this.groupDesc;
		}

		public void setGroupDesc(String groupDesc) {
			this.groupDesc = groupDesc;
		}

		public Integer getDeviceCount() {
			return this.deviceCount;
		}

		public void setDeviceCount(Integer deviceCount) {
			this.deviceCount = deviceCount;
		}

		public Integer getDeviceActive() {
			return this.deviceActive;
		}

		public void setDeviceActive(Integer deviceActive) {
			this.deviceActive = deviceActive;
		}

		public Integer getDeviceOnline() {
			return this.deviceOnline;
		}

		public void setDeviceOnline(Integer deviceOnline) {
			this.deviceOnline = deviceOnline;
		}
	}

	@Override
	public QueryDeviceGroupInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceGroupInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
