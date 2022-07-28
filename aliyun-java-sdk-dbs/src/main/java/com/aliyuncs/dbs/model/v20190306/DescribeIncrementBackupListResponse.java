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

package com.aliyuncs.dbs.model.v20190306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeIncrementBackupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIncrementBackupListResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Integer pageNum;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private Integer totalPages;

	private Integer totalElements;

	private Integer pageSize;

	private List<IncrementBackupFile> items;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalElements() {
		return this.totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<IncrementBackupFile> getItems() {
		return this.items;
	}

	public void setItems(List<IncrementBackupFile> items) {
		this.items = items;
	}

	public static class IncrementBackupFile {

		private Long endTime;

		private Long backupSetExpiredTime;

		private Long startTime;

		private String storageMethod;

		private String backupSetJobId;

		private String backupSetId;

		private String backupStatus;

		private String sourceEndpointIpPort;

		private Long backupSize;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getBackupSetExpiredTime() {
			return this.backupSetExpiredTime;
		}

		public void setBackupSetExpiredTime(Long backupSetExpiredTime) {
			this.backupSetExpiredTime = backupSetExpiredTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getStorageMethod() {
			return this.storageMethod;
		}

		public void setStorageMethod(String storageMethod) {
			this.storageMethod = storageMethod;
		}

		public String getBackupSetJobId() {
			return this.backupSetJobId;
		}

		public void setBackupSetJobId(String backupSetJobId) {
			this.backupSetJobId = backupSetJobId;
		}

		public String getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(String backupSetId) {
			this.backupSetId = backupSetId;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getSourceEndpointIpPort() {
			return this.sourceEndpointIpPort;
		}

		public void setSourceEndpointIpPort(String sourceEndpointIpPort) {
			this.sourceEndpointIpPort = sourceEndpointIpPort;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}
	}

	@Override
	public DescribeIncrementBackupListResponse getInstance(UnmarshallerContext context) {
		return	DescribeIncrementBackupListResponseUnmarshaller.unmarshall(this, context);
	}
}
