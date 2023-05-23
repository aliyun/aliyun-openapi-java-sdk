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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddGatewayRequest extends RpcAcsRequest<AddGatewayResponse> {
	   

	private String internetSlbSpec;

	private Boolean enableXtrace;

	private Integer replica;

	private Boolean enableHardwareAcceleration;

	private Boolean enableSls;

	private String spec;

	private String resourceGroupId;

	private String requestPars;

	private Boolean enterpriseSecurityGroup;

	private List<Tag> tags;

	private String vSwitchId;

	private String slbSpec;

	private String name;

	private String region;

	@SerializedName("zoneInfo")
	private List<ZoneInfo> zoneInfo;

	private String xtraceRatio;

	private String vSwitchId2;

	private String vpc;

	private String acceptLanguage;

	private String chargeType;
	public AddGatewayRequest() {
		super("mse", "2019-05-31", "AddGateway", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInternetSlbSpec() {
		return this.internetSlbSpec;
	}

	public void setInternetSlbSpec(String internetSlbSpec) {
		this.internetSlbSpec = internetSlbSpec;
		if(internetSlbSpec != null){
			putQueryParameter("InternetSlbSpec", internetSlbSpec);
		}
	}

	public Boolean getEnableXtrace() {
		return this.enableXtrace;
	}

	public void setEnableXtrace(Boolean enableXtrace) {
		this.enableXtrace = enableXtrace;
		if(enableXtrace != null){
			putQueryParameter("EnableXtrace", enableXtrace.toString());
		}
	}

	public Integer getReplica() {
		return this.replica;
	}

	public void setReplica(Integer replica) {
		this.replica = replica;
		if(replica != null){
			putQueryParameter("Replica", replica.toString());
		}
	}

	public Boolean getEnableHardwareAcceleration() {
		return this.enableHardwareAcceleration;
	}

	public void setEnableHardwareAcceleration(Boolean enableHardwareAcceleration) {
		this.enableHardwareAcceleration = enableHardwareAcceleration;
		if(enableHardwareAcceleration != null){
			putQueryParameter("EnableHardwareAcceleration", enableHardwareAcceleration.toString());
		}
	}

	public Boolean getEnableSls() {
		return this.enableSls;
	}

	public void setEnableSls(Boolean enableSls) {
		this.enableSls = enableSls;
		if(enableSls != null){
			putQueryParameter("EnableSls", enableSls.toString());
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
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

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putQueryParameter("RequestPars", requestPars);
		}
	}

	public Boolean getEnterpriseSecurityGroup() {
		return this.enterpriseSecurityGroup;
	}

	public void setEnterpriseSecurityGroup(Boolean enterpriseSecurityGroup) {
		this.enterpriseSecurityGroup = enterpriseSecurityGroup;
		if(enterpriseSecurityGroup != null){
			putQueryParameter("EnterpriseSecurityGroup", enterpriseSecurityGroup.toString());
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public String getSlbSpec() {
		return this.slbSpec;
	}

	public void setSlbSpec(String slbSpec) {
		this.slbSpec = slbSpec;
		if(slbSpec != null){
			putQueryParameter("SlbSpec", slbSpec);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public List<ZoneInfo> getZoneInfo() {
		return this.zoneInfo;
	}

	public void setZoneInfo(List<ZoneInfo> zoneInfo) {
		this.zoneInfo = zoneInfo;	
		if (zoneInfo != null) {
			putQueryParameter("ZoneInfo" , new Gson().toJson(zoneInfo));
		}	
	}

	public String getXtraceRatio() {
		return this.xtraceRatio;
	}

	public void setXtraceRatio(String xtraceRatio) {
		this.xtraceRatio = xtraceRatio;
		if(xtraceRatio != null){
			putQueryParameter("XtraceRatio", xtraceRatio);
		}
	}

	public String getVSwitchId2() {
		return this.vSwitchId2;
	}

	public void setVSwitchId2(String vSwitchId2) {
		this.vSwitchId2 = vSwitchId2;
		if(vSwitchId2 != null){
			putQueryParameter("VSwitchId2", vSwitchId2);
		}
	}

	public String getVpc() {
		return this.vpc;
	}

	public void setVpc(String vpc) {
		this.vpc = vpc;
		if(vpc != null){
			putQueryParameter("Vpc", vpc);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
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

	public static class ZoneInfo {

		@SerializedName("VSwitchId")
		private String vSwitchId;

		@SerializedName("ZoneId")
		private String zoneId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public Class<AddGatewayResponse> getResponseClass() {
		return AddGatewayResponse.class;
	}

}
