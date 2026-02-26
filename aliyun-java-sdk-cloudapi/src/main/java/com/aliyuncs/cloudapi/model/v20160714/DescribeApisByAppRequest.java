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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeApisByAppRequest extends RpcAcsRequest<DescribeApisByAppResponse> {
	   

	private String method;

	private String description;

	private Integer pageNumber;

	private String path;

	private String apiName;

	private String securityToken;

	private Long appId;

	private String apiUid;

	private Integer pageSize;
	public DescribeApisByAppRequest() {
		super("CloudAPI", "2016-07-14", "DescribeApisByApp", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizMethod() {
		return this.method;
	}

	public void setBizMethod(String method) {
		this.method = method;
		if(method != null){
			putQueryParameter("Method", method);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("Path", path);
		}
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		if(apiName != null){
			putQueryParameter("ApiName", apiName);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getApiUid() {
		return this.apiUid;
	}

	public void setApiUid(String apiUid) {
		this.apiUid = apiUid;
		if(apiUid != null){
			putQueryParameter("ApiUid", apiUid);
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
	public Class<DescribeApisByAppResponse> getResponseClass() {
		return DescribeApisByAppResponse.class;
	}

}
