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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeImageSensitiveFileListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageSensitiveFileListResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private List<SensitiveFileListItem> sensitiveFileList;

	private PageInfo pageInfo;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<SensitiveFileListItem> getSensitiveFileList() {
		return this.sensitiveFileList;
	}

	public void setSensitiveFileList(List<SensitiveFileListItem> sensitiveFileList) {
		this.sensitiveFileList = sensitiveFileList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class SensitiveFileListItem {

		private String riskLevel;

		private String sensitiveFileKey;

		private String sensitiveFileName;

		private Long firstScanTime;

		private Long lastScanTime;

		private Integer count;

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getSensitiveFileKey() {
			return this.sensitiveFileKey;
		}

		public void setSensitiveFileKey(String sensitiveFileKey) {
			this.sensitiveFileKey = sensitiveFileKey;
		}

		public String getSensitiveFileName() {
			return this.sensitiveFileName;
		}

		public void setSensitiveFileName(String sensitiveFileName) {
			this.sensitiveFileName = sensitiveFileName;
		}

		public Long getFirstScanTime() {
			return this.firstScanTime;
		}

		public void setFirstScanTime(Long firstScanTime) {
			this.firstScanTime = firstScanTime;
		}

		public Long getLastScanTime() {
			return this.lastScanTime;
		}

		public void setLastScanTime(Long lastScanTime) {
			this.lastScanTime = lastScanTime;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		private String lastRowKey;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getLastRowKey() {
			return this.lastRowKey;
		}

		public void setLastRowKey(String lastRowKey) {
			this.lastRowKey = lastRowKey;
		}
	}

	@Override
	public DescribeImageSensitiveFileListResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageSensitiveFileListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
