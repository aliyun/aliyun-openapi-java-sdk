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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListBasicAccelerateIpsRequest extends RpcAcsRequest<ListBasicAccelerateIpsResponse> {
	   

	private String clientToken;

	private String ipSetId;

	private String accelerateIpAddress;

	private String accelerateIpId;

	private String nextToken;

	private Integer maxResults;
	public ListBasicAccelerateIpsRequest() {
		super("Ga", "2019-11-20", "ListBasicAccelerateIps", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getIpSetId() {
		return this.ipSetId;
	}

	public void setIpSetId(String ipSetId) {
		this.ipSetId = ipSetId;
		if(ipSetId != null){
			putQueryParameter("IpSetId", ipSetId);
		}
	}

	public String getAccelerateIpAddress() {
		return this.accelerateIpAddress;
	}

	public void setAccelerateIpAddress(String accelerateIpAddress) {
		this.accelerateIpAddress = accelerateIpAddress;
		if(accelerateIpAddress != null){
			putQueryParameter("AccelerateIpAddress", accelerateIpAddress);
		}
	}

	public String getAccelerateIpId() {
		return this.accelerateIpId;
	}

	public void setAccelerateIpId(String accelerateIpId) {
		this.accelerateIpId = accelerateIpId;
		if(accelerateIpId != null){
			putQueryParameter("AccelerateIpId", accelerateIpId);
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
	public Class<ListBasicAccelerateIpsResponse> getResponseClass() {
		return ListBasicAccelerateIpsResponse.class;
	}

}
