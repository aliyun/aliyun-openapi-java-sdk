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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeVmMigrationPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVmMigrationPlansResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Plan> plans;

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

	public List<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}

	public static class Plan {

		private String planId;

		private String vaultId;

		private String planName;

		private String planStatus;

		private Integer vmCount;

		private Integer vmFinished;

		private Integer vmFailed;

		private Long delay;

		private Long createdTime;

		private Long updatedTime;

		private String incrementalSyncSchedule;

		private String mode;

		private Integer vmIncSync;

		private Long startTime;

		private Integer vmCancelled;

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getVaultId() {
			return this.vaultId;
		}

		public void setVaultId(String vaultId) {
			this.vaultId = vaultId;
		}

		public String getPlanName() {
			return this.planName;
		}

		public void setPlanName(String planName) {
			this.planName = planName;
		}

		public String getPlanStatus() {
			return this.planStatus;
		}

		public void setPlanStatus(String planStatus) {
			this.planStatus = planStatus;
		}

		public Integer getVmCount() {
			return this.vmCount;
		}

		public void setVmCount(Integer vmCount) {
			this.vmCount = vmCount;
		}

		public Integer getVmFinished() {
			return this.vmFinished;
		}

		public void setVmFinished(Integer vmFinished) {
			this.vmFinished = vmFinished;
		}

		public Integer getVmFailed() {
			return this.vmFailed;
		}

		public void setVmFailed(Integer vmFailed) {
			this.vmFailed = vmFailed;
		}

		public Long getDelay() {
			return this.delay;
		}

		public void setDelay(Long delay) {
			this.delay = delay;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public String getIncrementalSyncSchedule() {
			return this.incrementalSyncSchedule;
		}

		public void setIncrementalSyncSchedule(String incrementalSyncSchedule) {
			this.incrementalSyncSchedule = incrementalSyncSchedule;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Integer getVmIncSync() {
			return this.vmIncSync;
		}

		public void setVmIncSync(Integer vmIncSync) {
			this.vmIncSync = vmIncSync;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getVmCancelled() {
			return this.vmCancelled;
		}

		public void setVmCancelled(Integer vmCancelled) {
			this.vmCancelled = vmCancelled;
		}
	}

	@Override
	public DescribeVmMigrationPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeVmMigrationPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
