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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeAuditFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuditFilesResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String dBInstanceId;

	private List<LogFile> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public List<LogFile> getItems() {
		return this.items;
	}

	public void setItems(List<LogFile> items) {
		this.items = items;
	}

	public static class LogFile {

		private Integer fileID;

		private String logStatus;

		private String logStartTime;

		private String logEndTime;

		private String logDownloadURL;

		private Long logSize;

		public Integer getFileID() {
			return this.fileID;
		}

		public void setFileID(Integer fileID) {
			this.fileID = fileID;
		}

		public String getLogStatus() {
			return this.logStatus;
		}

		public void setLogStatus(String logStatus) {
			this.logStatus = logStatus;
		}

		public String getLogStartTime() {
			return this.logStartTime;
		}

		public void setLogStartTime(String logStartTime) {
			this.logStartTime = logStartTime;
		}

		public String getLogEndTime() {
			return this.logEndTime;
		}

		public void setLogEndTime(String logEndTime) {
			this.logEndTime = logEndTime;
		}

		public String getLogDownloadURL() {
			return this.logDownloadURL;
		}

		public void setLogDownloadURL(String logDownloadURL) {
			this.logDownloadURL = logDownloadURL;
		}

		public Long getLogSize() {
			return this.logSize;
		}

		public void setLogSize(Long logSize) {
			this.logSize = logSize;
		}
	}

	@Override
	public DescribeAuditFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuditFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
