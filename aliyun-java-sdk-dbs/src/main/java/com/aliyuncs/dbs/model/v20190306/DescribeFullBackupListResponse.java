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
import com.aliyuncs.dbs.transform.v20190306.DescribeFullBackupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFullBackupListResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Integer pageNum;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private Integer totalPages;

	private Integer totalElements;

	private Integer pageSize;

	private List<FullBackupFile> items;

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

	public List<FullBackupFile> getItems() {
		return this.items;
	}

	public void setItems(List<FullBackupFile> items) {
		this.items = items;
	}

	public static class FullBackupFile {

		private Long finishTime;

		private String backupStatus;

		private String sourceEndpointIpPort;

		private Long createTime;

		private String errMessage;

		private String backupObjects;

		private Long endTime;

		private Long startTime;

		private Long backupSetExpiredTime;

		private String storageMethod;

		private String backupSetId;

		private Long backupSize;

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
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

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}

		public String getBackupObjects() {
			return this.backupObjects;
		}

		public void setBackupObjects(String backupObjects) {
			this.backupObjects = backupObjects;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getBackupSetExpiredTime() {
			return this.backupSetExpiredTime;
		}

		public void setBackupSetExpiredTime(Long backupSetExpiredTime) {
			this.backupSetExpiredTime = backupSetExpiredTime;
		}

		public String getStorageMethod() {
			return this.storageMethod;
		}

		public void setStorageMethod(String storageMethod) {
			this.storageMethod = storageMethod;
		}

		public String getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(String backupSetId) {
			this.backupSetId = backupSetId;
		}

		public Long getBackupSize() {
			return this.backupSize;
		}

		public void setBackupSize(Long backupSize) {
			this.backupSize = backupSize;
		}
	}

	@Override
	public DescribeFullBackupListResponse getInstance(UnmarshallerContext context) {
		return	DescribeFullBackupListResponseUnmarshaller.unmarshall(this, context);
	}
}
