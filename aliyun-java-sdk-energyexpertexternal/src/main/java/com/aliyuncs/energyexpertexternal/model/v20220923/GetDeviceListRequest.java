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

package com.aliyuncs.energyexpertexternal.model.v20220923;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceListRequest extends RoaAcsRequest<GetDeviceListResponse> {
	   

	private String factoryId;
	public GetDeviceListRequest() {
		super("energyExpertExternal", "2022-09-23", "GetDeviceList", "basic");
		setUriPattern("/api/external/getDeviceList");
		setMethod(MethodType.GET);
	}

	public String getFactoryId() {
		return this.factoryId;
	}

	public void setFactoryId(String factoryId) {
		this.factoryId = factoryId;
		if(factoryId != null){
			putQueryParameter("factoryId", factoryId);
		}
	}

	@Override
	public Class<GetDeviceListResponse> getResponseClass() {
		return GetDeviceListResponse.class;
	}

}
