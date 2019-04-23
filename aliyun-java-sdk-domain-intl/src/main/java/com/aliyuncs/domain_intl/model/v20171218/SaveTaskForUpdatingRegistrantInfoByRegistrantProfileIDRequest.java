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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest extends RpcAcsRequest<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse> {
	
	public SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDRequest() {
		super("Domain-intl", "2017-12-18", "SaveTaskForUpdatingRegistrantInfoByRegistrantProfileID", "domain");
	}

	private String userClientIp;

	private Long registrantProfileId;

	private List<String> domainNames;

	private Boolean transferOutProhibited;

	private String lang;

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

	public List<String> getDomainNames() {
		return this.domainNames;
	}

	public void setDomainNames(List<String> domainNames) {
		this.domainNames = domainNames;	
		if (domainNames != null) {
			for (int i = 0; i < domainNames.size(); i++) {
				putQueryParameter("DomainName." + (i + 1) , domainNames.get(i));
			}
		}	
	}

	public Boolean getTransferOutProhibited() {
		return this.transferOutProhibited;
	}

	public void setTransferOutProhibited(Boolean transferOutProhibited) {
		this.transferOutProhibited = transferOutProhibited;
		if(transferOutProhibited != null){
			putQueryParameter("TransferOutProhibited", transferOutProhibited.toString());
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
	public Class<SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse> getResponseClass() {
		return SaveTaskForUpdatingRegistrantInfoByRegistrantProfileIDResponse.class;
	}

}
