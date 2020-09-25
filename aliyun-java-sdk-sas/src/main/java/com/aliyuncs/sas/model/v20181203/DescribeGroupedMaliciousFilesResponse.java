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
import com.aliyuncs.sas.transform.v20181203.DescribeGroupedMaliciousFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupedMaliciousFilesResponse extends AcsResponse {

	private String requestId;

	private List<GroupedMaliciousFile> groupedMaliciousFileResponse;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<GroupedMaliciousFile> getGroupedMaliciousFileResponse() {
		return this.groupedMaliciousFileResponse;
	}

	public void setGroupedMaliciousFileResponse(List<GroupedMaliciousFile> groupedMaliciousFileResponse) {
		this.groupedMaliciousFileResponse = groupedMaliciousFileResponse;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class GroupedMaliciousFile {

		private String maliciousName;

		private String maliciousMd5;

		private Long firstScanTimestamp;

		private Long latestScanTimestamp;

		private Integer status;

		private String level;

		private Long imageCount;

		public String getMaliciousName() {
			return this.maliciousName;
		}

		public void setMaliciousName(String maliciousName) {
			this.maliciousName = maliciousName;
		}

		public String getMaliciousMd5() {
			return this.maliciousMd5;
		}

		public void setMaliciousMd5(String maliciousMd5) {
			this.maliciousMd5 = maliciousMd5;
		}

		public Long getFirstScanTimestamp() {
			return this.firstScanTimestamp;
		}

		public void setFirstScanTimestamp(Long firstScanTimestamp) {
			this.firstScanTimestamp = firstScanTimestamp;
		}

		public Long getLatestScanTimestamp() {
			return this.latestScanTimestamp;
		}

		public void setLatestScanTimestamp(Long latestScanTimestamp) {
			this.latestScanTimestamp = latestScanTimestamp;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Long getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Long imageCount) {
			this.imageCount = imageCount;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
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

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribeGroupedMaliciousFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupedMaliciousFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
