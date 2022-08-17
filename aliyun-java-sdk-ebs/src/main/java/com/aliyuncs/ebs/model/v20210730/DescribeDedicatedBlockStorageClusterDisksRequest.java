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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDedicatedBlockStorageClusterDisksRequest extends RpcAcsRequest<DescribeDedicatedBlockStorageClusterDisksResponse> {
	   

	private String nextToken;

	private String dbscId;

	private Long maxResults;
	public DescribeDedicatedBlockStorageClusterDisksRequest() {
		super("ebs", "2021-07-30", "DescribeDedicatedBlockStorageClusterDisks", "ebs");
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

	public String getDbscId() {
		return this.dbscId;
	}

	public void setDbscId(String dbscId) {
		this.dbscId = dbscId;
		if(dbscId != null){
			putQueryParameter("DbscId", dbscId);
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

	@Override
	public Class<DescribeDedicatedBlockStorageClusterDisksResponse> getResponseClass() {
		return DescribeDedicatedBlockStorageClusterDisksResponse.class;
	}

}
