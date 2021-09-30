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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeVpnGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVpnGatewaysResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VpnGateway> vpnGateways;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VpnGateway> getVpnGateways() {
		return this.vpnGateways;
	}

	public void setVpnGateways(List<VpnGateway> vpnGateways) {
		this.vpnGateways = vpnGateways;
	}

	public static class VpnGateway {

		private String vpnType;

		private String status;

		private String vpcId;

		private Long sslMaxConnections;

		private String spec;

		private String internetIp;

		private Long createTime;

		private Boolean autoPropagate;

		private String chargeType;

		private String vpnGatewayId;

		private String tag;

		private String ipsecVpn;

		private Long endTime;

		private String vSwitchId;

		private String description;

		private Boolean enableBgp;

		private String businessStatus;

		private String sslVpn;

		private String name;

		private List<Tag> tags;

		private ReservationData reservationData;

		public String getVpnType() {
			return this.vpnType;
		}

		public void setVpnType(String vpnType) {
			this.vpnType = vpnType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public Long getSslMaxConnections() {
			return this.sslMaxConnections;
		}

		public void setSslMaxConnections(Long sslMaxConnections) {
			this.sslMaxConnections = sslMaxConnections;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Boolean getAutoPropagate() {
			return this.autoPropagate;
		}

		public void setAutoPropagate(Boolean autoPropagate) {
			this.autoPropagate = autoPropagate;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getVpnGatewayId() {
			return this.vpnGatewayId;
		}

		public void setVpnGatewayId(String vpnGatewayId) {
			this.vpnGatewayId = vpnGatewayId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getIpsecVpn() {
			return this.ipsecVpn;
		}

		public void setIpsecVpn(String ipsecVpn) {
			this.ipsecVpn = ipsecVpn;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getEnableBgp() {
			return this.enableBgp;
		}

		public void setEnableBgp(Boolean enableBgp) {
			this.enableBgp = enableBgp;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getSslVpn() {
			return this.sslVpn;
		}

		public void setSslVpn(String sslVpn) {
			this.sslVpn = sslVpn;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public ReservationData getReservationData() {
			return this.reservationData;
		}

		public void setReservationData(ReservationData reservationData) {
			this.reservationData = reservationData;
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class ReservationData {

			private String status;

			private String reservationOrderType;

			private String reservationIpsec;

			private String reservationSpec;

			private String reservationSsl;

			private Integer reservationMaxConnections;

			private String reservationEndTime;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getReservationOrderType() {
				return this.reservationOrderType;
			}

			public void setReservationOrderType(String reservationOrderType) {
				this.reservationOrderType = reservationOrderType;
			}

			public String getReservationIpsec() {
				return this.reservationIpsec;
			}

			public void setReservationIpsec(String reservationIpsec) {
				this.reservationIpsec = reservationIpsec;
			}

			public String getReservationSpec() {
				return this.reservationSpec;
			}

			public void setReservationSpec(String reservationSpec) {
				this.reservationSpec = reservationSpec;
			}

			public String getReservationSsl() {
				return this.reservationSsl;
			}

			public void setReservationSsl(String reservationSsl) {
				this.reservationSsl = reservationSsl;
			}

			public Integer getReservationMaxConnections() {
				return this.reservationMaxConnections;
			}

			public void setReservationMaxConnections(Integer reservationMaxConnections) {
				this.reservationMaxConnections = reservationMaxConnections;
			}

			public String getReservationEndTime() {
				return this.reservationEndTime;
			}

			public void setReservationEndTime(String reservationEndTime) {
				this.reservationEndTime = reservationEndTime;
			}
		}
	}

	@Override
	public DescribeVpnGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeVpnGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
