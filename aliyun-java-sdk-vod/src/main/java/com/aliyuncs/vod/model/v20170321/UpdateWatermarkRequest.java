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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateWatermarkRequest extends RpcAcsRequest<UpdateWatermarkResponse> {
	   

	private String watermarkConfig;

	private String watermarkId;

	private String name;
	public UpdateWatermarkRequest() {
		super("vod", "2017-03-21", "UpdateWatermark", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWatermarkConfig() {
		return this.watermarkConfig;
	}

	public void setWatermarkConfig(String watermarkConfig) {
		this.watermarkConfig = watermarkConfig;
		if(watermarkConfig != null){
			putQueryParameter("WatermarkConfig", watermarkConfig);
		}
	}

	public String getWatermarkId() {
		return this.watermarkId;
	}

	public void setWatermarkId(String watermarkId) {
		this.watermarkId = watermarkId;
		if(watermarkId != null){
			putQueryParameter("WatermarkId", watermarkId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<UpdateWatermarkResponse> getResponseClass() {
		return UpdateWatermarkResponse.class;
	}

}
