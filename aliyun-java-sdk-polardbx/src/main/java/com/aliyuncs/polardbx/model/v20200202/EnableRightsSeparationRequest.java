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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardbx.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableRightsSeparationRequest extends RpcAcsRequest<EnableRightsSeparationResponse> {
	   

	private String securityAccountPassword;

	private String securityAccountDescription;

	private String auditAccountPassword;

	private String dBInstanceName;

	private String securityAccountName;

	private String auditAccountName;

	private String auditAccountDescription;
	public EnableRightsSeparationRequest() {
		super("polardbx", "2020-02-02", "EnableRightsSeparation", "polardbx");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSecurityAccountPassword() {
		return this.securityAccountPassword;
	}

	public void setSecurityAccountPassword(String securityAccountPassword) {
		this.securityAccountPassword = securityAccountPassword;
		if(securityAccountPassword != null){
			putQueryParameter("SecurityAccountPassword", securityAccountPassword);
		}
	}

	public String getSecurityAccountDescription() {
		return this.securityAccountDescription;
	}

	public void setSecurityAccountDescription(String securityAccountDescription) {
		this.securityAccountDescription = securityAccountDescription;
		if(securityAccountDescription != null){
			putQueryParameter("SecurityAccountDescription", securityAccountDescription);
		}
	}

	public String getAuditAccountPassword() {
		return this.auditAccountPassword;
	}

	public void setAuditAccountPassword(String auditAccountPassword) {
		this.auditAccountPassword = auditAccountPassword;
		if(auditAccountPassword != null){
			putQueryParameter("AuditAccountPassword", auditAccountPassword);
		}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getSecurityAccountName() {
		return this.securityAccountName;
	}

	public void setSecurityAccountName(String securityAccountName) {
		this.securityAccountName = securityAccountName;
		if(securityAccountName != null){
			putQueryParameter("SecurityAccountName", securityAccountName);
		}
	}

	public String getAuditAccountName() {
		return this.auditAccountName;
	}

	public void setAuditAccountName(String auditAccountName) {
		this.auditAccountName = auditAccountName;
		if(auditAccountName != null){
			putQueryParameter("AuditAccountName", auditAccountName);
		}
	}

	public String getAuditAccountDescription() {
		return this.auditAccountDescription;
	}

	public void setAuditAccountDescription(String auditAccountDescription) {
		this.auditAccountDescription = auditAccountDescription;
		if(auditAccountDescription != null){
			putQueryParameter("AuditAccountDescription", auditAccountDescription);
		}
	}

	@Override
	public Class<EnableRightsSeparationResponse> getResponseClass() {
		return EnableRightsSeparationResponse.class;
	}

}
