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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAndroidInstanceGroupRequest extends RpcAcsRequest<CreateAndroidInstanceGroupResponse> {
	   

	private String bizRegionId;

	private Boolean enableIpv6;

	private Integer ipv6Bandwidth;

	private List<Tag> tags;

	private Integer period;

	private String vSwitchId;

	private String periodUnit;

	private Boolean autoRenew;

	private String instanceGroupSpec;

	private String policyGroupId;

	private String officeSiteId;

	private String imageId;

	private String clientToken;

	private String instanceGroupName;

	private Integer amount;

	private Boolean autoPay;

	private Integer numberOfInstances;

	private Boolean gpuAcceleration;

	private String chargeType;

	private String keyPairId;
	public CreateAndroidInstanceGroupRequest() {
		super("eds-aic", "2023-09-30", "CreateAndroidInstanceGroup");
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public Boolean getEnableIpv6() {
		return this.enableIpv6;
	}

	public void setEnableIpv6(Boolean enableIpv6) {
		this.enableIpv6 = enableIpv6;
		if(enableIpv6 != null){
			putQueryParameter("EnableIpv6", enableIpv6.toString());
		}
	}

	public Integer getIpv6Bandwidth() {
		return this.ipv6Bandwidth;
	}

	public void setIpv6Bandwidth(Integer ipv6Bandwidth) {
		this.ipv6Bandwidth = ipv6Bandwidth;
		if(ipv6Bandwidth != null){
			putQueryParameter("Ipv6Bandwidth", ipv6Bandwidth.toString());
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
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

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getInstanceGroupSpec() {
		return this.instanceGroupSpec;
	}

	public void setInstanceGroupSpec(String instanceGroupSpec) {
		this.instanceGroupSpec = instanceGroupSpec;
		if(instanceGroupSpec != null){
			putQueryParameter("InstanceGroupSpec", instanceGroupSpec);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
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

	public String getInstanceGroupName() {
		return this.instanceGroupName;
	}

	public void setInstanceGroupName(String instanceGroupName) {
		this.instanceGroupName = instanceGroupName;
		if(instanceGroupName != null){
			putQueryParameter("InstanceGroupName", instanceGroupName);
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Integer getNumberOfInstances() {
		return this.numberOfInstances;
	}

	public void setNumberOfInstances(Integer numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
		if(numberOfInstances != null){
			putQueryParameter("NumberOfInstances", numberOfInstances.toString());
		}
	}

	public Boolean getGpuAcceleration() {
		return this.gpuAcceleration;
	}

	public void setGpuAcceleration(Boolean gpuAcceleration) {
		this.gpuAcceleration = gpuAcceleration;
		if(gpuAcceleration != null){
			putQueryParameter("GpuAcceleration", gpuAcceleration.toString());
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getKeyPairId() {
		return this.keyPairId;
	}

	public void setKeyPairId(String keyPairId) {
		this.keyPairId = keyPairId;
		if(keyPairId != null){
			putQueryParameter("KeyPairId", keyPairId);
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

	@Override
	public Class<CreateAndroidInstanceGroupResponse> getResponseClass() {
		return CreateAndroidInstanceGroupResponse.class;
	}

}
