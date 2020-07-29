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

package com.aliyuncs.mpaas.model.v20190821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteMpaasMrtcArtvcRecordfileRequest extends RpcAcsRequest<DeleteMpaasMrtcArtvcRecordfileResponse> {
	   

	private String tenantId;

	private String bizRequestId;

	private String bizName;

	private String bizAppCode;

	private String roomId;

	private String recordId;

	private String s;

	private String appId;

	private String mediaType;

	private String workspaceId;
	public DeleteMpaasMrtcArtvcRecordfileRequest() {
		super("mPaaS", "2019-08-21", "DeleteMpaasMrtcArtvcRecordfile", "mpaas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getBizRequestId() {
		return this.bizRequestId;
	}

	public void setBizRequestId(String bizRequestId) {
		this.bizRequestId = bizRequestId;
		if(bizRequestId != null){
			putBodyParameter("BizRequestId", bizRequestId);
		}
	}

	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
		if(bizName != null){
			putBodyParameter("BizName", bizName);
		}
	}

	public String getBizAppCode() {
		return this.bizAppCode;
	}

	public void setBizAppCode(String bizAppCode) {
		this.bizAppCode = bizAppCode;
		if(bizAppCode != null){
			putBodyParameter("BizAppCode", bizAppCode);
		}
	}

	public String getRoomId() {
		return this.roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
		if(roomId != null){
			putBodyParameter("RoomId", roomId);
		}
	}

	public String getRecordId() {
		return this.recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
		if(recordId != null){
			putBodyParameter("RecordId", recordId);
		}
	}

	public String getS() {
		return this.s;
	}

	public void setS(String s) {
		this.s = s;
		if(s != null){
			putBodyParameter("S", s);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
		if(mediaType != null){
			putBodyParameter("MediaType", mediaType);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<DeleteMpaasMrtcArtvcRecordfileResponse> getResponseClass() {
		return DeleteMpaasMrtcArtvcRecordfileResponse.class;
	}

}
