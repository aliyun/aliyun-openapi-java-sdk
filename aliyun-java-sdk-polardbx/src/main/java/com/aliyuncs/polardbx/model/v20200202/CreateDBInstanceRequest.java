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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDBInstanceRequest extends RpcAcsRequest<CreateDBInstanceResponse> {
	   

	private String networkType;

	private String engineVersion;

	private String tertiaryZone;

	private String cnClass;

	private String resourceGroupId;

	private String dBNodeClass;

	private String secondaryZone;

	private String period;

	private Boolean isReadDBInstance;

	private String vSwitchId;

	private Boolean autoRenew;

	private String zoneId;

	private String cNNodeCount;

	private String primaryDBInstanceName;

	private String topologyType;

	private String clientToken;

	private Boolean isColumnarReadDBInstance;

	private String dNNodeCount;

	private Integer dBNodeCount;

	private String dnClass;

	private Integer usedTime;

	private String primaryZone;

	private String series;

	private String vPCId;

	private String payType;
	public CreateDBInstanceRequest() {
		super("polardbx", "2020-02-02", "CreateDBInstance", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
		if(engineVersion != null){
			putQueryParameter("EngineVersion", engineVersion);
		}
	}

	public String getTertiaryZone() {
		return this.tertiaryZone;
	}

	public void setTertiaryZone(String tertiaryZone) {
		this.tertiaryZone = tertiaryZone;
		if(tertiaryZone != null){
			putQueryParameter("TertiaryZone", tertiaryZone);
		}
	}

	public String getCnClass() {
		return this.cnClass;
	}

	public void setCnClass(String cnClass) {
		this.cnClass = cnClass;
		if(cnClass != null){
			putQueryParameter("CnClass", cnClass);
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

	public String getDBNodeClass() {
		return this.dBNodeClass;
	}

	public void setDBNodeClass(String dBNodeClass) {
		this.dBNodeClass = dBNodeClass;
		if(dBNodeClass != null){
			putQueryParameter("DBNodeClass", dBNodeClass);
		}
	}

	public String getSecondaryZone() {
		return this.secondaryZone;
	}

	public void setSecondaryZone(String secondaryZone) {
		this.secondaryZone = secondaryZone;
		if(secondaryZone != null){
			putQueryParameter("SecondaryZone", secondaryZone);
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

	public Boolean getIsReadDBInstance() {
		return this.isReadDBInstance;
	}

	public void setIsReadDBInstance(Boolean isReadDBInstance) {
		this.isReadDBInstance = isReadDBInstance;
		if(isReadDBInstance != null){
			putQueryParameter("IsReadDBInstance", isReadDBInstance.toString());
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

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
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

	public String getCNNodeCount() {
		return this.cNNodeCount;
	}

	public void setCNNodeCount(String cNNodeCount) {
		this.cNNodeCount = cNNodeCount;
		if(cNNodeCount != null){
			putQueryParameter("CNNodeCount", cNNodeCount);
		}
	}

	public String getPrimaryDBInstanceName() {
		return this.primaryDBInstanceName;
	}

	public void setPrimaryDBInstanceName(String primaryDBInstanceName) {
		this.primaryDBInstanceName = primaryDBInstanceName;
		if(primaryDBInstanceName != null){
			putQueryParameter("PrimaryDBInstanceName", primaryDBInstanceName);
		}
	}

	public String getTopologyType() {
		return this.topologyType;
	}

	public void setTopologyType(String topologyType) {
		this.topologyType = topologyType;
		if(topologyType != null){
			putQueryParameter("TopologyType", topologyType);
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

	public Boolean getIsColumnarReadDBInstance() {
		return this.isColumnarReadDBInstance;
	}

	public void setIsColumnarReadDBInstance(Boolean isColumnarReadDBInstance) {
		this.isColumnarReadDBInstance = isColumnarReadDBInstance;
		if(isColumnarReadDBInstance != null){
			putQueryParameter("IsColumnarReadDBInstance", isColumnarReadDBInstance.toString());
		}
	}

	public String getDNNodeCount() {
		return this.dNNodeCount;
	}

	public void setDNNodeCount(String dNNodeCount) {
		this.dNNodeCount = dNNodeCount;
		if(dNNodeCount != null){
			putQueryParameter("DNNodeCount", dNNodeCount);
		}
	}

	public Integer getDBNodeCount() {
		return this.dBNodeCount;
	}

	public void setDBNodeCount(Integer dBNodeCount) {
		this.dBNodeCount = dBNodeCount;
		if(dBNodeCount != null){
			putQueryParameter("DBNodeCount", dBNodeCount.toString());
		}
	}

	public String getDnClass() {
		return this.dnClass;
	}

	public void setDnClass(String dnClass) {
		this.dnClass = dnClass;
		if(dnClass != null){
			putQueryParameter("DnClass", dnClass);
		}
	}

	public Integer getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(Integer usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime.toString());
		}
	}

	public String getPrimaryZone() {
		return this.primaryZone;
	}

	public void setPrimaryZone(String primaryZone) {
		this.primaryZone = primaryZone;
		if(primaryZone != null){
			putQueryParameter("PrimaryZone", primaryZone);
		}
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
		if(series != null){
			putQueryParameter("Series", series);
		}
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
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

	@Override
	public Class<CreateDBInstanceResponse> getResponseClass() {
		return CreateDBInstanceResponse.class;
	}

}
