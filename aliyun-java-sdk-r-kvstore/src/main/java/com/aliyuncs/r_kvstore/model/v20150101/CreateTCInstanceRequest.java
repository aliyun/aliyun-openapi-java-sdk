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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.r_kvstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTCInstanceRequest extends RpcAcsRequest<CreateTCInstanceResponse> {
	   

	private Long resourceOwnerId;

	private String couponNo;

	private String networkType;

	private Boolean needEni;

	private String resourceGroupId;

	private String securityToken;

	private List<Tag> tags;

	private String businessInfo;

	private String autoRenewPeriod;

	private String period;

	private Boolean dryRun;

	private Long ownerId;

	private String vSwitchId;

	private String instanceName;

	private String autoRenew;

	private String zoneId;

	private String imageId;

	private String clientToken;

	private String securityGroupId;

	private String autoUseCoupon;

	private String instanceClass;

	private String instanceChargeType;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<DataDisk> dataDisks;

	private String vpcId;
	public CreateTCInstanceRequest() {
		super("R-kvstore", "2015-01-01", "CreateTCInstance", "redisa");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
		}
	}

	public Boolean getNeedEni() {
		return this.needEni;
	}

	public void setNeedEni(Boolean needEni) {
		this.needEni = needEni;
		if(needEni != null){
			putQueryParameter("NeedEni", needEni.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(String businessInfo) {
		this.businessInfo = businessInfo;
		if(businessInfo != null){
			putQueryParameter("BusinessInfo", businessInfo);
		}
	}

	public String getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(String autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
		}
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(String autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon);
		}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putQueryParameter("InstanceClass", instanceClass);
		}
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;	
		if (dataDisks != null) {
			for (int depth1 = 0; depth1 < dataDisks.size(); depth1++) {
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".PerformanceLevel" , dataDisks.get(depth1).getPerformanceLevel());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
			}
		}	
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	public static class DataDisk {

		private Integer size;

		private String performanceLevel;

		private String category;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	@Override
	public Class<CreateTCInstanceResponse> getResponseClass() {
		return CreateTCInstanceResponse.class;
	}

}
