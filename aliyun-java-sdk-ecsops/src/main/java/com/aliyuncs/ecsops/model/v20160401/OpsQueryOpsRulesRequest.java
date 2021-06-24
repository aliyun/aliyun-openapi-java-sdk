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
public class OpsQueryOpsRulesRequest extends RpcAcsRequest<OpsQueryOpsRulesResponse> {
	   

	private String opsActionName;

	private Integer fullInfo;

	private String logstore;

	private String auditParamStr;
	public OpsQueryOpsRulesRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryOpsRules", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getOpsActionName() {
		return this.opsActionName;
	}

	public void setOpsActionName(String opsActionName) {
		this.opsActionName = opsActionName;
		if(opsActionName != null){
			putQueryParameter("OpsActionName", opsActionName);
		}
	}

	public Integer getFullInfo() {
		return this.fullInfo;
	}

	public void setFullInfo(Integer fullInfo) {
		this.fullInfo = fullInfo;
		if(fullInfo != null){
			putQueryParameter("FullInfo", fullInfo.toString());
		}
	}

	public String getLogstore() {
		return this.logstore;
	}

	public void setLogstore(String logstore) {
		this.logstore = logstore;
		if(logstore != null){
			putQueryParameter("Logstore", logstore);
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
	public Class<OpsQueryOpsRulesResponse> getResponseClass() {
		return OpsQueryOpsRulesResponse.class;
	}

}
