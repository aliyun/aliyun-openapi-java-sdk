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
import com.aliyuncs.sas.transform.v20181203.DescribeRiskCheckResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskCheckResultResponse extends AcsResponse {

	private String requestId;

	private Integer pageCount;

	private Integer count;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<RiskCheckResultForDisplay> list;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

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

	public List<RiskCheckResultForDisplay> getList() {
		return this.list;
	}

	public void setList(List<RiskCheckResultForDisplay> list) {
		this.list = list;
	}

	public static class RiskCheckResultForDisplay {

		private Long itemId;

		private Long taskId;

		private String title;

		private String riskLevel;

		private String status;

		private Integer affectedCount;

		private Long checkTime;

		private Integer remainingTime;

		private Integer sort;

		private String type;

		private List<RiskItemResource> riskItemResources;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getAffectedCount() {
			return this.affectedCount;
		}

		public void setAffectedCount(Integer affectedCount) {
			this.affectedCount = affectedCount;
		}

		public Long getCheckTime() {
			return this.checkTime;
		}

		public void setCheckTime(Long checkTime) {
			this.checkTime = checkTime;
		}

		public Integer getRemainingTime() {
			return this.remainingTime;
		}

		public void setRemainingTime(Integer remainingTime) {
			this.remainingTime = remainingTime;
		}

		public Integer getSort() {
			return this.sort;
		}

		public void setSort(Integer sort) {
			this.sort = sort;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<RiskItemResource> getRiskItemResources() {
			return this.riskItemResources;
		}

		public void setRiskItemResources(List<RiskItemResource> riskItemResources) {
			this.riskItemResources = riskItemResources;
		}

		public static class RiskItemResource {

			private String resourceName;

			private String contentResource;

			public String getResourceName() {
				return this.resourceName;
			}

			public void setResourceName(String resourceName) {
				this.resourceName = resourceName;
			}

			public String getContentResource() {
				return this.contentResource;
			}

			public void setContentResource(String contentResource) {
				this.contentResource = contentResource;
			}
		}
	}

	@Override
	public DescribeRiskCheckResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeRiskCheckResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
