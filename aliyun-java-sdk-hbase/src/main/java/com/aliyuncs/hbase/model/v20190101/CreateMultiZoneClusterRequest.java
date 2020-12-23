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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateMultiZoneClusterRequest extends RpcAcsRequest<CreateMultiZoneClusterResponse> {
	   

	private String archVersion;

	private String clusterName;

	private String engineVersion;

	private String logDiskType;

	private String resourceGroupId;

	private String primaryVSwitchId;

	private String logInstanceType;

	private Integer autoRenewPeriod;

	private Integer period;

	private Integer logNodeCount;

	private String securityIPList;

	private String periodUnit;

	private String coreDiskType;

	private String arbiterZoneId;

	private String clientToken;

	private String multiZoneCombination;

	private String primaryZoneId;

	private String engine;

	private String standbyVSwitchId;

	private String standbyZoneId;

	private String masterInstanceType;

	private Integer coreNodeCount;

	private Integer logDiskSize;

	private String coreInstanceType;

	private Integer coreDiskSize;

	private String vpcId;

	private String payType;

	private String arbiterVSwitchId;
	public CreateMultiZoneClusterRequest() {
		super("HBase", "2019-01-01", "CreateMultiZoneCluster", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getArchVersion() {
		return this.archVersion;
	}

	public void setArchVersion(String archVersion) {
		this.archVersion = archVersion;
		if(archVersion != null){
			putQueryParameter("ArchVersion", archVersion);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
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

	public String getLogDiskType() {
		return this.logDiskType;
	}

	public void setLogDiskType(String logDiskType) {
		this.logDiskType = logDiskType;
		if(logDiskType != null){
			putQueryParameter("LogDiskType", logDiskType);
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

	public String getPrimaryVSwitchId() {
		return this.primaryVSwitchId;
	}

	public void setPrimaryVSwitchId(String primaryVSwitchId) {
		this.primaryVSwitchId = primaryVSwitchId;
		if(primaryVSwitchId != null){
			putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
		}
	}

	public String getLogInstanceType() {
		return this.logInstanceType;
	}

	public void setLogInstanceType(String logInstanceType) {
		this.logInstanceType = logInstanceType;
		if(logInstanceType != null){
			putQueryParameter("LogInstanceType", logInstanceType);
		}
	}

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
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

	public Integer getLogNodeCount() {
		return this.logNodeCount;
	}

	public void setLogNodeCount(Integer logNodeCount) {
		this.logNodeCount = logNodeCount;
		if(logNodeCount != null){
			putQueryParameter("LogNodeCount", logNodeCount.toString());
		}
	}

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
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

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
		if(coreDiskType != null){
			putQueryParameter("CoreDiskType", coreDiskType);
		}
	}

	public String getArbiterZoneId() {
		return this.arbiterZoneId;
	}

	public void setArbiterZoneId(String arbiterZoneId) {
		this.arbiterZoneId = arbiterZoneId;
		if(arbiterZoneId != null){
			putQueryParameter("ArbiterZoneId", arbiterZoneId);
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

	public String getMultiZoneCombination() {
		return this.multiZoneCombination;
	}

	public void setMultiZoneCombination(String multiZoneCombination) {
		this.multiZoneCombination = multiZoneCombination;
		if(multiZoneCombination != null){
			putQueryParameter("MultiZoneCombination", multiZoneCombination);
		}
	}

	public String getPrimaryZoneId() {
		return this.primaryZoneId;
	}

	public void setPrimaryZoneId(String primaryZoneId) {
		this.primaryZoneId = primaryZoneId;
		if(primaryZoneId != null){
			putQueryParameter("PrimaryZoneId", primaryZoneId);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	public String getStandbyVSwitchId() {
		return this.standbyVSwitchId;
	}

	public void setStandbyVSwitchId(String standbyVSwitchId) {
		this.standbyVSwitchId = standbyVSwitchId;
		if(standbyVSwitchId != null){
			putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
		}
	}

	public String getStandbyZoneId() {
		return this.standbyZoneId;
	}

	public void setStandbyZoneId(String standbyZoneId) {
		this.standbyZoneId = standbyZoneId;
		if(standbyZoneId != null){
			putQueryParameter("StandbyZoneId", standbyZoneId);
		}
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
		if(masterInstanceType != null){
			putQueryParameter("MasterInstanceType", masterInstanceType);
		}
	}

	public Integer getCoreNodeCount() {
		return this.coreNodeCount;
	}

	public void setCoreNodeCount(Integer coreNodeCount) {
		this.coreNodeCount = coreNodeCount;
		if(coreNodeCount != null){
			putQueryParameter("CoreNodeCount", coreNodeCount.toString());
		}
	}

	public Integer getLogDiskSize() {
		return this.logDiskSize;
	}

	public void setLogDiskSize(Integer logDiskSize) {
		this.logDiskSize = logDiskSize;
		if(logDiskSize != null){
			putQueryParameter("LogDiskSize", logDiskSize.toString());
		}
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
		if(coreInstanceType != null){
			putQueryParameter("CoreInstanceType", coreInstanceType);
		}
	}

	public Integer getCoreDiskSize() {
		return this.coreDiskSize;
	}

	public void setCoreDiskSize(Integer coreDiskSize) {
		this.coreDiskSize = coreDiskSize;
		if(coreDiskSize != null){
			putQueryParameter("CoreDiskSize", coreDiskSize.toString());
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public String getArbiterVSwitchId() {
		return this.arbiterVSwitchId;
	}

	public void setArbiterVSwitchId(String arbiterVSwitchId) {
		this.arbiterVSwitchId = arbiterVSwitchId;
		if(arbiterVSwitchId != null){
			putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
		}
	}

	@Override
	public Class<CreateMultiZoneClusterResponse> getResponseClass() {
		return CreateMultiZoneClusterResponse.class;
	}

}
