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

package com.aliyuncs.hitsdb.model.v20200615;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hitsdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpgradeLindormInstanceRequest extends RpcAcsRequest<UpgradeLindormInstanceResponse> {
	   

	private Long resourceOwnerId;

	private Integer phoenixCoreNum;

	private String phoenixCoreSpec;

	private String upgradeType;

	private String tsdbSpec;

	private String filestoreSpec;

	private String securityToken;

	private Integer tsdbNum;

	private String lindormSpec;

	private Integer solrNum;

	private Integer coldStorage;

	private String solrSpec;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer filestoreNum;

	private Long ownerId;

	private Integer lindormNum;

	private String coreSpec;

	private Integer coreNum;

	private Integer ltsCoreNum;

	private String instanceId;

	private String ltsCoreSpec;

	private Integer clusterStorage;

	private String zoneId;
	public UpgradeLindormInstanceRequest() {
		super("hitsdb", "2020-06-15", "UpgradeLindormInstance", "hitsdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getPhoenixCoreNum() {
		return this.phoenixCoreNum;
	}

	public void setPhoenixCoreNum(Integer phoenixCoreNum) {
		this.phoenixCoreNum = phoenixCoreNum;
		if(phoenixCoreNum != null){
			putQueryParameter("PhoenixCoreNum", phoenixCoreNum.toString());
		}
	}

	public String getPhoenixCoreSpec() {
		return this.phoenixCoreSpec;
	}

	public void setPhoenixCoreSpec(String phoenixCoreSpec) {
		this.phoenixCoreSpec = phoenixCoreSpec;
		if(phoenixCoreSpec != null){
			putQueryParameter("PhoenixCoreSpec", phoenixCoreSpec);
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

	public String getTsdbSpec() {
		return this.tsdbSpec;
	}

	public void setTsdbSpec(String tsdbSpec) {
		this.tsdbSpec = tsdbSpec;
		if(tsdbSpec != null){
			putQueryParameter("TsdbSpec", tsdbSpec);
		}
	}

	public String getFilestoreSpec() {
		return this.filestoreSpec;
	}

	public void setFilestoreSpec(String filestoreSpec) {
		this.filestoreSpec = filestoreSpec;
		if(filestoreSpec != null){
			putQueryParameter("FilestoreSpec", filestoreSpec);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Integer getTsdbNum() {
		return this.tsdbNum;
	}

	public void setTsdbNum(Integer tsdbNum) {
		this.tsdbNum = tsdbNum;
		if(tsdbNum != null){
			putQueryParameter("TsdbNum", tsdbNum.toString());
		}
	}

	public String getLindormSpec() {
		return this.lindormSpec;
	}

	public void setLindormSpec(String lindormSpec) {
		this.lindormSpec = lindormSpec;
		if(lindormSpec != null){
			putQueryParameter("LindormSpec", lindormSpec);
		}
	}

	public Integer getSolrNum() {
		return this.solrNum;
	}

	public void setSolrNum(Integer solrNum) {
		this.solrNum = solrNum;
		if(solrNum != null){
			putQueryParameter("SolrNum", solrNum.toString());
		}
	}

	public Integer getColdStorage() {
		return this.coldStorage;
	}

	public void setColdStorage(Integer coldStorage) {
		this.coldStorage = coldStorage;
		if(coldStorage != null){
			putQueryParameter("ColdStorage", coldStorage.toString());
		}
	}

	public String getSolrSpec() {
		return this.solrSpec;
	}

	public void setSolrSpec(String solrSpec) {
		this.solrSpec = solrSpec;
		if(solrSpec != null){
			putQueryParameter("SolrSpec", solrSpec);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Integer getFilestoreNum() {
		return this.filestoreNum;
	}

	public void setFilestoreNum(Integer filestoreNum) {
		this.filestoreNum = filestoreNum;
		if(filestoreNum != null){
			putQueryParameter("FilestoreNum", filestoreNum.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getLindormNum() {
		return this.lindormNum;
	}

	public void setLindormNum(Integer lindormNum) {
		this.lindormNum = lindormNum;
		if(lindormNum != null){
			putQueryParameter("LindormNum", lindormNum.toString());
		}
	}

	public String getCoreSpec() {
		return this.coreSpec;
	}

	public void setCoreSpec(String coreSpec) {
		this.coreSpec = coreSpec;
		if(coreSpec != null){
			putQueryParameter("CoreSpec", coreSpec);
		}
	}

	public Integer getCoreNum() {
		return this.coreNum;
	}

	public void setCoreNum(Integer coreNum) {
		this.coreNum = coreNum;
		if(coreNum != null){
			putQueryParameter("CoreNum", coreNum.toString());
		}
	}

	public Integer getLtsCoreNum() {
		return this.ltsCoreNum;
	}

	public void setLtsCoreNum(Integer ltsCoreNum) {
		this.ltsCoreNum = ltsCoreNum;
		if(ltsCoreNum != null){
			putQueryParameter("LtsCoreNum", ltsCoreNum.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getLtsCoreSpec() {
		return this.ltsCoreSpec;
	}

	public void setLtsCoreSpec(String ltsCoreSpec) {
		this.ltsCoreSpec = ltsCoreSpec;
		if(ltsCoreSpec != null){
			putQueryParameter("LtsCoreSpec", ltsCoreSpec);
		}
	}

	public Integer getClusterStorage() {
		return this.clusterStorage;
	}

	public void setClusterStorage(Integer clusterStorage) {
		this.clusterStorage = clusterStorage;
		if(clusterStorage != null){
			putQueryParameter("ClusterStorage", clusterStorage.toString());
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

	@Override
	public Class<UpgradeLindormInstanceResponse> getResponseClass() {
		return UpgradeLindormInstanceResponse.class;
	}

}
