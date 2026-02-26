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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetAppOtaLatestVersionRequest extends RpcAcsRequest<GetAppOtaLatestVersionResponse> {
	   

	private Integer clientType;

	private String clientUid;

	private String project;

	private String osType;

	private String baseVersion;
	public GetAppOtaLatestVersionRequest() {
		super("wyota", "2021-04-20", "GetAppOtaLatestVersion");
		setMethod(MethodType.POST);
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType.toString());
		}
	}

	public String getClientUid() {
		return this.clientUid;
	}

	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
		if(clientUid != null){
			putQueryParameter("ClientUid", clientUid);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public String getBaseVersion() {
		return this.baseVersion;
	}

	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
		if(baseVersion != null){
			putQueryParameter("BaseVersion", baseVersion);
		}
	}

	@Override
	public Class<GetAppOtaLatestVersionResponse> getResponseClass() {
		return GetAppOtaLatestVersionResponse.class;
	}

}
