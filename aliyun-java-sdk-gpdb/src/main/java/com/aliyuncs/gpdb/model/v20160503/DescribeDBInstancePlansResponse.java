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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstancePlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancePlansResponse extends AcsResponse {

	private String status;

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private String errorMessage;

	private List<PlanList> items;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<PlanList> getItems() {
		return this.items;
	}

	public void setItems(List<PlanList> items) {
		this.items = items;
	}

	public static class PlanList {

		private String dBInstanceId;

		private String planId;

		private String planScheduleType;

		private String planEndDate;

		private String planType;

		private String planDesc;

		private String planName;

		private String planStartDate;

		private String planConfig;

		private String planStatus;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getPlanScheduleType() {
			return this.planScheduleType;
		}

		public void setPlanScheduleType(String planScheduleType) {
			this.planScheduleType = planScheduleType;
		}

		public String getPlanEndDate() {
			return this.planEndDate;
		}

		public void setPlanEndDate(String planEndDate) {
			this.planEndDate = planEndDate;
		}

		public String getPlanType() {
			return this.planType;
		}

		public void setPlanType(String planType) {
			this.planType = planType;
		}

		public String getPlanDesc() {
			return this.planDesc;
		}

		public void setPlanDesc(String planDesc) {
			this.planDesc = planDesc;
		}

		public String getPlanName() {
			return this.planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public String getPlanStartDate() {
			return this.planStartDate;
		}

		public void setPlanStartDate(String planStartDate) {
			this.planStartDate = planStartDate;
		}

		public String getPlanConfig() {
			return this.planConfig;
		}

		public void setPlanConfig(String planConfig) {
			this.planConfig = planConfig;
		}

		public String getPlanStatus() {
			return this.planStatus;
		}

		public void setPlanStatus(String planStatus) {
			this.planStatus = planStatus;
		}
	}

	@Override
	public DescribeDBInstancePlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancePlansResponseUnmarshaller.unmarshall(this, context);
	}
}
