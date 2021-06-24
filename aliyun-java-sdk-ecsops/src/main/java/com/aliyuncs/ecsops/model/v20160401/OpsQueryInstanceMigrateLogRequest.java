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
public class OpsQueryInstanceMigrateLogRequest extends RpcAcsRequest<OpsQueryInstanceMigrateLogResponse> {
	   

	private String createStart;

	private Integer pageSize;

	private String destNcId;

	private String srcNcId;

	private String instanceId;

	private String createEnd;

	private Integer pageNo;

	private String auditParamStr;

	private String status;
	public OpsQueryInstanceMigrateLogRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryInstanceMigrateLog", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getCreateStart() {
		return this.createStart;
	}

	public void setCreateStart(String createStart) {
		this.createStart = createStart;
		if(createStart != null){
			putQueryParameter("CreateStart", createStart);
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

	public String getDestNcId() {
		return this.destNcId;
	}

	public void setDestNcId(String destNcId) {
		this.destNcId = destNcId;
		if(destNcId != null){
			putQueryParameter("DestNcId", destNcId);
		}
	}

	public String getSrcNcId() {
		return this.srcNcId;
	}

	public void setSrcNcId(String srcNcId) {
		this.srcNcId = srcNcId;
		if(srcNcId != null){
			putQueryParameter("SrcNcId", srcNcId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCreateEnd() {
		return this.createEnd;
	}

	public void setCreateEnd(String createEnd) {
		this.createEnd = createEnd;
		if(createEnd != null){
			putQueryParameter("CreateEnd", createEnd);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<OpsQueryInstanceMigrateLogResponse> getResponseClass() {
		return OpsQueryInstanceMigrateLogResponse.class;
	}

}
