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
public class QueryRegistrantProfilesRequest extends RpcAcsRequest<QueryRegistrantProfilesResponse> {
	   

	private Long registrantProfileId;

	private Integer pageNum;

	private Integer pageSize;

	private String realNameStatus;

	private String lang;

	private String email;

	private String zhRegistrantOrganization;

	private String registrantType;

	private String registrantProfileType;

	private Boolean defaultRegistrantProfile;

	private String registrantOrganization;

	private String userClientIp;
	public QueryRegistrantProfilesRequest() {
		super("Domain", "2018-01-29", "QueryRegistrantProfiles");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getRegistrantProfileId() {
		return this.registrantProfileId;
	}

	public void setRegistrantProfileId(Long registrantProfileId) {
		this.registrantProfileId = registrantProfileId;
		if(registrantProfileId != null){
			putQueryParameter("RegistrantProfileId", registrantProfileId.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getRealNameStatus() {
		return this.realNameStatus;
	}

	public void setRealNameStatus(String realNameStatus) {
		this.realNameStatus = realNameStatus;
		if(realNameStatus != null){
			putQueryParameter("RealNameStatus", realNameStatus);
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getZhRegistrantOrganization() {
		return this.zhRegistrantOrganization;
	}

	public void setZhRegistrantOrganization(String zhRegistrantOrganization) {
		this.zhRegistrantOrganization = zhRegistrantOrganization;
		if(zhRegistrantOrganization != null){
			putQueryParameter("ZhRegistrantOrganization", zhRegistrantOrganization);
		}
	}

	public String getRegistrantType() {
		return this.registrantType;
	}

	public void setRegistrantType(String registrantType) {
		this.registrantType = registrantType;
		if(registrantType != null){
			putQueryParameter("RegistrantType", registrantType);
		}
	}

	public String getRegistrantProfileType() {
		return this.registrantProfileType;
	}

	public void setRegistrantProfileType(String registrantProfileType) {
		this.registrantProfileType = registrantProfileType;
		if(registrantProfileType != null){
			putQueryParameter("RegistrantProfileType", registrantProfileType);
		}
	}

	public Boolean getDefaultRegistrantProfile() {
		return this.defaultRegistrantProfile;
	}

	public void setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
		this.defaultRegistrantProfile = defaultRegistrantProfile;
		if(defaultRegistrantProfile != null){
			putQueryParameter("DefaultRegistrantProfile", defaultRegistrantProfile.toString());
		}
	}

	public String getRegistrantOrganization() {
		return this.registrantOrganization;
	}

	public void setRegistrantOrganization(String registrantOrganization) {
		this.registrantOrganization = registrantOrganization;
		if(registrantOrganization != null){
			putQueryParameter("RegistrantOrganization", registrantOrganization);
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

	@Override
	public Class<QueryRegistrantProfilesResponse> getResponseClass() {
		return QueryRegistrantProfilesResponse.class;
	}

}
