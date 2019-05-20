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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class EnableCabServiceRequest extends RpcAcsRequest<EnableCabServiceResponse> {
	
	public EnableCabServiceRequest() {
		super("CloudCallCenter", "2017-07-05", "EnableCabService", "CloudCallCenter", "innerAPI");
	}

	private String components;

	private Long ownerId;

	private String region;

	private String commodityInstanceId;

	public String getComponents() {
		return this.components;
	}

	public void setComponents(String components) {
		this.components = components;
		if(components != null){
			putQueryParameter("Components", components);
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

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getCommodityInstanceId() {
		return this.commodityInstanceId;
	}

	public void setCommodityInstanceId(String commodityInstanceId) {
		this.commodityInstanceId = commodityInstanceId;
		if(commodityInstanceId != null){
			putQueryParameter("CommodityInstanceId", commodityInstanceId);
		}
	}

	@Override
	public Class<EnableCabServiceResponse> getResponseClass() {
		return EnableCabServiceResponse.class;
	}

}
