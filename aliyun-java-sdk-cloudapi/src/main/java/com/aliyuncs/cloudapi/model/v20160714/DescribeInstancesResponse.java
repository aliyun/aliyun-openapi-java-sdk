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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<InstanceAttribute> instances;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceAttribute> getInstances() {
		return this.instances;
	}

	public void setInstances(List<InstanceAttribute> instances) {
		this.instances = instances;
	}

	public static class InstanceAttribute {

		private String status;

		private Boolean vpcSlbIntranetEnable;

		private String classicEgressAddress;

		private String zoneLocalName;

		private String vipTypeList;

		private String userVpcId;

		private Boolean vpcIntranetEnable;

		private Long vpcOwnerId;

		private String instanceId;

		private Integer instanceRpsLimit;

		private String instanceType;

		private String regionId;

		private String instanceSpec;

		private String instanceChargeType;

		private String httpsPolicies;

		private String vpcEgressAddress;

		private Boolean egressIpv6Enable;

		private String expiredTime;

		private String instanceName;

		private String zoneId;

		private Boolean supportIpv6;

		private String internetEgressAddress;

		private String createdTime;

		private String userVswitchId;

		private String aclName;

		private String aclType;

		private String aclStatus;

		private String aclId;

		private String intranetSegments;

		private String iPV6AclName;

		private String iPV6AclId;

		private String iPV6AclType;

		private String iPV6AclStatus;

		private String dedicatedInstanceType;

		private String instanceCidrBlock;

		private String connectVpcId;

		private List<SpecAttribute> instanceSpecAttributes;

		private List<NetworkInterfaceAttribute> networkInterfaceAttributes;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getVpcSlbIntranetEnable() {
			return this.vpcSlbIntranetEnable;
		}

		public void setVpcSlbIntranetEnable(Boolean vpcSlbIntranetEnable) {
			this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
		}

		public String getClassicEgressAddress() {
			return this.classicEgressAddress;
		}

		public void setClassicEgressAddress(String classicEgressAddress) {
			this.classicEgressAddress = classicEgressAddress;
		}

		public String getZoneLocalName() {
			return this.zoneLocalName;
		}

		public void setZoneLocalName(String zoneLocalName) {
			this.zoneLocalName = zoneLocalName;
		}

		public String getVipTypeList() {
			return this.vipTypeList;
		}

		public void setVipTypeList(String vipTypeList) {
			this.vipTypeList = vipTypeList;
		}

		public String getUserVpcId() {
			return this.userVpcId;
		}

		public void setUserVpcId(String userVpcId) {
			this.userVpcId = userVpcId;
		}

		public Boolean getVpcIntranetEnable() {
			return this.vpcIntranetEnable;
		}

		public void setVpcIntranetEnable(Boolean vpcIntranetEnable) {
			this.vpcIntranetEnable = vpcIntranetEnable;
		}

		public Long getVpcOwnerId() {
			return this.vpcOwnerId;
		}

		public void setVpcOwnerId(Long vpcOwnerId) {
			this.vpcOwnerId = vpcOwnerId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInstanceRpsLimit() {
			return this.instanceRpsLimit;
		}

		public void setInstanceRpsLimit(Integer instanceRpsLimit) {
			this.instanceRpsLimit = instanceRpsLimit;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getInstanceSpec() {
			return this.instanceSpec;
		}

		public void setInstanceSpec(String instanceSpec) {
			this.instanceSpec = instanceSpec;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getHttpsPolicies() {
			return this.httpsPolicies;
		}

		public void setHttpsPolicies(String httpsPolicies) {
			this.httpsPolicies = httpsPolicies;
		}

		public String getVpcEgressAddress() {
			return this.vpcEgressAddress;
		}

		public void setVpcEgressAddress(String vpcEgressAddress) {
			this.vpcEgressAddress = vpcEgressAddress;
		}

		public Boolean getEgressIpv6Enable() {
			return this.egressIpv6Enable;
		}

		public void setEgressIpv6Enable(Boolean egressIpv6Enable) {
			this.egressIpv6Enable = egressIpv6Enable;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Boolean getSupportIpv6() {
			return this.supportIpv6;
		}

		public void setSupportIpv6(Boolean supportIpv6) {
			this.supportIpv6 = supportIpv6;
		}

		public String getInternetEgressAddress() {
			return this.internetEgressAddress;
		}

		public void setInternetEgressAddress(String internetEgressAddress) {
			this.internetEgressAddress = internetEgressAddress;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getUserVswitchId() {
			return this.userVswitchId;
		}

		public void setUserVswitchId(String userVswitchId) {
			this.userVswitchId = userVswitchId;
		}

		public String getAclName() {
			return this.aclName;
		}

		public void setAclName(String aclName) {
			this.aclName = aclName;
		}

		public String getAclType() {
			return this.aclType;
		}

		public void setAclType(String aclType) {
			this.aclType = aclType;
		}

		public String getAclStatus() {
			return this.aclStatus;
		}

		public void setAclStatus(String aclStatus) {
			this.aclStatus = aclStatus;
		}

		public String getAclId() {
			return this.aclId;
		}

		public void setAclId(String aclId) {
			this.aclId = aclId;
		}

		public String getIntranetSegments() {
			return this.intranetSegments;
		}

		public void setIntranetSegments(String intranetSegments) {
			this.intranetSegments = intranetSegments;
		}

		public String getIPV6AclName() {
			return this.iPV6AclName;
		}

		public void setIPV6AclName(String iPV6AclName) {
			this.iPV6AclName = iPV6AclName;
		}

		public String getIPV6AclId() {
			return this.iPV6AclId;
		}

		public void setIPV6AclId(String iPV6AclId) {
			this.iPV6AclId = iPV6AclId;
		}

		public String getIPV6AclType() {
			return this.iPV6AclType;
		}

		public void setIPV6AclType(String iPV6AclType) {
			this.iPV6AclType = iPV6AclType;
		}

		public String getIPV6AclStatus() {
			return this.iPV6AclStatus;
		}

		public void setIPV6AclStatus(String iPV6AclStatus) {
			this.iPV6AclStatus = iPV6AclStatus;
		}

		public String getDedicatedInstanceType() {
			return this.dedicatedInstanceType;
		}

		public void setDedicatedInstanceType(String dedicatedInstanceType) {
			this.dedicatedInstanceType = dedicatedInstanceType;
		}

		public String getInstanceCidrBlock() {
			return this.instanceCidrBlock;
		}

		public void setInstanceCidrBlock(String instanceCidrBlock) {
			this.instanceCidrBlock = instanceCidrBlock;
		}

		public String getConnectVpcId() {
			return this.connectVpcId;
		}

		public void setConnectVpcId(String connectVpcId) {
			this.connectVpcId = connectVpcId;
		}

		public List<SpecAttribute> getInstanceSpecAttributes() {
			return this.instanceSpecAttributes;
		}

		public void setInstanceSpecAttributes(List<SpecAttribute> instanceSpecAttributes) {
			this.instanceSpecAttributes = instanceSpecAttributes;
		}

		public List<NetworkInterfaceAttribute> getNetworkInterfaceAttributes() {
			return this.networkInterfaceAttributes;
		}

		public void setNetworkInterfaceAttributes(List<NetworkInterfaceAttribute> networkInterfaceAttributes) {
			this.networkInterfaceAttributes = networkInterfaceAttributes;
		}

		public static class SpecAttribute {

			private String value;

			private String localName;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getLocalName() {
				return this.localName;
			}

			public void setLocalName(String localName) {
				this.localName = localName;
			}
		}

		public static class NetworkInterfaceAttribute {

			private String vswitchId;

			private String securityGroupId;

			private String networkInterfaceId;

			private String cidrBlock;

			private String zoneId;

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}

			public String getSecurityGroupId() {
				return this.securityGroupId;
			}

			public void setSecurityGroupId(String securityGroupId) {
				this.securityGroupId = securityGroupId;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}

			public String getCidrBlock() {
				return this.cidrBlock;
			}

			public void setCidrBlock(String cidrBlock) {
				this.cidrBlock = cidrBlock;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
