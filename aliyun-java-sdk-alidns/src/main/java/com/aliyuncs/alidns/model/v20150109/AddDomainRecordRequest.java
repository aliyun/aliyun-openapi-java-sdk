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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddDomainRecordRequest extends RpcAcsRequest<AddDomainRecordResponse> {
	   

	private String rR;

	private String line;

	private String type;

	private String lang;

	private String value;

	private String domainName;

	private Long priority;

	private Long tTL;

	private String userClientIp;
	public AddDomainRecordRequest() {
		super("Alidns", "2015-01-09", "AddDomainRecord", "Alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRR() {
		return this.rR;
	}

	public void setRR(String rR) {
		this.rR = rR;
		if(rR != null){
			putQueryParameter("RR", rR);
		}
	}

	public String getLine() {
		return this.line;
	}

	public void setLine(String line) {
		this.line = line;
		if(line != null){
			putQueryParameter("Line", line);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
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

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public Long getTTL() {
		return this.tTL;
	}

	public void setTTL(Long tTL) {
		this.tTL = tTL;
		if(tTL != null){
			putQueryParameter("TTL", tTL.toString());
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
	public Class<AddDomainRecordResponse> getResponseClass() {
		return AddDomainRecordResponse.class;
	}

}
