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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

		private Long totalSize;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Gateways> result;

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
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

		public List<Gateways> getResult() {
			return this.result;
		}

		public void setResult(List<Gateways> result) {
			this.result = result;
		}

		public static class Gateways {

			private Long id;

			private String name;

			private String gatewayUniqueId;

			private String gatewayType;

			private String region;

			private String primaryUser;

			private Integer status;

			private Boolean ahasOn;

			private Boolean armsOn;

			private String spec;

			private Integer replica;

			private String gmtCreate;

			private String gmtModified;

			private String statusDesc;

			private Boolean upgrade;

			private Boolean mustUpgrade;

			private String currentVersion;

			private String latestVersion;

			private String vswitch2;

			private String instanceId;

			private String chargeType;

			private String endDate;

			private String tag;

			private List<SlbItem> slb;

			private List<InternetSlbItem> internetSlb;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getGatewayUniqueId() {
				return this.gatewayUniqueId;
			}

			public void setGatewayUniqueId(String gatewayUniqueId) {
				this.gatewayUniqueId = gatewayUniqueId;
			}

			public String getGatewayType() {
				return this.gatewayType;
			}

			public void setGatewayType(String gatewayType) {
				this.gatewayType = gatewayType;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}

			public String getPrimaryUser() {
				return this.primaryUser;
			}

			public void setPrimaryUser(String primaryUser) {
				this.primaryUser = primaryUser;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Boolean getAhasOn() {
				return this.ahasOn;
			}

			public void setAhasOn(Boolean ahasOn) {
				this.ahasOn = ahasOn;
			}

			public Boolean getArmsOn() {
				return this.armsOn;
			}

			public void setArmsOn(Boolean armsOn) {
				this.armsOn = armsOn;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public Integer getReplica() {
				return this.replica;
			}

			public void setReplica(Integer replica) {
				this.replica = replica;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getStatusDesc() {
				return this.statusDesc;
			}

			public void setStatusDesc(String statusDesc) {
				this.statusDesc = statusDesc;
			}

			public Boolean getUpgrade() {
				return this.upgrade;
			}

			public void setUpgrade(Boolean upgrade) {
				this.upgrade = upgrade;
			}

			public Boolean getMustUpgrade() {
				return this.mustUpgrade;
			}

			public void setMustUpgrade(Boolean mustUpgrade) {
				this.mustUpgrade = mustUpgrade;
			}

			public String getCurrentVersion() {
				return this.currentVersion;
			}

			public void setCurrentVersion(String currentVersion) {
				this.currentVersion = currentVersion;
			}

			public String getLatestVersion() {
				return this.latestVersion;
			}

			public void setLatestVersion(String latestVersion) {
				this.latestVersion = latestVersion;
			}

			public String getVswitch2() {
				return this.vswitch2;
			}

			public void setVswitch2(String vswitch2) {
				this.vswitch2 = vswitch2;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getChargeType() {
				return this.chargeType;
			}

			public void setChargeType(String chargeType) {
				this.chargeType = chargeType;
			}

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public String getTag() {
				return this.tag;
			}

			public void setTag(String tag) {
				this.tag = tag;
			}

			public List<SlbItem> getSlb() {
				return this.slb;
			}

			public void setSlb(List<SlbItem> slb) {
				this.slb = slb;
			}

			public List<InternetSlbItem> getInternetSlb() {
				return this.internetSlb;
			}

			public void setInternetSlb(List<InternetSlbItem> internetSlb) {
				this.internetSlb = internetSlb;
			}

			public static class SlbItem {

				private String slbIp;

				private String slbPort;

				private String slbSpec;

				private String type;

				private String gatewaySlbStatus;

				private String statusDesc;

				private String gatewaySlbMode;

				private String slbId;

				public String getSlbIp() {
					return this.slbIp;
				}

				public void setSlbIp(String slbIp) {
					this.slbIp = slbIp;
				}

				public String getSlbPort() {
					return this.slbPort;
				}

				public void setSlbPort(String slbPort) {
					this.slbPort = slbPort;
				}

				public String getSlbSpec() {
					return this.slbSpec;
				}

				public void setSlbSpec(String slbSpec) {
					this.slbSpec = slbSpec;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getGatewaySlbStatus() {
					return this.gatewaySlbStatus;
				}

				public void setGatewaySlbStatus(String gatewaySlbStatus) {
					this.gatewaySlbStatus = gatewaySlbStatus;
				}

				public String getStatusDesc() {
					return this.statusDesc;
				}

				public void setStatusDesc(String statusDesc) {
					this.statusDesc = statusDesc;
				}

				public String getGatewaySlbMode() {
					return this.gatewaySlbMode;
				}

				public void setGatewaySlbMode(String gatewaySlbMode) {
					this.gatewaySlbMode = gatewaySlbMode;
				}

				public String getSlbId() {
					return this.slbId;
				}

				public void setSlbId(String slbId) {
					this.slbId = slbId;
				}
			}

			public static class InternetSlbItem {

				private String slbIp;

				private String slbPort;

				private String slbSpec;

				private String type;

				private String internetNetworkFlow;

				private String gatewaySlbStatus;

				private String statusDesc;

				private String gatewaySlbMode;

				private String slbId;

				public String getSlbIp() {
					return this.slbIp;
				}

				public void setSlbIp(String slbIp) {
					this.slbIp = slbIp;
				}

				public String getSlbPort() {
					return this.slbPort;
				}

				public void setSlbPort(String slbPort) {
					this.slbPort = slbPort;
				}

				public String getSlbSpec() {
					return this.slbSpec;
				}

				public void setSlbSpec(String slbSpec) {
					this.slbSpec = slbSpec;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getInternetNetworkFlow() {
					return this.internetNetworkFlow;
				}

				public void setInternetNetworkFlow(String internetNetworkFlow) {
					this.internetNetworkFlow = internetNetworkFlow;
				}

				public String getGatewaySlbStatus() {
					return this.gatewaySlbStatus;
				}

				public void setGatewaySlbStatus(String gatewaySlbStatus) {
					this.gatewaySlbStatus = gatewaySlbStatus;
				}

				public String getStatusDesc() {
					return this.statusDesc;
				}

				public void setStatusDesc(String statusDesc) {
					this.statusDesc = statusDesc;
				}

				public String getGatewaySlbMode() {
					return this.gatewaySlbMode;
				}

				public void setGatewaySlbMode(String gatewaySlbMode) {
					this.gatewaySlbMode = gatewaySlbMode;
				}

				public String getSlbId() {
					return this.slbId;
				}

				public void setSlbId(String slbId) {
					this.slbId = slbId;
				}
			}
		}
	}

	@Override
	public ListGatewayResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
