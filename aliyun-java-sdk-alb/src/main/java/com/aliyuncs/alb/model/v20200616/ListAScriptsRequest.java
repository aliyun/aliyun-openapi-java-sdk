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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAScriptsRequest extends RpcAcsRequest<ListAScriptsResponse> {
	   

	private String nextToken;

	private List<String> aScriptNames;

	private List<String> listenerIds;

	private List<String> aScriptIds;

	private Integer maxResults;
	public ListAScriptsRequest() {
		super("Alb", "2020-06-16", "ListAScripts", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getAScriptNames() {
		return this.aScriptNames;
	}

	public void setAScriptNames(List<String> aScriptNames) {
		this.aScriptNames = aScriptNames;	
		if (aScriptNames != null) {
			for (int depth1 = 0; depth1 < aScriptNames.size(); depth1++) {
				putQueryParameter("AScriptNames." + (depth1 + 1) , aScriptNames.get(depth1));
			}
		}	
	}

	public List<String> getListenerIds() {
		return this.listenerIds;
	}

	public void setListenerIds(List<String> listenerIds) {
		this.listenerIds = listenerIds;	
		if (listenerIds != null) {
			for (int depth1 = 0; depth1 < listenerIds.size(); depth1++) {
				putQueryParameter("ListenerIds." + (depth1 + 1) , listenerIds.get(depth1));
			}
		}	
	}

	public List<String> getAScriptIds() {
		return this.aScriptIds;
	}

	public void setAScriptIds(List<String> aScriptIds) {
		this.aScriptIds = aScriptIds;	
		if (aScriptIds != null) {
			for (int depth1 = 0; depth1 < aScriptIds.size(); depth1++) {
				putQueryParameter("AScriptIds." + (depth1 + 1) , aScriptIds.get(depth1));
			}
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
	public Class<ListAScriptsResponse> getResponseClass() {
		return ListAScriptsResponse.class;
	}

}
