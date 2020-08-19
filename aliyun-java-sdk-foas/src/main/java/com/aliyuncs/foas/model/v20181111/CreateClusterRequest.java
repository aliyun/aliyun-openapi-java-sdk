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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends RoaAcsRequest<CreateClusterResponse> {
	   

	private String orderId;

	private String userOssBucket;

	private String displayName;

	private String userVpcId;

	private String zoneId;

	private String description;

	private String userVSwitch;
	public CreateClusterRequest() {
		super("foas", "2018-11-11", "CreateCluster", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/clusters");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putBodyParameter("orderId", orderId);
		}
	}

	public String getUserOssBucket() {
		return this.userOssBucket;
	}

	public void setUserOssBucket(String userOssBucket) {
		this.userOssBucket = userOssBucket;
		if(userOssBucket != null){
			putBodyParameter("userOssBucket", userOssBucket);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putBodyParameter("displayName", displayName);
		}
	}

	public String getUserVpcId() {
		return this.userVpcId;
	}

	public void setUserVpcId(String userVpcId) {
		this.userVpcId = userVpcId;
		if(userVpcId != null){
			putBodyParameter("userVpcId", userVpcId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("zoneId", zoneId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("description", description);
		}
	}

	public String getUserVSwitch() {
		return this.userVSwitch;
	}

	public void setUserVSwitch(String userVSwitch) {
		this.userVSwitch = userVSwitch;
		if(userVSwitch != null){
			putBodyParameter("userVSwitch", userVSwitch);
		}
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
