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
import com.aliyuncs.dbs.transform.v20190306.DescribeBackupSetDownloadTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupSetDownloadTaskListResponse extends AcsResponse {

	private Integer httpStatusCode;

	private Integer pageNum;

	private String requestId;

	private String errCode;

	private Boolean success;

	private String errMessage;

	private Integer totalPages;

	private Integer totalElements;

	private Integer pageSize;

	private List<BackupSetDownloadTaskDetail> items;

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

	public List<BackupSetDownloadTaskDetail> getItems() {
		return this.items;
	}

	public void setItems(List<BackupSetDownloadTaskDetail> items) {
		this.items = items;
	}

	public static class BackupSetDownloadTaskDetail {

		private String backupSetDownloadStatus;

		private Long backupSetDataSize;

		private String backupSetDownloadTargetType;

		private String backupSetDownloadDir;

		private String errMessage;

		private Long backupSetDownloadCreateTime;

		private String backupPlanId;

		private String backupSetDbType;

		private String backupSetDownloadInternetUrl;

		private String backupSetId;

		private String backupSetDownloadIntranetUrl;

		private Long backupGatewayId;

		private String backupSetDownloadWay;

		private Long backupSetDownloadFinishTime;

		private String backupSetJobType;

		private String backupSetDownloadTaskId;

		private String backupSetDownloadTaskName;

		private String backupSetDataFormat;

		private String backupSetCode;

		public String getBackupSetDownloadStatus() {
			return this.backupSetDownloadStatus;
		}

		public void setBackupSetDownloadStatus(String backupSetDownloadStatus) {
			this.backupSetDownloadStatus = backupSetDownloadStatus;
		}

		public Long getBackupSetDataSize() {
			return this.backupSetDataSize;
		}

		public void setBackupSetDataSize(Long backupSetDataSize) {
			this.backupSetDataSize = backupSetDataSize;
		}

		public String getBackupSetDownloadTargetType() {
			return this.backupSetDownloadTargetType;
		}

		public void setBackupSetDownloadTargetType(String backupSetDownloadTargetType) {
			this.backupSetDownloadTargetType = backupSetDownloadTargetType;
		}

		public String getBackupSetDownloadDir() {
			return this.backupSetDownloadDir;
		}

		public void setBackupSetDownloadDir(String backupSetDownloadDir) {
			this.backupSetDownloadDir = backupSetDownloadDir;
		}

		public String getErrMessage() {
			return this.errMessage;
		}

		public void setErrMessage(String errMessage) {
			this.errMessage = errMessage;
		}

		public Long getBackupSetDownloadCreateTime() {
			return this.backupSetDownloadCreateTime;
		}

		public void setBackupSetDownloadCreateTime(Long backupSetDownloadCreateTime) {
			this.backupSetDownloadCreateTime = backupSetDownloadCreateTime;
		}

		public String getBackupPlanId() {
			return this.backupPlanId;
		}

		public void setBackupPlanId(String backupPlanId) {
			this.backupPlanId = backupPlanId;
		}

		public String getBackupSetDbType() {
			return this.backupSetDbType;
		}

		public void setBackupSetDbType(String backupSetDbType) {
			this.backupSetDbType = backupSetDbType;
		}

		public String getBackupSetDownloadInternetUrl() {
			return this.backupSetDownloadInternetUrl;
		}

		public void setBackupSetDownloadInternetUrl(String backupSetDownloadInternetUrl) {
			this.backupSetDownloadInternetUrl = backupSetDownloadInternetUrl;
		}

		public String getBackupSetId() {
			return this.backupSetId;
		}

		public void setBackupSetId(String backupSetId) {
			this.backupSetId = backupSetId;
		}

		public String getBackupSetDownloadIntranetUrl() {
			return this.backupSetDownloadIntranetUrl;
		}

		public void setBackupSetDownloadIntranetUrl(String backupSetDownloadIntranetUrl) {
			this.backupSetDownloadIntranetUrl = backupSetDownloadIntranetUrl;
		}

		public Long getBackupGatewayId() {
			return this.backupGatewayId;
		}

		public void setBackupGatewayId(Long backupGatewayId) {
			this.backupGatewayId = backupGatewayId;
		}

		public String getBackupSetDownloadWay() {
			return this.backupSetDownloadWay;
		}

		public void setBackupSetDownloadWay(String backupSetDownloadWay) {
			this.backupSetDownloadWay = backupSetDownloadWay;
		}

		public Long getBackupSetDownloadFinishTime() {
			return this.backupSetDownloadFinishTime;
		}

		public void setBackupSetDownloadFinishTime(Long backupSetDownloadFinishTime) {
			this.backupSetDownloadFinishTime = backupSetDownloadFinishTime;
		}

		public String getBackupSetJobType() {
			return this.backupSetJobType;
		}

		public void setBackupSetJobType(String backupSetJobType) {
			this.backupSetJobType = backupSetJobType;
		}

		public String getBackupSetDownloadTaskId() {
			return this.backupSetDownloadTaskId;
		}

		public void setBackupSetDownloadTaskId(String backupSetDownloadTaskId) {
			this.backupSetDownloadTaskId = backupSetDownloadTaskId;
		}

		public String getBackupSetDownloadTaskName() {
			return this.backupSetDownloadTaskName;
		}

		public void setBackupSetDownloadTaskName(String backupSetDownloadTaskName) {
			this.backupSetDownloadTaskName = backupSetDownloadTaskName;
		}

		public String getBackupSetDataFormat() {
			return this.backupSetDataFormat;
		}

		public void setBackupSetDataFormat(String backupSetDataFormat) {
			this.backupSetDataFormat = backupSetDataFormat;
		}

		public String getBackupSetCode() {
			return this.backupSetCode;
		}

		public void setBackupSetCode(String backupSetCode) {
			this.backupSetCode = backupSetCode;
		}
	}

	@Override
	public DescribeBackupSetDownloadTaskListResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupSetDownloadTaskListResponseUnmarshaller.unmarshall(this, context);
	}
}
