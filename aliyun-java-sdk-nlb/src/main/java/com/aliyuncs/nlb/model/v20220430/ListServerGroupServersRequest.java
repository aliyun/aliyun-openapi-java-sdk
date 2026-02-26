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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListServerGroupServersRequest extends RpcAcsRequest<ListServerGroupServersResponse> {
	   

	private String serverGroupId;

	private String nextToken;

	private List<String> serverIdss;

	private List<String> serverIpss;

	private Integer maxResults;
	public ListServerGroupServersRequest() {
		super("Nlb", "2022-04-30", "ListServerGroupServers", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getServerIdss() {
		return this.serverIdss;
	}

	public void setServerIdss(List<String> serverIdss) {
		this.serverIdss = serverIdss;	
		if (serverIdss != null) {
			for (int i = 0; i < serverIdss.size(); i++) {
				putBodyParameter("ServerIds." + (i + 1) , serverIdss.get(i));
			}
		}	
	}

	public List<String> getServerIpss() {
		return this.serverIpss;
	}

	public void setServerIpss(List<String> serverIpss) {
		this.serverIpss = serverIpss;	
		if (serverIpss != null) {
			for (int i = 0; i < serverIpss.size(); i++) {
				putBodyParameter("ServerIps." + (i + 1) , serverIpss.get(i));
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
