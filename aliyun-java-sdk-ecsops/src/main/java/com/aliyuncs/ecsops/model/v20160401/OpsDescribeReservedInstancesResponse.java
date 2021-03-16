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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeReservedInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeReservedInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ReservedInstance> reservedInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ReservedInstance> getReservedInstances() {
		return this.reservedInstances;
	}

	public void setReservedInstances(List<ReservedInstance> reservedInstances) {
		this.reservedInstances = reservedInstances;
	}

	public static class ReservedInstance {

		private String reservedInstanceId;

		private String regionId;

		private String zoneId;

		private String reservedInstanceName;

		private String description;

		private String instanceType;

		private String scope;

		private String offeringType;

		private Integer instanceAmount;

		private String status;

		private String resourceGroupId;

		public String getReservedInstanceId() {
			return this.reservedInstanceId;
		}

		public void setReservedInstanceId(String reservedInstanceId) {
			this.reservedInstanceId = reservedInstanceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getReservedInstanceName() {
			return this.reservedInstanceName;
		}

		public void setReservedInstanceName(String reservedInstanceName) {
			this.reservedInstanceName = reservedInstanceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getOfferingType() {
			return this.offeringType;
		}

		public void setOfferingType(String offeringType) {
			this.offeringType = offeringType;
		}

		public Integer getInstanceAmount() {
			return this.instanceAmount;
		}

		public void setInstanceAmount(Integer instanceAmount) {
			this.instanceAmount = instanceAmount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}
	}

	@Override
	public OpsDescribeReservedInstancesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeReservedInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
