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

package com.aliyuncs.domain_intl.model.v20171218;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class QueryRegistrantProfileRealNameVerificationInfoRequest extends RpcAcsRequest<QueryRegistrantProfileRealNameVerificationInfoResponse> {
	
	public QueryRegistrantProfileRealNameVerificationInfoRequest() {
		super("Domain-intl", "2017-12-18", "QueryRegistrantProfileRealNameVerificationInfo", "domain");
	}

	private Boolean fetchImage;

	private String userClientIp;

	private Long registrantProfileId;

	private String lang;

	public Boolean getFetchImage() {
		return this.fetchImage;
	}

	public void setFetchImage(Boolean fetchImage) {
		this.fetchImage = fetchImage;
		if(fetchImage != null){
			putQueryParameter("FetchImage", fetchImage.toString());
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

	public Long getRegistrantProfileId() {
		return this.registrantProfileId;
	}

	public void setRegistrantProfileId(Long registrantProfileId) {
		this.registrantProfileId = registrantProfileId;
		if(registrantProfileId != null){
			putQueryParameter("RegistrantProfileId", registrantProfileId.toString());
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
	public Class<QueryRegistrantProfileRealNameVerificationInfoResponse> getResponseClass() {
		return QueryRegistrantProfileRealNameVerificationInfoResponse.class;
	}

}
