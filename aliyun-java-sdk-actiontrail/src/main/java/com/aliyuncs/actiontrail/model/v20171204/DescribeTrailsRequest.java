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

package com.aliyuncs.actiontrail.model.v20171204;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeTrailsRequest extends RpcAcsRequest<DescribeTrailsResponse> {
	
	public DescribeTrailsRequest() {
		super("Actiontrail", "2017-12-04", "DescribeTrails", "actiontrail");
	}

	private String nameList;

	private Boolean includeShadowTrails;

	public String getNameList() {
		return this.nameList;
	}

	public void setNameList(String nameList) {
		this.nameList = nameList;
		if(nameList != null){
			putQueryParameter("NameList", nameList);
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

	@Override
	public Class<DescribeTrailsResponse> getResponseClass() {
		return DescribeTrailsResponse.class;
	}

}
