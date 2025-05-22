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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeBinlogFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBinlogFilesResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private Long totalFileSize;

	private Integer totalRecordCount;

	private List<BinLogFile> items;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalFileSize() {
		return this.totalFileSize;
	}

	public void setTotalFileSize(Long totalFileSize) {
		this.totalFileSize = totalFileSize;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<BinLogFile> getItems() {
		return this.items;
	}

	public void setItems(List<BinLogFile> items) {
		this.items = items;
	}

	public static class BinLogFile {

		private String checksum;

		private String downloadLink;

		private Long fileSize;

		private String hostInstanceID;

		private String intranetDownloadLink;

		private String linkExpiredTime;

		private String logBeginTime;

		private String logEndTime;

		private String logFileName;

		private String remoteStatus;

		public String getChecksum() {
			return this.checksum;
		}

		public void setChecksum(String checksum) {
			this.checksum = checksum;
		}

		public String getDownloadLink() {
			return this.downloadLink;
		}

		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getHostInstanceID() {
			return this.hostInstanceID;
		}

		public void setHostInstanceID(String hostInstanceID) {
			this.hostInstanceID = hostInstanceID;
		}

		public String getIntranetDownloadLink() {
			return this.intranetDownloadLink;
		}

		public void setIntranetDownloadLink(String intranetDownloadLink) {
			this.intranetDownloadLink = intranetDownloadLink;
		}

		public String getLinkExpiredTime() {
			return this.linkExpiredTime;
		}

		public void setLinkExpiredTime(String linkExpiredTime) {
			this.linkExpiredTime = linkExpiredTime;
		}

		public String getLogBeginTime() {
			return this.logBeginTime;
		}

		public void setLogBeginTime(String logBeginTime) {
			this.logBeginTime = logBeginTime;
		}

		public String getLogEndTime() {
			return this.logEndTime;
		}

		public void setLogEndTime(String logEndTime) {
			this.logEndTime = logEndTime;
		}

		public String getLogFileName() {
			return this.logFileName;
		}

		public void setLogFileName(String logFileName) {
			this.logFileName = logFileName;
		}

		public String getRemoteStatus() {
			return this.remoteStatus;
		}

		public void setRemoteStatus(String remoteStatus) {
			this.remoteStatus = remoteStatus;
		}
	}

	@Override
	public DescribeBinlogFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeBinlogFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
