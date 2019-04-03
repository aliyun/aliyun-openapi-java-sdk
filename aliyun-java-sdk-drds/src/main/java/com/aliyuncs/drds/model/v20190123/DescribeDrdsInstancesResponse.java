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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeDrdsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrdsInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<Instance> instances;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String drdsInstanceId;

		private String type;

		private String regionId;

		private String zoneId;

		private String description;

		private String networkType;

		private String status;

		private Long createTime;

		private Long version;

		private String commodityCode;

		private String instRole;

		private String instanceSeries;

		private String instanceSpec;

		private String masterInstanceId;

		private String vpcCloudInstanceId;

		private String vpcId;

		private Long expireDate;

		private String versionAction;

		private String label;

		private List<Vip> vips;

		private List<String> readOnlyDBInstanceIds;

		public String getDrdsInstanceId() {
			return this.drdsInstanceId;
		}

		public void setDrdsInstanceId(String drdsInstanceId) {
			this.drdsInstanceId = drdsInstanceId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getBizVersion() {
			return this.version;
		}

		public void setBizVersion(Long version) {
			this.version = version;
		}

		/**
		 * @deprecated use getBizVersion instead of this.
		 */
		@Deprecated
		public Long getVersion() {
			return this.version;
		}

		/**
		 * @deprecated use setBizVersion instead of this.
		 */
		@Deprecated
		public void setVersion(Long version) {
			this.version = version;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getInstRole() {
			return this.instRole;
		}

		public void setInstRole(String instRole) {
			this.instRole = instRole;
		}

		public String getInstanceSeries() {
			return this.instanceSeries;
		}

		public void setInstanceSeries(String instanceSeries) {
			this.instanceSeries = instanceSeries;
		}

		public String getInstanceSpec() {
			return this.instanceSpec;
		}

		public void setInstanceSpec(String instanceSpec) {
			this.instanceSpec = instanceSpec;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getVpcCloudInstanceId() {
			return this.vpcCloudInstanceId;
		}

		public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
			this.vpcCloudInstanceId = vpcCloudInstanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Long getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(Long expireDate) {
			this.expireDate = expireDate;
		}

		public String getVersionAction() {
			return this.versionAction;
		}

		public void setVersionAction(String versionAction) {
			this.versionAction = versionAction;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public List<Vip> getVips() {
			return this.vips;
		}

		public void setVips(List<Vip> vips) {
			this.vips = vips;
		}

		public List<String> getReadOnlyDBInstanceIds() {
			return this.readOnlyDBInstanceIds;
		}

		public void setReadOnlyDBInstanceIds(List<String> readOnlyDBInstanceIds) {
			this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
		}

		public static class Vip {

			private String iP;

			private String port;

			private String type;

			private String vpcId;

			private String vswitchId;

			public String getIP() {
				return this.iP;
			}

			public void setIP(String iP) {
				this.iP = iP;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}
		}
	}

	@Override
	public DescribeDrdsInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrdsInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
