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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertsWithEntityRequest extends RpcAcsRequest<DescribeAlertsWithEntityResponse> {
	   

	private Long entityId;

	private Integer pageSize;

	private String sophonTaskId;

	private Integer currentPage;

	private String incidentUuid;
	public DescribeAlertsWithEntityRequest() {
		super("cloud-siem", "2022-06-16", "DescribeAlertsWithEntity", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getSophonTaskId() {
		return this.sophonTaskId;
	}

	public void setSophonTaskId(String sophonTaskId) {
		this.sophonTaskId = sophonTaskId;
		if(sophonTaskId != null){
			putBodyParameter("SophonTaskId", sophonTaskId);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getIncidentUuid() {
		return this.incidentUuid;
	}

	public void setIncidentUuid(String incidentUuid) {
		this.incidentUuid = incidentUuid;
		if(incidentUuid != null){
			putBodyParameter("IncidentUuid", incidentUuid);
		}
	}

	@Override
	public Class<DescribeAlertsWithEntityResponse> getResponseClass() {
		return DescribeAlertsWithEntityResponse.class;
	}

}
