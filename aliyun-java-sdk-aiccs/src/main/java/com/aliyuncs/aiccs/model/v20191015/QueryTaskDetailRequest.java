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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryTaskDetailRequest extends RpcAcsRequest<QueryTaskDetailResponse> {
	   

	private String statusList;

	private String endReasonList;

	private String departmentIdList;

	private String servicerId;

	private Integer currentPage;

	private String skillGroup;

	private String sid;

	private String instanceId;

	private String outboundTaskId;

	private String servicerName;

	private Integer pageSize;

	private String dnis;

	private String ani;

	private Long taskId;

	private String priorityList;
	public QueryTaskDetailRequest() {
		super("aiccs", "2019-10-15", "QueryTaskDetail");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStatusList() {
		return this.statusList;
	}

	public void setStatusList(String statusList) {
		this.statusList = statusList;
		if(statusList != null){
			putQueryParameter("StatusList", statusList);
		}
	}

	public String getEndReasonList() {
		return this.endReasonList;
	}

	public void setEndReasonList(String endReasonList) {
		this.endReasonList = endReasonList;
		if(endReasonList != null){
			putQueryParameter("EndReasonList", endReasonList);
		}
	}

	public String getDepartmentIdList() {
		return this.departmentIdList;
	}

	public void setDepartmentIdList(String departmentIdList) {
		this.departmentIdList = departmentIdList;
		if(departmentIdList != null){
			putQueryParameter("DepartmentIdList", departmentIdList);
		}
	}

	public String getServicerId() {
		return this.servicerId;
	}

	public void setServicerId(String servicerId) {
		this.servicerId = servicerId;
		if(servicerId != null){
			putQueryParameter("ServicerId", servicerId);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getSkillGroup() {
		return this.skillGroup;
	}

	public void setSkillGroup(String skillGroup) {
		this.skillGroup = skillGroup;
		if(skillGroup != null){
			putQueryParameter("SkillGroup", skillGroup);
		}
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid);
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

	public String getOutboundTaskId() {
		return this.outboundTaskId;
	}

	public void setOutboundTaskId(String outboundTaskId) {
		this.outboundTaskId = outboundTaskId;
		if(outboundTaskId != null){
			putQueryParameter("OutboundTaskId", outboundTaskId);
		}
	}

	public String getServicerName() {
		return this.servicerName;
	}

	public void setServicerName(String servicerName) {
		this.servicerName = servicerName;
		if(servicerName != null){
			putQueryParameter("ServicerName", servicerName);
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

	public String getDnis() {
		return this.dnis;
	}

	public void setDnis(String dnis) {
		this.dnis = dnis;
		if(dnis != null){
			putQueryParameter("Dnis", dnis);
		}
	}

	public String getAni() {
		return this.ani;
	}

	public void setAni(String ani) {
		this.ani = ani;
		if(ani != null){
			putQueryParameter("Ani", ani);
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	public String getPriorityList() {
		return this.priorityList;
	}

	public void setPriorityList(String priorityList) {
		this.priorityList = priorityList;
		if(priorityList != null){
			putQueryParameter("PriorityList", priorityList);
		}
	}

	@Override
	public Class<QueryTaskDetailResponse> getResponseClass() {
		return QueryTaskDetailResponse.class;
	}

}
