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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cusanalytic_sc_online.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPortrayalRequest extends RpcAcsRequest<GetPortrayalResponse> {
	
	public GetPortrayalRequest() {
		super("cusanalytic_sc_online", "2019-05-24", "GetPortrayal");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String date;

	private String locationIds;

	private String storeIds;

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
		if(date != null){
			putBodyParameter("Date", date);
		}
	}

	public String getLocationIds() {
		return this.locationIds;
	}

	public void setLocationIds(String locationIds) {
		this.locationIds = locationIds;
		if(locationIds != null){
			putBodyParameter("LocationIds", locationIds);
		}
	}

	public String getStoreIds() {
		return this.storeIds;
	}

	public void setStoreIds(String storeIds) {
		this.storeIds = storeIds;
		if(storeIds != null){
			putBodyParameter("StoreIds", storeIds);
		}
	}

	@Override
	public Class<GetPortrayalResponse> getResponseClass() {
		return GetPortrayalResponse.class;
	}

}
