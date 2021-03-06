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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.scsp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEntityIvrRouteRequest extends RpcAcsRequest<CreateEntityIvrRouteResponse> {
	   

	private String extInfo;

	private String departmentId;

	private Long groupId;

	private String entityName;

	private String entityId;

	private String entityBizCodeType;

	private String entityBizCode;

	private String instanceId;

	private String entityRelationNumber;

	private Long serviceId;
	public CreateEntityIvrRouteRequest() {
		super("scsp", "2020-07-02", "CreateEntityIvrRoute", "scsp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtInfo() {
		return this.extInfo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
		if(extInfo != null){
			putBodyParameter("ExtInfo", extInfo);
		}
	}

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
		if(departmentId != null){
			putBodyParameter("DepartmentId", departmentId);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId.toString());
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

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putBodyParameter("EntityId", entityId);
		}
	}

	public String getEntityBizCodeType() {
		return this.entityBizCodeType;
	}

	public void setEntityBizCodeType(String entityBizCodeType) {
		this.entityBizCodeType = entityBizCodeType;
		if(entityBizCodeType != null){
			putBodyParameter("EntityBizCodeType", entityBizCodeType);
		}
	}

	public String getEntityBizCode() {
		return this.entityBizCode;
	}

	public void setEntityBizCode(String entityBizCode) {
		this.entityBizCode = entityBizCode;
		if(entityBizCode != null){
			putBodyParameter("EntityBizCode", entityBizCode);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getEntityRelationNumber() {
		return this.entityRelationNumber;
	}

	public void setEntityRelationNumber(String entityRelationNumber) {
		this.entityRelationNumber = entityRelationNumber;
		if(entityRelationNumber != null){
			putBodyParameter("EntityRelationNumber", entityRelationNumber);
		}
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putBodyParameter("ServiceId", serviceId.toString());
		}
	}

	@Override
	public Class<CreateEntityIvrRouteResponse> getResponseClass() {
		return CreateEntityIvrRouteResponse.class;
	}

}
