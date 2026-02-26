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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListApprovalsRequest extends RpcAcsRequest<ListApprovalsResponse> {
	   

	private String schemaId;

	private Long pageSize;

	private Long createEndTime;

	private String operatorUserId;

	private String schemaName;

	private String policyType;

	private String processName;

	private Long currentPage;

	private List<String> approvalIds;

	private Long createStartTime;

	private String processId;

	private String creatorDepartment;

	private String operatorUsername;

	private String creatorUserId;

	private String creatorUsername;

	private List<String> statuses;

	private String creatorDevTag;
	public ListApprovalsRequest() {
		super("csas", "2023-01-20", "ListApprovals");
		setMethod(MethodType.GET);
	}

	public String getSchemaId() {
		return this.schemaId;
	}

	public void setSchemaId(String schemaId) {
		this.schemaId = schemaId;
		if(schemaId != null){
			putQueryParameter("SchemaId", schemaId);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getCreateEndTime() {
		return this.createEndTime;
	}

	public void setCreateEndTime(Long createEndTime) {
		this.createEndTime = createEndTime;
		if(createEndTime != null){
			putQueryParameter("CreateEndTime", createEndTime.toString());
		}
	}

	public String getOperatorUserId() {
		return this.operatorUserId;
	}

	public void setOperatorUserId(String operatorUserId) {
		this.operatorUserId = operatorUserId;
		if(operatorUserId != null){
			putQueryParameter("OperatorUserId", operatorUserId);
		}
	}

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
		if(schemaName != null){
			putQueryParameter("SchemaName", schemaName);
		}
	}

	public String getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
		if(policyType != null){
			putQueryParameter("PolicyType", policyType);
		}
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
		if(processName != null){
			putQueryParameter("ProcessName", processName);
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public List<String> getApprovalIds() {
		return this.approvalIds;
	}

	public void setApprovalIds(List<String> approvalIds) {
		this.approvalIds = approvalIds;	
		if (approvalIds != null) {
			for (int depth1 = 0; depth1 < approvalIds.size(); depth1++) {
				putQueryParameter("ApprovalIds." + (depth1 + 1) , approvalIds.get(depth1));
			}
		}	
	}

	public Long getCreateStartTime() {
		return this.createStartTime;
	}

	public void setCreateStartTime(Long createStartTime) {
		this.createStartTime = createStartTime;
		if(createStartTime != null){
			putQueryParameter("CreateStartTime", createStartTime.toString());
		}
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
		if(processId != null){
			putQueryParameter("ProcessId", processId);
		}
	}

	public String getCreatorDepartment() {
		return this.creatorDepartment;
	}

	public void setCreatorDepartment(String creatorDepartment) {
		this.creatorDepartment = creatorDepartment;
		if(creatorDepartment != null){
			putQueryParameter("CreatorDepartment", creatorDepartment);
		}
	}

	public String getOperatorUsername() {
		return this.operatorUsername;
	}

	public void setOperatorUsername(String operatorUsername) {
		this.operatorUsername = operatorUsername;
		if(operatorUsername != null){
			putQueryParameter("OperatorUsername", operatorUsername);
		}
	}

	public String getCreatorUserId() {
		return this.creatorUserId;
	}

	public void setCreatorUserId(String creatorUserId) {
		this.creatorUserId = creatorUserId;
		if(creatorUserId != null){
			putQueryParameter("CreatorUserId", creatorUserId);
		}
	}

	public String getCreatorUsername() {
		return this.creatorUsername;
	}

	public void setCreatorUsername(String creatorUsername) {
		this.creatorUsername = creatorUsername;
		if(creatorUsername != null){
			putQueryParameter("CreatorUsername", creatorUsername);
		}
	}

	public List<String> getStatuses() {
		return this.statuses;
	}

	public void setStatuses(List<String> statuses) {
		this.statuses = statuses;	
		if (statuses != null) {
			for (int depth1 = 0; depth1 < statuses.size(); depth1++) {
				putQueryParameter("Statuses." + (depth1 + 1) , statuses.get(depth1));
			}
		}	
	}

	public String getCreatorDevTag() {
		return this.creatorDevTag;
	}

	public void setCreatorDevTag(String creatorDevTag) {
		this.creatorDevTag = creatorDevTag;
		if(creatorDevTag != null){
			putQueryParameter("CreatorDevTag", creatorDevTag);
		}
	}

	@Override
	public Class<ListApprovalsResponse> getResponseClass() {
		return ListApprovalsResponse.class;
	}

}
