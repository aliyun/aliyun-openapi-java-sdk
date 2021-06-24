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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeMigrationInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeMigrationInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer total;

	private List<Instance> instanceSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Instance> getInstanceSet() {
		return this.instanceSet;
	}

	public void setInstanceSet(List<Instance> instanceSet) {
		this.instanceSet = instanceSet;
	}

	public static class Instance {

		private String status;

		private Integer networkTranType;

		private String finishTime;

		private String sourceIzNo;

		private Boolean needKeepPrivateIp;

		private String privateIpAfter;

		private String createTime;

		private Boolean needNetworkConnectivity;

		private Long aliUid;

		private String instanceId;

		private String targetIzNo;

		private Integer transType;

		private Boolean needTransDisk;

		private String migrationPlanId;

		private String startTime;

		private String publicIp;

		private String privateIpBefore;

		private Long numericId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getNetworkTranType() {
			return this.networkTranType;
		}

		public void setNetworkTranType(Integer networkTranType) {
			this.networkTranType = networkTranType;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getSourceIzNo() {
			return this.sourceIzNo;
		}

		public void setSourceIzNo(String sourceIzNo) {
			this.sourceIzNo = sourceIzNo;
		}

		public Boolean getNeedKeepPrivateIp() {
			return this.needKeepPrivateIp;
		}

		public void setNeedKeepPrivateIp(Boolean needKeepPrivateIp) {
			this.needKeepPrivateIp = needKeepPrivateIp;
		}

		public String getPrivateIpAfter() {
			return this.privateIpAfter;
		}

		public void setPrivateIpAfter(String privateIpAfter) {
			this.privateIpAfter = privateIpAfter;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getNeedNetworkConnectivity() {
			return this.needNetworkConnectivity;
		}

		public void setNeedNetworkConnectivity(Boolean needNetworkConnectivity) {
			this.needNetworkConnectivity = needNetworkConnectivity;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTargetIzNo() {
			return this.targetIzNo;
		}

		public void setTargetIzNo(String targetIzNo) {
			this.targetIzNo = targetIzNo;
		}

		public Integer getTransType() {
			return this.transType;
		}

		public void setTransType(Integer transType) {
			this.transType = transType;
		}

		public Boolean getNeedTransDisk() {
			return this.needTransDisk;
		}

		public void setNeedTransDisk(Boolean needTransDisk) {
			this.needTransDisk = needTransDisk;
		}

		public String getMigrationPlanId() {
			return this.migrationPlanId;
		}

		public void setMigrationPlanId(String migrationPlanId) {
			this.migrationPlanId = migrationPlanId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getPublicIp() {
			return this.publicIp;
		}

		public void setPublicIp(String publicIp) {
			this.publicIp = publicIp;
		}

		public String getPrivateIpBefore() {
			return this.privateIpBefore;
		}

		public void setPrivateIpBefore(String privateIpBefore) {
			this.privateIpBefore = privateIpBefore;
		}

		public Long getNumericId() {
			return this.numericId;
		}

		public void setNumericId(Long numericId) {
			this.numericId = numericId;
		}
	}

	@Override
	public OpsDescribeMigrationInstancesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeMigrationInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
