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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DryRunClusterRequest extends RpcAcsRequest<DryRunClusterResponse> {
	   

	private String dBClusterDescription;

	private Boolean enableDefaultResourcePool;

	private String storageResource;

	private String dBClusterNetworkType;

	private String period;

	private String dBClusterId;

	private String dBClusterVersion;

	private String usedTime;

	private String vSwitchId;

	private String vPCId;

	private String zoneId;

	private String computeResource;

	private String payType;

	private String operation;
	public DryRunClusterRequest() {
		super("adb", "2019-03-15", "DryRunCluster", "ads");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBClusterDescription() {
		return this.dBClusterDescription;
	}

	public void setDBClusterDescription(String dBClusterDescription) {
		this.dBClusterDescription = dBClusterDescription;
		if(dBClusterDescription != null){
			putQueryParameter("DBClusterDescription", dBClusterDescription);
		}
	}

	public Boolean getEnableDefaultResourcePool() {
		return this.enableDefaultResourcePool;
	}

	public void setEnableDefaultResourcePool(Boolean enableDefaultResourcePool) {
		this.enableDefaultResourcePool = enableDefaultResourcePool;
		if(enableDefaultResourcePool != null){
			putQueryParameter("EnableDefaultResourcePool", enableDefaultResourcePool.toString());
		}
	}

	public String getStorageResource() {
		return this.storageResource;
	}

	public void setStorageResource(String storageResource) {
		this.storageResource = storageResource;
		if(storageResource != null){
			putQueryParameter("StorageResource", storageResource);
		}
	}

	public String getDBClusterNetworkType() {
		return this.dBClusterNetworkType;
	}

	public void setDBClusterNetworkType(String dBClusterNetworkType) {
		this.dBClusterNetworkType = dBClusterNetworkType;
		if(dBClusterNetworkType != null){
			putQueryParameter("DBClusterNetworkType", dBClusterNetworkType);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getDBClusterVersion() {
		return this.dBClusterVersion;
	}

	public void setDBClusterVersion(String dBClusterVersion) {
		this.dBClusterVersion = dBClusterVersion;
		if(dBClusterVersion != null){
			putQueryParameter("DBClusterVersion", dBClusterVersion);
		}
	}

	public String getUsedTime() {
		return this.usedTime;
	}

	public void setUsedTime(String usedTime) {
		this.usedTime = usedTime;
		if(usedTime != null){
			putQueryParameter("UsedTime", usedTime);
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

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
		if(vPCId != null){
			putQueryParameter("VPCId", vPCId);
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

	public String getComputeResource() {
		return this.computeResource;
	}

	public void setComputeResource(String computeResource) {
		this.computeResource = computeResource;
		if(computeResource != null){
			putQueryParameter("ComputeResource", computeResource);
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

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	@Override
	public Class<DryRunClusterResponse> getResponseClass() {
		return DryRunClusterResponse.class;
	}

}
