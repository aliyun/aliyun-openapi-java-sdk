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
public class DescribeCloudDriveGroupsRequest extends RpcAcsRequest<DescribeCloudDriveGroupsResponse> {
	   

	private String parentGroupId;

	private String groupType;

	private String driveType;

	private String nextToken;

	private String directoryId;

	private List<String> groupIds;

	private String directoryName;

	private String groupName;

	private String cdsId;

	private String driveStatus;

	private Integer maxResults;
	public DescribeCloudDriveGroupsRequest() {
		super("ecd", "2020-09-30", "DescribeCloudDriveGroups", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getParentGroupId() {
		return this.parentGroupId;
	}

	public void setParentGroupId(String parentGroupId) {
		this.parentGroupId = parentGroupId;
		if(parentGroupId != null){
			putQueryParameter("ParentGroupId", parentGroupId);
		}
	}

	public String getGroupType() {
		return this.groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
		if(groupType != null){
			putQueryParameter("GroupType", groupType);
		}
	}

	public String getDriveType() {
		return this.driveType;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
		if(driveType != null){
			putQueryParameter("DriveType", driveType);
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

	public String getDirectoryId() {
		return this.directoryId;
	}

	public void setDirectoryId(String directoryId) {
		this.directoryId = directoryId;
		if(directoryId != null){
			putQueryParameter("DirectoryId", directoryId);
		}
	}

	public List<String> getGroupIds() {
		return this.groupIds;
	}

	public void setGroupIds(List<String> groupIds) {
		this.groupIds = groupIds;	
		if (groupIds != null) {
			for (int i = 0; i < groupIds.size(); i++) {
				putQueryParameter("GroupId." + (i + 1) , groupIds.get(i));
			}
		}	
	}

	public String getDirectoryName() {
		return this.directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
		if(directoryName != null){
			putQueryParameter("DirectoryName", directoryName);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
		}
	}

	public String getDriveStatus() {
		return this.driveStatus;
	}

	public void setDriveStatus(String driveStatus) {
		this.driveStatus = driveStatus;
		if(driveStatus != null){
			putQueryParameter("DriveStatus", driveStatus);
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
	public Class<DescribeCloudDriveGroupsResponse> getResponseClass() {
		return DescribeCloudDriveGroupsResponse.class;
	}

}
