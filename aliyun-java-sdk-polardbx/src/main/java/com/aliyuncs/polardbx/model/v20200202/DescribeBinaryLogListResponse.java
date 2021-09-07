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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeBinaryLogListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBinaryLogListResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalNumber;

	private List<LogListItem> logList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalNumber() {
		return this.totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public List<LogListItem> getLogList() {
		return this.logList;
	}

	public void setLogList(List<LogListItem> logList) {
		this.logList = logList;
	}

	public static class LogListItem {

		private Long id;

		private String createdTime;

		private String modifiedTime;

		private String fileName;

		private Integer uploadStatus;

		private Integer purgeStatus;

		private String uploadHost;

		private String beginTime;

		private String endTime;

		private Long logSize;

		private String downloadLink;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Integer getUploadStatus() {
			return this.uploadStatus;
		}

		public void setUploadStatus(Integer uploadStatus) {
			this.uploadStatus = uploadStatus;
		}

		public Integer getPurgeStatus() {
			return this.purgeStatus;
		}

		public void setPurgeStatus(Integer purgeStatus) {
			this.purgeStatus = purgeStatus;
		}

		public String getUploadHost() {
			return this.uploadHost;
		}

		public void setUploadHost(String uploadHost) {
			this.uploadHost = uploadHost;
		}

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Long getLogSize() {
			return this.logSize;
		}

		public void setLogSize(Long logSize) {
			this.logSize = logSize;
		}

		public String getDownloadLink() {
			return this.downloadLink;
		}

		public void setDownloadLink(String downloadLink) {
			this.downloadLink = downloadLink;
		}
	}

	@Override
	public DescribeBinaryLogListResponse getInstance(UnmarshallerContext context) {
		return	DescribeBinaryLogListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
