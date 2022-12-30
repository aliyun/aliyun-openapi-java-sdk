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
import com.aliyuncs.eflo.transform.v20220530.GetVccResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVccResponse extends AcsResponse {

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

		private String tenantId;

		private String regionId;

		private String vccId;

		private String vpdId;

		private String vpcId;

		private String vSwitchId;

		private String cenId;

		private String vccName;

		private String accessPointId;

		private String lineOperator;

		private String spec;

		private String portType;

		private String pricingCycle;

		private String payType;

		private String duration;

		private String status;

		private String currentNode;

		private String internetChargeType;

		private String bandwidthStr;

		private String message;

		private String createTime;

		private String gmtModified;

		private String commodityCode;

		private String bgpCidr;

		private List<AliyunRouterInfoItem> aliyunRouterInfo;

		private List<CisRouterInfoItem> cisRouterInfo;

		private VpdBaseInfo vpdBaseInfo;

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

		public String getVccId() {
			return this.vccId;
		}

		public void setVccId(String vccId) {
			this.vccId = vccId;
		}

		public String getVpdId() {
			return this.vpdId;
		}

		public void setVpdId(String vpdId) {
			this.vpdId = vpdId;
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

		public String getCenId() {
			return this.cenId;
		}

		public void setCenId(String cenId) {
			this.cenId = cenId;
		}

		public String getVccName() {
			return this.vccName;
		}

		public void setVccName(String vccName) {
			this.vccName = vccName;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getLineOperator() {
			return this.lineOperator;
		}

		public void setLineOperator(String lineOperator) {
			this.lineOperator = lineOperator;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getPortType() {
			return this.portType;
		}

		public void setPortType(String portType) {
			this.portType = portType;
		}

		public String getPricingCycle() {
			return this.pricingCycle;
		}

		public void setPricingCycle(String pricingCycle) {
			this.pricingCycle = pricingCycle;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCurrentNode() {
			return this.currentNode;
		}

		public void setCurrentNode(String currentNode) {
			this.currentNode = currentNode;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getBandwidthStr() {
			return this.bandwidthStr;
		}

		public void setBandwidthStr(String bandwidthStr) {
			this.bandwidthStr = bandwidthStr;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
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

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getBgpCidr() {
			return this.bgpCidr;
		}

		public void setBgpCidr(String bgpCidr) {
			this.bgpCidr = bgpCidr;
		}

		public List<AliyunRouterInfoItem> getAliyunRouterInfo() {
			return this.aliyunRouterInfo;
		}

		public void setAliyunRouterInfo(List<AliyunRouterInfoItem> aliyunRouterInfo) {
			this.aliyunRouterInfo = aliyunRouterInfo;
		}

		public List<CisRouterInfoItem> getCisRouterInfo() {
			return this.cisRouterInfo;
		}

		public void setCisRouterInfo(List<CisRouterInfoItem> cisRouterInfo) {
			this.cisRouterInfo = cisRouterInfo;
		}

		public VpdBaseInfo getVpdBaseInfo() {
			return this.vpdBaseInfo;
		}

		public void setVpdBaseInfo(VpdBaseInfo vpdBaseInfo) {
			this.vpdBaseInfo = vpdBaseInfo;
		}

		public static class AliyunRouterInfoItem {

			private String pcId;

			private String vbrId;

			private String localGatewayIp;

			private String peerGatewayIp;

			private String mask;

			private String vlanId;

			public String getPcId() {
				return this.pcId;
			}

			public void setPcId(String pcId) {
				this.pcId = pcId;
			}

			public String getVbrId() {
				return this.vbrId;
			}

			public void setVbrId(String vbrId) {
				this.vbrId = vbrId;
			}

			public String getLocalGatewayIp() {
				return this.localGatewayIp;
			}

			public void setLocalGatewayIp(String localGatewayIp) {
				this.localGatewayIp = localGatewayIp;
			}

			public String getPeerGatewayIp() {
				return this.peerGatewayIp;
			}

			public void setPeerGatewayIp(String peerGatewayIp) {
				this.peerGatewayIp = peerGatewayIp;
			}

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}

			public String getVlanId() {
				return this.vlanId;
			}

			public void setVlanId(String vlanId) {
				this.vlanId = vlanId;
			}
		}

		public static class CisRouterInfoItem {

			private String ccrId;

			private List<CcInfo> ccInfos;

			public String getCcrId() {
				return this.ccrId;
			}

			public void setCcrId(String ccrId) {
				this.ccrId = ccrId;
			}

			public List<CcInfo> getCcInfos() {
				return this.ccInfos;
			}

			public void setCcInfos(List<CcInfo> ccInfos) {
				this.ccInfos = ccInfos;
			}

			public static class CcInfo {

				private String ccId;

				private String vlanId;

				private String localGatewayIp;

				private String remoteGatewayIp;

				private String subnetMask;

				private String status;

				public String getCcId() {
					return this.ccId;
				}

				public void setCcId(String ccId) {
					this.ccId = ccId;
				}

				public String getVlanId() {
					return this.vlanId;
				}

				public void setVlanId(String vlanId) {
					this.vlanId = vlanId;
				}

				public String getLocalGatewayIp() {
					return this.localGatewayIp;
				}

				public void setLocalGatewayIp(String localGatewayIp) {
					this.localGatewayIp = localGatewayIp;
				}

				public String getRemoteGatewayIp() {
					return this.remoteGatewayIp;
				}

				public void setRemoteGatewayIp(String remoteGatewayIp) {
					this.remoteGatewayIp = remoteGatewayIp;
				}

				public String getSubnetMask() {
					return this.subnetMask;
				}

				public void setSubnetMask(String subnetMask) {
					this.subnetMask = subnetMask;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}
		}

		public static class VpdBaseInfo {

			private String vpdId;

			private String name;

			private String cidr;

			private String gmtCreate;

			public String getVpdId() {
				return this.vpdId;
			}

			public void setVpdId(String vpdId) {
				this.vpdId = vpdId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCidr() {
				return this.cidr;
			}

			public void setCidr(String cidr) {
				this.cidr = cidr;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}
		}
	}

	@Override
	public GetVccResponse getInstance(UnmarshallerContext context) {
		return	GetVccResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
