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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeFileSystemStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFileSystemStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<FileSystemStatistic> fileSystemStatistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<FileSystemStatistic> getFileSystemStatistics() {
		return this.fileSystemStatistics;
	}

	public void setFileSystemStatistics(List<FileSystemStatistic> fileSystemStatistics) {
		this.fileSystemStatistics = fileSystemStatistics;
	}

	public static class FileSystemStatistic {

		private String fileSystemType;

		private Integer totalCount;

		private Long meteredSize;

		private Integer expiredCount;

		private Integer expiringCount;

		public String getFileSystemType() {
			return this.fileSystemType;
		}

		public void setFileSystemType(String fileSystemType) {
			this.fileSystemType = fileSystemType;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Long getMeteredSize() {
			return this.meteredSize;
		}

		public void setMeteredSize(Long meteredSize) {
			this.meteredSize = meteredSize;
		}

		public Integer getExpiredCount() {
			return this.expiredCount;
		}

		public void setExpiredCount(Integer expiredCount) {
			this.expiredCount = expiredCount;
		}

		public Integer getExpiringCount() {
			return this.expiringCount;
		}

		public void setExpiringCount(Integer expiringCount) {
			this.expiringCount = expiringCount;
		}
	}

	@Override
	public DescribeFileSystemStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFileSystemStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
