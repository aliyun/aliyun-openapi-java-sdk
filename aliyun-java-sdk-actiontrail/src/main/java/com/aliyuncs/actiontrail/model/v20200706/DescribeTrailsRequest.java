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

package com.aliyuncs.actiontrail.model.v20200706;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.actiontrail.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrailsRequest extends RpcAcsRequest<DescribeTrailsResponse> {
	   

	private Boolean includeOrganizationTrail;

	private Boolean includeShadowTrails;

	private String nameList;
	public DescribeTrailsRequest() {
		super("Actiontrail", "2020-07-06", "DescribeTrails", "actiontrail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIncludeOrganizationTrail() {
		return this.includeOrganizationTrail;
	}

	public void setIncludeOrganizationTrail(Boolean includeOrganizationTrail) {
		this.includeOrganizationTrail = includeOrganizationTrail;
		if(includeOrganizationTrail != null){
			putQueryParameter("IncludeOrganizationTrail", includeOrganizationTrail.toString());
		}
	}

	public Boolean getIncludeShadowTrails() {
		return this.includeShadowTrails;
	}

	public void setIncludeShadowTrails(Boolean includeShadowTrails) {
		this.includeShadowTrails = includeShadowTrails;
		if(includeShadowTrails != null){
			putQueryParameter("IncludeShadowTrails", includeShadowTrails.toString());
		}
	}

	public String getNameList() {
		return this.nameList;
	}

	public void setNameList(String nameList) {
		this.nameList = nameList;
		if(nameList != null){
			putQueryParameter("NameList", nameList);
		}
	}

	@Override
	public Class<DescribeTrailsResponse> getResponseClass() {
		return DescribeTrailsResponse.class;
	}

}
