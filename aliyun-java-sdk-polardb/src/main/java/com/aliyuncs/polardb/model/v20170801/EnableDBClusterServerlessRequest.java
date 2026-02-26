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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableDBClusterServerlessRequest extends RpcAcsRequest<EnableDBClusterServerlessResponse> {
	   

	private String scaleRoNumMax;

	private Long resourceOwnerId;

	private String scaleApRoNumMax;

	private String scaleMax;

	private String scaleApRoNumMin;

	private String scaleMin;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private Long ownerId;

	private String scaleRoNumMin;
	public EnableDBClusterServerlessRequest() {
		super("polardb", "2017-08-01", "EnableDBClusterServerless", "polardb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScaleRoNumMax() {
		return this.scaleRoNumMax;
	}

	public void setScaleRoNumMax(String scaleRoNumMax) {
		this.scaleRoNumMax = scaleRoNumMax;
		if(scaleRoNumMax != null){
			putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
		}
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

	public String getScaleApRoNumMax() {
		return this.scaleApRoNumMax;
	}

	public void setScaleApRoNumMax(String scaleApRoNumMax) {
		this.scaleApRoNumMax = scaleApRoNumMax;
		if(scaleApRoNumMax != null){
			putQueryParameter("ScaleApRoNumMax", scaleApRoNumMax);
		}
	}

	public String getScaleMax() {
		return this.scaleMax;
	}

	public void setScaleMax(String scaleMax) {
		this.scaleMax = scaleMax;
		if(scaleMax != null){
			putQueryParameter("ScaleMax", scaleMax);
		}
	}

	public String getScaleApRoNumMin() {
		return this.scaleApRoNumMin;
	}

	public void setScaleApRoNumMin(String scaleApRoNumMin) {
		this.scaleApRoNumMin = scaleApRoNumMin;
		if(scaleApRoNumMin != null){
			putQueryParameter("ScaleApRoNumMin", scaleApRoNumMin);
		}
	}

	public String getScaleMin() {
		return this.scaleMin;
	}

	public void setScaleMin(String scaleMin) {
		this.scaleMin = scaleMin;
		if(scaleMin != null){
			putQueryParameter("ScaleMin", scaleMin);
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

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getScaleRoNumMin() {
		return this.scaleRoNumMin;
	}

	public void setScaleRoNumMin(String scaleRoNumMin) {
		this.scaleRoNumMin = scaleRoNumMin;
		if(scaleRoNumMin != null){
			putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
		}
	}

	@Override
	public Class<EnableDBClusterServerlessResponse> getResponseClass() {
		return EnableDBClusterServerlessResponse.class;
	}

}
