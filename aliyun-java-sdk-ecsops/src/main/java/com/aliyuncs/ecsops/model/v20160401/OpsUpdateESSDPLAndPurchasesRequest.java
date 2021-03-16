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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateESSDPLAndPurchasesRequest extends RpcAcsRequest<OpsUpdateESSDPLAndPurchasesResponse> {
	   

	private Long resourceOwnerId;

	private Integer diskSize;

	private String spArticleCode;

	private String diskType;

	private String operator;

	private String instanceId;

	private String diskId;

	private String operateApplication;

	private String auditParamStr;
	public OpsUpdateESSDPLAndPurchasesRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateESSDPLAndPurchases", "ecs");
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

	public Integer getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Integer diskSize) {
		this.diskSize = diskSize;
		if(diskSize != null){
			putQueryParameter("DiskSize", diskSize.toString());
		}
	}

	public String getSpArticleCode() {
		return this.spArticleCode;
	}

	public void setSpArticleCode(String spArticleCode) {
		this.spArticleCode = spArticleCode;
		if(spArticleCode != null){
			putQueryParameter("SpArticleCode", spArticleCode);
		}
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putQueryParameter("DiskType", diskType);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
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

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public String getOperateApplication() {
		return this.operateApplication;
	}

	public void setOperateApplication(String operateApplication) {
		this.operateApplication = operateApplication;
		if(operateApplication != null){
			putQueryParameter("OperateApplication", operateApplication);
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
	public Class<OpsUpdateESSDPLAndPurchasesResponse> getResponseClass() {
		return OpsUpdateESSDPLAndPurchasesResponse.class;
	}

}
