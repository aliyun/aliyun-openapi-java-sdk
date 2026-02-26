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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDomainGroupListRequest extends RpcAcsRequest<QueryDomainGroupListResponse> {
	   

	private Boolean showDeletingGroup;

	private String userClientIp;

	private String domainGroupName;

	private String lang;
	public QueryDomainGroupListRequest() {
		super("Domain", "2018-01-29", "QueryDomainGroupList", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getShowDeletingGroup() {
		return this.showDeletingGroup;
	}

	public void setShowDeletingGroup(Boolean showDeletingGroup) {
		this.showDeletingGroup = showDeletingGroup;
		if(showDeletingGroup != null){
			putQueryParameter("ShowDeletingGroup", showDeletingGroup.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getDomainGroupName() {
		return this.domainGroupName;
	}

	public void setDomainGroupName(String domainGroupName) {
		this.domainGroupName = domainGroupName;
		if(domainGroupName != null){
			putQueryParameter("DomainGroupName", domainGroupName);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<QueryDomainGroupListResponse> getResponseClass() {
		return QueryDomainGroupListResponse.class;
	}

}
