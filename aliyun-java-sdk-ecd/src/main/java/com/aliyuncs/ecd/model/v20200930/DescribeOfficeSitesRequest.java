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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeOfficeSitesRequest extends RpcAcsRequest<DescribeOfficeSitesResponse> {
	   

	private List<String> officeSiteIds;

	private String officeSiteType;

	private String nextToken;

	private Integer maxResults;
	public DescribeOfficeSitesRequest() {
		super("ecd", "2020-09-30", "DescribeOfficeSites", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getOfficeSiteIds() {
		return this.officeSiteIds;
	}

	public void setOfficeSiteIds(List<String> officeSiteIds) {
		this.officeSiteIds = officeSiteIds;	
		if (officeSiteIds != null) {
			for (int i = 0; i < officeSiteIds.size(); i++) {
				putQueryParameter("OfficeSiteId." + (i + 1) , officeSiteIds.get(i));
			}
		}	
	}

	public String getOfficeSiteType() {
		return this.officeSiteType;
	}

	public void setOfficeSiteType(String officeSiteType) {
		this.officeSiteType = officeSiteType;
		if(officeSiteType != null){
			putQueryParameter("OfficeSiteType", officeSiteType);
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
	public Class<DescribeOfficeSitesResponse> getResponseClass() {
		return DescribeOfficeSitesResponse.class;
	}

}
