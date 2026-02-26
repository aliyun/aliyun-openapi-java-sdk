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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyEnsRouteEntryRequest extends RpcAcsRequest<ModifyEnsRouteEntryResponse> {
	   

	private String routeEntryName;

	private String description;

	private String routeEntryId;
	public ModifyEnsRouteEntryRequest() {
		super("Ens", "2017-11-10", "ModifyEnsRouteEntry", "ens");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getRouteEntryName() {
		return this.routeEntryName;
	}

	public void setRouteEntryName(String routeEntryName) {
		this.routeEntryName = routeEntryName;
		if(routeEntryName != null){
			putQueryParameter("RouteEntryName", routeEntryName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getRouteEntryId() {
		return this.routeEntryId;
	}

	public void setRouteEntryId(String routeEntryId) {
		this.routeEntryId = routeEntryId;
		if(routeEntryId != null){
			putQueryParameter("RouteEntryId", routeEntryId);
		}
	}

	@Override
	public Class<ModifyEnsRouteEntryResponse> getResponseClass() {
		return ModifyEnsRouteEntryResponse.class;
	}

}
