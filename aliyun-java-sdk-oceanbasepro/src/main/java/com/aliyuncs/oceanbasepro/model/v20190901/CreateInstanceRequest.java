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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	   

	private String instanceClass;

	private String resourceGroupId;

	private Long autoRenewPeriod;

	private Long period;

	private Long diskSize;

	private String zones;

	private String diskType;

	private String obVersion;

	private String periodUnit;

	private String instanceName;

	private Boolean autoRenew;

	private String series;

	private String chargeType;
	public CreateInstanceRequest() {
		super("OceanBasePro", "2019-09-01", "CreateInstance", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceClass() {
		return this.instanceClass;
	}

	public void setInstanceClass(String instanceClass) {
		this.instanceClass = instanceClass;
		if(instanceClass != null){
			putBodyParameter("InstanceClass", instanceClass);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Long getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Long autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putBodyParameter("AutoRenewPeriod", autoRenewPeriod.toString());
		}
	}

	public Long getPeriod() {
		return this.period;
	}

	public void setPeriod(Long period) {
		this.period = period;
		if(period != null){
			putBodyParameter("Period", period.toString());
		}
	}

	public Long getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Long diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putBodyParameter("DiskSize", diskSize.toString());
		}
	}

	public String getZones() {
		return this.zones;
	}

	public void setZones(String zones) {
		this.zones = zones;
		if(zones != null){
			putBodyParameter("Zones", zones);
		}
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putBodyParameter("DiskType", diskType);
		}
	}

	public String getObVersion() {
		return this.obVersion;
	}

	public void setObVersion(String obVersion) {
		this.obVersion = obVersion;
		if(obVersion != null){
			putBodyParameter("ObVersion", obVersion);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putBodyParameter("PeriodUnit", periodUnit);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putBodyParameter("AutoRenew", autoRenew.toString());
		}
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
		if(series != null){
			putBodyParameter("Series", series);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putBodyParameter("ChargeType", chargeType);
		}
	}

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
