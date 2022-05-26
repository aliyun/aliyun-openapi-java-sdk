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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MapFromHavanaBindIdRequest extends RpcAcsRequest<MapFromHavanaBindIdResponse> {
	   

	private String havanaBindId;

	private String appName;

	private List<Object> havanaBindStations;
	public MapFromHavanaBindIdRequest() {
		super("account-crm", "2016-06-06", "MapFromHavanaBindId");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getHavanaBindId() {
		return this.havanaBindId;
	}

	public void setHavanaBindId(String havanaBindId) {
		this.havanaBindId = havanaBindId;
		if(havanaBindId != null){
			putQueryParameter("HavanaBindId", havanaBindId);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public List<Object> getHavanaBindStations() {
		return this.havanaBindStations;
	}

	public void setHavanaBindStations(List<Object> havanaBindStations) {
		this.havanaBindStations = havanaBindStations;
		if(havanaBindStations != null){
			putQueryParameter("HavanaBindStations", new Gson().toJson(havanaBindStations));
		}
	}

	@Override
	public Class<MapFromHavanaBindIdResponse> getResponseClass() {
		return MapFromHavanaBindIdResponse.class;
	}

}
