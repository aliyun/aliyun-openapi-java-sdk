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
public class OpsQueryWorkflowListRequest extends RpcAcsRequest<OpsQueryWorkflowListResponse> {
	   

	private String workflowStatus;

	private String workflowName;

	private Integer pageNum;

	private String workflowInstanceId;

	private Integer pageSize;

	private Long createTimeEnd;

	private String bizType;

	private String extCol3;

	private String bizId;

	private Long createTimeStart;

	private String extCol1;

	private String auditParamStr;

	private String extCol2;
	public OpsQueryWorkflowListRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryWorkflowList", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getWorkflowStatus() {
		return this.workflowStatus;
	}

	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
		if(workflowStatus != null){
			putQueryParameter("WorkflowStatus", workflowStatus);
		}
	}

	public String getWorkflowName() {
		return this.workflowName;
	}

	public void setWorkflowName(String workflowName) {
		this.workflowName = workflowName;
		if(workflowName != null){
			putQueryParameter("WorkflowName", workflowName);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getWorkflowInstanceId() {
		return this.workflowInstanceId;
	}

	public void setWorkflowInstanceId(String workflowInstanceId) {
		this.workflowInstanceId = workflowInstanceId;
		if(workflowInstanceId != null){
			putQueryParameter("WorkflowInstanceId", workflowInstanceId);
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

	public Long getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setCreateTimeEnd(Long createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
		if(createTimeEnd != null){
			putQueryParameter("CreateTimeEnd", createTimeEnd.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getExtCol3() {
		return this.extCol3;
	}

	public void setExtCol3(String extCol3) {
		this.extCol3 = extCol3;
		if(extCol3 != null){
			putQueryParameter("ExtCol3", extCol3);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Long getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeStart(Long createTimeStart) {
		this.createTimeStart = createTimeStart;
		if(createTimeStart != null){
			putQueryParameter("CreateTimeStart", createTimeStart.toString());
		}
	}

	public String getExtCol1() {
		return this.extCol1;
	}

	public void setExtCol1(String extCol1) {
		this.extCol1 = extCol1;
		if(extCol1 != null){
			putQueryParameter("ExtCol1", extCol1);
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

	public String getExtCol2() {
		return this.extCol2;
	}

	public void setExtCol2(String extCol2) {
		this.extCol2 = extCol2;
		if(extCol2 != null){
			putQueryParameter("ExtCol2", extCol2);
		}
	}

	@Override
	public Class<OpsQueryWorkflowListResponse> getResponseClass() {
		return OpsQueryWorkflowListResponse.class;
	}

}
