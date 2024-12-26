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

package com.aliyuncs.schedulerx3.model.v20240624;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx3.transform.v20240624.ListClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClustersResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String message;

	private Boolean success;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Record> records;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
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

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String clusterId;

			private String clusterName;

			private String clusterSpec;

			private Integer productType;

			private String engineType;

			private String engineVersion;

			private Integer status;

			private String createTime;

			private String endTime;

			private String intranetDomain;

			private String internetDomain;

			private String chargeType;

			private String vpcId;

			private String spInstanceId;

			private List<VswitchesItem> vSwitches;

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getClusterName() {
				return this.clusterName;
			}

			public void setClusterName(String clusterName) {
				this.clusterName = clusterName;
			}

			public String getClusterSpec() {
				return this.clusterSpec;
			}

			public void setClusterSpec(String clusterSpec) {
				this.clusterSpec = clusterSpec;
			}

			public Integer getProductType() {
				return this.productType;
			}

			public void setProductType(Integer productType) {
				this.productType = productType;
			}

			public String getEngineType() {
				return this.engineType;
			}

			public void setEngineType(String engineType) {
				this.engineType = engineType;
			}

			public String getEngineVersion() {
				return this.engineVersion;
			}

			public void setEngineVersion(String engineVersion) {
				this.engineVersion = engineVersion;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getIntranetDomain() {
				return this.intranetDomain;
			}

			public void setIntranetDomain(String intranetDomain) {
				this.intranetDomain = intranetDomain;
			}

			public String getInternetDomain() {
				return this.internetDomain;
			}

			public void setInternetDomain(String internetDomain) {
				this.internetDomain = internetDomain;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

			public String getSpInstanceId() {
				return this.spInstanceId;
			}

			public void setSpInstanceId(String spInstanceId) {
				this.spInstanceId = spInstanceId;
			}

			public List<VswitchesItem> getVSwitches() {
				return this.vSwitches;
			}

			public void setVSwitches(List<VswitchesItem> vSwitches) {
				this.vSwitches = vSwitches;
			}

			public static class VswitchesItem {

				private String zoneId;

				private String vSwitchId;

				public String getZoneId() {
					return this.zoneId;
				}

				public void setZoneId(String zoneId) {
					this.zoneId = zoneId;
				}

				public String getVSwitchId() {
					return this.vSwitchId;
				}

				public void setVSwitchId(String vSwitchId) {
					this.vSwitchId = vSwitchId;
				}
			}
		}
	}

	@Override
	public ListClustersResponse getInstance(UnmarshallerContext context) {
		return	ListClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
