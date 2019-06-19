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
public class XpackRelateDBRequest extends RpcAcsRequest<XpackRelateDBResponse> {
	
	public XpackRelateDBRequest() {
		super("HBase", "2017-01-15", "XpackRelateDB");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String zoneId;

	private String clusterId;

	private Long ownerId;

	private String relateDbType;

	private String dbClusterIds;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getRelateDbType() {
		return this.relateDbType;
	}

	public void setRelateDbType(String relateDbType) {
		this.relateDbType = relateDbType;
		if(relateDbType != null){
			putQueryParameter("RelateDbType", relateDbType);
		}
	}

	public String getDbClusterIds() {
		return this.dbClusterIds;
	}

	public void setDbClusterIds(String dbClusterIds) {
		this.dbClusterIds = dbClusterIds;
		if(dbClusterIds != null){
			putQueryParameter("DbClusterIds", dbClusterIds);
		}
	}

	@Override
	public Class<XpackRelateDBResponse> getResponseClass() {
		return XpackRelateDBResponse.class;
	}

}
