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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLifecyclePolicyRequest extends RpcAcsRequest<CreateLifecyclePolicyResponse> {
	   

	private String storageType;

	private String path;

	private String lifecyclePolicyName;

	private String fileSystemId;

	private String lifecycleRuleName;

	private List<String> pathss;
	public CreateLifecyclePolicyRequest() {
		super("NAS", "2017-06-26", "CreateLifecyclePolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putQueryParameter("Path", path);
		}
	}

	public String getLifecyclePolicyName() {
		return this.lifecyclePolicyName;
	}

	public void setLifecyclePolicyName(String lifecyclePolicyName) {
		this.lifecyclePolicyName = lifecyclePolicyName;
		if(lifecyclePolicyName != null){
			putQueryParameter("LifecyclePolicyName", lifecyclePolicyName);
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

	public String getLifecycleRuleName() {
		return this.lifecycleRuleName;
	}

	public void setLifecycleRuleName(String lifecycleRuleName) {
		this.lifecycleRuleName = lifecycleRuleName;
		if(lifecycleRuleName != null){
			putQueryParameter("LifecycleRuleName", lifecycleRuleName);
		}
	}

	public List<String> getPathss() {
		return this.pathss;
	}

	public void setPathss(List<String> pathss) {
		this.pathss = pathss;	
		if (pathss != null) {
			for (int i = 0; i < pathss.size(); i++) {
				putQueryParameter("Paths." + (i + 1) , pathss.get(i));
			}
		}	
	}

	@Override
	public Class<CreateLifecyclePolicyResponse> getResponseClass() {
		return CreateLifecyclePolicyResponse.class;
	}

}
