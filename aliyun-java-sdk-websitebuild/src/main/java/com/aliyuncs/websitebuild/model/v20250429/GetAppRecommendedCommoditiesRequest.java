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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetAppRecommendedCommoditiesRequest extends RpcAcsRequest<GetAppRecommendedCommoditiesResponse> {
	   

	private String resourceConditions;

	private String scene;

	private String extend;

	private String bizId;
	public GetAppRecommendedCommoditiesRequest() {
		super("WebsiteBuild", "2025-04-29", "GetAppRecommendedCommodities");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getResourceConditions() {
		return this.resourceConditions;
	}

	public void setResourceConditions(String resourceConditions) {
		this.resourceConditions = resourceConditions;
		if(resourceConditions != null){
			putQueryParameter("ResourceConditions", resourceConditions);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
		if(extend != null){
			putQueryParameter("Extend", extend);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	@Override
	public Class<GetAppRecommendedCommoditiesResponse> getResponseClass() {
		return GetAppRecommendedCommoditiesResponse.class;
	}

}
