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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsBlackListCurdAlarmCenterRequest extends RpcAcsRequest<OpsBlackListCurdAlarmCenterResponse> {
	   

	private Boolean useBpms;

	private String dataType;

	private String blacklistOpsParam;

	private String operateType;

	private String staffId;

	private String auditParamStr;
	public OpsBlackListCurdAlarmCenterRequest() {
		super("Ecsops", "2016-04-01", "OpsBlackListCurdAlarmCenter", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getUseBpms() {
		return this.useBpms;
	}

	public void setUseBpms(Boolean useBpms) {
		this.useBpms = useBpms;
		if(useBpms != null){
			putQueryParameter("UseBpms", useBpms.toString());
		}
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
		if(dataType != null){
			putQueryParameter("DataType", dataType);
		}
	}

	public String getBlacklistOpsParam() {
		return this.blacklistOpsParam;
	}

	public void setBlacklistOpsParam(String blacklistOpsParam) {
		this.blacklistOpsParam = blacklistOpsParam;
		if(blacklistOpsParam != null){
			putQueryParameter("BlacklistOpsParam", blacklistOpsParam);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	public String getStaffId() {
		return this.staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
		if(staffId != null){
			putQueryParameter("StaffId", staffId);
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
	public Class<OpsBlackListCurdAlarmCenterResponse> getResponseClass() {
		return OpsBlackListCurdAlarmCenterResponse.class;
	}

}
