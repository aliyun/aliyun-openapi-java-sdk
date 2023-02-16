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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApiDestinationsRequest extends RpcAcsRequest<ListApiDestinationsResponse> {
	   

	private String clientToken;

	private String description;

	private String nextToken;

	private Long maxResults;

	private String apiDestinationNamePrefix;
	public ListApiDestinationsRequest() {
		super("eventbridge", "2020-04-01", "ListApiDestinations");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getApiDestinationNamePrefix() {
		return this.apiDestinationNamePrefix;
	}

	public void setApiDestinationNamePrefix(String apiDestinationNamePrefix) {
		this.apiDestinationNamePrefix = apiDestinationNamePrefix;
		if(apiDestinationNamePrefix != null){
			putQueryParameter("ApiDestinationNamePrefix", apiDestinationNamePrefix);
		}
	}

	@Override
	public Class<ListApiDestinationsResponse> getResponseClass() {
		return ListApiDestinationsResponse.class;
	}

}
