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
public class OpsQueryDiagnoseInfoRequest extends RpcAcsRequest<OpsQueryDiagnoseInfoResponse> {
	   

	private String diagnoseId;

	private String diagnoseAction;

	private Integer pageNumber;

	private String diagnoseRequestId;

	private Integer pageSize;

	private Long aliUid;

	private Integer diagnoseType;

	private String errorCode;

	private String auditParamStr;

	private Integer status;
	public OpsQueryDiagnoseInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryDiagnoseInfo", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDiagnoseId() {
		return this.diagnoseId;
	}

	public void setDiagnoseId(String diagnoseId) {
		this.diagnoseId = diagnoseId;
		if(diagnoseId != null){
			putQueryParameter("DiagnoseId", diagnoseId);
		}
	}

	public String getDiagnoseAction() {
		return this.diagnoseAction;
	}

	public void setDiagnoseAction(String diagnoseAction) {
		this.diagnoseAction = diagnoseAction;
		if(diagnoseAction != null){
			putQueryParameter("DiagnoseAction", diagnoseAction);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getDiagnoseRequestId() {
		return this.diagnoseRequestId;
	}

	public void setDiagnoseRequestId(String diagnoseRequestId) {
		this.diagnoseRequestId = diagnoseRequestId;
		if(diagnoseRequestId != null){
			putQueryParameter("DiagnoseRequestId", diagnoseRequestId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public Integer getDiagnoseType() {
		return this.diagnoseType;
	}

	public void setDiagnoseType(Integer diagnoseType) {
		this.diagnoseType = diagnoseType;
		if(diagnoseType != null){
			putQueryParameter("DiagnoseType", diagnoseType.toString());
		}
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putQueryParameter("ErrorCode", errorCode);
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<OpsQueryDiagnoseInfoResponse> getResponseClass() {
		return OpsQueryDiagnoseInfoResponse.class;
	}

}
