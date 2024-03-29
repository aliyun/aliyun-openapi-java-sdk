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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetVccRouteEntryRequest extends RpcAcsRequest<GetVccRouteEntryResponse> {
	   

	private String vccId;

	private String vccRouteEntryId;
	public GetVccRouteEntryRequest() {
		super("eflo", "2022-05-30", "GetVccRouteEntry", "eflo");
		setMethod(MethodType.POST);
	}

	public String getVccId() {
		return this.vccId;
	}

	public void setVccId(String vccId) {
		this.vccId = vccId;
		if(vccId != null){
			putBodyParameter("VccId", vccId);
		}
	}

	public String getVccRouteEntryId() {
		return this.vccRouteEntryId;
	}

	public void setVccRouteEntryId(String vccRouteEntryId) {
		this.vccRouteEntryId = vccRouteEntryId;
		if(vccRouteEntryId != null){
			putBodyParameter("VccRouteEntryId", vccRouteEntryId);
		}
	}

	@Override
	public Class<GetVccRouteEntryResponse> getResponseClass() {
		return GetVccRouteEntryResponse.class;
	}

}
