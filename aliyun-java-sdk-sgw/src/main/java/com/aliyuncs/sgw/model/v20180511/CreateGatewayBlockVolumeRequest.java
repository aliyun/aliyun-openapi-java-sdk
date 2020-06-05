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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGatewayBlockVolumeRequest extends RpcAcsRequest<CreateGatewayBlockVolumeResponse> {
	   

	private String ossEndpoint;

	private Boolean recovery;

	private String securityToken;

	private Integer chunkSize;

	private String gatewayId;

	private String volumeProtocol;

	private Boolean chapEnabled;

	private String cacheMode;

	private String localFilePath;

	private Boolean ossBucketSsl;

	private Long size;

	private String chapInUser;

	private String name;

	private String ossBucketName;

	private String chapInPassword;
	public CreateGatewayBlockVolumeRequest() {
		super("sgw", "2018-05-11", "CreateGatewayBlockVolume", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		if(ossEndpoint != null){
			putQueryParameter("OssEndpoint", ossEndpoint);
		}
	}

	public Boolean getRecovery() {
		return this.recovery;
	}

	public void setRecovery(Boolean recovery) {
		this.recovery = recovery;
		if(recovery != null){
			putQueryParameter("Recovery", recovery.toString());
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public Integer getChunkSize() {
		return this.chunkSize;
	}

	public void setChunkSize(Integer chunkSize) {
		this.chunkSize = chunkSize;
		if(chunkSize != null){
			putQueryParameter("ChunkSize", chunkSize.toString());
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

	public String getVolumeProtocol() {
		return this.volumeProtocol;
	}

	public void setVolumeProtocol(String volumeProtocol) {
		this.volumeProtocol = volumeProtocol;
		if(volumeProtocol != null){
			putQueryParameter("VolumeProtocol", volumeProtocol);
		}
	}

	public Boolean getChapEnabled() {
		return this.chapEnabled;
	}

	public void setChapEnabled(Boolean chapEnabled) {
		this.chapEnabled = chapEnabled;
		if(chapEnabled != null){
			putQueryParameter("ChapEnabled", chapEnabled.toString());
		}
	}

	public String getCacheMode() {
		return this.cacheMode;
	}

	public void setCacheMode(String cacheMode) {
		this.cacheMode = cacheMode;
		if(cacheMode != null){
			putQueryParameter("CacheMode", cacheMode);
		}
	}

	public String getLocalFilePath() {
		return this.localFilePath;
	}

	public void setLocalFilePath(String localFilePath) {
		this.localFilePath = localFilePath;
		if(localFilePath != null){
			putQueryParameter("LocalFilePath", localFilePath);
		}
	}

	public Boolean getOssBucketSsl() {
		return this.ossBucketSsl;
	}

	public void setOssBucketSsl(Boolean ossBucketSsl) {
		this.ossBucketSsl = ossBucketSsl;
		if(ossBucketSsl != null){
			putQueryParameter("OssBucketSsl", ossBucketSsl.toString());
		}
	}

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public String getChapInUser() {
		return this.chapInUser;
	}

	public void setChapInUser(String chapInUser) {
		this.chapInUser = chapInUser;
		if(chapInUser != null){
			putQueryParameter("ChapInUser", chapInUser);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
		if(ossBucketName != null){
			putQueryParameter("OssBucketName", ossBucketName);
		}
	}

	public String getChapInPassword() {
		return this.chapInPassword;
	}

	public void setChapInPassword(String chapInPassword) {
		this.chapInPassword = chapInPassword;
		if(chapInPassword != null){
			putQueryParameter("ChapInPassword", chapInPassword);
		}
	}

	@Override
	public Class<CreateGatewayBlockVolumeResponse> getResponseClass() {
		return CreateGatewayBlockVolumeResponse.class;
	}

}
