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
public class OpsQuerySeqStartEndConfigRequest extends RpcAcsRequest<OpsQuerySeqStartEndConfigResponse> {
	   

	private String impactEvent;

	private String auditParamStr;
	public OpsQuerySeqStartEndConfigRequest() {
		super("Ecsops", "2016-04-01", "OpsQuerySeqStartEndConfig", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getImpactEvent() {
		return this.impactEvent;
	}

	public void setImpactEvent(String impactEvent) {
		this.impactEvent = impactEvent;
		if(impactEvent != null){
			putQueryParameter("ImpactEvent", impactEvent);
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
	public Class<OpsQuerySeqStartEndConfigResponse> getResponseClass() {
		return OpsQuerySeqStartEndConfigResponse.class;
	}

}
