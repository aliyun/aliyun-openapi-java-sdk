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

package com.aliyuncs.computenest.model.v20210601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenest.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListServiceInstanceResourcesRequest extends RpcAcsRequest<ListServiceInstanceResourcesResponse> {
	   

	private String expireTimeEnd;

	private String nextToken;

	private String serviceInstanceResourceType;

	private List<String> resourceARNs;

	private List<Tag> tags;

	private String serviceInstanceId;

	private String expireTimeStart;

	private Integer maxResults;

	private String payType;
	public ListServiceInstanceResourcesRequest() {
		super("ComputeNest", "2021-06-01", "ListServiceInstanceResources", "computenest");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExpireTimeEnd() {
		return this.expireTimeEnd;
	}

	public void setExpireTimeEnd(String expireTimeEnd) {
		this.expireTimeEnd = expireTimeEnd;
		if(expireTimeEnd != null){
			putQueryParameter("ExpireTimeEnd", expireTimeEnd);
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

	public String getServiceInstanceResourceType() {
		return this.serviceInstanceResourceType;
	}

	public void setServiceInstanceResourceType(String serviceInstanceResourceType) {
		this.serviceInstanceResourceType = serviceInstanceResourceType;
		if(serviceInstanceResourceType != null){
			putQueryParameter("ServiceInstanceResourceType", serviceInstanceResourceType);
		}
	}

	public List<String> getResourceARNs() {
		return this.resourceARNs;
	}

	public void setResourceARNs(List<String> resourceARNs) {
		this.resourceARNs = resourceARNs;	
		if (resourceARNs != null) {
			for (int i = 0; i < resourceARNs.size(); i++) {
				putQueryParameter("ResourceARN." + (i + 1) , resourceARNs.get(i));
			}
		}	
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getServiceInstanceId() {
		return this.serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
		if(serviceInstanceId != null){
			putQueryParameter("ServiceInstanceId", serviceInstanceId);
		}
	}

	public String getExpireTimeStart() {
		return this.expireTimeStart;
	}

	public void setExpireTimeStart(String expireTimeStart) {
		this.expireTimeStart = expireTimeStart;
		if(expireTimeStart != null){
			putQueryParameter("ExpireTimeStart", expireTimeStart);
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListServiceInstanceResourcesResponse> getResponseClass() {
		return ListServiceInstanceResourcesResponse.class;
	}

}
