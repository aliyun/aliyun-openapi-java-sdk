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
public class DescribeDirectoriesRequest extends RpcAcsRequest<DescribeDirectoriesResponse> {
	   

	private String directoryType;

	private String nextToken;

	private String directoryStatus;

	private Integer maxResults;

	private List<String> directoryIds;
	public DescribeDirectoriesRequest() {
		super("ecd", "2020-09-30", "DescribeDirectories", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDirectoryType() {
		return this.directoryType;
	}

	public void setDirectoryType(String directoryType) {
		this.directoryType = directoryType;
		if(directoryType != null){
			putQueryParameter("DirectoryType", directoryType);
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

	public String getDirectoryStatus() {
		return this.directoryStatus;
	}

	public void setDirectoryStatus(String directoryStatus) {
		this.directoryStatus = directoryStatus;
		if(directoryStatus != null){
			putQueryParameter("DirectoryStatus", directoryStatus);
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

	public List<String> getDirectoryIds() {
		return this.directoryIds;
	}

	public void setDirectoryIds(List<String> directoryIds) {
		this.directoryIds = directoryIds;	
		if (directoryIds != null) {
			for (int i = 0; i < directoryIds.size(); i++) {
				putQueryParameter("DirectoryId." + (i + 1) , directoryIds.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeDirectoriesResponse> getResponseClass() {
		return DescribeDirectoriesResponse.class;
	}

}
