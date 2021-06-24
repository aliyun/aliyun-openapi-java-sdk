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
public class OpsForceNcDownRequest extends RpcAcsRequest<OpsForceNcDownResponse> {
	   

	private String operator;

	private String sn;

	private String detectFrom;

	private String ip;

	private String workOrderId;

	private String auditParamStr;
	public OpsForceNcDownRequest() {
		super("Ecsops", "2016-04-01", "OpsForceNcDown", "ecsops");
		setMethod(MethodType.POST);
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

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
		if(sn != null){
			putQueryParameter("Sn", sn);
		}
	}

	public String getDetectFrom() {
		return this.detectFrom;
	}

	public void setDetectFrom(String detectFrom) {
		this.detectFrom = detectFrom;
		if(detectFrom != null){
			putQueryParameter("DetectFrom", detectFrom);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public String getWorkOrderId() {
		return this.workOrderId;
	}

	public void setWorkOrderId(String workOrderId) {
		this.workOrderId = workOrderId;
		if(workOrderId != null){
			putQueryParameter("WorkOrderId", workOrderId);
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
	public Class<OpsForceNcDownResponse> getResponseClass() {
		return OpsForceNcDownResponse.class;
	}

}
