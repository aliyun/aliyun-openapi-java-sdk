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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ListStackInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListStackInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<StackInstance> stackInstances;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<StackInstance> getStackInstances() {
		return this.stackInstances;
	}

	public void setStackInstances(List<StackInstance> stackInstances) {
		this.stackInstances = stackInstances;
	}

	public static class StackInstance {

		private String stackGroupName;

		private String stackGroupId;

		private String stackId;

		private String accountId;

		private String regionId;

		private String status;

		private String statusReason;

		private String stackDriftStatus;

		private String driftDetectionTime;

		public String getStackGroupName() {
			return this.stackGroupName;
		}

		public void setStackGroupName(String stackGroupName) {
			this.stackGroupName = stackGroupName;
		}

		public String getStackGroupId() {
			return this.stackGroupId;
		}

		public void setStackGroupId(String stackGroupId) {
			this.stackGroupId = stackGroupId;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusReason() {
			return this.statusReason;
		}

		public void setStatusReason(String statusReason) {
			this.statusReason = statusReason;
		}

		public String getStackDriftStatus() {
			return this.stackDriftStatus;
		}

		public void setStackDriftStatus(String stackDriftStatus) {
			this.stackDriftStatus = stackDriftStatus;
		}

		public String getDriftDetectionTime() {
			return this.driftDetectionTime;
		}

		public void setDriftDetectionTime(String driftDetectionTime) {
			this.driftDetectionTime = driftDetectionTime;
		}
	}

	@Override
	public ListStackInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListStackInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
