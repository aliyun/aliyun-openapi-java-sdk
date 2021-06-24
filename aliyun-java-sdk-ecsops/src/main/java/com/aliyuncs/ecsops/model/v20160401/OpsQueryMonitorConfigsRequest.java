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
public class OpsQueryMonitorConfigsRequest extends RpcAcsRequest<OpsQueryMonitorConfigsResponse> {
	   

	private String monitorItem;

	private String monitorResultFile;

	private String auditParamStr;
	public OpsQueryMonitorConfigsRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryMonitorConfigs", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getMonitorItem() {
		return this.monitorItem;
	}

	public void setMonitorItem(String monitorItem) {
		this.monitorItem = monitorItem;
		if(monitorItem != null){
			putQueryParameter("MonitorItem", monitorItem);
		}
	}

	public String getMonitorResultFile() {
		return this.monitorResultFile;
	}

	public void setMonitorResultFile(String monitorResultFile) {
		this.monitorResultFile = monitorResultFile;
		if(monitorResultFile != null){
			putQueryParameter("MonitorResultFile", monitorResultFile);
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
	public Class<OpsQueryMonitorConfigsResponse> getResponseClass() {
		return OpsQueryMonitorConfigsResponse.class;
	}

}
