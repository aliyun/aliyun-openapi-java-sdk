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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppEnvsRequest extends RoaAcsRequest<DescribeAppEnvsResponse> {
	
	public DescribeAppEnvsRequest() {
		super("WebPlus", "2019-03-20", "DescribeAppEnvs", "webx");
		setUriPattern("/pop/v1/wam/appEnv");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean recentUpdated;

	private String envName;

	private String appId;

	private Integer pageSize;

	private Boolean includeTerminated;

	private String envId;

	private String stackSearch;

	private Integer pageNumber;

	private String envSearch;

	public Boolean getRecentUpdated() {
		return this.recentUpdated;
	}

	public void setRecentUpdated(Boolean recentUpdated) {
		this.recentUpdated = recentUpdated;
		if(recentUpdated != null){
			putQueryParameter("RecentUpdated", recentUpdated.toString());
		}
	}

	public String getEnvName() {
		return this.envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
		if(envName != null){
			putQueryParameter("EnvName", envName);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	public Boolean getIncludeTerminated() {
		return this.includeTerminated;
	}

	public void setIncludeTerminated(Boolean includeTerminated) {
		this.includeTerminated = includeTerminated;
		if(includeTerminated != null){
			putQueryParameter("IncludeTerminated", includeTerminated.toString());
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId);
		}
	}

	public String getStackSearch() {
		return this.stackSearch;
	}

	public void setStackSearch(String stackSearch) {
		this.stackSearch = stackSearch;
		if(stackSearch != null){
			putQueryParameter("StackSearch", stackSearch);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getEnvSearch() {
		return this.envSearch;
	}

	public void setEnvSearch(String envSearch) {
		this.envSearch = envSearch;
		if(envSearch != null){
			putQueryParameter("EnvSearch", envSearch);
		}
	}

	@Override
	public Class<DescribeAppEnvsResponse> getResponseClass() {
		return DescribeAppEnvsResponse.class;
	}

}
