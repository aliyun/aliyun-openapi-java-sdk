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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MapPkFromHidRequest extends RpcAcsRequest<MapPkFromHidResponse> {
	   

	private String hid;

	private String appName;

	private String mappingScenes;

	private String bid;
	public MapPkFromHidRequest() {
		super("account-crm", "2016-06-06", "MapPkFromHid");
		setMethod(MethodType.POST);
	}

	public String getHid() {
		return this.hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
		if(hid != null){
			putQueryParameter("Hid", hid);
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

	public String getMappingScenes() {
		return this.mappingScenes;
	}

	public void setMappingScenes(String mappingScenes) {
		this.mappingScenes = mappingScenes;
		if(mappingScenes != null){
			putQueryParameter("MappingScenes", mappingScenes);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	@Override
	public Class<MapPkFromHidResponse> getResponseClass() {
		return MapPkFromHidResponse.class;
	}

}
