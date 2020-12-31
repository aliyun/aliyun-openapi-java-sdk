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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveUserCreditRequest extends RpcAcsRequest<SaveUserCreditResponse> {
	   

	private Boolean avoidExpiration;

	private String description;

	private Boolean avoidPrepaidNotification;

	private Boolean avoidPrepaidExpiration;

	private Boolean avoidNotification;

	private String operator;

	private String creditValue;

	private String creditType;
	public SaveUserCreditRequest() {
		super("BssOpenApi", "2017-12-14", "SaveUserCredit");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAvoidExpiration() {
		return this.avoidExpiration;
	}

	public void setAvoidExpiration(Boolean avoidExpiration) {
		this.avoidExpiration = avoidExpiration;
		if(avoidExpiration != null){
			putQueryParameter("AvoidExpiration", avoidExpiration.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Boolean getAvoidPrepaidNotification() {
		return this.avoidPrepaidNotification;
	}

	public void setAvoidPrepaidNotification(Boolean avoidPrepaidNotification) {
		this.avoidPrepaidNotification = avoidPrepaidNotification;
		if(avoidPrepaidNotification != null){
			putQueryParameter("AvoidPrepaidNotification", avoidPrepaidNotification.toString());
		}
	}

	public Boolean getAvoidPrepaidExpiration() {
		return this.avoidPrepaidExpiration;
	}

	public void setAvoidPrepaidExpiration(Boolean avoidPrepaidExpiration) {
		this.avoidPrepaidExpiration = avoidPrepaidExpiration;
		if(avoidPrepaidExpiration != null){
			putQueryParameter("AvoidPrepaidExpiration", avoidPrepaidExpiration.toString());
		}
	}

	public Boolean getAvoidNotification() {
		return this.avoidNotification;
	}

	public void setAvoidNotification(Boolean avoidNotification) {
		this.avoidNotification = avoidNotification;
		if(avoidNotification != null){
			putQueryParameter("AvoidNotification", avoidNotification.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getCreditValue() {
		return this.creditValue;
	}

	public void setCreditValue(String creditValue) {
		this.creditValue = creditValue;
		if(creditValue != null){
			putQueryParameter("CreditValue", creditValue);
		}
	}

	public String getCreditType() {
		return this.creditType;
	}

	public void setCreditType(String creditType) {
		this.creditType = creditType;
		if(creditType != null){
			putQueryParameter("CreditType", creditType);
		}
	}

	@Override
	public Class<SaveUserCreditResponse> getResponseClass() {
		return SaveUserCreditResponse.class;
	}

}
