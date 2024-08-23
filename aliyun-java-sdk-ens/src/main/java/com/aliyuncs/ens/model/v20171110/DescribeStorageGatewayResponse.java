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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeStorageGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStorageGatewayResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<StorageGatewaysItem> storageGateways;

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

	public List<StorageGatewaysItem> getStorageGateways() {
		return this.storageGateways;
	}

	public void setStorageGateways(List<StorageGatewaysItem> storageGateways) {
		this.storageGateways = storageGateways;
	}

	public static class StorageGatewaysItem {

		private String ensRegionId;

		private String storageGatewayId;

		private String storageGatewayName;

		private Integer storageGatewayType;

		private String serviceIp;

		private String creationTime;

		private String status;

		private String description;

		private String vpcId;

		private String cidrBlock;

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getStorageGatewayId() {
			return this.storageGatewayId;
		}

		public void setStorageGatewayId(String storageGatewayId) {
			this.storageGatewayId = storageGatewayId;
		}

		public String getStorageGatewayName() {
			return this.storageGatewayName;
		}

		public void setStorageGatewayName(String storageGatewayName) {
			this.storageGatewayName = storageGatewayName;
		}

		public Integer getStorageGatewayType() {
			return this.storageGatewayType;
		}

		public void setStorageGatewayType(Integer storageGatewayType) {
			this.storageGatewayType = storageGatewayType;
		}

		public String getServiceIp() {
			return this.serviceIp;
		}

		public void setServiceIp(String serviceIp) {
			this.serviceIp = serviceIp;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}
	}

	@Override
	public DescribeStorageGatewayResponse getInstance(UnmarshallerContext context) {
		return	DescribeStorageGatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
