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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmRecoveryPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmRecoveryPlansResponse extends AcsResponse {

	private String requestId;

	private Integer totalItems;

	private Integer totalPages;

	private Integer pageNumber;

	private Integer pageSize;

	private List<RecoveryPlan> recoveryPlans;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
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

	public List<RecoveryPlan> getRecoveryPlans() {
		return this.recoveryPlans;
	}

	public void setRecoveryPlans(List<RecoveryPlan> recoveryPlans) {
		this.recoveryPlans = recoveryPlans;
	}

	public static class RecoveryPlan {

		private Long recoveryPlanId;

		private String name;

		private String remark;

		private Integer faultAddrPoolNum;

		private String lastExecuteTime;

		private Long lastExecuteTimestamp;

		private String lastRollbackTime;

		private Long lastRollbackTimestamp;

		private String createTime;

		private Long createTimestamp;

		private String updateTime;

		private Long updateTimestamp;

		private String status;

		public Long getRecoveryPlanId() {
			return this.recoveryPlanId;
		}

		public void setRecoveryPlanId(Long recoveryPlanId) {
			this.recoveryPlanId = recoveryPlanId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Integer getFaultAddrPoolNum() {
			return this.faultAddrPoolNum;
		}

		public void setFaultAddrPoolNum(Integer faultAddrPoolNum) {
			this.faultAddrPoolNum = faultAddrPoolNum;
		}

		public String getLastExecuteTime() {
			return this.lastExecuteTime;
		}

		public void setLastExecuteTime(String lastExecuteTime) {
			this.lastExecuteTime = lastExecuteTime;
		}

		public Long getLastExecuteTimestamp() {
			return this.lastExecuteTimestamp;
		}

		public void setLastExecuteTimestamp(Long lastExecuteTimestamp) {
			this.lastExecuteTimestamp = lastExecuteTimestamp;
		}

		public String getLastRollbackTime() {
			return this.lastRollbackTime;
		}

		public void setLastRollbackTime(String lastRollbackTime) {
			this.lastRollbackTime = lastRollbackTime;
		}

		public Long getLastRollbackTimestamp() {
			return this.lastRollbackTimestamp;
		}

		public void setLastRollbackTimestamp(Long lastRollbackTimestamp) {
			this.lastRollbackTimestamp = lastRollbackTimestamp;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Long getUpdateTimestamp() {
			return this.updateTimestamp;
		}

		public void setUpdateTimestamp(Long updateTimestamp) {
			this.updateTimestamp = updateTimestamp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeGtmRecoveryPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmRecoveryPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
