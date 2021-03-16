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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryMonitorStoragesRequest extends RpcAcsRequest<OpsQueryMonitorStoragesResponse> {
	   

	private List<String> monitorResultFiles;

	private Boolean force;

	private String auditParamStr;
	public OpsQueryMonitorStoragesRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryMonitorStorages", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getMonitorResultFiles() {
		return this.monitorResultFiles;
	}

	public void setMonitorResultFiles(List<String> monitorResultFiles) {
		this.monitorResultFiles = monitorResultFiles;	
		if (monitorResultFiles != null) {
			for (int i = 0; i < monitorResultFiles.size(); i++) {
				putQueryParameter("MonitorResultFile." + (i + 1) , monitorResultFiles.get(i));
			}
		}	
	}

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
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
	public Class<OpsQueryMonitorStoragesResponse> getResponseClass() {
		return OpsQueryMonitorStoragesResponse.class;
	}

}
