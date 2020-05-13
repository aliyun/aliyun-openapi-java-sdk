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
public class GenerateSysAppDownloadInfoRequest extends RpcAcsRequest<GenerateSysAppDownloadInfoResponse> {
	   

	private String plugins;

	private Integer osType;

	private String certFileObjectKey;

	private String pkgName;

	private String signMode;

	private String projectId;
	public GenerateSysAppDownloadInfoRequest() {
		super("iovcc", "2018-05-01", "GenerateSysAppDownloadInfo", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPlugins() {
		return this.plugins;
	}

	public void setPlugins(String plugins) {
		this.plugins = plugins;
		if(plugins != null){
			putQueryParameter("Plugins", plugins);
		}
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

	public String getCertFileObjectKey() {
		return this.certFileObjectKey;
	}

	public void setCertFileObjectKey(String certFileObjectKey) {
		this.certFileObjectKey = certFileObjectKey;
		if(certFileObjectKey != null){
			putQueryParameter("CertFileObjectKey", certFileObjectKey);
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

	public String getSignMode() {
		return this.signMode;
	}

	public void setSignMode(String signMode) {
		this.signMode = signMode;
		if(signMode != null){
			putQueryParameter("SignMode", signMode);
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
	public Class<GenerateSysAppDownloadInfoResponse> getResponseClass() {
		return GenerateSysAppDownloadInfoResponse.class;
	}

}
