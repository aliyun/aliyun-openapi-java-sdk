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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTenantsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTenantsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<Data> tenants;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getTenants() {
		return this.tenants;
	}

	public void setTenants(List<Data> tenants) {
		this.tenants = tenants;
	}

	public static class Data {

		private String vpcId;

		private String status;

		private String primaryZone;

		private String deployType;

		private String deployMode;

		private String createTime;

		private String tenantName;

		private Integer mem;

		private Integer cpu;

		private String description;

		private String tenantMode;

		private String tenantId;

		private Integer unitCpu;

		private Integer unitMem;

		private Integer unitNum;

		private Double usedDiskSize;

		private String charset;

		private String collation;

		private Boolean enableReadOnlyReplica;

		private String parameterTemplate;

		private Integer iops;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPrimaryZone() {
			return this.primaryZone;
		}

		public void setPrimaryZone(String primaryZone) {
			this.primaryZone = primaryZone;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public Integer getMem() {
			return this.mem;
		}

		public void setMem(Integer mem) {
			this.mem = mem;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTenantMode() {
			return this.tenantMode;
		}

		public void setTenantMode(String tenantMode) {
			this.tenantMode = tenantMode;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Integer getUnitCpu() {
			return this.unitCpu;
		}

		public void setUnitCpu(Integer unitCpu) {
			this.unitCpu = unitCpu;
		}

		public Integer getUnitMem() {
			return this.unitMem;
		}

		public void setUnitMem(Integer unitMem) {
			this.unitMem = unitMem;
		}

		public Integer getUnitNum() {
			return this.unitNum;
		}

		public void setUnitNum(Integer unitNum) {
			this.unitNum = unitNum;
		}

		public Double getUsedDiskSize() {
			return this.usedDiskSize;
		}

		public void setUsedDiskSize(Double usedDiskSize) {
			this.usedDiskSize = usedDiskSize;
		}

		public String getCharset() {
			return this.charset;
		}

		public void setCharset(String charset) {
			this.charset = charset;
		}

		public String getCollation() {
			return this.collation;
		}

		public void setCollation(String collation) {
			this.collation = collation;
		}

		public Boolean getEnableReadOnlyReplica() {
			return this.enableReadOnlyReplica;
		}

		public void setEnableReadOnlyReplica(Boolean enableReadOnlyReplica) {
			this.enableReadOnlyReplica = enableReadOnlyReplica;
		}

		public String getParameterTemplate() {
			return this.parameterTemplate;
		}

		public void setParameterTemplate(String parameterTemplate) {
			this.parameterTemplate = parameterTemplate;
		}

		public Integer getIops() {
			return this.iops;
		}

		public void setIops(Integer iops) {
			this.iops = iops;
		}
	}

	@Override
	public DescribeTenantsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTenantsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
