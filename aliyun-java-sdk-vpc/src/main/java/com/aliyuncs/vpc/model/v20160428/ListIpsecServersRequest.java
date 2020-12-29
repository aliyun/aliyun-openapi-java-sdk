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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListIpsecServersRequest extends RpcAcsRequest<ListIpsecServersResponse> {
	   

	private String vpnGatewayId;

	private String nextToken;

	private String ipsecServerName;

	private Integer maxResults;

	private List<String> ipsecServerIds;
	public ListIpsecServersRequest() {
		super("Vpc", "2016-04-28", "ListIpsecServers", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
		if(vpnGatewayId != null){
			putQueryParameter("VpnGatewayId", vpnGatewayId);
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

	public String getIpsecServerName() {
		return this.ipsecServerName;
	}

	public void setIpsecServerName(String ipsecServerName) {
		this.ipsecServerName = ipsecServerName;
		if(ipsecServerName != null){
			putQueryParameter("IpsecServerName", ipsecServerName);
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

	public List<String> getIpsecServerIds() {
		return this.ipsecServerIds;
	}

	public void setIpsecServerIds(List<String> ipsecServerIds) {
		this.ipsecServerIds = ipsecServerIds;	
		if (ipsecServerIds != null) {
			for (int i = 0; i < ipsecServerIds.size(); i++) {
				putQueryParameter("IpsecServerId." + (i + 1) , ipsecServerIds.get(i));
			}
		}	
	}

	@Override
	public Class<ListIpsecServersResponse> getResponseClass() {
		return ListIpsecServersResponse.class;
	}

}
