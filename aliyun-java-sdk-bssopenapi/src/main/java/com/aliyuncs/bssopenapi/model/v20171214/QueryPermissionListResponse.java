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

package com.aliyuncs.bssopenapi.model.v20171214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.bssopenapi.transform.v20171214.QueryPermissionListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPermissionListResponse extends AcsResponse {

	private String code;

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long masterId;

		private Long memberId;

		private String relationType;

		private String state;

		private String setupTime;

		private String startTime;

		private String endTime;

		private List<PermissionListItem> permissionList;

		public Long getMasterId() {
			return this.masterId;
		}

		public void setMasterId(Long masterId) {
			this.masterId = masterId;
		}

		public Long getMemberId() {
			return this.memberId;
		}

		public void setMemberId(Long memberId) {
			this.memberId = memberId;
		}

		public String getRelationType() {
			return this.relationType;
		}

		public void setRelationType(String relationType) {
			this.relationType = relationType;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getSetupTime() {
			return this.setupTime;
		}

		public void setSetupTime(String setupTime) {
			this.setupTime = setupTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public List<PermissionListItem> getPermissionList() {
			return this.permissionList;
		}

		public void setPermissionList(List<PermissionListItem> permissionList) {
			this.permissionList = permissionList;
		}

		public static class PermissionListItem {

			private String permissionCode;

			private String permissionName;

			private String startTime;

			private String endTime;

			public String getPermissionCode() {
				return this.permissionCode;
			}

			public void setPermissionCode(String permissionCode) {
				this.permissionCode = permissionCode;
			}

			public String getPermissionName() {
				return this.permissionName;
			}

			public void setPermissionName(String permissionName) {
				this.permissionName = permissionName;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public QueryPermissionListResponse getInstance(UnmarshallerContext context) {
		return	QueryPermissionListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
