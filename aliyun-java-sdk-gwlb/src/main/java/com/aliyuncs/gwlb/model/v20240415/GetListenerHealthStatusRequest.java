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
import com.aliyuncs.gwlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetListenerHealthStatusRequest extends RpcAcsRequest<GetListenerHealthStatusResponse> {
	   

	private Integer skip;

	private String listenerId;

	private String nextToken;

	private List<Filter> filter;

	private Integer maxResults;
	public GetListenerHealthStatusRequest() {
		super("Gwlb", "2024-04-15", "GetListenerHealthStatus", "gwlb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putBodyParameter("ListenerId", listenerId);
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

	public List<Filter> getFilter() {
		return this.filter;
	}

	public void setFilter(List<Filter> filter) {
		this.filter = filter;	
		if (filter != null) {
			for (int depth1 = 0; depth1 < filter.size(); depth1++) {
				if (filter.get(depth1) != null) {
					
						putBodyParameter("Filter." + (depth1 + 1) + ".Name" , filter.get(depth1).getName());
						if (filter.get(depth1).getValues() != null) {
							for (int depth2 = 0; depth2 < filter.get(depth1).getValues().size(); depth2++) {
								putBodyParameter("Filter." + (depth1 + 1) + ".Values." + (depth2 + 1) , filter.get(depth1).getValues().get(depth2));
							}
						}
				}
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

	public static class Filter {

		private String name;

		private List<String> values;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getValues() {
			return this.values;
		}

		public void setValues(List<String> values) {
			this.values = values;
		}
	}

	@Override
	public Class<GetListenerHealthStatusResponse> getResponseClass() {
		return GetListenerHealthStatusResponse.class;
	}

}
