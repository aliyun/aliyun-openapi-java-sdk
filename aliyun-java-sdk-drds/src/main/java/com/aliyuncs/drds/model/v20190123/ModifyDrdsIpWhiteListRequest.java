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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDrdsIpWhiteListRequest extends RpcAcsRequest<ModifyDrdsIpWhiteListResponse> {
	   

	private String drdsInstanceId;

	private String groupName;

	private Boolean mode;

	private String dbName;

	private String groupAttribute;

	private String ipWhiteList;
	public ModifyDrdsIpWhiteListRequest() {
		super("Drds", "2019-01-23", "ModifyDrdsIpWhiteList", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public Boolean getMode() {
		return this.mode;
	}

	public void setMode(Boolean mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode.toString());
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getGroupAttribute() {
		return this.groupAttribute;
	}

	public void setGroupAttribute(String groupAttribute) {
		this.groupAttribute = groupAttribute;
		if(groupAttribute != null){
			putQueryParameter("GroupAttribute", groupAttribute);
		}
	}

	public String getIpWhiteList() {
		return this.ipWhiteList;
	}

	public void setIpWhiteList(String ipWhiteList) {
		this.ipWhiteList = ipWhiteList;
		if(ipWhiteList != null){
			putQueryParameter("IpWhiteList", ipWhiteList);
		}
	}

	@Override
	public Class<ModifyDrdsIpWhiteListResponse> getResponseClass() {
		return ModifyDrdsIpWhiteListResponse.class;
	}

}
