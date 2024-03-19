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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.expressconnectrouter.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateExpressConnectRouterAssociationRequest extends RpcAcsRequest<CreateExpressConnectRouterAssociationResponse> {
	   

	private Long vpcOwnerId;

	private String cenId;

	private String clientToken;

	private List<String> allowedPrefixess;

	private String ecrId;

	private String associationRegionId;

	private Long transitRouterOwnerId;

	private Boolean dryRun;

	private Boolean createAttachment;

	private String transitRouterId;

	private String vpcId;
	public CreateExpressConnectRouterAssociationRequest() {
		super("ExpressConnectRouter", "2023-09-01", "CreateExpressConnectRouterAssociation", "ecr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getVpcOwnerId() {
		return this.vpcOwnerId;
	}

	public void setVpcOwnerId(Long vpcOwnerId) {
		this.vpcOwnerId = vpcOwnerId;
		if(vpcOwnerId != null){
			putBodyParameter("VpcOwnerId", vpcOwnerId.toString());
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putBodyParameter("CenId", cenId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public List<String> getAllowedPrefixess() {
		return this.allowedPrefixess;
	}

	public void setAllowedPrefixess(List<String> allowedPrefixess) {
		this.allowedPrefixess = allowedPrefixess;	
		if (allowedPrefixess != null) {
			for (int i = 0; i < allowedPrefixess.size(); i++) {
				putBodyParameter("AllowedPrefixes." + (i + 1) , allowedPrefixess.get(i));
			}
		}	
	}

	public String getEcrId() {
		return this.ecrId;
	}

	public void setEcrId(String ecrId) {
		this.ecrId = ecrId;
		if(ecrId != null){
			putBodyParameter("EcrId", ecrId);
		}
	}

	public String getAssociationRegionId() {
		return this.associationRegionId;
	}

	public void setAssociationRegionId(String associationRegionId) {
		this.associationRegionId = associationRegionId;
		if(associationRegionId != null){
			putBodyParameter("AssociationRegionId", associationRegionId);
		}
	}

	public Long getTransitRouterOwnerId() {
		return this.transitRouterOwnerId;
	}

	public void setTransitRouterOwnerId(Long transitRouterOwnerId) {
		this.transitRouterOwnerId = transitRouterOwnerId;
		if(transitRouterOwnerId != null){
			putBodyParameter("TransitRouterOwnerId", transitRouterOwnerId.toString());
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public Boolean getCreateAttachment() {
		return this.createAttachment;
	}

	public void setCreateAttachment(Boolean createAttachment) {
		this.createAttachment = createAttachment;
		if(createAttachment != null){
			putBodyParameter("CreateAttachment", createAttachment.toString());
		}
	}

	public String getTransitRouterId() {
		return this.transitRouterId;
	}

	public void setTransitRouterId(String transitRouterId) {
		this.transitRouterId = transitRouterId;
		if(transitRouterId != null){
			putBodyParameter("TransitRouterId", transitRouterId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	@Override
	public Class<CreateExpressConnectRouterAssociationResponse> getResponseClass() {
		return CreateExpressConnectRouterAssociationResponse.class;
	}

}
