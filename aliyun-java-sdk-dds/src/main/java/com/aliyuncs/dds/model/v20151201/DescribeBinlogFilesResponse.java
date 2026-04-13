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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeBinlogFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBinlogFilesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer maxRecordsPerPage;

	private Integer totalRecordCount;

	private List<LogFile> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getMaxRecordsPerPage() {
		return this.maxRecordsPerPage;
	}

	public void setMaxRecordsPerPage(Integer maxRecordsPerPage) {
		this.maxRecordsPerPage = maxRecordsPerPage;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<LogFile> getItems() {
		return this.items;
	}

	public void setItems(List<LogFile> items) {
		this.items = items;
	}

	public static class LogFile {

		private String logFileName;

		private String dumpDownloadURL;

		private String logBeginTime;

		private String dumpBucket;

		private String linkExpiredTime;

		private String downloadLink;

		private String oSSEndpoint;

		private String logEndTime;

		private Integer dumpState;

		private String fileSize;

		private String fileId;

		private String binLogId;

		private String logStatus;

		public String getLogFileName() {
			return this.logFileName;
		}

		public void setLogFileName(String logFileName) {
			this.logFileName = logFileName;
		}

		public String getDumpDownloadURL() {
			return this.dumpDownloadURL;
		}

		public void setDumpDownloadURL(String dumpDownloadURL) {
			this.dumpDownloadURL = dumpDownloadURL;
		}

		public String getLogBeginTime() {
			return this.logBeginTime;
		}

		public void setLogBeginTime(String logBeginTime) {
			this.logBeginTime = logBeginTime;
		}

		public String getDumpBucket() {
			return this.dumpBucket;
		}

		public void setDumpBucket(String dumpBucket) {
			this.dumpBucket = dumpBucket;
		}

		public String getLinkExpiredTime() {
			return this.linkExpiredTime;
		}

		public void setLinkExpiredTime(String linkExpiredTime) {
			this.linkExpiredTime = linkExpiredTime;
		}

		public String getDownloadLink() {
			return this.downloadLink;
		}

		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}

		public String getOSSEndpoint() {
			return this.oSSEndpoint;
		}

		public void setOSSEndpoint(String oSSEndpoint) {
			this.oSSEndpoint = oSSEndpoint;
		}

		public String getLogEndTime() {
			return this.logEndTime;
		}

		public void setLogEndTime(String logEndTime) {
			this.logEndTime = logEndTime;
		}

		public Integer getDumpState() {
			return this.dumpState;
		}

		public void setDumpState(Integer dumpState) {
			this.dumpState = dumpState;
		}

		public String getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getBinLogId() {
			return this.binLogId;
		}

		public void setBinLogId(String binLogId) {
			this.binLogId = binLogId;
		}

		public String getLogStatus() {
			return this.logStatus;
		}

		public void setLogStatus(String logStatus) {
			this.logStatus = logStatus;
		}
	}

	@Override
	public DescribeBinlogFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeBinlogFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
