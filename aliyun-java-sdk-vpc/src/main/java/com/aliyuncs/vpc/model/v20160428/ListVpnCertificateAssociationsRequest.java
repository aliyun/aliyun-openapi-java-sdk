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
public class ListVpnCertificateAssociationsRequest extends RpcAcsRequest<ListVpnCertificateAssociationsResponse> {
	   

	private List<String> certificateIds;

	private List<String> vpnGatewayIds;

	private String certificateType;

	private String nextToken;

	private Integer maxResults;
	public ListVpnCertificateAssociationsRequest() {
		super("Vpc", "2016-04-28", "ListVpnCertificateAssociations", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getCertificateIds() {
		return this.certificateIds;
	}

	public void setCertificateIds(List<String> certificateIds) {
		this.certificateIds = certificateIds;	
		if (certificateIds != null) {
			for (int i = 0; i < certificateIds.size(); i++) {
				putQueryParameter("CertificateId." + (i + 1) , certificateIds.get(i));
			}
		}	
	}

	public List<String> getVpnGatewayIds() {
		return this.vpnGatewayIds;
	}

	public void setVpnGatewayIds(List<String> vpnGatewayIds) {
		this.vpnGatewayIds = vpnGatewayIds;	
		if (vpnGatewayIds != null) {
			for (int i = 0; i < vpnGatewayIds.size(); i++) {
				putQueryParameter("VpnGatewayId." + (i + 1) , vpnGatewayIds.get(i));
			}
		}	
	}

	public String getCertificateType() {
		return this.certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
		if(certificateType != null){
			putQueryParameter("CertificateType", certificateType);
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
	public Class<ListVpnCertificateAssociationsResponse> getResponseClass() {
		return ListVpnCertificateAssociationsResponse.class;
	}

}
