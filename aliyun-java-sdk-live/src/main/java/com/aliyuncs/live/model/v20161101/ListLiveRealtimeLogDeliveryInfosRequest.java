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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLiveRealtimeLogDeliveryInfosRequest extends RpcAcsRequest<ListLiveRealtimeLogDeliveryInfosResponse> {
	
	public ListLiveRealtimeLogDeliveryInfosRequest() {
		super("live", "2016-11-01", "ListLiveRealtimeLogDeliveryInfos", "live");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long ownerId;

	private String liveOpenapiReserve;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getLiveOpenapiReserve() {
		return this.liveOpenapiReserve;
	}

	public void setLiveOpenapiReserve(String liveOpenapiReserve) {
		this.liveOpenapiReserve = liveOpenapiReserve;
		if(liveOpenapiReserve != null){
			putQueryParameter("LiveOpenapiReserve", liveOpenapiReserve);
		}
	}

	@Override
	public Class<ListLiveRealtimeLogDeliveryInfosResponse> getResponseClass() {
		return ListLiveRealtimeLogDeliveryInfosResponse.class;
	}

}
