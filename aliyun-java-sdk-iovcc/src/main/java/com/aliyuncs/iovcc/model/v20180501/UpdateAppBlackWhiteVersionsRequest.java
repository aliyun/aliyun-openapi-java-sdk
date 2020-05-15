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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAppBlackWhiteVersionsRequest extends RpcAcsRequest<UpdateAppBlackWhiteVersionsResponse> {
	   

	private String versionId;

	private String whiteAppVersions;

	private String blackAppVersions;

	private String projectId;
	public UpdateAppBlackWhiteVersionsRequest() {
		super("iovcc", "2018-05-01", "UpdateAppBlackWhiteVersions", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
		if(versionId != null){
			putQueryParameter("VersionId", versionId);
		}
	}

	public String getWhiteAppVersions() {
		return this.whiteAppVersions;
	}

	public void setWhiteAppVersions(String whiteAppVersions) {
		this.whiteAppVersions = whiteAppVersions;
		if(whiteAppVersions != null){
			putQueryParameter("WhiteAppVersions", whiteAppVersions);
		}
	}

	public String getBlackAppVersions() {
		return this.blackAppVersions;
	}

	public void setBlackAppVersions(String blackAppVersions) {
		this.blackAppVersions = blackAppVersions;
		if(blackAppVersions != null){
			putQueryParameter("BlackAppVersions", blackAppVersions);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<UpdateAppBlackWhiteVersionsResponse> getResponseClass() {
		return UpdateAppBlackWhiteVersionsResponse.class;
	}

}
