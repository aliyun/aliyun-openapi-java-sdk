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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsPutAxtPluginRequest extends RpcAcsRequest<OpsPutAxtPluginResponse> {
	   

	private String distro;

	private Long timeout;

	private String pluginVersion;

	private String runPath;

	private String osType;

	private String url;

	private Boolean preInstalled;

	private String name;

	private String publisher;

	private String arch;

	private String auditParamStr;

	private String md5;
	public OpsPutAxtPluginRequest() {
		super("Ecsops", "2016-04-01", "OpsPutAxtPlugin", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDistro() {
		return this.distro;
	}

	public void setDistro(String distro) {
		this.distro = distro;
		if(distro != null){
			putQueryParameter("Distro", distro);
		}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getPluginVersion() {
		return this.pluginVersion;
	}

	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
		if(pluginVersion != null){
			putQueryParameter("PluginVersion", pluginVersion);
		}
	}

	public String getRunPath() {
		return this.runPath;
	}

	public void setRunPath(String runPath) {
		this.runPath = runPath;
		if(runPath != null){
			putQueryParameter("RunPath", runPath);
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putQueryParameter("Url", url);
		}
	}

	public Boolean getPreInstalled() {
		return this.preInstalled;
	}

	public void setPreInstalled(Boolean preInstalled) {
		this.preInstalled = preInstalled;
		if(preInstalled != null){
			putQueryParameter("PreInstalled", preInstalled.toString());
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

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
		if(publisher != null){
			putQueryParameter("Publisher", publisher);
		}
	}

	public String getArch() {
		return this.arch;
	}

	public void setArch(String arch) {
		this.arch = arch;
		if(arch != null){
			putQueryParameter("Arch", arch);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
		if(md5 != null){
			putQueryParameter("Md5", md5);
		}
	}

	@Override
	public Class<OpsPutAxtPluginResponse> getResponseClass() {
		return OpsPutAxtPluginResponse.class;
	}

}
