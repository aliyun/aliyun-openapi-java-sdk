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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.GetRealtimeConcurrencyReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRealtimeConcurrencyReportResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Long reportDate;

	private Reports reports;

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

	public Long getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Long reportDate) {
		this.reportDate = reportDate;
	}

	public Reports getReports() {
		return this.reports;
	}

	public void setReports(Reports reports) {
		this.reports = reports;
	}

	public static class Reports {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Item> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
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

		public List<Item> getList() {
			return this.list;
		}

		public void setList(List<Item> list) {
			this.list = list;
		}

		public static class Item {

			private Long reportDate;

			private String instanceId;

			private String instanceName;

			private String jobGroupId;

			private String jobGroupName;

			private Long occupiedConcurrencyCount;

			private Long maxConcurrencyLimit;

			private Long minConcurrencyLimit;

			public Long getReportDate() {
				return this.reportDate;
			}

			public void setReportDate(Long reportDate) {
				this.reportDate = reportDate;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getJobGroupId() {
				return this.jobGroupId;
			}

			public void setJobGroupId(String jobGroupId) {
				this.jobGroupId = jobGroupId;
			}

			public String getJobGroupName() {
				return this.jobGroupName;
			}

			public void setJobGroupName(String jobGroupName) {
				this.jobGroupName = jobGroupName;
			}

			public Long getOccupiedConcurrencyCount() {
				return this.occupiedConcurrencyCount;
			}

			public void setOccupiedConcurrencyCount(Long occupiedConcurrencyCount) {
				this.occupiedConcurrencyCount = occupiedConcurrencyCount;
			}

			public Long getMaxConcurrencyLimit() {
				return this.maxConcurrencyLimit;
			}

			public void setMaxConcurrencyLimit(Long maxConcurrencyLimit) {
				this.maxConcurrencyLimit = maxConcurrencyLimit;
			}

			public Long getMinConcurrencyLimit() {
				return this.minConcurrencyLimit;
			}

			public void setMinConcurrencyLimit(Long minConcurrencyLimit) {
				this.minConcurrencyLimit = minConcurrencyLimit;
			}
		}
	}

	@Override
	public GetRealtimeConcurrencyReportResponse getInstance(UnmarshallerContext context) {
		return	GetRealtimeConcurrencyReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
