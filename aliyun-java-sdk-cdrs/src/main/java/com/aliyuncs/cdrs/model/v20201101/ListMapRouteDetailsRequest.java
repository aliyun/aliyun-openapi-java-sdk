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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListMapRouteDetailsRequest extends RpcAcsRequest<ListMapRouteDetailsResponse> {
	   

	private String routeList;
	public ListMapRouteDetailsRequest() {
		super("CDRS", "2020-11-01", "ListMapRouteDetails");
		setMethod(MethodType.POST);
	}

	public String getRouteList() {
		return this.routeList;
	}

	public void setRouteList(String routeList) {
		this.routeList = routeList;
		if(routeList != null){
			putBodyParameter("RouteList", routeList);
		}
	}

	@Override
	public Class<ListMapRouteDetailsResponse> getResponseClass() {
		return ListMapRouteDetailsResponse.class;
	}

}
