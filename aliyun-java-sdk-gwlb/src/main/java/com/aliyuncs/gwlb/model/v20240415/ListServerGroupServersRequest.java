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

package com.aliyuncs.gwlb.model.v20240415;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListServerGroupServersRequest extends RpcAcsRequest<ListServerGroupServersResponse> {
	   

	private Integer skip;

	private String serverGroupId;

	private String nextToken;

	private List<String> serverIds;

	private List<String> serverIps;

	private Integer maxResults;
	public ListServerGroupServersRequest() {
		super("Gwlb", "2024-04-15", "ListServerGroupServers");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getSkip() {
		return this.skip;
	}

	public void setSkip(Integer skip) {
		this.skip = skip;
		if(skip != null){
			putBodyParameter("Skip", skip.toString());
		}
	}

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
		if(serverGroupId != null){
			putBodyParameter("ServerGroupId", serverGroupId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public List<String> getServerIds() {
		return this.serverIds;
	}

	public void setServerIds(List<String> serverIds) {
		this.serverIds = serverIds;	
		if (serverIds != null) {
			for (int depth1 = 0; depth1 < serverIds.size(); depth1++) {
				putBodyParameter("ServerIds." + (depth1 + 1) , serverIds.get(depth1));
			}
		}	
	}

	public List<String> getServerIps() {
		return this.serverIps;
	}

	public void setServerIps(List<String> serverIps) {
		this.serverIps = serverIps;	
		if (serverIps != null) {
			for (int depth1 = 0; depth1 < serverIps.size(); depth1++) {
				putBodyParameter("ServerIps." + (depth1 + 1) , serverIps.get(depth1));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListServerGroupServersResponse> getResponseClass() {
		return ListServerGroupServersResponse.class;
	}

}
