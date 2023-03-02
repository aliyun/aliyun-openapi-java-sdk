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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySolutionDeviceGroupPageRequest extends RpcAcsRequest<QuerySolutionDeviceGroupPageResponse> {
	   

	private String fuzzyGroupName;

	private String projectCode;

	private Integer pageId;

	private String iotInstanceId;

	private Integer pageSize;
	public QuerySolutionDeviceGroupPageRequest() {
		super("Iot", "2018-01-20", "QuerySolutionDeviceGroupPage", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFuzzyGroupName() {
		return this.fuzzyGroupName;
	}

	public void setFuzzyGroupName(String fuzzyGroupName) {
		this.fuzzyGroupName = fuzzyGroupName;
		if(fuzzyGroupName != null){
			putQueryParameter("FuzzyGroupName", fuzzyGroupName);
		}
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
		if(projectCode != null){
			putQueryParameter("ProjectCode", projectCode);
		}
	}

	public Integer getPageId() {
		return this.pageId;
	}

	public void setPageId(Integer pageId) {
		this.pageId = pageId;
		if(pageId != null){
			putQueryParameter("PageId", pageId.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<QuerySolutionDeviceGroupPageResponse> getResponseClass() {
		return QuerySolutionDeviceGroupPageResponse.class;
	}

}
