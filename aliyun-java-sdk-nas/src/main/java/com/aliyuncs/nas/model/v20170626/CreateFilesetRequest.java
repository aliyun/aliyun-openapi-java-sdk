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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateFilesetRequest extends RpcAcsRequest<CreateFilesetResponse> {
	   

	private String clientToken;

	private String description;

	private Boolean deletionProtection;

	private Quota quota;

	private String fileSystemId;

	private Boolean dryRun;

	private String fileSystemPath;
	public CreateFilesetRequest() {
		super("NAS", "2017-06-26", "CreateFileset", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
		if(deletionProtection != null){
			putQueryParameter("DeletionProtection", deletionProtection.toString());
		}
	}

	public Quota getQuota() {
		return this.quota;
	}

	public void setQuota(Quota quota) {
		this.quota = quota;	
		if (quota != null) {
			
				putQueryParameter("Quota.SizeLimit" , quota.getSizeLimit());
				putQueryParameter("Quota.FileCountLimit" , quota.getFileCountLimit());
		}	
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getFileSystemPath() {
		return this.fileSystemPath;
	}

	public void setFileSystemPath(String fileSystemPath) {
		this.fileSystemPath = fileSystemPath;
		if(fileSystemPath != null){
			putQueryParameter("FileSystemPath", fileSystemPath);
		}
	}

	public static class Quota {

		private Long sizeLimit;

		private Long fileCountLimit;

		public Long getSizeLimit() {
			return this.sizeLimit;
		}

		public void setSizeLimit(Long sizeLimit) {
			this.sizeLimit = sizeLimit;
		}

		public Long getFileCountLimit() {
			return this.fileCountLimit;
		}

		public void setFileCountLimit(Long fileCountLimit) {
			this.fileCountLimit = fileCountLimit;
		}
	}

	@Override
	public Class<CreateFilesetResponse> getResponseClass() {
		return CreateFilesetResponse.class;
	}

}
