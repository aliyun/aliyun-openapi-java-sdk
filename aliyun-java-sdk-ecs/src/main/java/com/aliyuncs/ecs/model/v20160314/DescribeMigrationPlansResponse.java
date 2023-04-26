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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribeMigrationPlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMigrationPlansResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<MigrationPlan> migrationPlanSet;

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

	public List<MigrationPlan> getMigrationPlanSet() {
		return this.migrationPlanSet;
	}

	public void setMigrationPlanSet(List<MigrationPlan> migrationPlanSet) {
		this.migrationPlanSet = migrationPlanSet;
	}

	public static class MigrationPlan {

		private String status;

		private String type;

		private Integer totalInstanceCount;

		private String targetVpcId;

		private String targetVSwitchId;

		private String createTime;

		private Boolean enableNetworkConnectivity;

		private Boolean enableAutoCreateVSwitch;

		private String targetZoneId;

		private Boolean remainPrivateIp;

		private String migrationPlanId;

		private Integer finishInstanceCount;

		private Boolean remainPublicMacAsPriority;

		private String name;

		private List<String> securityGroupNos;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getTotalInstanceCount() {
			return this.totalInstanceCount;
		}

		public void setTotalInstanceCount(Integer totalInstanceCount) {
			this.totalInstanceCount = totalInstanceCount;
		}

		public String getTargetVpcId() {
			return this.targetVpcId;
		}

		public void setTargetVpcId(String targetVpcId) {
			this.targetVpcId = targetVpcId;
		}

		public String getTargetVSwitchId() {
			return this.targetVSwitchId;
		}

		public void setTargetVSwitchId(String targetVSwitchId) {
			this.targetVSwitchId = targetVSwitchId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getEnableNetworkConnectivity() {
			return this.enableNetworkConnectivity;
		}

		public void setEnableNetworkConnectivity(Boolean enableNetworkConnectivity) {
			this.enableNetworkConnectivity = enableNetworkConnectivity;
		}

		public Boolean getEnableAutoCreateVSwitch() {
			return this.enableAutoCreateVSwitch;
		}

		public void setEnableAutoCreateVSwitch(Boolean enableAutoCreateVSwitch) {
			this.enableAutoCreateVSwitch = enableAutoCreateVSwitch;
		}

		public String getTargetZoneId() {
			return this.targetZoneId;
		}

		public void setTargetZoneId(String targetZoneId) {
			this.targetZoneId = targetZoneId;
		}

		public Boolean getRemainPrivateIp() {
			return this.remainPrivateIp;
		}

		public void setRemainPrivateIp(Boolean remainPrivateIp) {
			this.remainPrivateIp = remainPrivateIp;
		}

		public String getMigrationPlanId() {
			return this.migrationPlanId;
		}

		public void setMigrationPlanId(String migrationPlanId) {
			this.migrationPlanId = migrationPlanId;
		}

		public Integer getFinishInstanceCount() {
			return this.finishInstanceCount;
		}

		public void setFinishInstanceCount(Integer finishInstanceCount) {
			this.finishInstanceCount = finishInstanceCount;
		}

		public Boolean getRemainPublicMacAsPriority() {
			return this.remainPublicMacAsPriority;
		}

		public void setRemainPublicMacAsPriority(Boolean remainPublicMacAsPriority) {
			this.remainPublicMacAsPriority = remainPublicMacAsPriority;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getSecurityGroupNos() {
			return this.securityGroupNos;
		}

		public void setSecurityGroupNos(List<String> securityGroupNos) {
			this.securityGroupNos = securityGroupNos;
		}
	}

	@Override
	public DescribeMigrationPlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeMigrationPlansResponseUnmarshaller.unmarshall(this, context);
	}
}
