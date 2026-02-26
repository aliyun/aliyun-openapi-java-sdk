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
public class ListFullNatEntriesRequest extends RpcAcsRequest<ListFullNatEntriesResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private List<String> networkInterfaceIdss;

	private String fullNatEntryId;

	private String natIpPort;

	private String fullNatTableId;

	private String nextToken;

	private List<String> fullNatEntryNamess;

	private String natGatewayId;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String ownerAccount;

	private Long ownerId;

	private String natIp;

	private Long maxResults;
	public ListFullNatEntriesRequest() {
		super("Vpc", "2016-04-28", "ListFullNatEntries", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
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

	public List<String> getNetworkInterfaceIdss() {
		return this.networkInterfaceIdss;
	}

	public void setNetworkInterfaceIdss(List<String> networkInterfaceIdss) {
		this.networkInterfaceIdss = networkInterfaceIdss;	
		if (networkInterfaceIdss != null) {
			for (int i = 0; i < networkInterfaceIdss.size(); i++) {
				putQueryParameter("NetworkInterfaceIds." + (i + 1) , networkInterfaceIdss.get(i));
			}
		}	
	}

	public String getFullNatEntryId() {
		return this.fullNatEntryId;
	}

	public void setFullNatEntryId(String fullNatEntryId) {
		this.fullNatEntryId = fullNatEntryId;
		if(fullNatEntryId != null){
			putQueryParameter("FullNatEntryId", fullNatEntryId);
		}
	}

	public String getNatIpPort() {
		return this.natIpPort;
	}

	public void setNatIpPort(String natIpPort) {
		this.natIpPort = natIpPort;
		if(natIpPort != null){
			putQueryParameter("NatIpPort", natIpPort);
		}
	}

	public String getFullNatTableId() {
		return this.fullNatTableId;
	}

	public void setFullNatTableId(String fullNatTableId) {
		this.fullNatTableId = fullNatTableId;
		if(fullNatTableId != null){
			putQueryParameter("FullNatTableId", fullNatTableId);
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

	public List<String> getFullNatEntryNamess() {
		return this.fullNatEntryNamess;
	}

	public void setFullNatEntryNamess(List<String> fullNatEntryNamess) {
		this.fullNatEntryNamess = fullNatEntryNamess;	
		if (fullNatEntryNamess != null) {
			for (int i = 0; i < fullNatEntryNamess.size(); i++) {
				putQueryParameter("FullNatEntryNames." + (i + 1) , fullNatEntryNamess.get(i));
			}
		}	
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
		if(natGatewayId != null){
			putQueryParameter("NatGatewayId", natGatewayId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getNatIp() {
		return this.natIp;
	}

	public void setNatIp(String natIp) {
		this.natIp = natIp;
		if(natIp != null){
			putQueryParameter("NatIp", natIp);
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
	public Class<ListFullNatEntriesResponse> getResponseClass() {
		return ListFullNatEntriesResponse.class;
	}

}
