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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ResizeClusterV2Request extends RpcAcsRequest<ResizeClusterV2Response> {
	   

	private Boolean isOpenPublicIp;

	private Boolean autoPayOrder;

	private String clusterId;

	private String vswitchId;

	private List<HostComponentInfo> hostComponentInfos;

	private List<HostGroup> hostGroups;

	private List<PromotionInfo> promotionInfos;
	public ResizeClusterV2Request() {
		super("Emr", "2016-04-08", "ResizeClusterV2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsOpenPublicIp() {
		return this.isOpenPublicIp;
	}

	public void setIsOpenPublicIp(Boolean isOpenPublicIp) {
		this.isOpenPublicIp = isOpenPublicIp;
		if(isOpenPublicIp != null){
			putQueryParameter("IsOpenPublicIp", isOpenPublicIp.toString());
		}
	}

	public Boolean getAutoPayOrder() {
		return this.autoPayOrder;
	}

	public void setAutoPayOrder(Boolean autoPayOrder) {
		this.autoPayOrder = autoPayOrder;
		if(autoPayOrder != null){
			putQueryParameter("AutoPayOrder", autoPayOrder.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getVswitchId() {
		return this.vswitchId;
	}

	public void setVswitchId(String vswitchId) {
		this.vswitchId = vswitchId;
		if(vswitchId != null){
			putQueryParameter("VswitchId", vswitchId);
		}
	}

	public List<HostComponentInfo> getHostComponentInfos() {
		return this.hostComponentInfos;
	}

	public void setHostComponentInfos(List<HostComponentInfo> hostComponentInfos) {
		this.hostComponentInfos = hostComponentInfos;	
		if (hostComponentInfos != null) {
			for (int depth1 = 0; depth1 < hostComponentInfos.size(); depth1++) {
				putQueryParameter("HostComponentInfo." + (depth1 + 1) + ".HostName" , hostComponentInfos.get(depth1).getHostName());
				if (hostComponentInfos.get(depth1).getComponentNameLists() != null) {
					for (int i = 0; i < hostComponentInfos.get(depth1).getComponentNameLists().size(); i++) {
						putQueryParameter("HostComponentInfo." + (depth1 + 1) + ".ComponentNameList." + (i + 1) , hostComponentInfos.get(depth1).getComponentNameLists().get(i));
					}
				}
				putQueryParameter("HostComponentInfo." + (depth1 + 1) + ".ServiceName" , hostComponentInfos.get(depth1).getServiceName());
			}
		}	
	}

	public List<HostGroup> getHostGroups() {
		return this.hostGroups;
	}

	public void setHostGroups(List<HostGroup> hostGroups) {
		this.hostGroups = hostGroups;	
		if (hostGroups != null) {
			for (int depth1 = 0; depth1 < hostGroups.size(); depth1++) {
				putQueryParameter("HostGroup." + (depth1 + 1) + ".Period" , hostGroups.get(depth1).getPeriod());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".SysDiskCapacity" , hostGroups.get(depth1).getSysDiskCapacity());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostKeyPairName" , hostGroups.get(depth1).getHostKeyPairName());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskCapacity" , hostGroups.get(depth1).getDiskCapacity());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".SysDiskType" , hostGroups.get(depth1).getSysDiskType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".ClusterId" , hostGroups.get(depth1).getClusterId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskType" , hostGroups.get(depth1).getDiskType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupName" , hostGroups.get(depth1).getHostGroupName());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".VswitchId" , hostGroups.get(depth1).getVswitchId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskCount" , hostGroups.get(depth1).getDiskCount());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".AutoRenew" , hostGroups.get(depth1).getAutoRenew());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupId" , hostGroups.get(depth1).getHostGroupId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".NodeCount" , hostGroups.get(depth1).getNodeCount());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".InstanceType" , hostGroups.get(depth1).getInstanceType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".Comment" , hostGroups.get(depth1).getComment());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".ChargeType" , hostGroups.get(depth1).getChargeType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".CreateType" , hostGroups.get(depth1).getCreateType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostPassword" , hostGroups.get(depth1).getHostPassword());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupType" , hostGroups.get(depth1).getHostGroupType());
			}
		}	
	}

	public List<PromotionInfo> getPromotionInfos() {
		return this.promotionInfos;
	}

	public void setPromotionInfos(List<PromotionInfo> promotionInfos) {
		this.promotionInfos = promotionInfos;	
		if (promotionInfos != null) {
			for (int depth1 = 0; depth1 < promotionInfos.size(); depth1++) {
				putQueryParameter("PromotionInfo." + (depth1 + 1) + ".PromotionOptionCode" , promotionInfos.get(depth1).getPromotionOptionCode());
				putQueryParameter("PromotionInfo." + (depth1 + 1) + ".ProductCode" , promotionInfos.get(depth1).getProductCode());
				putQueryParameter("PromotionInfo." + (depth1 + 1) + ".PromotionOptionNo" , promotionInfos.get(depth1).getPromotionOptionNo());
			}
		}	
	}

	public static class HostComponentInfo {

		private String hostName;

		private List<String> componentNameLists;

		private String serviceName;

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public List<String> getComponentNameLists() {
			return this.componentNameLists;
		}

		public void setComponentNameLists(List<String> componentNameLists) {
			this.componentNameLists = componentNameLists;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	}

	public static class HostGroup {

		private Integer period;

		private Integer sysDiskCapacity;

		private String hostKeyPairName;

		private Integer diskCapacity;

		private String sysDiskType;

		private String clusterId;

		private String diskType;

		private String hostGroupName;

		private Integer vswitchId;

		private Integer diskCount;

		private Boolean autoRenew;

		private String hostGroupId;

		private Integer nodeCount;

		private String instanceType;

		private String comment;

		private String chargeType;

		private String createType;

		private String hostPassword;

		private String hostGroupType;

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public Integer getSysDiskCapacity() {
			return this.sysDiskCapacity;
		}

		public void setSysDiskCapacity(Integer sysDiskCapacity) {
			this.sysDiskCapacity = sysDiskCapacity;
		}

		public String getHostKeyPairName() {
			return this.hostKeyPairName;
		}

		public void setHostKeyPairName(String hostKeyPairName) {
			this.hostKeyPairName = hostKeyPairName;
		}

		public Integer getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Integer diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public String getSysDiskType() {
			return this.sysDiskType;
		}

		public void setSysDiskType(String sysDiskType) {
			this.sysDiskType = sysDiskType;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getHostGroupName() {
			return this.hostGroupName;
		}

		public void setHostGroupName(String hostGroupName) {
			this.hostGroupName = hostGroupName;
		}

		public Integer getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(Integer vswitchId) {
			this.vswitchId = vswitchId;
		}

		public Integer getDiskCount() {
			return this.diskCount;
		}

		public void setDiskCount(Integer diskCount) {
			this.diskCount = diskCount;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCreateType() {
			return this.createType;
		}

		public void setCreateType(String createType) {
			this.createType = createType;
		}

		public String getHostPassword() {
			return this.hostPassword;
		}

		public void setHostPassword(String hostPassword) {
			this.hostPassword = hostPassword;
		}

		public String getHostGroupType() {
			return this.hostGroupType;
		}

		public void setHostGroupType(String hostGroupType) {
			this.hostGroupType = hostGroupType;
		}
	}

	public static class PromotionInfo {

		private String promotionOptionCode;

		private String productCode;

		private String promotionOptionNo;

		public String getPromotionOptionCode() {
			return this.promotionOptionCode;
		}

		public void setPromotionOptionCode(String promotionOptionCode) {
			this.promotionOptionCode = promotionOptionCode;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getPromotionOptionNo() {
			return this.promotionOptionNo;
		}

		public void setPromotionOptionNo(String promotionOptionNo) {
			this.promotionOptionNo = promotionOptionNo;
		}
	}

	@Override
	public Class<ResizeClusterV2Response> getResponseClass() {
		return ResizeClusterV2Response.class;
	}

}
