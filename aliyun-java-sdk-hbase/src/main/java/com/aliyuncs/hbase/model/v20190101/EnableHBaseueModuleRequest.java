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
public class EnableHBaseueModuleRequest extends RpcAcsRequest<EnableHBaseueModuleResponse> {
	   

	private String clientToken;

	private String moduleTypeName;

	private String hbaseueClusterId;

	private String bdsId;

	private String moduleClusterName;

	private Integer autoRenewPeriod;

	private Integer period;

	private Integer diskSize;

	private String masterInstanceType;

	private String diskType;

	private String vswitchId;

	private String periodUnit;

	private String coreInstanceType;

	private String vpcId;

	private Integer nodeCount;

	private String zoneId;

	private String payType;
	public EnableHBaseueModuleRequest() {
		super("HBase", "2019-01-01", "EnableHBaseueModule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getModuleTypeName() {
		return this.moduleTypeName;
	}

	public void setModuleTypeName(String moduleTypeName) {
		this.moduleTypeName = moduleTypeName;
		if(moduleTypeName != null){
			putQueryParameter("ModuleTypeName", moduleTypeName);
		}
	}

	public String getHbaseueClusterId() {
		return this.hbaseueClusterId;
	}

	public void setHbaseueClusterId(String hbaseueClusterId) {
		this.hbaseueClusterId = hbaseueClusterId;
		if(hbaseueClusterId != null){
			putQueryParameter("HbaseueClusterId", hbaseueClusterId);
		}
	}

	public String getBdsId() {
		return this.bdsId;
	}

	public void setBdsId(String bdsId) {
		this.bdsId = bdsId;
		if(bdsId != null){
			putQueryParameter("BdsId", bdsId);
		}
	}

	public String getModuleClusterName() {
		return this.moduleClusterName;
	}

	public void setModuleClusterName(String moduleClusterName) {
		this.moduleClusterName = moduleClusterName;
		if(moduleClusterName != null){
			putQueryParameter("ModuleClusterName", moduleClusterName);
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

	public Integer getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Integer diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putQueryParameter("DiskSize", diskSize.toString());
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

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putQueryParameter("DiskType", diskType);
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

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Integer getNodeCount() {
		return this.nodeCount;
	}

	public void setNodeCount(Integer nodeCount) {
		this.nodeCount = nodeCount;
		if(nodeCount != null){
			putQueryParameter("NodeCount", nodeCount.toString());
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

	@Override
	public Class<EnableHBaseueModuleResponse> getResponseClass() {
		return EnableHBaseueModuleResponse.class;
	}

}
