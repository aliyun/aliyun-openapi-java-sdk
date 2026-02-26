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
import com.aliyuncs.live.transform.v20161101.ModifyLiveMessageUserInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyLiveMessageUserInfoResponse extends AcsResponse {

	private String requestId;

	private List<FailGroups> failList;

	private List<SuccessGroups> successList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FailGroups> getFailList() {
		return this.failList;
	}

	public void setFailList(List<FailGroups> failList) {
		this.failList = failList;
	}

	public List<SuccessGroups> getSuccessList() {
		return this.successList;
	}

	public void setSuccessList(List<SuccessGroups> successList) {
		this.successList = successList;
	}

	public static class FailGroups {

		private Integer code;

		private String groupId;

		private String reason;

		private Boolean success;

		public Integer getCode() {
			return this.code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}

	public static class SuccessGroups {

		private String groupId;

		private Boolean success;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}
	}

	@Override
	public ModifyLiveMessageUserInfoResponse getInstance(UnmarshallerContext context) {
		return	ModifyLiveMessageUserInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
