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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateSdkDownloadInfoRequest extends RpcAcsRequest<GenerateSdkDownloadInfoResponse> {
	   

	private Integer osType;

	private String sdks;

	private String certFileObjectKey;

	private String appId;

	private String pkgName;

	private String projectId;
	public GenerateSdkDownloadInfoRequest() {
		super("iovcc", "2018-05-01", "GenerateSdkDownloadInfo", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getOsType() {
		return this.osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType.toString());
		}
	}

	public String getSdks() {
		return this.sdks;
	}

	public void setSdks(String sdks) {
		this.sdks = sdks;
		if(sdks != null){
			putQueryParameter("Sdks", sdks);
		}
	}

	public String getCertFileObjectKey() {
		return this.certFileObjectKey;
	}

	public void setCertFileObjectKey(String certFileObjectKey) {
		this.certFileObjectKey = certFileObjectKey;
		if(certFileObjectKey != null){
			putQueryParameter("CertFileObjectKey", certFileObjectKey);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getPkgName() {
		return this.pkgName;
	}

	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
		if(pkgName != null){
			putQueryParameter("PkgName", pkgName);
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
	public Class<GenerateSdkDownloadInfoResponse> getResponseClass() {
		return GenerateSdkDownloadInfoResponse.class;
	}

}
