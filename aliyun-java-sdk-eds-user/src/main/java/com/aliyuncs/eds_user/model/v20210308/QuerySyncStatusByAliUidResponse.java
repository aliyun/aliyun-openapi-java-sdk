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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.QuerySyncStatusByAliUidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySyncStatusByAliUidResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String gmtCreated;

		private String gmtModified;

		private Long aliUid;

		private String status;

		private String corpId;

		private String latestBeginTime;

		private String latestEndTime;

		private String latestSuccessTime;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getLatestBeginTime() {
			return this.latestBeginTime;
		}

		public void setLatestBeginTime(String latestBeginTime) {
			this.latestBeginTime = latestBeginTime;
		}

		public String getLatestEndTime() {
			return this.latestEndTime;
		}

		public void setLatestEndTime(String latestEndTime) {
			this.latestEndTime = latestEndTime;
		}

		public String getLatestSuccessTime() {
			return this.latestSuccessTime;
		}

		public void setLatestSuccessTime(String latestSuccessTime) {
			this.latestSuccessTime = latestSuccessTime;
		}
	}

	@Override
	public QuerySyncStatusByAliUidResponse getInstance(UnmarshallerContext context) {
		return	QuerySyncStatusByAliUidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
