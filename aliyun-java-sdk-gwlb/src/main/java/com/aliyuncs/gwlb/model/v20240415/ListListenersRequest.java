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
public class ListListenersRequest extends RpcAcsRequest<ListListenersResponse> {
	   

	private List<String> loadBalancerIds;

	private Long skip;

	private String nextToken;

	private List<Tag> tag;

	private List<String> listenerIds;

	private Integer maxResults;
	public ListListenersRequest() {
		super("Gwlb", "2024-04-15", "ListListeners");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getLoadBalancerIds() {
		return this.loadBalancerIds;
	}

	public void setLoadBalancerIds(List<String> loadBalancerIds) {
		this.loadBalancerIds = loadBalancerIds;	
		if (loadBalancerIds != null) {
			for (int depth1 = 0; depth1 < loadBalancerIds.size(); depth1++) {
				putBodyParameter("LoadBalancerIds." + (depth1 + 1) , loadBalancerIds.get(depth1));
			}
		}	
	}

	public Long getSkip() {
		return this.skip;
	}

	public void setSkip(Long skip) {
		this.skip = skip;
		if(skip != null){
			putBodyParameter("Skip", skip.toString());
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

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			for (int depth1 = 0; depth1 < tag.size(); depth1++) {
				if (tag.get(depth1) != null) {
					
						putBodyParameter("Tag." + (depth1 + 1) + ".Key" , tag.get(depth1).getKey());
						putBodyParameter("Tag." + (depth1 + 1) + ".Value" , tag.get(depth1).getValue());
				}
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
				putBodyParameter("ListenerIds." + (depth1 + 1) , listenerIds.get(depth1));
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
