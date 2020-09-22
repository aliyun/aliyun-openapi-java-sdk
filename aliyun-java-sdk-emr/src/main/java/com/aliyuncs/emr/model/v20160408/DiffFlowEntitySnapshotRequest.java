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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DiffFlowEntitySnapshotRequest extends RpcAcsRequest<DiffFlowEntitySnapshotResponse> {
	   

	private Long resourceOwnerId;

	private String srcRevision;

	private String entityId;

	private String dstRevision;

	private String entityType;
	public DiffFlowEntitySnapshotRequest() {
		super("Emr", "2016-04-08", "DiffFlowEntitySnapshot");
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

	public String getSrcRevision() {
		return this.srcRevision;
	}

	public void setSrcRevision(String srcRevision) {
		this.srcRevision = srcRevision;
		if(srcRevision != null){
			putQueryParameter("SrcRevision", srcRevision);
		}
	}

	public String getEntityId() {
		return this.entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
		if(entityId != null){
			putQueryParameter("EntityId", entityId);
		}
	}

	public String getDstRevision() {
		return this.dstRevision;
	}

	public void setDstRevision(String dstRevision) {
		this.dstRevision = dstRevision;
		if(dstRevision != null){
			putQueryParameter("DstRevision", dstRevision);
		}
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
		if(entityType != null){
			putQueryParameter("EntityType", entityType);
		}
	}

	@Override
	public Class<DiffFlowEntitySnapshotResponse> getResponseClass() {
		return DiffFlowEntitySnapshotResponse.class;
	}

}
