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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListSQLReviewOriginSQLResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSQLReviewOriginSQLResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Integer totalCount;

	private List<OriginSQLListItem> originSQLList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<OriginSQLListItem> getOriginSQLList() {
		return this.originSQLList;
	}

	public void setOriginSQLList(List<OriginSQLListItem> originSQLList) {
		this.originSQLList = originSQLList;
	}

	public static class OriginSQLListItem {

		private Long sQLId;

		private Long fileId;

		private String fileName;

		private String sQLContent;

		private String checkStatus;

		private String statusDesc;

		private String checkedTime;

		public Long getSQLId() {
			return this.sQLId;
		}

		public void setSQLId(Long sQLId) {
			this.sQLId = sQLId;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getSQLContent() {
			return this.sQLContent;
		}

		public void setSQLContent(String sQLContent) {
			this.sQLContent = sQLContent;
		}

		public String getCheckStatus() {
			return this.checkStatus;
		}

		public void setCheckStatus(String checkStatus) {
			this.checkStatus = checkStatus;
		}

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getCheckedTime() {
			return this.checkedTime;
		}

		public void setCheckedTime(String checkedTime) {
			this.checkedTime = checkedTime;
		}
	}

	@Override
	public ListSQLReviewOriginSQLResponse getInstance(UnmarshallerContext context) {
		return	ListSQLReviewOriginSQLResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
