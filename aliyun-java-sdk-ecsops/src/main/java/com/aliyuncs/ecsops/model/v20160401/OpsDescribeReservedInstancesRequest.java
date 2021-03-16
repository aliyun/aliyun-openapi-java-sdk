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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeReservedInstancesRequest extends RpcAcsRequest<OpsDescribeReservedInstancesResponse> {
	   

	private Long resourceOwnerId;

	private String instanceTypeFamily;

	private String offeringClass;

	private List<String> reservedInstanceIds;

	private String offeringType;

	private String scope;

	private String zoneId;

	private String reservedInstanceName;

	private String instanceType;

	private List<String> statuss;

	private String auditParamStr;
	public OpsDescribeReservedInstancesRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeReservedInstances", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public String getOfferingClass() {
		return this.offeringClass;
	}

	public void setOfferingClass(String offeringClass) {
		this.offeringClass = offeringClass;
		if(offeringClass != null){
			putQueryParameter("OfferingClass", offeringClass);
		}
	}

	public List<String> getReservedInstanceIds() {
		return this.reservedInstanceIds;
	}

	public void setReservedInstanceIds(List<String> reservedInstanceIds) {
		this.reservedInstanceIds = reservedInstanceIds;	
		if (reservedInstanceIds != null) {
			for (int i = 0; i < reservedInstanceIds.size(); i++) {
				putQueryParameter("ReservedInstanceId." + (i + 1) , reservedInstanceIds.get(i));
			}
		}	
	}

	public String getOfferingType() {
		return this.offeringType;
	}

	public void setOfferingType(String offeringType) {
		this.offeringType = offeringType;
		if(offeringType != null){
			putQueryParameter("OfferingType", offeringType);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getReservedInstanceName() {
		return this.reservedInstanceName;
	}

	public void setReservedInstanceName(String reservedInstanceName) {
		this.reservedInstanceName = reservedInstanceName;
		if(reservedInstanceName != null){
			putQueryParameter("ReservedInstanceName", reservedInstanceName);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public List<String> getStatuss() {
		return this.statuss;
	}

	public void setStatuss(List<String> statuss) {
		this.statuss = statuss;	
		if (statuss != null) {
			for (int i = 0; i < statuss.size(); i++) {
				putQueryParameter("Status." + (i + 1) , statuss.get(i));
			}
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
	public Class<OpsDescribeReservedInstancesResponse> getResponseClass() {
		return OpsDescribeReservedInstancesResponse.class;
	}

}
