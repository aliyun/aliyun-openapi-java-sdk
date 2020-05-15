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
import com.aliyuncs.hbr.transform.v20170908.DescribePlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlansResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

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

	public List<Plan> getPlans() {
		return this.plans;
	}

	public void setPlans(List<Plan> plans) {
		this.plans = plans;
	}

	public static class Plan {

		private Long createdTime;

		private Long updatedTime;

		private String planId;

		private String clientId;

		private String vaultId;

		private String planName;

		private String planStatus;

		private String sourceType;

		private String source;

		private Long retention;

		private String scheduleType;

		private String fullPolicyId;

		private String incPolicyId;

		private String diffPolicyId;

		private Boolean isRemoved;

		private String serverId;

		private String serverType;

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

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
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

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public String getScheduleType() {
			return this.scheduleType;
		}

		public void setScheduleType(String scheduleType) {
			this.scheduleType = scheduleType;
		}

		public String getFullPolicyId() {
			return this.fullPolicyId;
		}

		public void setFullPolicyId(String fullPolicyId) {
			this.fullPolicyId = fullPolicyId;
		}

		public String getIncPolicyId() {
			return this.incPolicyId;
		}

		public void setIncPolicyId(String incPolicyId) {
			this.incPolicyId = incPolicyId;
		}

		public String getDiffPolicyId() {
			return this.diffPolicyId;
		}

		public void setDiffPolicyId(String diffPolicyId) {
			this.diffPolicyId = diffPolicyId;
		}

		public Boolean getIsRemoved() {
			return this.isRemoved;
		}

		public void setIsRemoved(Boolean isRemoved) {
			this.isRemoved = isRemoved;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}
	}

	@Override
	public DescribePlansResponse getInstance(UnmarshallerContext context) {
		return	DescribePlansResponseUnmarshaller.unmarshall(this, context);
	}
}
