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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDrdsInstanceRequest extends RpcAcsRequest<CreateDrdsInstanceResponse> {
	   

	private Boolean isAutoRenew;

	private String clientToken;

	private String description;

	private String type;

	private Integer duration;

	private Boolean isHa;

	private Integer mySQLVersion;

	private String instanceSeries;

	private String masterInstId;

	private Integer quantity;

	private String specification;

	private String vswitchId;

	private String vpcId;

	private String zoneId;

	private String payType;

	private String pricingCycle;
	public CreateDrdsInstanceRequest() {
		super("Drds", "2019-01-23", "CreateDrdsInstance", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsAutoRenew() {
		return this.isAutoRenew;
	}

	public void setIsAutoRenew(Boolean isAutoRenew) {
		this.isAutoRenew = isAutoRenew;
		if(isAutoRenew != null){
			putQueryParameter("IsAutoRenew", isAutoRenew.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public Boolean getIsHa() {
		return this.isHa;
	}

	public void setIsHa(Boolean isHa) {
		this.isHa = isHa;
		if(isHa != null){
			putQueryParameter("isHa", isHa.toString());
		}
	}

	public Integer getMySQLVersion() {
		return this.mySQLVersion;
	}

	public void setMySQLVersion(Integer mySQLVersion) {
		this.mySQLVersion = mySQLVersion;
		if(mySQLVersion != null){
			putQueryParameter("MySQLVersion", mySQLVersion.toString());
		}
	}

	public String getInstanceSeries() {
		return this.instanceSeries;
	}

	public void setInstanceSeries(String instanceSeries) {
		this.instanceSeries = instanceSeries;
		if(instanceSeries != null){
			putQueryParameter("InstanceSeries", instanceSeries);
		}
	}

	public String getMasterInstId() {
		return this.masterInstId;
	}

	public void setMasterInstId(String masterInstId) {
		this.masterInstId = masterInstId;
		if(masterInstId != null){
			putQueryParameter("MasterInstId", masterInstId);
		}
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
		}
	}

	public String getSpecification() {
		return this.specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
		if(specification != null){
			putQueryParameter("Specification", specification);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
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

	@Override
	public Class<CreateDrdsInstanceResponse> getResponseClass() {
		return CreateDrdsInstanceResponse.class;
	}

}
