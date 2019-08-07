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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportFullSyncStatusRequest extends RpcAcsRequest<ReportFullSyncStatusResponse> {
	
	public ReportFullSyncStatusRequest() {
		super("hdr", "2017-09-25", "ReportFullSyncStatus", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String securityToken;

	private Long fullSyncTotalSize;

	private Integer fullSyncProgress;

	private Long fullSyncCurrentSize;

	private String serverId;

	private Long userUid;

	private String gatewayId;

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Long getFullSyncTotalSize() {
		return this.fullSyncTotalSize;
	}

	public void setFullSyncTotalSize(Long fullSyncTotalSize) {
		this.fullSyncTotalSize = fullSyncTotalSize;
		if(fullSyncTotalSize != null){
			putQueryParameter("FullSyncTotalSize", fullSyncTotalSize.toString());
		}
	}

	public Integer getFullSyncProgress() {
		return this.fullSyncProgress;
	}

	public void setFullSyncProgress(Integer fullSyncProgress) {
		this.fullSyncProgress = fullSyncProgress;
		if(fullSyncProgress != null){
			putQueryParameter("FullSyncProgress", fullSyncProgress.toString());
		}
	}

	public Long getFullSyncCurrentSize() {
		return this.fullSyncCurrentSize;
	}

	public void setFullSyncCurrentSize(Long fullSyncCurrentSize) {
		this.fullSyncCurrentSize = fullSyncCurrentSize;
		if(fullSyncCurrentSize != null){
			putQueryParameter("FullSyncCurrentSize", fullSyncCurrentSize.toString());
		}
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
		}
	}

	public Long getUserUid() {
		return this.userUid;
	}

	public void setUserUid(Long userUid) {
		this.userUid = userUid;
		if(userUid != null){
			putQueryParameter("UserUid", userUid.toString());
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	@Override
	public Class<ReportFullSyncStatusResponse> getResponseClass() {
		return ReportFullSyncStatusResponse.class;
	}

}
