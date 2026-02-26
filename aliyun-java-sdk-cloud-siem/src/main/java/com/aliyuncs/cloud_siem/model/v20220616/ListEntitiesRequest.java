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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListEntitiesRequest extends RpcAcsRequest<ListEntitiesResponse> {
	   

	private Long roleFor;

	private String malwareType;

	private String entityName;

	private String entityUuids;

	private Integer pageSize;

	private Integer roleType;

	private Integer currentPage;

	private String tags;

	private String isMalwareEntity;

	private String entityType;

	private String entityUuid;

	private String incidentUuid;
	public ListEntitiesRequest() {
		super("cloud-siem", "2022-06-16", "ListEntities", "cloud-siem");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putBodyParameter("RoleFor", roleFor.toString());
		}
	}

	public String getMalwareType() {
		return this.malwareType;
	}

	public void setMalwareType(String malwareType) {
		this.malwareType = malwareType;
		if(malwareType != null){
			putBodyParameter("MalwareType", malwareType);
		}
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
		if(entityName != null){
			putBodyParameter("EntityName", entityName);
		}
	}

	public String getEntityUuids() {
		return this.entityUuids;
	}

	public void setEntityUuids(String entityUuids) {
		this.entityUuids = entityUuids;
		if(entityUuids != null){
			putBodyParameter("EntityUuids", entityUuids);
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

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putBodyParameter("RoleType", roleType.toString());
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

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putBodyParameter("Tags", tags);
		}
	}

	public String getIsMalwareEntity() {
		return this.isMalwareEntity;
	}

	public void setIsMalwareEntity(String isMalwareEntity) {
		this.isMalwareEntity = isMalwareEntity;
		if(isMalwareEntity != null){
			putBodyParameter("IsMalwareEntity", isMalwareEntity);
		}
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putBodyParameter("EntityType", entityType);
		}
	}

	public String getEntityUuid() {
		return this.entityUuid;
	}

	public void setEntityUuid(String entityUuid) {
		this.entityUuid = entityUuid;
		if(entityUuid != null){
			putBodyParameter("EntityUuid", entityUuid);
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
	public Class<ListEntitiesResponse> getResponseClass() {
		return ListEntitiesResponse.class;
	}

}
