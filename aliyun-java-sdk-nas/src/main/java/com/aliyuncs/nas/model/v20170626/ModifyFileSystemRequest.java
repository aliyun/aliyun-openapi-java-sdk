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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyFileSystemRequest extends RpcAcsRequest<ModifyFileSystemResponse> {
	   

	private String description;

	@SerializedName("options")
	private Options options;

	private String fileSystemId;
	public ModifyFileSystemRequest() {
		super("NAS", "2017-06-26", "ModifyFileSystem", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Options getOptions() {
		return this.options;
	}

	public void setOptions(Options options) {
		this.options = options;	
		if (options != null) {
			putQueryParameter("Options" , new Gson().toJson(options));
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

	public static class Options {

		@SerializedName("EnableOplock")
		private Boolean enableOplock;

		public Boolean getEnableOplock() {
			return this.enableOplock;
		}

		public void setEnableOplock(Boolean enableOplock) {
			this.enableOplock = enableOplock;
		}
	}

	@Override
	public Class<ModifyFileSystemResponse> getResponseClass() {
		return ModifyFileSystemResponse.class;
	}

}
