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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeMfaDevicesRequest extends RpcAcsRequest<DescribeMfaDevicesResponse> {
	   

	private List<String> endUserIdss;

	private List<String> serialNumberss;

	private String adDomain;

	private String nextToken;

	private Long maxResults;
	public DescribeMfaDevicesRequest() {
		super("eds-user", "2021-03-08", "DescribeMfaDevices", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getEndUserIdss() {
		return this.endUserIdss;
	}

	public void setEndUserIdss(List<String> endUserIdss) {
		this.endUserIdss = endUserIdss;	
		if (endUserIdss != null) {
			for (int i = 0; i < endUserIdss.size(); i++) {
				putQueryParameter("EndUserIds." + (i + 1) , endUserIdss.get(i));
			}
		}	
	}

	public List<String> getSerialNumberss() {
		return this.serialNumberss;
	}

	public void setSerialNumberss(List<String> serialNumberss) {
		this.serialNumberss = serialNumberss;	
		if (serialNumberss != null) {
			for (int i = 0; i < serialNumberss.size(); i++) {
				putQueryParameter("SerialNumbers." + (i + 1) , serialNumberss.get(i));
			}
		}	
	}

	public String getAdDomain() {
		return this.adDomain;
	}

	public void setAdDomain(String adDomain) {
		this.adDomain = adDomain;
		if(adDomain != null){
			putQueryParameter("AdDomain", adDomain);
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

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<DescribeMfaDevicesResponse> getResponseClass() {
		return DescribeMfaDevicesResponse.class;
	}

}
