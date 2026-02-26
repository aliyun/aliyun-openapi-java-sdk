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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopsRequest extends RpcAcsRequest<DescribeDesktopsResponse> {
	   

	private String officeSiteId;

	private String snapshotPolicyId;

	private String qosRuleId;

	private List<String> imageIds;

	private String desktopStatus;

	private String resourceGroupId;

	private String desktopGroupId;

	private String nextToken;

	private Boolean onlyDesktopGroup;

	private Boolean queryFotaUpdate;

	private String directoryId;

	private List<String> endUserIds;

	private List<String> desktopIds;

	private List<Tag> tags;

	private String desktopType;

	private List<String> desktopStatusLists;

	private String desktopName;

	private String groupId;

	private String officeSiteName;

	private List<String> excludedEndUserIds;

	private String gpuInstanceGroupId;

	private Boolean filterDesktopGroup;

	private String managementFlag;

	private String subPayType;

	private String expiredTime;

	private Integer maxResults;

	private Boolean fillResourceGroup;

	private List<String> osTypess;

	private String protocolType;

	private String chargeType;

	private String policyGroupId;

	private String userName;
	public DescribeDesktopsRequest() {
		super("ecd", "2020-09-30", "DescribeDesktops", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOfficeSiteId() {
		return this.officeSiteId;
	}

	public void setOfficeSiteId(String officeSiteId) {
		this.officeSiteId = officeSiteId;
		if(officeSiteId != null){
			putQueryParameter("OfficeSiteId", officeSiteId);
		}
	}

	public String getSnapshotPolicyId() {
		return this.snapshotPolicyId;
	}

	public void setSnapshotPolicyId(String snapshotPolicyId) {
		this.snapshotPolicyId = snapshotPolicyId;
		if(snapshotPolicyId != null){
			putQueryParameter("SnapshotPolicyId", snapshotPolicyId);
		}
	}

	public String getQosRuleId() {
		return this.qosRuleId;
	}

	public void setQosRuleId(String qosRuleId) {
		this.qosRuleId = qosRuleId;
		if(qosRuleId != null){
			putQueryParameter("QosRuleId", qosRuleId);
		}
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public String getDesktopStatus() {
		return this.desktopStatus;
	}

	public void setDesktopStatus(String desktopStatus) {
		this.desktopStatus = desktopStatus;
		if(desktopStatus != null){
			putQueryParameter("DesktopStatus", desktopStatus);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
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

	public Boolean getOnlyDesktopGroup() {
		return this.onlyDesktopGroup;
	}

	public void setOnlyDesktopGroup(Boolean onlyDesktopGroup) {
		this.onlyDesktopGroup = onlyDesktopGroup;
		if(onlyDesktopGroup != null){
			putQueryParameter("OnlyDesktopGroup", onlyDesktopGroup.toString());
		}
	}

	public Boolean getQueryFotaUpdate() {
		return this.queryFotaUpdate;
	}

	public void setQueryFotaUpdate(Boolean queryFotaUpdate) {
		this.queryFotaUpdate = queryFotaUpdate;
		if(queryFotaUpdate != null){
			putQueryParameter("QueryFotaUpdate", queryFotaUpdate.toString());
		}
	}

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	public List<String> getEndUserIds() {
		return this.endUserIds;
	}

	public void setEndUserIds(List<String> endUserIds) {
		this.endUserIds = endUserIds;	
		if (endUserIds != null) {
			for (int i = 0; i < endUserIds.size(); i++) {
				putQueryParameter("EndUserId." + (i + 1) , endUserIds.get(i));
			}
		}	
	}

	public List<String> getDesktopIds() {
		return this.desktopIds;
	}

	public void setDesktopIds(List<String> desktopIds) {
		this.desktopIds = desktopIds;	
		if (desktopIds != null) {
			for (int i = 0; i < desktopIds.size(); i++) {
				putQueryParameter("DesktopId." + (i + 1) , desktopIds.get(i));
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

	public String getDesktopType() {
		return this.desktopType;
	}

	public void setDesktopType(String desktopType) {
		this.desktopType = desktopType;
		if(desktopType != null){
			putQueryParameter("DesktopType", desktopType);
		}
	}

	public List<String> getDesktopStatusLists() {
		return this.desktopStatusLists;
	}

	public void setDesktopStatusLists(List<String> desktopStatusLists) {
		this.desktopStatusLists = desktopStatusLists;	
		if (desktopStatusLists != null) {
			for (int i = 0; i < desktopStatusLists.size(); i++) {
				putQueryParameter("DesktopStatusList." + (i + 1) , desktopStatusLists.get(i));
			}
		}	
	}

	public String getDesktopName() {
		return this.desktopName;
	}

	public void setDesktopName(String desktopName) {
		this.desktopName = desktopName;
		if(desktopName != null){
			putQueryParameter("DesktopName", desktopName);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getOfficeSiteName() {
		return this.officeSiteName;
	}

	public void setOfficeSiteName(String officeSiteName) {
		this.officeSiteName = officeSiteName;
		if(officeSiteName != null){
			putQueryParameter("OfficeSiteName", officeSiteName);
		}
	}

	public List<String> getExcludedEndUserIds() {
		return this.excludedEndUserIds;
	}

	public void setExcludedEndUserIds(List<String> excludedEndUserIds) {
		this.excludedEndUserIds = excludedEndUserIds;	
		if (excludedEndUserIds != null) {
			for (int i = 0; i < excludedEndUserIds.size(); i++) {
				putQueryParameter("ExcludedEndUserId." + (i + 1) , excludedEndUserIds.get(i));
			}
		}	
	}

	public String getGpuInstanceGroupId() {
		return this.gpuInstanceGroupId;
	}

	public void setGpuInstanceGroupId(String gpuInstanceGroupId) {
		this.gpuInstanceGroupId = gpuInstanceGroupId;
		if(gpuInstanceGroupId != null){
			putQueryParameter("GpuInstanceGroupId", gpuInstanceGroupId);
		}
	}

	public Boolean getFilterDesktopGroup() {
		return this.filterDesktopGroup;
	}

	public void setFilterDesktopGroup(Boolean filterDesktopGroup) {
		this.filterDesktopGroup = filterDesktopGroup;
		if(filterDesktopGroup != null){
			putQueryParameter("FilterDesktopGroup", filterDesktopGroup.toString());
		}
	}

	public String getManagementFlag() {
		return this.managementFlag;
	}

	public void setManagementFlag(String managementFlag) {
		this.managementFlag = managementFlag;
		if(managementFlag != null){
			putQueryParameter("ManagementFlag", managementFlag);
		}
	}

	public String getSubPayType() {
		return this.subPayType;
	}

	public void setSubPayType(String subPayType) {
		this.subPayType = subPayType;
		if(subPayType != null){
			putQueryParameter("SubPayType", subPayType);
		}
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
		if(expiredTime != null){
			putQueryParameter("ExpiredTime", expiredTime);
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

	public Boolean getFillResourceGroup() {
		return this.fillResourceGroup;
	}

	public void setFillResourceGroup(Boolean fillResourceGroup) {
		this.fillResourceGroup = fillResourceGroup;
		if(fillResourceGroup != null){
			putQueryParameter("FillResourceGroup", fillResourceGroup.toString());
		}
	}

	public List<String> getOsTypess() {
		return this.osTypess;
	}

	public void setOsTypess(List<String> osTypess) {
		this.osTypess = osTypess;	
		if (osTypess != null) {
			for (int i = 0; i < osTypess.size(); i++) {
				putQueryParameter("OsTypes." + (i + 1) , osTypess.get(i));
			}
		}	
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getPolicyGroupId() {
		return this.policyGroupId;
	}

	public void setPolicyGroupId(String policyGroupId) {
		this.policyGroupId = policyGroupId;
		if(policyGroupId != null){
			putQueryParameter("PolicyGroupId", policyGroupId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
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
	public Class<DescribeDesktopsResponse> getResponseClass() {
		return DescribeDesktopsResponse.class;
	}

}
