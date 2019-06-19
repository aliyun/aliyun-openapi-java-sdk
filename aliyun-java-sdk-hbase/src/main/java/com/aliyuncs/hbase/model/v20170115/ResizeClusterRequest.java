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

package com.aliyuncs.hbase.model.v20170115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ResizeClusterRequest extends RpcAcsRequest<ResizeClusterResponse> {
	
	public ResizeClusterRequest() {
		super("HBase", "2017-01-15", "ResizeCluster");
	}

	private String clientToken;

	private String cloudType;

	private String upgradeType;

	private String clusterId;

	private String coreInstanceQuantity;

	private String coldStorageSize;

	private String coreDiskQuantity;

	private String isColdStorage;

	private String engine;

	private String coreInstanceType;

	private String coreDiskSize;

	private String zoneId;

	private String coreDiskType;

	private String payType;

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getCloudType() {
		return this.cloudType;
	}

	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
		if(cloudType != null){
			putQueryParameter("CloudType", cloudType);
		}
	}

	public String getUpgradeType() {
		return this.upgradeType;
	}

	public void setUpgradeType(String upgradeType) {
		this.upgradeType = upgradeType;
		if(upgradeType != null){
			putQueryParameter("UpgradeType", upgradeType);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getCoreInstanceQuantity() {
		return this.coreInstanceQuantity;
	}

	public void setCoreInstanceQuantity(String coreInstanceQuantity) {
		this.coreInstanceQuantity = coreInstanceQuantity;
		if(coreInstanceQuantity != null){
			putQueryParameter("CoreInstanceQuantity", coreInstanceQuantity);
		}
	}

	public String getColdStorageSize() {
		return this.coldStorageSize;
	}

	public void setColdStorageSize(String coldStorageSize) {
		this.coldStorageSize = coldStorageSize;
		if(coldStorageSize != null){
			putQueryParameter("ColdStorageSize", coldStorageSize);
		}
	}

	public String getCoreDiskQuantity() {
		return this.coreDiskQuantity;
	}

	public void setCoreDiskQuantity(String coreDiskQuantity) {
		this.coreDiskQuantity = coreDiskQuantity;
		if(coreDiskQuantity != null){
			putQueryParameter("CoreDiskQuantity", coreDiskQuantity);
		}
	}

	public String getIsColdStorage() {
		return this.isColdStorage;
	}

	public void setIsColdStorage(String isColdStorage) {
		this.isColdStorage = isColdStorage;
		if(isColdStorage != null){
			putQueryParameter("IsColdStorage", isColdStorage);
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

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
		if(coreInstanceType != null){
			putQueryParameter("CoreInstanceType", coreInstanceType);
		}
	}

	public String getCoreDiskSize() {
		return this.coreDiskSize;
	}

	public void setCoreDiskSize(String coreDiskSize) {
		this.coreDiskSize = coreDiskSize;
		if(coreDiskSize != null){
			putQueryParameter("CoreDiskSize", coreDiskSize);
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

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
		if(coreDiskType != null){
			putQueryParameter("CoreDiskType", coreDiskType);
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
	public Class<ResizeClusterResponse> getResponseClass() {
		return ResizeClusterResponse.class;
	}

}
