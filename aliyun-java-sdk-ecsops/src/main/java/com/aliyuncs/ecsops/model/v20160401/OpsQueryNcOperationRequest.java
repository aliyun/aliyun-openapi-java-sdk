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
public class OpsQueryNcOperationRequest extends RpcAcsRequest<OpsQueryNcOperationResponse> {
	   

	private String opsActionName;

	private String cnSn;

	private String endTime;

	private String startTime;

	private Integer pageNumber;

	private String ncIp;

	private String opsRuleName;

	private Integer pageSize;

	private String auditParamStr;
	public OpsQueryNcOperationRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryNcOperation", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getCnSn() {
		return this.cnSn;
	}

	public void setCnSn(String cnSn) {
		this.cnSn = cnSn;
		if(cnSn != null){
			putQueryParameter("CnSn", cnSn);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getNcIp() {
		return this.ncIp;
	}

	public void setNcIp(String ncIp) {
		this.ncIp = ncIp;
		if(ncIp != null){
			putQueryParameter("NcIp", ncIp);
		}
	}

	public String getOpsRuleName() {
		return this.opsRuleName;
	}

	public void setOpsRuleName(String opsRuleName) {
		this.opsRuleName = opsRuleName;
		if(opsRuleName != null){
			putQueryParameter("OpsRuleName", opsRuleName);
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
	public Class<OpsQueryNcOperationResponse> getResponseClass() {
		return OpsQueryNcOperationResponse.class;
	}

}
