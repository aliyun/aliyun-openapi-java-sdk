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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCpfsAccessPointRequest extends RpcAcsRequest<CreateCpfsAccessPointResponse> {
	   

	private String description;

	private String fileSystemId;

	private RootDirectory rootDirectory;
	public CreateCpfsAccessPointRequest() {
		super("NAS", "2017-06-26", "CreateCpfsAccessPoint", "nas");
		setProtocol(ProtocolType.HTTPS);
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

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public RootDirectory getRootDirectory() {
		return this.rootDirectory;
	}

	public void setRootDirectory(RootDirectory rootDirectory) {
		this.rootDirectory = rootDirectory;	
		if (rootDirectory != null) {
			
				putQueryParameter("RootDirectory.RootPath" , rootDirectory.getRootPath());
		}	
	}

	public static class RootDirectory {

		private String rootPath;

		public String getRootPath() {
			return this.rootPath;
		}

		public void setRootPath(String rootPath) {
			this.rootPath = rootPath;
		}
	}

	@Override
	public Class<CreateCpfsAccessPointResponse> getResponseClass() {
		return CreateCpfsAccessPointResponse.class;
	}

}
