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

package com.aliyuncs.aliyuncvc.model.v20191030;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aliyuncvc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CustomLayoutRequest extends RpcAcsRequest<CustomLayoutResponse> {
	   

	private String liveUUID;

	private String layoutInfo;
	public CustomLayoutRequest() {
		super("aliyuncvc", "2019-10-30", "CustomLayout", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLiveUUID() {
		return this.liveUUID;
	}

	public void setLiveUUID(String liveUUID) {
		this.liveUUID = liveUUID;
		if(liveUUID != null){
			putBodyParameter("LiveUUID", liveUUID);
		}
	}

	public String getLayoutInfo() {
		return this.layoutInfo;
	}

	public void setLayoutInfo(String layoutInfo) {
		this.layoutInfo = layoutInfo;
		if(layoutInfo != null){
			putBodyParameter("LayoutInfo", layoutInfo);
		}
	}

	@Override
	public Class<CustomLayoutResponse> getResponseClass() {
		return CustomLayoutResponse.class;
	}

}
