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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetRepoTagManifestRequest extends RpcAcsRequest<GetRepoTagManifestResponse> {
	   

	private String repoId;

	private Integer schemaVersion;

	private String instanceId;

	private String tag;
	public GetRepoTagManifestRequest() {
		super("cr", "2018-12-01", "GetRepoTagManifest", "acr");
		setMethod(MethodType.POST);
	}

	public String getRepoId() {
		return this.repoId;
	}

	public void setRepoId(String repoId) {
		this.repoId = repoId;
		if(repoId != null){
			putQueryParameter("RepoId", repoId);
		}
	}

	public Integer getSchemaVersion() {
		return this.schemaVersion;
	}

	public void setSchemaVersion(Integer schemaVersion) {
		this.schemaVersion = schemaVersion;
		if(schemaVersion != null){
			putQueryParameter("SchemaVersion", schemaVersion.toString());
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

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
		}
	}

	@Override
	public Class<GetRepoTagManifestResponse> getResponseClass() {
		return GetRepoTagManifestResponse.class;
	}

}
