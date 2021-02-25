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
public class GetEntityRouteRequest extends RpcAcsRequest<GetEntityRouteResponse> {
	   

	private String entityBizCode;

	private String instanceId;

	private String entityName;

	private String entityId;

	private String entityRelationNumber;

	private Long uniqueId;
	public GetEntityRouteRequest() {
		super("scsp", "2020-07-02", "GetEntityRoute");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getEntityRelationNumber() {
		return this.entityRelationNumber;
	}

	public void setEntityRelationNumber(String entityRelationNumber) {
		this.entityRelationNumber = entityRelationNumber;
		if(entityRelationNumber != null){
			putBodyParameter("EntityRelationNumber", entityRelationNumber);
		}
	}

	public Long getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
		if(uniqueId != null){
			putBodyParameter("UniqueId", uniqueId.toString());
		}
	}

	@Override
	public Class<GetEntityRouteResponse> getResponseClass() {
		return GetEntityRouteResponse.class;
	}

}
