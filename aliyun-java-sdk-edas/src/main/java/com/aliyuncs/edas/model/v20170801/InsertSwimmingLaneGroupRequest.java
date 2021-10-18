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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InsertSwimmingLaneGroupRequest extends RoaAcsRequest<InsertSwimmingLaneGroupResponse> {
	   

	private String appIds;

	private String logicalRegionId;

	private String name;

	private String entryApp;
	public InsertSwimmingLaneGroupRequest() {
		super("Edas", "2017-08-01", "InsertSwimmingLaneGroup", "edas");
		setUriPattern("/pop/v5/trafficmgnt/swimming_lane_groups");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppIds() {
		return this.appIds;
	}

	public void setAppIds(String appIds) {
		this.appIds = appIds;
		if(appIds != null){
			putQueryParameter("AppIds", appIds);
		}
	}

	public String getLogicalRegionId() {
		return this.logicalRegionId;
	}

	public void setLogicalRegionId(String logicalRegionId) {
		this.logicalRegionId = logicalRegionId;
		if(logicalRegionId != null){
			putQueryParameter("LogicalRegionId", logicalRegionId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getEntryApp() {
		return this.entryApp;
	}

	public void setEntryApp(String entryApp) {
		this.entryApp = entryApp;
		if(entryApp != null){
			putQueryParameter("EntryApp", entryApp);
		}
	}

	@Override
	public Class<InsertSwimmingLaneGroupResponse> getResponseClass() {
		return InsertSwimmingLaneGroupResponse.class;
	}

}
