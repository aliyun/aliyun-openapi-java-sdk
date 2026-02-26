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
	   

	private String nextToken;

	private String connectionName;

	private Long maxResults;

	private String apiDestinationNamePrefix;
	public ListApiDestinationsRequest() {
		super("eventbridge", "2020-04-01", "ListApiDestinations");
		setMethod(MethodType.POST);
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

	public String getConnectionName() {
		return this.connectionName;
	}

	public void setConnectionName(String connectionName) {
		this.connectionName = connectionName;
		if(connectionName != null){
			putQueryParameter("ConnectionName", connectionName);
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
