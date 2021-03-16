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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateSpotAdvisorSummaryRequest extends RpcAcsRequest<OpsUpdateSpotAdvisorSummaryResponse> {
	   

	private String izNo;

	private Boolean ioOptimized;

	private Float userReleaseRate;

	private Float userReleaseRateStddev;

	private Float passiveReleaseRateStddev;

	private String instanceTypeName;

	private String networkType;

	private Integer priceReleaseVcpu;

	private Integer opsReleaseVcpu;

	private Float passiveReleaseRate;

	private Float priceReleaseRateStddev;

	private Integer inventoryReleaseVcpu;

	private Float inventoryReleaseRateStddev;

	private Integer passiveReleaseVcpu;

	private Float discountStddev;

	private Integer userReleaseVcpu;

	private Float discountAvg;

	private Float inventoryReleaseRate;

	private Float opsReleaseRateStddev;

	private Float priceReleaseRate;

	private Float opsReleaseRate;

	private String auditParamStr;
	public OpsUpdateSpotAdvisorSummaryRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateSpotAdvisorSummary", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("IzNo", izNo);
		}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
		}
	}

	public Float getUserReleaseRate() {
		return this.userReleaseRate;
	}

	public void setUserReleaseRate(Float userReleaseRate) {
		this.userReleaseRate = userReleaseRate;
		if(userReleaseRate != null){
			putQueryParameter("UserReleaseRate", userReleaseRate.toString());
		}
	}

	public Float getUserReleaseRateStddev() {
		return this.userReleaseRateStddev;
	}

	public void setUserReleaseRateStddev(Float userReleaseRateStddev) {
		this.userReleaseRateStddev = userReleaseRateStddev;
		if(userReleaseRateStddev != null){
			putQueryParameter("UserReleaseRateStddev", userReleaseRateStddev.toString());
		}
	}

	public Float getPassiveReleaseRateStddev() {
		return this.passiveReleaseRateStddev;
	}

	public void setPassiveReleaseRateStddev(Float passiveReleaseRateStddev) {
		this.passiveReleaseRateStddev = passiveReleaseRateStddev;
		if(passiveReleaseRateStddev != null){
			putQueryParameter("PassiveReleaseRateStddev", passiveReleaseRateStddev.toString());
		}
	}

	public String getInstanceTypeName() {
		return this.instanceTypeName;
	}

	public void setInstanceTypeName(String instanceTypeName) {
		this.instanceTypeName = instanceTypeName;
		if(instanceTypeName != null){
			putQueryParameter("InstanceTypeName", instanceTypeName);
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

	public Integer getPriceReleaseVcpu() {
		return this.priceReleaseVcpu;
	}

	public void setPriceReleaseVcpu(Integer priceReleaseVcpu) {
		this.priceReleaseVcpu = priceReleaseVcpu;
		if(priceReleaseVcpu != null){
			putQueryParameter("PriceReleaseVcpu", priceReleaseVcpu.toString());
		}
	}

	public Integer getOpsReleaseVcpu() {
		return this.opsReleaseVcpu;
	}

	public void setOpsReleaseVcpu(Integer opsReleaseVcpu) {
		this.opsReleaseVcpu = opsReleaseVcpu;
		if(opsReleaseVcpu != null){
			putQueryParameter("OpsReleaseVcpu", opsReleaseVcpu.toString());
		}
	}

	public Float getPassiveReleaseRate() {
		return this.passiveReleaseRate;
	}

	public void setPassiveReleaseRate(Float passiveReleaseRate) {
		this.passiveReleaseRate = passiveReleaseRate;
		if(passiveReleaseRate != null){
			putQueryParameter("PassiveReleaseRate", passiveReleaseRate.toString());
		}
	}

	public Float getPriceReleaseRateStddev() {
		return this.priceReleaseRateStddev;
	}

	public void setPriceReleaseRateStddev(Float priceReleaseRateStddev) {
		this.priceReleaseRateStddev = priceReleaseRateStddev;
		if(priceReleaseRateStddev != null){
			putQueryParameter("PriceReleaseRateStddev", priceReleaseRateStddev.toString());
		}
	}

	public Integer getInventoryReleaseVcpu() {
		return this.inventoryReleaseVcpu;
	}

	public void setInventoryReleaseVcpu(Integer inventoryReleaseVcpu) {
		this.inventoryReleaseVcpu = inventoryReleaseVcpu;
		if(inventoryReleaseVcpu != null){
			putQueryParameter("InventoryReleaseVcpu", inventoryReleaseVcpu.toString());
		}
	}

	public Float getInventoryReleaseRateStddev() {
		return this.inventoryReleaseRateStddev;
	}

	public void setInventoryReleaseRateStddev(Float inventoryReleaseRateStddev) {
		this.inventoryReleaseRateStddev = inventoryReleaseRateStddev;
		if(inventoryReleaseRateStddev != null){
			putQueryParameter("InventoryReleaseRateStddev", inventoryReleaseRateStddev.toString());
		}
	}

	public Integer getPassiveReleaseVcpu() {
		return this.passiveReleaseVcpu;
	}

	public void setPassiveReleaseVcpu(Integer passiveReleaseVcpu) {
		this.passiveReleaseVcpu = passiveReleaseVcpu;
		if(passiveReleaseVcpu != null){
			putQueryParameter("PassiveReleaseVcpu", passiveReleaseVcpu.toString());
		}
	}

	public Float getDiscountStddev() {
		return this.discountStddev;
	}

	public void setDiscountStddev(Float discountStddev) {
		this.discountStddev = discountStddev;
		if(discountStddev != null){
			putQueryParameter("DiscountStddev", discountStddev.toString());
		}
	}

	public Integer getUserReleaseVcpu() {
		return this.userReleaseVcpu;
	}

	public void setUserReleaseVcpu(Integer userReleaseVcpu) {
		this.userReleaseVcpu = userReleaseVcpu;
		if(userReleaseVcpu != null){
			putQueryParameter("UserReleaseVcpu", userReleaseVcpu.toString());
		}
	}

	public Float getDiscountAvg() {
		return this.discountAvg;
	}

	public void setDiscountAvg(Float discountAvg) {
		this.discountAvg = discountAvg;
		if(discountAvg != null){
			putQueryParameter("DiscountAvg", discountAvg.toString());
		}
	}

	public Float getInventoryReleaseRate() {
		return this.inventoryReleaseRate;
	}

	public void setInventoryReleaseRate(Float inventoryReleaseRate) {
		this.inventoryReleaseRate = inventoryReleaseRate;
		if(inventoryReleaseRate != null){
			putQueryParameter("InventoryReleaseRate", inventoryReleaseRate.toString());
		}
	}

	public Float getOpsReleaseRateStddev() {
		return this.opsReleaseRateStddev;
	}

	public void setOpsReleaseRateStddev(Float opsReleaseRateStddev) {
		this.opsReleaseRateStddev = opsReleaseRateStddev;
		if(opsReleaseRateStddev != null){
			putQueryParameter("OpsReleaseRateStddev", opsReleaseRateStddev.toString());
		}
	}

	public Float getPriceReleaseRate() {
		return this.priceReleaseRate;
	}

	public void setPriceReleaseRate(Float priceReleaseRate) {
		this.priceReleaseRate = priceReleaseRate;
		if(priceReleaseRate != null){
			putQueryParameter("PriceReleaseRate", priceReleaseRate.toString());
		}
	}

	public Float getOpsReleaseRate() {
		return this.opsReleaseRate;
	}

	public void setOpsReleaseRate(Float opsReleaseRate) {
		this.opsReleaseRate = opsReleaseRate;
		if(opsReleaseRate != null){
			putQueryParameter("OpsReleaseRate", opsReleaseRate.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsUpdateSpotAdvisorSummaryResponse> getResponseClass() {
		return OpsUpdateSpotAdvisorSummaryResponse.class;
	}

}
