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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecommendRequest extends RoaAcsRequest<RecommendResponse> {
	   

	private Integer returnCount;

	private String serviceType;

	private String instanceId;

	private String ip;

	private String sceneId;

	private String imei;

	private String userId;

	private String items;

	private String userInfo;
	public RecommendRequest() {
		super("Airec", "2020-11-26", "Recommend", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/actions/recommend");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getReturnCount() {
		return this.returnCount;
	}

	public void setReturnCount(Integer returnCount) {
		this.returnCount = returnCount;
		if(returnCount != null){
			putQueryParameter("returnCount", returnCount.toString());
		}
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
		if(serviceType != null){
			putQueryParameter("serviceType", serviceType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("ip", ip);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("sceneId", sceneId);
		}
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
		if(imei != null){
			putQueryParameter("imei", imei);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("userId", userId);
		}
	}

	public String getItems() {
		return this.items;
	}

	public void setItems(String items) {
		this.items = items;
		if(items != null){
			putQueryParameter("items", items);
		}
	}

	public String getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
		if(userInfo != null){
			putQueryParameter("userInfo", userInfo);
		}
	}

	@Override
	public Class<RecommendResponse> getResponseClass() {
		return RecommendResponse.class;
	}

}
