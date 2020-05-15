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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeWebsiteScanResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebsiteScanResultResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<WebsiteScanResult> websiteScanResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<WebsiteScanResult> getWebsiteScanResultList() {
		return this.websiteScanResultList;
	}

	public void setWebsiteScanResultList(List<WebsiteScanResult> websiteScanResultList) {
		this.websiteScanResultList = websiteScanResultList;
	}

	public static class WebsiteScanResult {

		private String instanceId;

		private String scanTime;

		private String domain;

		private Integer sourceRiskCount;

		private Integer imageRiskCount;

		private Integer handleStatus;

		private Integer id;

		private Integer textRiskCount;

		private String taskId;

		private String url;

		private List<String> labels;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getScanTime() {
			return this.scanTime;
		}

		public void setScanTime(String scanTime) {
			this.scanTime = scanTime;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Integer getSourceRiskCount() {
			return this.sourceRiskCount;
		}

		public void setSourceRiskCount(Integer sourceRiskCount) {
			this.sourceRiskCount = sourceRiskCount;
		}

		public Integer getImageRiskCount() {
			return this.imageRiskCount;
		}

		public void setImageRiskCount(Integer imageRiskCount) {
			this.imageRiskCount = imageRiskCount;
		}

		public Integer getHandleStatus() {
			return this.handleStatus;
		}

		public void setHandleStatus(Integer handleStatus) {
			this.handleStatus = handleStatus;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getTextRiskCount() {
			return this.textRiskCount;
		}

		public void setTextRiskCount(Integer textRiskCount) {
			this.textRiskCount = textRiskCount;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public List<String> getLabels() {
			return this.labels;
		}

		public void setLabels(List<String> labels) {
			this.labels = labels;
		}
	}

	@Override
	public DescribeWebsiteScanResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebsiteScanResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
