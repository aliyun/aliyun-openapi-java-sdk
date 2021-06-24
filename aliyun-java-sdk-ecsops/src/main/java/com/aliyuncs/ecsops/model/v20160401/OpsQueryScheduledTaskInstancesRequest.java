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

/**
 * @author auto create
 * @version 
 */
public class OpsQueryScheduledTaskInstancesRequest extends RpcAcsRequest<OpsQueryScheduledTaskInstancesResponse> {
	   

	private String gmtBeginProcessEnd;

	private String taskName;

	private Integer pageNumber;

	private Integer pageSize;

	private String gmtCreateEnd;

	private Long aliUid;

	private List<Long> ids;

	private String gmtModifiedEnd;

	private String gmtBeginProcessStart;

	private String gmtCreateStart;

	private String gmtModifiedStart;

	private String sourceIpNode;

	private String bizId;

	private String auditParamStr;

	private String status;
	public OpsQueryScheduledTaskInstancesRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryScheduledTaskInstances", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getGmtBeginProcessEnd() {
		return this.gmtBeginProcessEnd;
	}

	public void setGmtBeginProcessEnd(String gmtBeginProcessEnd) {
		this.gmtBeginProcessEnd = gmtBeginProcessEnd;
		if(gmtBeginProcessEnd != null){
			putQueryParameter("GmtBeginProcessEnd", gmtBeginProcessEnd);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getGmtCreateEnd() {
		return this.gmtCreateEnd;
	}

	public void setGmtCreateEnd(String gmtCreateEnd) {
		this.gmtCreateEnd = gmtCreateEnd;
		if(gmtCreateEnd != null){
			putQueryParameter("GmtCreateEnd", gmtCreateEnd);
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

	public List<Long> getIds() {
		return this.ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;	
		if (ids != null) {
			for (int i = 0; i < ids.size(); i++) {
				putQueryParameter("Id." + (i + 1) , ids.get(i));
			}
		}	
	}

	public String getGmtModifiedEnd() {
		return this.gmtModifiedEnd;
	}

	public void setGmtModifiedEnd(String gmtModifiedEnd) {
		this.gmtModifiedEnd = gmtModifiedEnd;
		if(gmtModifiedEnd != null){
			putQueryParameter("GmtModifiedEnd", gmtModifiedEnd);
		}
	}

	public String getGmtBeginProcessStart() {
		return this.gmtBeginProcessStart;
	}

	public void setGmtBeginProcessStart(String gmtBeginProcessStart) {
		this.gmtBeginProcessStart = gmtBeginProcessStart;
		if(gmtBeginProcessStart != null){
			putQueryParameter("GmtBeginProcessStart", gmtBeginProcessStart);
		}
	}

	public String getGmtCreateStart() {
		return this.gmtCreateStart;
	}

	public void setGmtCreateStart(String gmtCreateStart) {
		this.gmtCreateStart = gmtCreateStart;
		if(gmtCreateStart != null){
			putQueryParameter("GmtCreateStart", gmtCreateStart);
		}
	}

	public String getGmtModifiedStart() {
		return this.gmtModifiedStart;
	}

	public void setGmtModifiedStart(String gmtModifiedStart) {
		this.gmtModifiedStart = gmtModifiedStart;
		if(gmtModifiedStart != null){
			putQueryParameter("GmtModifiedStart", gmtModifiedStart);
		}
	}

	public String getSourceIpNode() {
		return this.sourceIpNode;
	}

	public void setSourceIpNode(String sourceIpNode) {
		this.sourceIpNode = sourceIpNode;
		if(sourceIpNode != null){
			putQueryParameter("SourceIpNode", sourceIpNode);
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
	public Class<OpsQueryScheduledTaskInstancesResponse> getResponseClass() {
		return OpsQueryScheduledTaskInstancesResponse.class;
	}

}
