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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.ListNetworkInterfacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNetworkInterfacesResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private Long total;

		private List<DataItem> data;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String tenantId;

			private String regionId;

			private String networkInterfaceId;

			private String nodeId;

			private String zoneId;

			private String ip;

			private String serviceMac;

			private String status;

			private String gateway;

			private String createTime;

			private Integer quota;

			private String ncType;

			private String networkInterfaceName;

			private List<PrivateIpAddressMacGroupItem> privateIpAddressMacGroup;

			private List<String> ethernet;

			private VpdBaseInfo vpdBaseInfo;

			private SubnetBaseInfo subnetBaseInfo;

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public String getServiceMac() {
				return this.serviceMac;
			}

			public void setServiceMac(String serviceMac) {
				this.serviceMac = serviceMac;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getGateway() {
				return this.gateway;
			}

			public void setGateway(String gateway) {
				this.gateway = gateway;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public Integer getQuota() {
				return this.quota;
			}

			public void setQuota(Integer quota) {
				this.quota = quota;
			}

			public String getNcType() {
				return this.ncType;
			}

			public void setNcType(String ncType) {
				this.ncType = ncType;
			}

			public String getNetworkInterfaceName() {
				return this.networkInterfaceName;
			}

			public void setNetworkInterfaceName(String networkInterfaceName) {
				this.networkInterfaceName = networkInterfaceName;
			}

			public List<PrivateIpAddressMacGroupItem> getPrivateIpAddressMacGroup() {
				return this.privateIpAddressMacGroup;
			}

			public void setPrivateIpAddressMacGroup(List<PrivateIpAddressMacGroupItem> privateIpAddressMacGroup) {
				this.privateIpAddressMacGroup = privateIpAddressMacGroup;
			}

			public List<String> getEthernet() {
				return this.ethernet;
			}

			public void setEthernet(List<String> ethernet) {
				this.ethernet = ethernet;
			}

			public VpdBaseInfo getVpdBaseInfo() {
				return this.vpdBaseInfo;
			}

			public void setVpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
				this.vpdBaseInfo = vpdBaseInfo;
			}

			public SubnetBaseInfo getSubnetBaseInfo() {
				return this.subnetBaseInfo;
			}

			public void setSubnetBaseInfo(SubnetBaseInfo subnetBaseInfo) {
				this.subnetBaseInfo = subnetBaseInfo;
			}

			public static class PrivateIpAddressMacGroupItem {

				private String ipName;

				private String privateIpAddress;

				private String ipAddressMac;

				private String status;

				private String description;

				private String message;

				public String getIpName() {
					return this.ipName;
				}

				public void setIpName(String ipName) {
					this.ipName = ipName;
				}

				public String getPrivateIpAddress() {
					return this.privateIpAddress;
				}

				public void setPrivateIpAddress(String privateIpAddress) {
					this.privateIpAddress = privateIpAddress;
				}

				public String getIpAddressMac() {
					return this.ipAddressMac;
				}

				public void setIpAddressMac(String ipAddressMac) {
					this.ipAddressMac = ipAddressMac;
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

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}
			}

			public static class VpdBaseInfo {

				private String vpdId;

				private String vpdName;

				private String cidr;

				private String createTime;

				public String getVpdId() {
					return this.vpdId;
				}

				public void setVpdId(String vpdId) {
					this.vpdId = vpdId;
				}

				public String getVpdName() {
					return this.vpdName;
				}

				public void setVpdName(String vpdName) {
					this.vpdName = vpdName;
				}

				public String getCidr() {
					return this.cidr;
				}

				public void setCidr(String cidr) {
					this.cidr = cidr;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}
			}

			public static class SubnetBaseInfo {

				private String subnetId;

				private String subnetName;

				private String cidr;

				private String createTime;

				public String getSubnetId() {
					return this.subnetId;
				}

				public void setSubnetId(String subnetId) {
					this.subnetId = subnetId;
				}

				public String getSubnetName() {
					return this.subnetName;
				}

				public void setSubnetName(String subnetName) {
					this.subnetName = subnetName;
				}

				public String getCidr() {
					return this.cidr;
				}

				public void setCidr(String cidr) {
					this.cidr = cidr;
				}

				public String getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(String createTime) {
					this.createTime = createTime;
				}
			}
		}
	}

	@Override
	public ListNetworkInterfacesResponse getInstance(UnmarshallerContext context) {
		return	ListNetworkInterfacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
