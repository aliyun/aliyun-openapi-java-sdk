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
public class DescribeApplicationsRequest extends RoaAcsRequest<DescribeApplicationsResponse> {
	
	public DescribeApplicationsRequest() {
		super("WebPlus", "2019-03-20", "DescribeApplications", "webx");
		setUriPattern("/pop/v1/wam/application");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String appName;

	private String appId;

	private Integer pageSize;

	private String categorySearch;

	private String stackSearch;

	private Integer pageNumber;

	private String appSearch;

	private String envSearch;

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
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

	public String getCategorySearch() {
		return this.categorySearch;
	}

	public void setCategorySearch(String categorySearch) {
		this.categorySearch = categorySearch;
		if(categorySearch != null){
			putQueryParameter("CategorySearch", categorySearch);
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

	public String getAppSearch() {
		return this.appSearch;
	}

	public void setAppSearch(String appSearch) {
		this.appSearch = appSearch;
		if(appSearch != null){
			putQueryParameter("AppSearch", appSearch);
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
	public Class<DescribeApplicationsResponse> getResponseClass() {
		return DescribeApplicationsResponse.class;
	}

}
