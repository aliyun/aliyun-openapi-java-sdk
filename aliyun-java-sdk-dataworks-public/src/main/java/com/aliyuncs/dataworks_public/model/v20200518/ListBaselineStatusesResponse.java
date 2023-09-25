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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListBaselineStatusesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBaselineStatusesResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<BaselineStatusesItem> baselineStatuses;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<BaselineStatusesItem> getBaselineStatuses() {
			return this.baselineStatuses;
		}

		public void setBaselineStatuses(List<BaselineStatusesItem> baselineStatuses) {
			this.baselineStatuses = baselineStatuses;
		}

		public static class BaselineStatusesItem {

			private String status;

			private String owner;

			private Long finishTime;

			private Long projectId;

			private Integer priority;

			private Long endCast;

			private Integer inGroupId;

			private String baselineName;

			private Long baselineId;

			private String finishStatus;

			private Long bizdate;

			private Long buffer;

			private Long slaTime;

			private Long expTime;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(Long finishTime) {
				this.finishTime = finishTime;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Long getEndCast() {
				return this.endCast;
			}

			public void setEndCast(Long endCast) {
				this.endCast = endCast;
			}

			public Integer getInGroupId() {
				return this.inGroupId;
			}

			public void setInGroupId(Integer inGroupId) {
				this.inGroupId = inGroupId;
			}

			public String getBaselineName() {
				return this.baselineName;
			}

			public void setBaselineName(String baselineName) {
				this.baselineName = baselineName;
			}

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public String getFinishStatus() {
				return this.finishStatus;
			}

			public void setFinishStatus(String finishStatus) {
				this.finishStatus = finishStatus;
			}

			public Long getBizdate() {
				return this.bizdate;
			}

			public void setBizdate(Long bizdate) {
				this.bizdate = bizdate;
			}

			public Long getBuffer() {
				return this.buffer;
			}

			public void setBuffer(Long buffer) {
				this.buffer = buffer;
			}

			public Long getSlaTime() {
				return this.slaTime;
			}

			public void setSlaTime(Long slaTime) {
				this.slaTime = slaTime;
			}

			public Long getExpTime() {
				return this.expTime;
			}

			public void setExpTime(Long expTime) {
				this.expTime = expTime;
			}
		}
	}

	@Override
	public ListBaselineStatusesResponse getInstance(UnmarshallerContext context) {
		return	ListBaselineStatusesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
