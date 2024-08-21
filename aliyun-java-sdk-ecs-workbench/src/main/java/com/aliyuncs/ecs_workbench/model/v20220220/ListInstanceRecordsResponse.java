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

package com.aliyuncs.ecs_workbench.model.v20220220;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs_workbench.transform.v20220220.ListInstanceRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceRecordsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Root root;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Root getRoot() {
		return this.root;
	}

	public void setRoot(Root root) {
		this.root = root;
	}

	public static class Root {

		private Integer totalCount;

		private List<RecordListItem> recordList;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<RecordListItem> getRecordList() {
			return this.recordList;
		}

		public void setRecordList(List<RecordListItem> recordList) {
			this.recordList = recordList;
		}

		public static class RecordListItem {

			private String gmtCreate;

			private Long accountId;

			private String instanceId;

			private String terminalSessionToken;

			private Long recordDurationMillis;

			private String status;

			private String expireTime;

			private String instanceRecordUrl;

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getAccountId() {
				return this.accountId;
			}

			public void setAccountId(Long accountId) {
				this.accountId = accountId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTerminalSessionToken() {
				return this.terminalSessionToken;
			}

			public void setTerminalSessionToken(String terminalSessionToken) {
				this.terminalSessionToken = terminalSessionToken;
			}

			public Long getRecordDurationMillis() {
				return this.recordDurationMillis;
			}

			public void setRecordDurationMillis(Long recordDurationMillis) {
				this.recordDurationMillis = recordDurationMillis;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getInstanceRecordUrl() {
				return this.instanceRecordUrl;
			}

			public void setInstanceRecordUrl(String instanceRecordUrl) {
				this.instanceRecordUrl = instanceRecordUrl;
			}
		}
	}

	@Override
	public ListInstanceRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
