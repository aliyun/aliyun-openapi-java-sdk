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
public class ListVSwitchCidrReservationsRequest extends RpcAcsRequest<ListVSwitchCidrReservationsResponse> {
	   

	private Long resourceOwnerId;

	private String vSwitchCidrReservationType;

	private String nextToken;

	private List<String> vSwitchCidrReservationIdss;

	private String ipVersion;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<Tags> tagss;

	private String vSwitchId;

	private Long maxResults;
	public ListVSwitchCidrReservationsRequest() {
		super("Vpc", "2016-04-28", "ListVSwitchCidrReservations", "vpc");
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

	public String getVSwitchCidrReservationType() {
		return this.vSwitchCidrReservationType;
	}

	public void setVSwitchCidrReservationType(String vSwitchCidrReservationType) {
		this.vSwitchCidrReservationType = vSwitchCidrReservationType;
		if(vSwitchCidrReservationType != null){
			putQueryParameter("VSwitchCidrReservationType", vSwitchCidrReservationType);
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

	public List<String> getVSwitchCidrReservationIdss() {
		return this.vSwitchCidrReservationIdss;
	}

	public void setVSwitchCidrReservationIdss(List<String> vSwitchCidrReservationIdss) {
		this.vSwitchCidrReservationIdss = vSwitchCidrReservationIdss;	
		if (vSwitchCidrReservationIdss != null) {
			for (int i = 0; i < vSwitchCidrReservationIdss.size(); i++) {
				putQueryParameter("VSwitchCidrReservationIds." + (i + 1) , vSwitchCidrReservationIdss.get(i));
			}
		}	
	}

	public String getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
		if(ipVersion != null){
			putQueryParameter("IpVersion", ipVersion);
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

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
			}
		}	
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public static class Tags {

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
	public Class<ListVSwitchCidrReservationsResponse> getResponseClass() {
		return ListVSwitchCidrReservationsResponse.class;
	}

}
