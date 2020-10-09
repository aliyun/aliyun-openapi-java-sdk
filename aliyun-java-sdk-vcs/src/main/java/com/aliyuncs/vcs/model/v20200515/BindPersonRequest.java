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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindPersonRequest extends RpcAcsRequest<BindPersonResponse> {
	   

	private String isvSubId;

	private String corpId;

	private String personMatchingRate;

	private Long profileId;

	private String personId;
	public BindPersonRequest() {
		super("Vcs", "2020-05-15", "BindPerson");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIsvSubId() {
		return this.isvSubId;
	}

	public void setIsvSubId(String isvSubId) {
		this.isvSubId = isvSubId;
		if(isvSubId != null){
			putBodyParameter("IsvSubId", isvSubId);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public String getPersonMatchingRate() {
		return this.personMatchingRate;
	}

	public void setPersonMatchingRate(String personMatchingRate) {
		this.personMatchingRate = personMatchingRate;
		if(personMatchingRate != null){
			putBodyParameter("PersonMatchingRate", personMatchingRate);
		}
	}

	public Long getProfileId() {
		return this.profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
		if(profileId != null){
			putBodyParameter("ProfileId", profileId.toString());
		}
	}

	public String getPersonId() {
		return this.personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
		if(personId != null){
			putBodyParameter("PersonId", personId);
		}
	}

	@Override
	public Class<BindPersonResponse> getResponseClass() {
		return BindPersonResponse.class;
	}

}
