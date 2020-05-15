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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCenRouteMapRequest extends RpcAcsRequest<CreateCenRouteMapResponse> {
	   

	private Long resourceOwnerId;

	private String communityMatchMode;

	private String mapResult;

	private Integer nextPriority;

	private List<String> destinationCidrBlockss;

	private List<String> sourceInstanceIdss;

	private List<String> sourceRegionIdss;

	private List<Long> matchAsnss;

	private Integer preference;

	private Long ownerId;

	private Integer priority;

	private List<String> destinationChildInstanceTypess;

	private List<String> sourceRouteTableIdss;

	private List<String> sourceChildInstanceTypess;

	private String communityOperateMode;

	private List<String> operateCommunitySets;

	private List<String> routeTypess;

	private String cidrMatchMode;

	private String cenId;

	private String description;

	private Boolean sourceInstanceIdsReverseMatch;

	private List<String> destinationRouteTableIdss;

	private String transmitDirection;

	private List<String> destinationInstanceIdss;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Boolean destinationInstanceIdsReverseMatch;

	private List<Long> prependAsPaths;

	private String asPathMatchMode;

	private List<String> matchCommunitySets;

	private String cenRegionId;
	public CreateCenRouteMapRequest() {
		super("Cbn", "2017-09-12", "CreateCenRouteMap", "Cbn");
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

	public String getCommunityMatchMode() {
		return this.communityMatchMode;
	}

	public void setCommunityMatchMode(String communityMatchMode) {
		this.communityMatchMode = communityMatchMode;
		if(communityMatchMode != null){
			putQueryParameter("CommunityMatchMode", communityMatchMode);
		}
	}

	public String getMapResult() {
		return this.mapResult;
	}

	public void setMapResult(String mapResult) {
		this.mapResult = mapResult;
		if(mapResult != null){
			putQueryParameter("MapResult", mapResult);
		}
	}

	public Integer getNextPriority() {
		return this.nextPriority;
	}

	public void setNextPriority(Integer nextPriority) {
		this.nextPriority = nextPriority;
		if(nextPriority != null){
			putQueryParameter("NextPriority", nextPriority.toString());
		}
	}

	public List<String> getDestinationCidrBlockss() {
		return this.destinationCidrBlockss;
	}

	public void setDestinationCidrBlockss(List<String> destinationCidrBlockss) {
		this.destinationCidrBlockss = destinationCidrBlockss;	
		if (destinationCidrBlockss != null) {
			for (int i = 0; i < destinationCidrBlockss.size(); i++) {
				putQueryParameter("DestinationCidrBlocks." + (i + 1) , destinationCidrBlockss.get(i));
			}
		}	
	}

	public List<String> getSourceInstanceIdss() {
		return this.sourceInstanceIdss;
	}

	public void setSourceInstanceIdss(List<String> sourceInstanceIdss) {
		this.sourceInstanceIdss = sourceInstanceIdss;	
		if (sourceInstanceIdss != null) {
			for (int i = 0; i < sourceInstanceIdss.size(); i++) {
				putQueryParameter("SourceInstanceIds." + (i + 1) , sourceInstanceIdss.get(i));
			}
		}	
	}

	public List<String> getSourceRegionIdss() {
		return this.sourceRegionIdss;
	}

	public void setSourceRegionIdss(List<String> sourceRegionIdss) {
		this.sourceRegionIdss = sourceRegionIdss;	
		if (sourceRegionIdss != null) {
			for (int i = 0; i < sourceRegionIdss.size(); i++) {
				putQueryParameter("SourceRegionIds." + (i + 1) , sourceRegionIdss.get(i));
			}
		}	
	}

	public List<Long> getMatchAsnss() {
		return this.matchAsnss;
	}

	public void setMatchAsnss(List<Long> matchAsnss) {
		this.matchAsnss = matchAsnss;	
		if (matchAsnss != null) {
			for (int i = 0; i < matchAsnss.size(); i++) {
				putQueryParameter("MatchAsns." + (i + 1) , matchAsnss.get(i));
			}
		}	
	}

	public Integer getPreference() {
		return this.preference;
	}

	public void setPreference(Integer preference) {
		this.preference = preference;
		if(preference != null){
			putQueryParameter("Preference", preference.toString());
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public List<String> getDestinationChildInstanceTypess() {
		return this.destinationChildInstanceTypess;
	}

	public void setDestinationChildInstanceTypess(List<String> destinationChildInstanceTypess) {
		this.destinationChildInstanceTypess = destinationChildInstanceTypess;	
		if (destinationChildInstanceTypess != null) {
			for (int i = 0; i < destinationChildInstanceTypess.size(); i++) {
				putQueryParameter("DestinationChildInstanceTypes." + (i + 1) , destinationChildInstanceTypess.get(i));
			}
		}	
	}

	public List<String> getSourceRouteTableIdss() {
		return this.sourceRouteTableIdss;
	}

	public void setSourceRouteTableIdss(List<String> sourceRouteTableIdss) {
		this.sourceRouteTableIdss = sourceRouteTableIdss;	
		if (sourceRouteTableIdss != null) {
			for (int i = 0; i < sourceRouteTableIdss.size(); i++) {
				putQueryParameter("SourceRouteTableIds." + (i + 1) , sourceRouteTableIdss.get(i));
			}
		}	
	}

	public List<String> getSourceChildInstanceTypess() {
		return this.sourceChildInstanceTypess;
	}

	public void setSourceChildInstanceTypess(List<String> sourceChildInstanceTypess) {
		this.sourceChildInstanceTypess = sourceChildInstanceTypess;	
		if (sourceChildInstanceTypess != null) {
			for (int i = 0; i < sourceChildInstanceTypess.size(); i++) {
				putQueryParameter("SourceChildInstanceTypes." + (i + 1) , sourceChildInstanceTypess.get(i));
			}
		}	
	}

	public String getCommunityOperateMode() {
		return this.communityOperateMode;
	}

	public void setCommunityOperateMode(String communityOperateMode) {
		this.communityOperateMode = communityOperateMode;
		if(communityOperateMode != null){
			putQueryParameter("CommunityOperateMode", communityOperateMode);
		}
	}

	public List<String> getOperateCommunitySets() {
		return this.operateCommunitySets;
	}

	public void setOperateCommunitySets(List<String> operateCommunitySets) {
		this.operateCommunitySets = operateCommunitySets;	
		if (operateCommunitySets != null) {
			for (int i = 0; i < operateCommunitySets.size(); i++) {
				putQueryParameter("OperateCommunitySet." + (i + 1) , operateCommunitySets.get(i));
			}
		}	
	}

	public List<String> getRouteTypess() {
		return this.routeTypess;
	}

	public void setRouteTypess(List<String> routeTypess) {
		this.routeTypess = routeTypess;	
		if (routeTypess != null) {
			for (int i = 0; i < routeTypess.size(); i++) {
				putQueryParameter("RouteTypes." + (i + 1) , routeTypess.get(i));
			}
		}	
	}

	public String getCidrMatchMode() {
		return this.cidrMatchMode;
	}

	public void setCidrMatchMode(String cidrMatchMode) {
		this.cidrMatchMode = cidrMatchMode;
		if(cidrMatchMode != null){
			putQueryParameter("CidrMatchMode", cidrMatchMode);
		}
	}

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Boolean getSourceInstanceIdsReverseMatch() {
		return this.sourceInstanceIdsReverseMatch;
	}

	public void setSourceInstanceIdsReverseMatch(Boolean sourceInstanceIdsReverseMatch) {
		this.sourceInstanceIdsReverseMatch = sourceInstanceIdsReverseMatch;
		if(sourceInstanceIdsReverseMatch != null){
			putQueryParameter("SourceInstanceIdsReverseMatch", sourceInstanceIdsReverseMatch.toString());
		}
	}

	public List<String> getDestinationRouteTableIdss() {
		return this.destinationRouteTableIdss;
	}

	public void setDestinationRouteTableIdss(List<String> destinationRouteTableIdss) {
		this.destinationRouteTableIdss = destinationRouteTableIdss;	
		if (destinationRouteTableIdss != null) {
			for (int i = 0; i < destinationRouteTableIdss.size(); i++) {
				putQueryParameter("DestinationRouteTableIds." + (i + 1) , destinationRouteTableIdss.get(i));
			}
		}	
	}

	public String getTransmitDirection() {
		return this.transmitDirection;
	}

	public void setTransmitDirection(String transmitDirection) {
		this.transmitDirection = transmitDirection;
		if(transmitDirection != null){
			putQueryParameter("TransmitDirection", transmitDirection);
		}
	}

	public List<String> getDestinationInstanceIdss() {
		return this.destinationInstanceIdss;
	}

	public void setDestinationInstanceIdss(List<String> destinationInstanceIdss) {
		this.destinationInstanceIdss = destinationInstanceIdss;	
		if (destinationInstanceIdss != null) {
			for (int i = 0; i < destinationInstanceIdss.size(); i++) {
				putQueryParameter("DestinationInstanceIds." + (i + 1) , destinationInstanceIdss.get(i));
			}
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

	public Boolean getDestinationInstanceIdsReverseMatch() {
		return this.destinationInstanceIdsReverseMatch;
	}

	public void setDestinationInstanceIdsReverseMatch(Boolean destinationInstanceIdsReverseMatch) {
		this.destinationInstanceIdsReverseMatch = destinationInstanceIdsReverseMatch;
		if(destinationInstanceIdsReverseMatch != null){
			putQueryParameter("DestinationInstanceIdsReverseMatch", destinationInstanceIdsReverseMatch.toString());
		}
	}

	public List<Long> getPrependAsPaths() {
		return this.prependAsPaths;
	}

	public void setPrependAsPaths(List<Long> prependAsPaths) {
		this.prependAsPaths = prependAsPaths;	
		if (prependAsPaths != null) {
			for (int i = 0; i < prependAsPaths.size(); i++) {
				putQueryParameter("PrependAsPath." + (i + 1) , prependAsPaths.get(i));
			}
		}	
	}

	public String getAsPathMatchMode() {
		return this.asPathMatchMode;
	}

	public void setAsPathMatchMode(String asPathMatchMode) {
		this.asPathMatchMode = asPathMatchMode;
		if(asPathMatchMode != null){
			putQueryParameter("AsPathMatchMode", asPathMatchMode);
		}
	}

	public List<String> getMatchCommunitySets() {
		return this.matchCommunitySets;
	}

	public void setMatchCommunitySets(List<String> matchCommunitySets) {
		this.matchCommunitySets = matchCommunitySets;	
		if (matchCommunitySets != null) {
			for (int i = 0; i < matchCommunitySets.size(); i++) {
				putQueryParameter("MatchCommunitySet." + (i + 1) , matchCommunitySets.get(i));
			}
		}	
	}

	public String getCenRegionId() {
		return this.cenRegionId;
	}

	public void setCenRegionId(String cenRegionId) {
		this.cenRegionId = cenRegionId;
		if(cenRegionId != null){
			putQueryParameter("CenRegionId", cenRegionId);
		}
	}

	@Override
	public Class<CreateCenRouteMapResponse> getResponseClass() {
		return CreateCenRouteMapResponse.class;
	}

}
