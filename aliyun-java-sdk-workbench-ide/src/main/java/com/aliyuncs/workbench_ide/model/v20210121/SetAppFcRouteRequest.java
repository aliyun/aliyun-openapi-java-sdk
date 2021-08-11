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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetAppFcRouteRequest extends RpcAcsRequest<SetAppFcRouteResponse> {
	   

	private Long appId;

	private String currentOrgId;

	private List<RouteList> routeLists;
	public SetAppFcRouteRequest() {
		super("Workbench-ide", "2021-01-21", "SetAppFcRoute");
		setMethod(MethodType.POST);
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public List<RouteList> getRouteLists() {
		return this.routeLists;
	}

	public void setRouteLists(List<RouteList> routeLists) {
		this.routeLists = routeLists;	
		if (routeLists != null) {
			for (int depth1 = 0; depth1 < routeLists.size(); depth1++) {
				putQueryParameter("RouteList." + (depth1 + 1) + ".Handler" , routeLists.get(depth1).getHandler());
				putQueryParameter("RouteList." + (depth1 + 1) + ".HttpMethod" , routeLists.get(depth1).getHttpMethod());
				putQueryParameter("RouteList." + (depth1 + 1) + ".Uri" , routeLists.get(depth1).getUri());
			}
		}	
	}

	public static class RouteList {

		private String handler;

		private String httpMethod;

		private String uri;

		public String getHandler() {
			return this.handler;
		}

		public void setHandler(String handler) {
			this.handler = handler;
		}

		public String getHttpMethod() {
			return this.httpMethod;
		}

		public void setHttpMethod(String httpMethod) {
			this.httpMethod = httpMethod;
		}

		public String getUri() {
			return this.uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}
	}

	@Override
	public Class<SetAppFcRouteResponse> getResponseClass() {
		return SetAppFcRouteResponse.class;
	}

}
