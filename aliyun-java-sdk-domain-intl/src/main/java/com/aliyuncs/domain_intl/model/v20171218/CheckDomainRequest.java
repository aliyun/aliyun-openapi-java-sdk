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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckDomainRequest extends RpcAcsRequest<CheckDomainResponse> {
	   

	private String domainName;

	private String feeCurrency;

	private Integer feePeriod;

	private String userClientIp;

	private String feeCommand;

	private String lang;
	public CheckDomainRequest() {
		super("Domain-intl", "2017-12-18", "CheckDomain");
		setMethod(MethodType.POST);
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getFeeCurrency() {
		return this.feeCurrency;
	}

	public void setFeeCurrency(String feeCurrency) {
		this.feeCurrency = feeCurrency;
		if(feeCurrency != null){
			putQueryParameter("FeeCurrency", feeCurrency);
		}
	}

	public Integer getFeePeriod() {
		return this.feePeriod;
	}

	public void setFeePeriod(Integer feePeriod) {
		this.feePeriod = feePeriod;
		if(feePeriod != null){
			putQueryParameter("FeePeriod", feePeriod.toString());
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

	public String getFeeCommand() {
		return this.feeCommand;
	}

	public void setFeeCommand(String feeCommand) {
		this.feeCommand = feeCommand;
		if(feeCommand != null){
			putQueryParameter("FeeCommand", feeCommand);
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
	public Class<CheckDomainResponse> getResponseClass() {
		return CheckDomainResponse.class;
	}

}
