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
public class GetSecretParametersByPathRequest extends RpcAcsRequest<GetSecretParametersByPathResponse> {
	   

	private Boolean withDecryption;

	private Boolean recursive;

	private String path;

	private String nextToken;

	private Integer maxResults;
	public GetSecretParametersByPathRequest() {
		super("oos", "2019-06-01", "GetSecretParametersByPath", "oos");
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

	public Boolean getRecursive() {
		return this.recursive;
	}

	public void setRecursive(Boolean recursive) {
		this.recursive = recursive;
		if(recursive != null){
			putQueryParameter("Recursive", recursive.toString());
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	@Override
	public Class<GetSecretParametersByPathResponse> getResponseClass() {
		return GetSecretParametersByPathResponse.class;
	}

}
