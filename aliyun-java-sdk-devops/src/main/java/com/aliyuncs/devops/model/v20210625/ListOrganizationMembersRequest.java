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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListOrganizationMembersRequest extends RoaAcsRequest<ListOrganizationMembersResponse> {
	   

	private String externUid;

	private String organizationId;

	private String organizationMemberName;

	private Long joinTimeFrom;

	private String provider;

	private String nextToken;

	private Long joinTimeTo;

	private Long maxResults;

	private String state;

	private Boolean containsExternInfo;
	public ListOrganizationMembersRequest() {
		super("devops", "2021-06-25", "ListOrganizationMembers");
		setUriPattern("/organization/[organizationId]/members");
		setMethod(MethodType.GET);
	}

	public String getExternUid() {
		return this.externUid;
	}

	public void setExternUid(String externUid) {
		this.externUid = externUid;
		if(externUid != null){
			putQueryParameter("externUid", externUid);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getOrganizationMemberName() {
		return this.organizationMemberName;
	}

	public void setOrganizationMemberName(String organizationMemberName) {
		this.organizationMemberName = organizationMemberName;
		if(organizationMemberName != null){
			putQueryParameter("organizationMemberName", organizationMemberName);
		}
	}

	public Long getJoinTimeFrom() {
		return this.joinTimeFrom;
	}

	public void setJoinTimeFrom(Long joinTimeFrom) {
		this.joinTimeFrom = joinTimeFrom;
		if(joinTimeFrom != null){
			putQueryParameter("joinTimeFrom", joinTimeFrom.toString());
		}
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
		if(provider != null){
			putQueryParameter("provider", provider);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("nextToken", nextToken);
		}
	}

	public Long getJoinTimeTo() {
		return this.joinTimeTo;
	}

	public void setJoinTimeTo(Long joinTimeTo) {
		this.joinTimeTo = joinTimeTo;
		if(joinTimeTo != null){
			putQueryParameter("joinTimeTo", joinTimeTo.toString());
		}
	}

	public Long getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Long maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("maxResults", maxResults.toString());
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("state", state);
		}
	}

	public Boolean getContainsExternInfo() {
		return this.containsExternInfo;
	}

	public void setContainsExternInfo(Boolean containsExternInfo) {
		this.containsExternInfo = containsExternInfo;
		if(containsExternInfo != null){
			putQueryParameter("containsExternInfo", containsExternInfo.toString());
		}
	}

	@Override
	public Class<ListOrganizationMembersResponse> getResponseClass() {
		return ListOrganizationMembersResponse.class;
	}

}
