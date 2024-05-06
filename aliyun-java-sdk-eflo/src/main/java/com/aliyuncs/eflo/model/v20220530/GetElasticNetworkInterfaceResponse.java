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
import com.aliyuncs.eflo.transform.v20220530.GetElasticNetworkInterfaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetElasticNetworkInterfaceResponse extends AcsResponse {

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

		private String regionId;

		private String zoneId;

		private String elasticNetworkInterfaceId;

		private String nodeId;

		private String status;

		private String ip;

		private String vpcId;

		private String vSwitchId;

		private String message;

		private String mac;

		private String type;

		private String gateway;

		private String mask;

		private String createTime;

		private String gmtModified;

		private String description;

		private String securityGroupId;

		private List<PrivateIpAddress> privateIpAddresses;

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

		public String getElasticNetworkInterfaceId() {
			return this.elasticNetworkInterfaceId;
		}

		public void setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
			this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGateway() {
			return this.gateway;
		}

		public void setGateway(String gateway) {
			this.gateway = gateway;
		}

		public String getMask() {
			return this.mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public List<PrivateIpAddress> getPrivateIpAddresses() {
			return this.privateIpAddresses;
		}

		public void setPrivateIpAddresses(List<PrivateIpAddress> privateIpAddresses) {
			this.privateIpAddresses = privateIpAddresses;
		}

		public static class PrivateIpAddress {

			private String elasticNetworkInterfaceId;

			private String regionId;

			private String gmtCreate;

			private String gmtModified;

			private String ipName;

			private String privateIpAddress;

			private String status;

			private String description;

			private String message;

			public String getElasticNetworkInterfaceId() {
				return this.elasticNetworkInterfaceId;
			}

			public void setElasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
				this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
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
	}

	@Override
	public GetElasticNetworkInterfaceResponse getInstance(UnmarshallerContext context) {
		return	GetElasticNetworkInterfaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
