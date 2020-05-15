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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRestoreRequest extends RpcAcsRequest<CreateRestoreResponse> {
	   

	private String clientId;

	private String snapshotId;

	private String excludes;

	private String sourceClientId;

	private String vaultId;

	private String source;

	private String snapshotHash;

	private String extra;

	private String includes;

	private String serverId;

	private String token;

	private String restoreName;

	private String target;

	private String restoreType;

	private String containerRestoreId;
	public CreateRestoreRequest() {
		super("hbr", "2017-09-08", "CreateRestore", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public String getExcludes() {
		return this.excludes;
	}

	public void setExcludes(String excludes) {
		this.excludes = excludes;
		if(excludes != null){
			putQueryParameter("Excludes", excludes);
		}
	}

	public String getSourceClientId() {
		return this.sourceClientId;
	}

	public void setSourceClientId(String sourceClientId) {
		this.sourceClientId = sourceClientId;
		if(sourceClientId != null){
			putQueryParameter("SourceClientId", sourceClientId);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putQueryParameter("Source", source);
		}
	}

	public String getSnapshotHash() {
		return this.snapshotHash;
	}

	public void setSnapshotHash(String snapshotHash) {
		this.snapshotHash = snapshotHash;
		if(snapshotHash != null){
			putQueryParameter("SnapshotHash", snapshotHash);
		}
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putQueryParameter("Extra", extra);
		}
	}

	public String getIncludes() {
		return this.includes;
	}

	public void setIncludes(String includes) {
		this.includes = includes;
		if(includes != null){
			putQueryParameter("Includes", includes);
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getRestoreName() {
		return this.restoreName;
	}

	public void setRestoreName(String restoreName) {
		this.restoreName = restoreName;
		if(restoreName != null){
			putQueryParameter("RestoreName", restoreName);
		}
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		if(target != null){
			putQueryParameter("Target", target);
		}
	}

	public String getRestoreType() {
		return this.restoreType;
	}

	public void setRestoreType(String restoreType) {
		this.restoreType = restoreType;
		if(restoreType != null){
			putQueryParameter("RestoreType", restoreType);
		}
	}

	public String getContainerRestoreId() {
		return this.containerRestoreId;
	}

	public void setContainerRestoreId(String containerRestoreId) {
		this.containerRestoreId = containerRestoreId;
		if(containerRestoreId != null){
			putQueryParameter("ContainerRestoreId", containerRestoreId);
		}
	}

	@Override
	public Class<CreateRestoreResponse> getResponseClass() {
		return CreateRestoreResponse.class;
	}

}
