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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	   

	private String instanceSpec;

	private String instanceCidr;

	private String httpsPolicy;

	private Integer duration;

	private String instanceType;

	private List<Tag> tags;

	private Boolean autoPay;

	private String userVpcId;

	private String token;

	private List<ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroups;

	private String instanceName;

	private String zoneId;

	private String chargeType;

	private String pricingCycle;
	public CreateInstanceRequest() {
		super("CloudAPI", "2016-07-14", "CreateInstance", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
		}
	}

	public String getInstanceCidr() {
		return this.instanceCidr;
	}

	public void setInstanceCidr(String instanceCidr) {
		this.instanceCidr = instanceCidr;
		if(instanceCidr != null){
			putQueryParameter("InstanceCidr", instanceCidr);
		}
	}

	public String getHttpsPolicy() {
		return this.httpsPolicy;
	}

	public void setHttpsPolicy(String httpsPolicy) {
		this.httpsPolicy = httpsPolicy;
		if(httpsPolicy != null){
			putQueryParameter("HttpsPolicy", httpsPolicy);
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
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

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public String getUserVpcId() {
		return this.userVpcId;
	}

	public void setUserVpcId(String userVpcId) {
		this.userVpcId = userVpcId;
		if(userVpcId != null){
			putQueryParameter("UserVpcId", userVpcId);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public List<ZoneVSwitchSecurityGroup> getZoneVSwitchSecurityGroups() {
		return this.zoneVSwitchSecurityGroups;
	}

	public void setZoneVSwitchSecurityGroups(List<ZoneVSwitchSecurityGroup> zoneVSwitchSecurityGroups) {
		this.zoneVSwitchSecurityGroups = zoneVSwitchSecurityGroups;	
		if (zoneVSwitchSecurityGroups != null) {
			for (int depth1 = 0; depth1 < zoneVSwitchSecurityGroups.size(); depth1++) {
				putQueryParameter("ZoneVSwitchSecurityGroup." + (depth1 + 1) + ".VSwitchId" , zoneVSwitchSecurityGroups.get(depth1).getVSwitchId());
				putQueryParameter("ZoneVSwitchSecurityGroup." + (depth1 + 1) + ".CidrBlock" , zoneVSwitchSecurityGroups.get(depth1).getCidrBlock());
				putQueryParameter("ZoneVSwitchSecurityGroup." + (depth1 + 1) + ".SecurityGroupId" , zoneVSwitchSecurityGroups.get(depth1).getSecurityGroupId());
				putQueryParameter("ZoneVSwitchSecurityGroup." + (depth1 + 1) + ".ZoneId" , zoneVSwitchSecurityGroups.get(depth1).getZoneId());
			}
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
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

	public static class ZoneVSwitchSecurityGroup {

		private String vSwitchId;

		private String cidrBlock;

		private String securityGroupId;

		private String zoneId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
