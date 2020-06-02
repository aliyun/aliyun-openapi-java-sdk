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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.ListChartReleaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListChartReleaseResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Integer pageNo;

	private Integer pageSize;

	private String totalCount;

	private List<ChartReleasesItem> chartReleases;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<ChartReleasesItem> getChartReleases() {
		return this.chartReleases;
	}

	public void setChartReleases(List<ChartReleasesItem> chartReleases) {
		this.chartReleases = chartReleases;
	}

	public static class ChartReleasesItem {

		private String chart;

		private String release;

		private String status;

		private String size;

		private String instanceId;

		private String repoId;

		private Long modifiedTime;

		public String getChart() {
			return this.chart;
		}

		public void setChart(String chart) {
			this.chart = chart;
		}

		public String getRelease() {
			return this.release;
		}

		public void setRelease(String release) {
			this.release = release;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getRepoId() {
			return this.repoId;
		}

		public void setRepoId(String repoId) {
			this.repoId = repoId;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}
	}

	@Override
	public ListChartReleaseResponse getInstance(UnmarshallerContext context) {
		return	ListChartReleaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
