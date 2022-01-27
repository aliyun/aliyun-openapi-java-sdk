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
public class GetGrayAppsRequest extends RoaAcsRequest<GetGrayAppsResponse> {
	   

	private Integer clusterTypes;

	private Integer appname;

	private String physicalRegionId;
	public GetGrayAppsRequest() {
		super("Edas", "2017-08-01", "GetGrayApps", "Edas");
		setUriPattern("/pop/v5/gray/app_list");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getClusterTypes() {
		return this.clusterTypes;
	}

	public void setClusterTypes(Integer clusterTypes) {
		this.clusterTypes = clusterTypes;
		if(clusterTypes != null){
			putQueryParameter("ClusterTypes", clusterTypes.toString());
		}
	}

	public Integer getAppname() {
		return this.appname;
	}

	public void setAppname(Integer appname) {
		this.appname = appname;
		if(appname != null){
			putQueryParameter("Appname", appname.toString());
		}
	}

	public String getPhysicalRegionId() {
		return this.physicalRegionId;
	}

	public void setPhysicalRegionId(String physicalRegionId) {
		this.physicalRegionId = physicalRegionId;
		if(physicalRegionId != null){
			putQueryParameter("PhysicalRegionId", physicalRegionId);
		}
	}

	@Override
	public Class<GetGrayAppsResponse> getResponseClass() {
		return GetGrayAppsResponse.class;
	}

}
