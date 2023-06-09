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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDataServiceApiContextRequest extends RpcAcsRequest<GetDataServiceApiContextResponse> {
	   

	private Integer apiStatus;

	private String cacheKey;

	private Long apiId;

	private Boolean verbose;

	private Boolean forPrivateResGroup;
	public GetDataServiceApiContextRequest() {
		super("dataworks-public", "2018-06-01", "GetDataServiceApiContext");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getApiStatus() {
		return this.apiStatus;
	}

	public void setApiStatus(Integer apiStatus) {
		this.apiStatus = apiStatus;
		if(apiStatus != null){
			putQueryParameter("ApiStatus", apiStatus.toString());
		}
	}

	public String getCacheKey() {
		return this.cacheKey;
	}

	public void setCacheKey(String cacheKey) {
		this.cacheKey = cacheKey;
		if(cacheKey != null){
			putQueryParameter("CacheKey", cacheKey);
		}
	}

	public Long getApiId() {
		return this.apiId;
	}

	public void setApiId(Long apiId) {
		this.apiId = apiId;
		if(apiId != null){
			putQueryParameter("ApiId", apiId.toString());
		}
	}

	public Boolean getVerbose() {
		return this.verbose;
	}

	public void setVerbose(Boolean verbose) {
		this.verbose = verbose;
		if(verbose != null){
			putQueryParameter("Verbose", verbose.toString());
		}
	}

	public Boolean getForPrivateResGroup() {
		return this.forPrivateResGroup;
	}

	public void setForPrivateResGroup(Boolean forPrivateResGroup) {
		this.forPrivateResGroup = forPrivateResGroup;
		if(forPrivateResGroup != null){
			putQueryParameter("ForPrivateResGroup", forPrivateResGroup.toString());
		}
	}

	@Override
	public Class<GetDataServiceApiContextResponse> getResponseClass() {
		return GetDataServiceApiContextResponse.class;
	}

}
