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
public class ValidateDnsGtmCnameRrCanUseRequest extends RpcAcsRequest<ValidateDnsGtmCnameRrCanUseResponse> {
	   

	private String cnameMode;

	private String cnameZone;

	private String cnameRr;

	private String cnameType;

	private String instanceId;

	private String lang;
	public ValidateDnsGtmCnameRrCanUseRequest() {
		super("Alidns", "2015-01-09", "ValidateDnsGtmCnameRrCanUse", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCnameMode() {
		return this.cnameMode;
	}

	public void setCnameMode(String cnameMode) {
		this.cnameMode = cnameMode;
		if(cnameMode != null){
			putQueryParameter("CnameMode", cnameMode);
		}
	}

	public String getCnameZone() {
		return this.cnameZone;
	}

	public void setCnameZone(String cnameZone) {
		this.cnameZone = cnameZone;
		if(cnameZone != null){
			putQueryParameter("CnameZone", cnameZone);
		}
	}

	public String getCnameRr() {
		return this.cnameRr;
	}

	public void setCnameRr(String cnameRr) {
		this.cnameRr = cnameRr;
		if(cnameRr != null){
			putQueryParameter("CnameRr", cnameRr);
		}
	}

	public String getCnameType() {
		return this.cnameType;
	}

	public void setCnameType(String cnameType) {
		this.cnameType = cnameType;
		if(cnameType != null){
			putQueryParameter("CnameType", cnameType);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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
	public Class<ValidateDnsGtmCnameRrCanUseResponse> getResponseClass() {
		return ValidateDnsGtmCnameRrCanUseResponse.class;
	}

}
