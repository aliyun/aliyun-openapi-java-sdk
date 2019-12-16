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
public class ApplyPhysicalConnectionLOARequest extends RpcAcsRequest<ApplyPhysicalConnectionLOAResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String lineType;

	private String si;

	private String peerLocation;

	private String resourceOwnerAccount;

	private Integer bandwidth;

	private String ownerAccount;

	private String constructionTime;

	private Long ownerId;

	private String instanceId;

	private String companyName;

	private List<PMInfo> pMInfos;
	public ApplyPhysicalConnectionLOARequest() {
		super("Vpc", "2016-04-28", "ApplyPhysicalConnectionLOA", "Vpc");
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

	public String getLineType() {
		return this.lineType;
	}

	public void setLineType(String lineType) {
		this.lineType = lineType;
		if(lineType != null){
			putQueryParameter("LineType", lineType);
		}
	}

	public String getSi() {
		return this.si;
	}

	public void setSi(String si) {
		this.si = si;
		if(si != null){
			putQueryParameter("Si", si);
		}
	}

	public String getPeerLocation() {
		return this.peerLocation;
	}

	public void setPeerLocation(String peerLocation) {
		this.peerLocation = peerLocation;
		if(peerLocation != null){
			putQueryParameter("PeerLocation", peerLocation);
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

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
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

	public String getConstructionTime() {
		return this.constructionTime;
	}

	public void setConstructionTime(String constructionTime) {
		this.constructionTime = constructionTime;
		if(constructionTime != null){
			putQueryParameter("ConstructionTime", constructionTime);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
		if(companyName != null){
			putQueryParameter("CompanyName", companyName);
		}
	}

	public List<PMInfo> getPMInfos() {
		return this.pMInfos;
	}

	public void setPMInfos(List<PMInfo> pMInfos) {
		this.pMInfos = pMInfos;	
		if (pMInfos != null) {
			for (int depth1 = 0; depth1 < pMInfos.size(); depth1++) {
				putQueryParameter("PMInfo." + (depth1 + 1) + ".PMCertificateNo" , pMInfos.get(depth1).getPMCertificateNo());
				putQueryParameter("PMInfo." + (depth1 + 1) + ".PMName" , pMInfos.get(depth1).getPMName());
				putQueryParameter("PMInfo." + (depth1 + 1) + ".PMCertificateType" , pMInfos.get(depth1).getPMCertificateType());
				putQueryParameter("PMInfo." + (depth1 + 1) + ".PMContactInfo" , pMInfos.get(depth1).getPMContactInfo());
				putQueryParameter("PMInfo." + (depth1 + 1) + ".PMGender" , pMInfos.get(depth1).getPMGender());
			}
		}	
	}

	public static class PMInfo {

		private String pMCertificateNo;

		private String pMName;

		private String pMCertificateType;

		private String pMContactInfo;

		private String pMGender;

		public String getPMCertificateNo() {
			return this.pMCertificateNo;
		}

		public void setPMCertificateNo(String pMCertificateNo) {
			this.pMCertificateNo = pMCertificateNo;
		}

		public String getPMName() {
			return this.pMName;
		}

		public void setPMName(String pMName) {
			this.pMName = pMName;
		}

		public String getPMCertificateType() {
			return this.pMCertificateType;
		}

		public void setPMCertificateType(String pMCertificateType) {
			this.pMCertificateType = pMCertificateType;
		}

		public String getPMContactInfo() {
			return this.pMContactInfo;
		}

		public void setPMContactInfo(String pMContactInfo) {
			this.pMContactInfo = pMContactInfo;
		}

		public String getPMGender() {
			return this.pMGender;
		}

		public void setPMGender(String pMGender) {
			this.pMGender = pMGender;
		}
	}

	@Override
	public Class<ApplyPhysicalConnectionLOAResponse> getResponseClass() {
		return ApplyPhysicalConnectionLOAResponse.class;
	}

}
