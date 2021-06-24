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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsSreCreateOwnerAppRequest extends RpcAcsRequest<OpsSreCreateOwnerAppResponse> {
	   

	private String ownerAppTagName;

	private String ownerApp;

	private String auditParamStr;
	public OpsSreCreateOwnerAppRequest() {
		super("Ecsops", "2016-04-01", "OpsSreCreateOwnerApp", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getOwnerAppTagName() {
		return this.ownerAppTagName;
	}

	public void setOwnerAppTagName(String ownerAppTagName) {
		this.ownerAppTagName = ownerAppTagName;
		if(ownerAppTagName != null){
			putQueryParameter("OwnerAppTagName", ownerAppTagName);
		}
	}

	public String getOwnerApp() {
		return this.ownerApp;
	}

	public void setOwnerApp(String ownerApp) {
		this.ownerApp = ownerApp;
		if(ownerApp != null){
			putQueryParameter("OwnerApp", ownerApp);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsSreCreateOwnerAppResponse> getResponseClass() {
		return OpsSreCreateOwnerAppResponse.class;
	}

}
