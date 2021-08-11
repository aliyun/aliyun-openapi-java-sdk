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
public class ListListenersRequest extends RpcAcsRequest<ListListenersResponse> {
	   

	private List<String> loadBalancerIds;

	private String nextToken;

	private String listenerProtocol;

	private List<String> listenerIds;

	private Integer maxResults;
	public ListListenersRequest() {
		super("Alb", "2020-06-16", "ListListeners", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getLoadBalancerIds() {
		return this.loadBalancerIds;
	}

	public void setLoadBalancerIds(List<String> loadBalancerIds) {
		this.loadBalancerIds = loadBalancerIds;	
		if (loadBalancerIds != null) {
			for (int depth1 = 0; depth1 < loadBalancerIds.size(); depth1++) {
				putQueryParameter("LoadBalancerIds." + (depth1 + 1) , loadBalancerIds.get(depth1));
			}
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

	public String getListenerProtocol() {
		return this.listenerProtocol;
	}

	public void setListenerProtocol(String listenerProtocol) {
		this.listenerProtocol = listenerProtocol;
		if(listenerProtocol != null){
			putQueryParameter("ListenerProtocol", listenerProtocol);
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
	public Class<ListListenersResponse> getResponseClass() {
		return ListListenersResponse.class;
	}

}
