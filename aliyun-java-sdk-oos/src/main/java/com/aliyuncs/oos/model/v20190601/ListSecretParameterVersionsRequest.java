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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSecretParameterVersionsRequest extends RpcAcsRequest<ListSecretParameterVersionsResponse> {
	   

	private Boolean withDecryption;

	private String nextToken;

	private String name;

	private Integer maxResults;

	private String shareType;
	public ListSecretParameterVersionsRequest() {
		super("oos", "2019-06-01", "ListSecretParameterVersions", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getWithDecryption() {
		return this.withDecryption;
	}

	public void setWithDecryption(Boolean withDecryption) {
		this.withDecryption = withDecryption;
		if(withDecryption != null){
			putQueryParameter("WithDecryption", withDecryption.toString());
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getShareType() {
		return this.shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
		if(shareType != null){
			putQueryParameter("ShareType", shareType);
		}
	}

	@Override
	public Class<ListSecretParameterVersionsResponse> getResponseClass() {
		return ListSecretParameterVersionsResponse.class;
	}

}
