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
public class ListListenersRequest extends RpcAcsRequest<ListListenersResponse> {
	   

	private List<String> loadBalancerIdss;

	private String nextToken;

	private List<Tag> tag;

	private String listenerProtocol;

	private List<String> listenerIdss;

	private Integer maxResults;
	public ListListenersRequest() {
		super("Nlb", "2022-04-30", "ListListeners", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getLoadBalancerIdss() {
		return this.loadBalancerIdss;
	}

	public void setLoadBalancerIdss(List<String> loadBalancerIdss) {
		this.loadBalancerIdss = loadBalancerIdss;	
		if (loadBalancerIdss != null) {
			for (int i = 0; i < loadBalancerIdss.size(); i++) {
				putQueryParameter("LoadBalancerIds." + (i + 1) , loadBalancerIdss.get(i));
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

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				if (tag.get(depth1) != null) {
					
						putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
						putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				}
			}
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

	public List<String> getListenerIdss() {
		return this.listenerIdss;
	}

	public void setListenerIdss(List<String> listenerIdss) {
		this.listenerIdss = listenerIdss;	
		if (listenerIdss != null) {
			for (int i = 0; i < listenerIdss.size(); i++) {
				putQueryParameter("ListenerIds." + (i + 1) , listenerIdss.get(i));
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

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ListListenersResponse> getResponseClass() {
		return ListListenersResponse.class;
	}

}
