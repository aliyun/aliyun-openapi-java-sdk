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
public class OpsQueryInstanceTransferLogRequest extends RpcAcsRequest<OpsQueryInstanceTransferLogResponse> {
	   

	private Long resourceOwnerId;

	private String oldNcId;

	private String createStart;

	private String instanceId;

	private String createEnd;

	private Integer pageNo;

	private String newNcId;

	private Integer pageSize;

	private String resourceOwnerBid;

	private String auditParamStr;

	private String status;
	public OpsQueryInstanceTransferLogRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryInstanceTransferLog", "ecs");
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

	public String getOldNcId() {
		return this.oldNcId;
	}

	public void setOldNcId(String oldNcId) {
		this.oldNcId = oldNcId;
		if(oldNcId != null){
			putQueryParameter("OldNcId", oldNcId);
		}
	}

	public String getCreateStart() {
		return this.createStart;
	}

	public void setCreateStart(String createStart) {
		this.createStart = createStart;
		if(createStart != null){
			putQueryParameter("CreateStart", createStart);
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

	public String getCreateEnd() {
		return this.createEnd;
	}

	public void setCreateEnd(String createEnd) {
		this.createEnd = createEnd;
		if(createEnd != null){
			putQueryParameter("CreateEnd", createEnd);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public String getNewNcId() {
		return this.newNcId;
	}

	public void setNewNcId(String newNcId) {
		this.newNcId = newNcId;
		if(newNcId != null){
			putQueryParameter("NewNcId", newNcId);
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

	public String getResourceOwnerBid() {
		return this.resourceOwnerBid;
	}

	public void setResourceOwnerBid(String resourceOwnerBid) {
		this.resourceOwnerBid = resourceOwnerBid;
		if(resourceOwnerBid != null){
			putQueryParameter("ResourceOwnerBid", resourceOwnerBid);
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
	public Class<OpsQueryInstanceTransferLogResponse> getResponseClass() {
		return OpsQueryInstanceTransferLogResponse.class;
	}

}
