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
import com.aliyuncs.hbr.transform.v20170908.DescribeVmBackupPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVmBackupPlansResponse extends AcsResponse {

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

		private String planName;

		private String planStatus;

		private String serverType;

		private Long retention;

		private String fullSchedule;

		private String incSchedule;

		private String diffSchedule;

		private Long updatedTime;

		private Long createdTime;

		private List<VmInfo> vmInfos;

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
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

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public Long getRetention() {
			return this.retention;
		}

		public void setRetention(Long retention) {
			this.retention = retention;
		}

		public String getFullSchedule() {
			return this.fullSchedule;
		}

		public void setFullSchedule(String fullSchedule) {
			this.fullSchedule = fullSchedule;
		}

		public String getIncSchedule() {
			return this.incSchedule;
		}

		public void setIncSchedule(String incSchedule) {
			this.incSchedule = incSchedule;
		}

		public String getDiffSchedule() {
			return this.diffSchedule;
		}

		public void setDiffSchedule(String diffSchedule) {
			this.diffSchedule = diffSchedule;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public List<VmInfo> getVmInfos() {
			return this.vmInfos;
		}

		public void setVmInfos(List<VmInfo> vmInfos) {
			this.vmInfos = vmInfos;
		}

		public static class VmInfo {

			private String vmId;

			private String vmName;

			private String extra;

			private String hypervisorId;

			private String vmInfo;

			private String clientId;

			private Boolean forceSilentSnapshot;

			private String hypervisorType;

			private Boolean useHotAdd;

			public String getVmId() {
				return this.vmId;
			}

			public void setVmId(String vmId) {
				this.vmId = vmId;
			}

			public String getVmName() {
				return this.vmName;
			}

			public void setVmName(String vmName) {
				this.vmName = vmName;
			}

			public String getExtra() {
				return this.extra;
			}

			public void setExtra(String extra) {
				this.extra = extra;
			}

			public String getHypervisorId() {
				return this.hypervisorId;
			}

			public void setHypervisorId(String hypervisorId) {
				this.hypervisorId = hypervisorId;
			}

			public String getVmInfo() {
				return this.vmInfo;
			}

			public void setVmInfo(String vmInfo) {
				this.vmInfo = vmInfo;
			}

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public Boolean getForceSilentSnapshot() {
				return this.forceSilentSnapshot;
			}

			public void setForceSilentSnapshot(Boolean forceSilentSnapshot) {
				this.forceSilentSnapshot = forceSilentSnapshot;
			}

			public String getHypervisorType() {
				return this.hypervisorType;
			}

			public void setHypervisorType(String hypervisorType) {
				this.hypervisorType = hypervisorType;
			}

			public Boolean getUseHotAdd() {
				return this.useHotAdd;
			}

			public void setUseHotAdd(Boolean useHotAdd) {
				this.useHotAdd = useHotAdd;
			}
		}
	}

	@Override
	public DescribeVmBackupPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeVmBackupPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
