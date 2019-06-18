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

package com.aliyuncs.airec.model.v20181012;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RecommendRequest extends RoaAcsRequest<RecommendResponse> {
	
	public RecommendRequest() {
		super("Airec", "2018-10-12", "Recommend", "airec");
		setUriPattern("/openapi/instances/[InstanceId]/actions/recommend");
		setMethod(MethodType.GET);
	}

	private Integer returnCount;

	private String instanceId;

	private String ip;

	private String sceneId;

	private String imei;

	private String userId;

	private String items;

	public Integer getReturnCount() {
		return this.returnCount;
	}

	public void setReturnCount(Integer returnCount) {
		this.returnCount = returnCount;
		if(returnCount != null){
			putQueryParameter("ReturnCount", returnCount.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
		}
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
		if(imei != null){
			putQueryParameter("Imei", imei);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getItems() {
		return this.items;
	}

	public void setItems(String items) {
		this.items = items;
		if(items != null){
			putQueryParameter("Items", items);
		}
	}

	@Override
	public Class<RecommendResponse> getResponseClass() {
		return RecommendResponse.class;
	}

}
